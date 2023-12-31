/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.reporting.dataset.definition.evaluator;

import org.openmrs.annotation.Handler;
import org.openmrs.api.context.Context;
import org.openmrs.module.kenyaemr.reporting.dataset.definition.MergingDataSetDefinition;
import org.openmrs.module.reporting.dataset.DataSet;
import org.openmrs.module.reporting.dataset.DataSetColumn;
import org.openmrs.module.reporting.dataset.MapDataSet;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.evaluator.DataSetEvaluator;
import org.openmrs.module.reporting.dataset.definition.service.DataSetDefinitionService;
import org.openmrs.module.reporting.evaluation.EvaluationContext;
import org.openmrs.module.reporting.evaluation.EvaluationException;
import org.openmrs.util.OpenmrsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Evaluator for merged data sets
 */
@Handler(supports = MergingDataSetDefinition.class)
public class MergingDataSetEvaluator implements DataSetEvaluator {

	/**
	 * @see DataSetEvaluator#evaluate(org.openmrs.module.reporting.dataset.definition.DataSetDefinition, org.openmrs.module.reporting.evaluation.EvaluationContext)
	 */
	@Override
	public MapDataSet evaluate(DataSetDefinition dataSetDefinition, EvaluationContext context) throws EvaluationException {
		MergingDataSetDefinition dsd = (MergingDataSetDefinition) dataSetDefinition;

		List<MapDataSet> dataSets = new ArrayList<MapDataSet>();

		DataSetDefinitionService dss = Context.getService(DataSetDefinitionService.class);

		for (DataSetDefinition childDsd : dsd.getDataSetDefinitions()) {
			DataSet dataSet = dss.evaluate(childDsd, context);

			if (dataSet instanceof MapDataSet) {
				dataSets.add((MapDataSet) dataSet);
			}
			else {
				throw new EvaluationException("Can only merge single dimension data sets");
			}
		}

		return mergeDataSets(dataSets, dsd, context);
	}

	/**
	 * Merges a collection of map data sets
	 * @param dataSets the data sets
	 * @return the merged data set
	 */
	protected MapDataSet mergeDataSets(List<MapDataSet> dataSets, MergingDataSetDefinition dataSetDefinition, EvaluationContext context) {
		MapDataSet ret = new MapDataSet(dataSetDefinition, context);

		List<DataSetColumn> columns = new ArrayList<DataSetColumn>();

		// Gather all columns from all contained data sets
		for (DataSet dataSet : dataSets) {
			for (DataSetColumn column : dataSet.getMetaData().getColumns()) {
				columns.add(column);
			}
		}

		// Sort the columns according to the merge order
		if (MergingDataSetDefinition.MergeOrder.NAME.equals(dataSetDefinition.getMergeOrder())) {
			Collections.sort(columns, new Comparator<DataSetColumn>() {
				@Override
				public int compare(DataSetColumn column1, DataSetColumn column2) {
					return OpenmrsUtil.compareWithNullAsGreatest(column1.getName(), column2.getName());
				}
			});
		}
		else if (MergingDataSetDefinition.MergeOrder.LABEL.equals(dataSetDefinition.getMergeOrder())) {
			Collections.sort(columns, new Comparator<DataSetColumn>() {
				@Override
				public int compare(DataSetColumn column1, DataSetColumn column2) {
					return OpenmrsUtil.compareWithNullAsGreatest(column1.getLabel(), column2.getLabel());
				}
			});
		}

		ret.getMetaData().setColumns(columns);

		// Gather column data values from all contained data sets
		for (MapDataSet dataSet : dataSets) {
			for (DataSetColumn column : dataSet.getMetaData().getColumns()) {
				ret.addData(column, getDataSetData(dataSet, column));
			}
		}

		return ret;
	}

	/**
	 * Until REPORT-491 is fixed, MapDataSet.getData doesn't work for some data set types
	 * @param dataSet the data set
	 * @param column the column
	 * @return the data value
	 *
	 * updating to MapDataSet.getData since REPORT-491 was fixed
	 */
	private Object getDataSetData(MapDataSet dataSet, DataSetColumn column) {
			return dataSet.getData(column);
	}
}
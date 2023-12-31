/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
    /**
     * This Source Code Form is subject to the terms of the Mozilla Public License,
     * v. 2.0. If a copy of the MPL was not distributed with this file, You can
     * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
     * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
     *
     * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
     * graphic logo is a trademark of OpenMRS Inc.
     */
    package org.openmrs.module.kenyaemr.calculation.library.models;

    import org.openmrs.PersonName;

    import java.util.List;
    import java.util.Set;

    /**
     * Created by codehub on 11/2/15.
     * a model class that hold the basics of a patient
     */
    public class PatientSummary {

        private Set<PersonName> names;
        private String upn;
        private String birthDate;
        private Integer age;
        private String maritalStatus;
        private String hivConfrimedDate;
        private String firstCd4;
        private String firstCd4Date;
        private String dateEnrolledIntoCare;
        private String dateEnrolledInTb;
        private String dateCompletedInTb;
        private String whoStagingAtEnrollment;
        private String patientEntryPoint;
        private String dateEntryPoint;
        private String vlResults;
        private String vlDates;
        private String cd4Dates;
        private String cd4Results;

        private String transferInFacility;
        private String transferInDate;
        private String nameOfTreatmentSupporter;
        private String tbScreeningOutcome;
        private String stiScreeningOutcome;
        private String caxcScreeningOutcome;
        private String pulseRate;
        private String respiratoryRate;
        private String bloodPressure;
        private String oxygenSaturation;
        private String lmp;
        private String bmi;
        private  String familyProtection;
        private String kDoDNumber;
        private String kDoDUnit;
        private String kDoDCadre;
        private String kDoDRank;
        private String relationshipToTreatmentSupporter;
        private String contactOfTreatmentSupporter;
        private String drigAllergies;
        private String previousArt;
        private String dateStartedArt;
        private String artPurpose;
        private String clinicalStageAtArtStart;
        private String currentCd4;
        private String purposeDrugs;
        private String purposeDate;
        private String weightAtArtStart;
        private String heightAtArtStart;;
        private String  bpDiastolic;
        private String currentRegimen;
        private List<String> ois;
        private String dateOfReport;
        private String clinicName;
        private String mflCode;
        private String gender;
        private String firstRegimen;
        private String cd4AtArtStart;
        private String currentArtRegimen;
        private String currentWhoStaging;
        private String onCtx;
        private String dapsone;
        private String onIpt;
        private String clinicsEnrolled;
        private String mostRecentCd4;
        private String mostRecentCd4Date;
        private String mostRecentVl;
        private String mostRecentVlDate;
        private String artInterruptions;
        private String artInterruptionReason;
        private String artInterruptionDate;
        private String substitutionWithFirstLine;
        private String substitutionWithFirstLineReason;
        private String substitutionWithFirstLineDate;
        private String switchToSecondLineRegimen;
        private String switchToSecondLineRegimenReason;
        private String switchToSecondLineRegimenDate;
        private String transferOutDate;
        private String deathDate;
        private String nextAppointmentDate;

        public PatientSummary() {
        }

        public PatientSummary(Set<PersonName> names, String upn, String birthDate, Integer age, String maritalStatus, String hivConfrimedDate, String firstCd4, String firstCd4Date,String dateEnrolledInTb,String dateCompletedInTb, String dateEnrolledIntoCare, String whoStagingAtEnrollment,String vlResults, String vlDates, String cd4Dates, String cd4Results, String patientEntryPoint, String dateEntryPoint, String transferInStatus,String tbScreeningOutcome, String stiScreeningOutcome, String kDoDCadre,String kDoDUnit ,String kDoDNumber,String kDoDRank, String caxcScreeningOutcome ,String transferInDate,String pulseRate,String bmi,String lmp, String nameOfTreatmentSupporter, String relationshipToTreatmentSupporter, String contactOfTreatmentSupporter, String drigAllergies, String previousArt, String dateStartedArt, String artPurpose, String clinicalStageAtArtStart, String currentCd4, String purposeDrugs, String purposeDate,String bpDiastolic, String weightAtArtStart,String familyProtection, String heightAtArtStart, String currentRegimen, List<String> ois, String dateOfReport, String clinicName, String mflCode, String gender, String firstRegimen, String cd4AtArtStart, String currentArtRegimen, String currentWhoStaging, String onCtx, String dapsone, String onIpt, String clinicsEnrolled, String mostRecentCd4, String mostRecentCd4Date, String mostRecentVl, String mostRecentVlDate, String artInterruptions, String artInterruptionReason, String artInterruptionDate, String substitutionWithFirstLine, String substitutionWithFirstLineReason, String substitutionWithFirstLineDate, String switchToSecondLineRegimen, String switchToSecondLineRegimenReason, String switchToSecondLineRegimenDate, String transferOutDate, String deathDate, String nextAppointmentDate, String bloodPressure,String respiratoryRate,String oxygenSaturation) {
            this.names = names;
            this.upn = upn;
            this.birthDate = birthDate;
            this.age = age;
            this.maritalStatus = maritalStatus;
            this.hivConfrimedDate = hivConfrimedDate;
            this.firstCd4 = firstCd4;
            this.kDoDCadre = kDoDCadre;
            this.kDoDUnit = kDoDUnit;
            this.kDoDNumber = kDoDNumber;
            this.kDoDRank = kDoDRank;
            this.firstCd4Date = firstCd4Date;
            this.dateEnrolledIntoCare = dateEnrolledIntoCare;
            this.dateEnrolledInTb = dateEnrolledInTb;
            this.dateCompletedInTb = dateCompletedInTb;
            this.whoStagingAtEnrollment = whoStagingAtEnrollment;
            this.patientEntryPoint = patientEntryPoint;
            this.dateEntryPoint = dateEntryPoint;
            this.vlResults  = vlResults;
            this.vlDates = vlDates;
            this.cd4Dates  = cd4Dates;
            this.cd4Results = cd4Results;
            this.transferInFacility = transferInStatus;
            this.transferInDate = transferInDate;
            this.nameOfTreatmentSupporter = nameOfTreatmentSupporter;
            this.bloodPressure = bloodPressure;
            this.respiratoryRate = respiratoryRate;
            this.oxygenSaturation = oxygenSaturation;
            this.pulseRate = pulseRate;
            this.tbScreeningOutcome = tbScreeningOutcome;
            this.stiScreeningOutcome = stiScreeningOutcome;
            this.caxcScreeningOutcome = caxcScreeningOutcome;
            this.lmp = lmp;
            this.bmi = bmi;
            this.relationshipToTreatmentSupporter = relationshipToTreatmentSupporter;
            this.contactOfTreatmentSupporter = contactOfTreatmentSupporter;
            this.drigAllergies = drigAllergies;
            this.previousArt = previousArt;
            this.dateStartedArt = dateStartedArt;
            this.artPurpose = artPurpose;
            this.clinicalStageAtArtStart = clinicalStageAtArtStart;
            this.currentCd4 = currentCd4;
            this.purposeDrugs = purposeDrugs;
            this.purposeDate = purposeDate;
            this.weightAtArtStart = weightAtArtStart;
            this.heightAtArtStart = heightAtArtStart;
            this.familyProtection = familyProtection;
            this.bpDiastolic = bpDiastolic;
            this.currentRegimen = currentRegimen;
            this.ois = ois;
            this.dateOfReport = dateOfReport;
            this.clinicName = clinicName;
            this.mflCode = mflCode;
            this.gender = gender;
            this.firstRegimen = firstRegimen;
            this.cd4AtArtStart = cd4AtArtStart;
            this.currentArtRegimen = currentArtRegimen;
            this.currentWhoStaging = currentWhoStaging;
            this.onCtx = onCtx;
            this.dapsone = dapsone;
            this.onIpt = onIpt;
            this.clinicsEnrolled = clinicsEnrolled;
            this.mostRecentCd4 = mostRecentCd4;
            this.mostRecentCd4Date = mostRecentCd4Date;

            this.mostRecentVl = mostRecentVl;
            this.mostRecentVlDate = mostRecentVlDate;
            this.artInterruptions = artInterruptions;
            this.artInterruptionReason = artInterruptionReason;
            this.artInterruptionDate = artInterruptionDate;
            this.substitutionWithFirstLine = substitutionWithFirstLine;
            this.substitutionWithFirstLineReason = substitutionWithFirstLineReason;
            this.substitutionWithFirstLineDate = substitutionWithFirstLineDate;
            this.switchToSecondLineRegimen = switchToSecondLineRegimen;
            this.switchToSecondLineRegimenReason = switchToSecondLineRegimenReason;
            this.switchToSecondLineRegimenDate = switchToSecondLineRegimenDate;
            this.transferOutDate = transferOutDate;
            this.deathDate = deathDate;
            this.nextAppointmentDate = nextAppointmentDate;
        }

        public String getFirstCd4() {
            return firstCd4;
        }

        public void setFirstCd4(String firstCd4) {
            this.firstCd4 = firstCd4;
        }

        public Set<PersonName> getNames() {
            return names;
        }

        public void setNames(Set<PersonName> names) {
            this.names = names;
        }

        public String getUpn() {
            return upn;
        }

        public void setUpn(String upn) {
            this.upn = upn;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getMaritalStatus() {
            return maritalStatus;
        }

        public void setMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
        }

        public String getHivConfrimedDate() {
            return hivConfrimedDate;
        }

        public void setHivConfrimedDate(String hivConfrimedDate) {
            this.hivConfrimedDate = hivConfrimedDate;
        }

        public String getFirstCd4Date() {
            return firstCd4Date;
        }

        public void setFirstCd4Date(String firstCd4Date) {
            this.firstCd4Date = firstCd4Date;
        }

        public String getDateEnrolledIntoCare() {
            return dateEnrolledIntoCare;
        }

        public void setDateEnrolledIntoCare(String dateEnrolledIntoCare) {
            this.dateEnrolledIntoCare = dateEnrolledIntoCare;
        }

        public String getDateEnrolledInTb() {
            return dateEnrolledInTb;
        }

        public void setDateEnrolledInTb(String dateEnrolledInTb) {
            this.dateEnrolledInTb = dateEnrolledInTb;
        }
        public String getDateCompletedInTb() {
            return dateCompletedInTb;
        }

        public void setDateCompletedInTb(String dateCompletedInTb) {
            this.dateCompletedInTb = dateCompletedInTb;
        }

        public String getWhoStagingAtEnrollment() {
            return whoStagingAtEnrollment;
        }

        public void setWhoStagingAtEnrollment(String whoStagingAtEnrollment) {
            this.whoStagingAtEnrollment = whoStagingAtEnrollment;
        }

        public String getPatientEntryPoint() {
            return patientEntryPoint;
        }

        public void setPatientEntryPoint(String patientEntryPoint) {
            this.patientEntryPoint = patientEntryPoint;
        }

        public String getDateEntryPoint() {
            return dateEntryPoint;
        }

        public void setDateEntryPoint(String dateEntryPoint) {
            this.dateEntryPoint = dateEntryPoint;
        }

        public String getVlResults() {
            return vlResults;
        }

        public void setVlResults(String vlResults) {
            this.vlResults = vlResults;
        }
        public String getVlDates() {
            return vlDates;
        }

        public void setVlDates(String vlDates) {
            this.vlDates = vlDates;
        }

        public String getCd4Results() {
            return cd4Results;
        }

        public void setCd4Results(String cd4Results) {
            this.cd4Results = cd4Results;
        }
        public String getCd4Dates() {
            return cd4Dates;
        }

        public void setCd4Dates(String cd4Dates) {
            this.cd4Dates = cd4Dates;
        }

        public String getTransferInFacility() {
            return transferInFacility;
        }

        public void setTransferInFacility(String transferInFacility) {
            this.transferInFacility = transferInFacility;
        }

        public String getTransferInDate() {
            return transferInDate;
        }

        public void setTransferInDate(String transferInDate) {
            this.transferInDate = transferInDate;
        }

        public String getNameOfTreatmentSupporter() {
            return nameOfTreatmentSupporter;
        }

        public void setNameOfTreatmentSupporter(String nameOfTreatmentSupporter) {
            this.nameOfTreatmentSupporter = nameOfTreatmentSupporter;
        }

        public String getTbScreeningOutcome() {
            return tbScreeningOutcome;
        }

        public void setTbScreeningOutcome(String tbScreeningOutcome) {
            this.tbScreeningOutcome = tbScreeningOutcome;
        }
        public String getStiScreeningOutcome() {
            return stiScreeningOutcome;
        }

        public void setStiScreeningOutcome(String stiScreeningOutcome) {
            this.stiScreeningOutcome = stiScreeningOutcome;
        }
        public String getCaxcScreeningOutcome() {
            return caxcScreeningOutcome;
        }

        public void setCaxcScreeningOutcome(String caxcScreeningOutcome) {
            this.caxcScreeningOutcome = caxcScreeningOutcome;
        }
        public String getPulseRate() {
            return pulseRate;
        }

        public void setPulseRate(String pulseRate) {
            this.pulseRate = pulseRate;
        }

        public String getLmp() {
            return lmp;
        }

        public void setLmp(String lmp) {
            this.lmp = lmp;
        }

        public String getBmi() {
            return bmi;
        }
        public void setBmi(String bmi) {
            this.bmi = bmi;
        }


        public String getKdodCadre() {
            return kDoDCadre;
        }
        public void setKdodCadre(String kDoDCadre) {
            this.kDoDCadre = kDoDCadre;
        }

        public String getKdodUnit() {
            return kDoDUnit;
        }
        public void setKdodUnit(String kDoDUnit) {
            this.kDoDUnit = kDoDUnit;
        }

        public String getKdodNumber() {
            return kDoDNumber;
        }
        public void setKdodNumber(String kDoDNumber) {
            this.kDoDNumber = kDoDNumber;
        }

        public String getKdodRank() {
            return kDoDRank;
        }
        public void setKdodRank(String kDoDRank) {
            this.kDoDRank = kDoDRank;
        }

        public String getBloodPressure() {
            return bloodPressure;
        }

        public void setBloodPressure(String bloodPressure) {
            this.bloodPressure = bloodPressure;
        }
        public String getRespiratoryRate() {
            return respiratoryRate;
        }

        public void setRespiratoryRate(String respiratoryRate) {
            this.respiratoryRate = respiratoryRate;
        }
        public String getOxygenSaturation() {
            return oxygenSaturation;
        }

        public void setOxygenSaturation(String oxygenSaturation) {
            this.oxygenSaturation = oxygenSaturation;
        }

        public String getRelationshipToTreatmentSupporter() {
            return relationshipToTreatmentSupporter;
        }

        public void setRelationshipToTreatmentSupporter(String relationshipToTreatmentSupporter) {
            this.relationshipToTreatmentSupporter = relationshipToTreatmentSupporter;
        }

        public String getContactOfTreatmentSupporter() {
            return contactOfTreatmentSupporter;
        }

        public void setContactOfTreatmentSupporter(String contactOfTreatmentSupporter) {
            this.contactOfTreatmentSupporter = contactOfTreatmentSupporter;
        }

        public String getDrigAllergies() {
            return drigAllergies;
        }

        public void setDrigAllergies(String drigAllergies) {
            this.drigAllergies = drigAllergies;
        }

        public String getPreviousArt() {
            return previousArt;
        }

        public void setPreviousArt(String previousArt) {
            this.previousArt = previousArt;
        }

        public String getDateStartedArt() {
            return dateStartedArt;
        }

        public void setDateStartedArt(String dateStartedArt) {
            this.dateStartedArt = dateStartedArt;
        }

        public String getArtPurpose() {
            return artPurpose;
        }

        public void setArtPurpose(String artPurpose) {
            this.artPurpose = artPurpose;
        }

        public String getClinicalStageAtArtStart() {
            return clinicalStageAtArtStart;
        }

        public void setClinicalStageAtArtStart(String clinicalStageAtArtStart) {
            this.clinicalStageAtArtStart = clinicalStageAtArtStart;
        }

        public String getCurrentCd4() {
            return currentCd4;
        }

        public void setCurrentCd4(String currentCd4) {
            this.currentCd4 = currentCd4;
        }

        public String getPurposeDrugs() {
            return purposeDrugs;
        }

        public void setPurposeDrugs(String purposeDrugs) {
            this.purposeDrugs = purposeDrugs;
        }

        public String getPurposeDate() {
            return purposeDate;
        }

        public void setPurposeDate(String purposeDate) {
            this.purposeDate = purposeDate;
        }

        public String getWeightAtArtStart() {
            return weightAtArtStart;
        }

        public void setWeightAtArtStart(String weightAtArtStart) {
            this.weightAtArtStart = weightAtArtStart;
        }

        public String getFamilyProtection() {
            return familyProtection;
        }

        public void setFamilyProtection(String familyProtection) {
            this.familyProtection = familyProtection;
        }

        public String getBpDiastolic() {
            return bpDiastolic;
        }

        public void setBpDiastolic(String bpDiastolic) {
            this.bpDiastolic = bpDiastolic;
        }

        public String getHeightAtArtStart() {
            return heightAtArtStart;
        }

        public void setHeightAtArtStart(String heightAtArtStart) {
            this.heightAtArtStart = heightAtArtStart;
        }

        public String getCurrentRegimen() {
            return currentRegimen;
        }

        public void setCurrentRegimen(String currentRegimen) {
            this.currentRegimen = currentRegimen;
        }

        public List<String> getOis() {
            return ois;
        }

        public void setOis(List<String> ois) {
            this.ois = ois;
        }

        public String getDateOfReport() {
            return dateOfReport;
        }

        public void setDateOfReport(String dateOfReport) {
            this.dateOfReport = dateOfReport;
        }

        public String getClinicName() {
            return clinicName;
        }

        public void setClinicName(String clinicName) {
            this.clinicName = clinicName;
        }

        public String getMflCode() {
            return mflCode;
        }

        public void setMflCode(String mflCode) {
            this.mflCode = mflCode;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getFirstRegimen() {
            return firstRegimen;
        }

        public void setFirstRegimen(String firstRegimen) {
            this.firstRegimen = firstRegimen;
        }

        public String getCd4AtArtStart() {
            return cd4AtArtStart;
        }

        public void setCd4AtArtStart(String cd4AtArtStart) {
            this.cd4AtArtStart = cd4AtArtStart;
        }

        public String getCurrentArtRegimen() {
            return currentArtRegimen;
        }

        public void setCurrentArtRegimen(String currentArtRegimen) {
            this.currentArtRegimen = currentArtRegimen;
        }

        public String getCurrentWhoStaging() {
            return currentWhoStaging;
        }

        public void setCurrentWhoStaging(String currentWhoStaging) {
            this.currentWhoStaging = currentWhoStaging;
        }

        public String getOnCtx() {
            return onCtx;
        }

        public void setOnCtx(String onCtx) {
            this.onCtx = onCtx;
        }

        public String getDapsone() {
            return dapsone;
        }

        public void setDapsone(String dapsone) {
            this.dapsone = dapsone;
        }

        public String getOnIpt() {
            return onIpt;
        }

        public void setOnIpt(String onIpt) {
            this.onIpt = onIpt;
        }

        public String getClinicsEnrolled() {
            return clinicsEnrolled;
        }

        public void setClinicsEnrolled(String clinicsEnrolled) {
            this.clinicsEnrolled = clinicsEnrolled;
        }

        public String getMostRecentCd4() {
            return mostRecentCd4;
        }

        public void setMostRecentCd4(String mostRecentCd4) {
            this.mostRecentCd4 = mostRecentCd4;
        }

        public String getMostRecentCd4Date() {
            return mostRecentCd4Date;
        }

        public void setMostRecentCd4Date(String mostRecentCd4Date) {
            this.mostRecentCd4Date = mostRecentCd4Date;
        }

        public String getMostRecentVl() {
            return mostRecentVl;
        }

        public void setMostRecentVl(String mostRecentVl) {
            this.mostRecentVl = mostRecentVl;
        }

        public String getMostRecentVlDate() {
            return mostRecentVlDate;
        }

        public void setMostRecentVlDate(String mostRecentVlDate) {
            this.mostRecentVlDate = mostRecentVlDate;
        }

        public String getArtInterruptions() {
            return artInterruptions;
        }

        public void setArtInterruptions(String artInterruptions) {
            this.artInterruptions = artInterruptions;
        }

        public String getArtInterruptionReason() {
            return artInterruptionReason;
        }

        public void setArtInterruptionReason(String artInterruptionReason) {
            this.artInterruptionReason = artInterruptionReason;
        }

        public String getArtInterruptionDate() {
            return artInterruptionDate;
        }

        public void setArtInterruptionDate(String artInterruptionDate) {
            this.artInterruptionDate = artInterruptionDate;
        }

        public String getSubstitutionWithFirstLine() {
            return substitutionWithFirstLine;
        }

        public void setSubstitutionWithFirstLine(String substitutionWithFirstLine) {
            this.substitutionWithFirstLine = substitutionWithFirstLine;
        }

        public String getSubstitutionWithFirstLineReason() {
            return substitutionWithFirstLineReason;
        }

        public void setSubstitutionWithFirstLineReason(String substitutionWithFirstLineReason) {
            this.substitutionWithFirstLineReason = substitutionWithFirstLineReason;
        }

        public String getSubstitutionWithFirstLineDate() {
            return substitutionWithFirstLineDate;
        }

        public void setSubstitutionWithFirstLineDate(String substitutionWithFirstLineDate) {
            this.substitutionWithFirstLineDate = substitutionWithFirstLineDate;
        }

        public String getSwitchToSecondLineRegimen() {
            return switchToSecondLineRegimen;
        }

        public void setSwitchToSecondLineRegimen(String switchToSecondLineRegimen) {
            this.switchToSecondLineRegimen = switchToSecondLineRegimen;
        }

        public String getSwitchToSecondLineRegimenReason() {
            return switchToSecondLineRegimenReason;
        }

        public void setSwitchToSecondLineRegimenReason(String switchToSecondLineRegimenReason) {
            this.switchToSecondLineRegimenReason = switchToSecondLineRegimenReason;
        }

        public String getSwitchToSecondLineRegimenDate() {
            return switchToSecondLineRegimenDate;
        }

        public void setSwitchToSecondLineRegimenDate(String switchToSecondLineRegimenDate) {
            this.switchToSecondLineRegimenDate = switchToSecondLineRegimenDate;
        }

        public String getTransferOutDate() {
            return transferOutDate;
        }

        public void setTransferOutDate(String transferOutDate) {
            this.transferOutDate = transferOutDate;
        }

        public String getDeathDate() {
            return deathDate;
        }

        public void setDeathDate(String deathDate) {
            this.deathDate = deathDate;
        }

        public String getNextAppointmentDate() {
            return nextAppointmentDate;
        }

        public void setNextAppointmentDate(String nextAppointmentDate) {
            this.nextAppointmentDate = nextAppointmentDate;
        }

    }

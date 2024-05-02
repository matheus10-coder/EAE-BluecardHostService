package net.abcbs.rpa.dto;
/***********************************************************************************************************************************************************************
 * @author mfribeiro
 * 
 * Description: BluecardDTO class used to perform core task such as create and construct the object used in BluecardJavaBean
 * 
 * Project: Bluecard Host Adjustment 
 ***********************************************************************************************************************************************************************/

public class BluecardDTO {
	
	//private variables
	private String sccfId;
	private String hostPlanCntlId;
	private String patLastName;
	private String patFirstName;
	private String patMiddleName;
	private String patBirthDt;
	private String patSexCd; 
	private String patAddressLnOneDesc;
	private String patAddressLnTwoDesc;
	private String patCityName;
	private String patStateCd;
	private String patZipCd;
	private String patPhoneNumberId;
	private String patRelSubCd;
	private String patWorkCompInd;
	private String autoOthAccdntDc;
	private String autoAccdntStCd;
	private String subApfxId;
	private String subSufxId;
	private String subLastName;
	private String subFirstName;
	private String subMiddleName;
	private String subAddressLnOneDesc;
	private String subAddressLnTwoDesc;
	private String subCityName;
	private String subStateCd;
	private String subZipCd;
	private String subGroupId;
	private String subBirthDt;
	private String subSexCd;
	private String otherCarrier; //seq_num column name 
	private String rlseInfoCd;
	private String accIllOnsetDt; //date type format
	private String unableWorkFromDt;
	private String unableWorkToDt;
	private String refProvLastName;
	private String refProvFirstName;
	private String refProvMiddleName;
	private String refProvId;
	private String refProvNpiCd;
	private String fedTaxId;
	private String patCntlId;
	private String assgBnftInd;
	private double patPaidAmt;
	private String servFacilName;
	private String servFacilStreetCd;
	private String servFacilZipCd;
	private String servFacilLocId;
	private String billProvLastName;
	private String billProvFirstName;
	private String billProvMiddleName;
	private String subOrgName;
	private String provLnOneAddress;
	private String provLnTwoAddress;
	private String provCityName;
	private String provStreetName;
	private String provStreetCd;
	private String provZipCd;
	private String provPhoneNumberId;
	private String provNpiCd;
	private String icdProvSubmitVerCd;
	private String diagCdOne;
	private String diagCdTwo;
	private String diagCdThree;
	private String diagCdFour;
	private String diagCdFive;
	private String diagCdSix;
	private String diagCdSeven;
	private String diagCdEight;
	private String diagCdNine;
	private String diagCdTen;
	private String diagCdEleven;
	private String diagCdTwelve;
	private String diagCdThirteen;
	private String diagCdFourteen;
	private String diagCdFifteen;
	private String diagCdSixteen;
	private String diagCdSeventeen;
	private String diagCdEighteen;
	private String diagCdNineteen;
	private String diagCdTwenty;
	private String diagCdTwentyOne;
	private String diagCdTwentyTwo;
	private String diagCdTwentyThree;
	private String diagCdTwentyFour;
	private String icdTenDiagCdOne;
	private String icdTenDiagCdTwo;
	private String icdTenDiagCdThree;
	private String icdTenDiagCdFour;
	private String icdTenDiagCdFive;
	private String icdTenDiagCdSix;
	private String icdTenDiagCdSeven;
	private String icdTenDiagCdEight;
	private String icdTenDiagCdNine;
	private String icdTenDiagCdTen;
	private String icdTenDiagCdEleven;
	private String icdTenDiagCdTwelve;
	private String icdTenDiagCdThirteen;
	private String icdTenDiagCdFourteen;
	private String icdTenDiagCdFifteen;
	private String icdTenDiagCdSixteen;
	private String icdTenDiagCdSeventeen;
	private String icdTenDiagCdEighteen;
	private String icdTenDiagCdNineteen;
	private String icdTenDiagCdTwenty;
	private String icdTenDiagCdTwentyOne;
	private String icdTenDiagCdTwentyTwo;
	private String icdTenDiagCdTwentyThree;
	private String icdTenDiagCdTwentyFour;
	private String othInsId;
	private String othPyrNm;
	private String lnNum;
	private String servStartDt;
	private String servEndDt;
	private String perfProvPosInd;
	private String hcpcsProcCd;
	private String hcpcsProcmodCdOne;
	private String hcpcsProcmodCdTwo;
	private String hcpcsProcmodCdThree;
	private String hcpcsProcmodCdFour;
	private String othhcpcsProcmodCdFourPyrNm;
	private String diagCdIndOne;
	private String diagCdIndTwo;
	private String diagCdIndThree;
	private String diagCdIndFour;
	private double servChgAmt;
	private String servNum;
	private String perfProvTxnmyCd;
	private String hostPlanReceiptDt;
	private String billTypeCd;
	private String fdbPostingDt;
	private String statusCd;
	private String format; // claim taxonomy type code
	private String pos; //place of service code
	private String tos; //type of service code
	private String servDate;
	private String prcMethodCd; 
	private String ruleNumbId;
	private String otherInsuredLastName;
	private String otherInsuredId;
	private String otherCarrierFinCd;
	private String oplValueCd;
	private String oplValueAmt;
	private String totChgAmt;
	private String programCd;
	private String dlvyMethod;
	private String claimSpecNoteData; // claim special notations data
	private String perfProviderNumber; 
	private String nationalProviderId;
	
	// facility variables
	private String clmTpCd;
	private String bcbsProvId;
	private String natlOoaCd;
	private String lenStayDayNum;
	private String prcMethCdII;
	private String admitSrcCd;
	private String admitDt;
	private String stmtCovFromDt;
	private String stmtCovToDt;
	private String patStsCd;
	private String valCd1;
	private String valCd2;
	private String valCd3;
	private String valCd4;
	private String valCd5;
	private String valCd6;
	private String valCd7;
	private String valCd8;
	private String valCd9;
	private String valCd10;
	private String valCd11;
	private String valCd12;
	private String princProcCd;
	private String princProcDt;
	private String icd10PrincProcCd;
	private String icd10ProcCd1;
	private String icd10ProcCd2;
	private String icd10ProcCd3;
	private String icd10ProcCd4;
	private String icd10ProcCd5;
	private String icd10ProcCd6;
	private String icd10ProcCd7;
	private String icd10ProcCd8;
	private String icd10ProcCd9;
	private String icd10ProcCd10;
	private String icd10ProcCd11;
	private String icd10ProcCd12;
	private String icd10ProcCd13;
	private String icd10ProcCd14;
	private String icd10ProcCd15;
	private String icd10ProcCd16;
	private String icd10ProcCd17;
	private String icd10ProcCd18;
	private String icd10ProcCd19;
	private String icd10ProcCd20;
	private String icd10ProcCd21;
	private String icd10ProcCd22;
	private String icd10ProcCd23;
	private String icd10ProcCd24;
	private String procCd1;
	private String procCd2;
	private String procCd3;
	private String procCd4;
	private String procCd5;
	private String procCd6;
	private String procCd7;
	private String procCd8;
	private String procCd9;
	private String procCd10;
	private String procCd11;
	private String procCd12;
	private String procCd13;
	private String procCd14;
	private String procCd15;
	private String procCd16;
	private String procCd17;
	private String procCd18;
	private String procCd19;
	private String procCd20;
	private String procCd21;
	private String procCd22;
	private String procCd23;
	private String procCd24;
	private String procDt1;
	private String procDt2;
	private String procDt3;
	private String procDt4;
	private String procDt5;
	private String procDt6;
	private String procDt7;
	private String procDt8;
	private String procDt9;
	private String procDt10;
	private String procDt11;
	private String procDt12;
	private String procDt13;
	private String procDt14;
	private String procDt15;
	private String procDt16;
	private String procDt17;
	private String procDt18;
	private String procDt19;
	private String procDt20;
	private String procDt21;
	private String procDt22;
	private String procDt23;
	private String procDt24;
	private String princDiagPoaCd;
	private String icd10PrincDiagCd;
	private String icd10AdmitDiagCd;
	private String diagPoaCd1;
	private String diagPoaCd2;
	private String diagPoaCd3;
	private String diagPoaCd4;
	private String diagPoaCd5;
	private String diagPoaCd6;
	private String diagPoaCd7;
	private String diagPoaCd8;
	private String diagPoaCd9;
	private String diagPoaCd10;
	private String diagPoaCd11;
	private String diagPoaCd12;
	private String diagPoaCd13;
	private String diagPoaCd14;
	private String diagPoaCd15;
	private String diagPoaCd16;
	private String diagPoaCd17;
	private String diagPoaCd18;
	private String diagPoaCd19;
	private String diagPoaCd20;
	private String diagPoaCd21;
	private String diagPoaCd22;
	private String diagPoaCd23;
	private String diagPoaCd24;
	private String ruleNumId;
	private String prcMethCdIO;
	private String revCd;
	private String accomRateAmt;
	private String revTpCd;
	private String locRateAmt;
	private String benefitManagementTreatmentAuthNum;
	private String admitTpCd;
	private String condCd1;
	private String condCd2;
	private String condCd3;
	private String condCd4;
	private String condCd5;
	private String condCd6;
	private String condCd7;
	private String condCd8;
	private String condCd9;
	private String condCd10;
	private String admitHrNum;
	private String dischrgHrNum;
	private String occrCd1;
	private String occrCd2;
	private String occrCd3;
	private String occrCd4;
	private String occrCd5;
	private String occrCd6;
	private String occrCd7;
	private String occrCd8;
	private String occrCd9;
	private String occrCd10;
	private String occrDt1;
	private String occrDt2;
	private String occrDt3;
	private String occrDt4;
	private String occrDt5;
	private String occrDt6;
	private String occrDt7;
	private String occrDt8;
	private String occrDt9;
	private String occrDt10;
	private String billTpCd;
	private String medRecId;
	private String patRsnVisDiagCd1;
	private String patRsnVisDiagCd2;
	private String patRsnVisDiagCd3;
	private String icd10ExtCauseInjCd1;
	private String icd10ExtCauseInjCd2;
	private String icd10ExtCauseInjCd3;
	private String icd10ExtCauseInjCd4;
	private String icd10ExtCauseInjCd5;
	private String icd10ExtCauseInjCd6;
	private String icd10ExtCauseInjCd7;
	private String icd10ExtCauseInjCd8;
	private String icd10ExtCauseInjCd9;
	private String icd10ExtCauseInjCd10;
	private String icd10ExtCauseInjCd11;
	private String icd10ExtCauseInjCd12;
	private String natlProvId;
	private String subscriberFirstNm;
	private String subscriberLastNm;
	private String subscriberMiNm;
	private String subscriberId;
	private String cfaStatusCd;
	private String checkVoucherNumber;
	private String cfaProcessingDt;

	
	public String getSccf() {
		return sccfId;
	}
	public void setSccf(String sccfID) {
		this.sccfId = sccfID;
	}
	public String getHostPlan() {
		return hostPlanCntlId;
	}
	public void setHostPlan(String hostPlanID) {
		this.hostPlanCntlId = hostPlanID;
	}
	public String getPatLastName() {
		return patLastName;
	}
	public void setPatLastName(String lastName) {
		this.patLastName = lastName;
	}
	public String getPatFirstName() {
		return patFirstName;
	}
	public void setPatFirstName(String firstName) {
		this.patFirstName = firstName;
	}
	public String getPatMiNm() {
		return patMiddleName;
	}
	public void setPatMiNm(String patMiNm) {
		this.patMiddleName = patMiNm;
	}
	public String getPatBirthDt() {
		return patBirthDt;
	}
	public void setPatBirthDt(String birthDt) {
		this.patBirthDt = birthDt;
	}
	public String getPatSexCd() {
		return patSexCd;
	}
	public void setPatSexCd(String patSexCd) {
		this.patSexCd = patSexCd;
	}
	public String getPatAddressLnOneDesc() {
		return patAddressLnOneDesc;
	}
	public void setPatAddressLnOneDesc(String patAddressLnOneDesc) {
		this.patAddressLnOneDesc = patAddressLnOneDesc;
	}
	public String getPatAddressLnTwoDesc() {
		return patAddressLnTwoDesc;
	}
	public void setPatAddressLnTwoDesc(String patAddressLnTwoDesc) {
		this.patAddressLnTwoDesc = patAddressLnTwoDesc;
	}
	public String getPatCityName() {
		return patCityName;
	}
	public void setPatCityName(String patCityName) {
		this.patCityName = patCityName;
	}
	public String getPatStateCd() {
		return patStateCd;
	}
	public void setPatStateCd(String patStateCd) {
		this.patStateCd = patStateCd;
	}
	public String getPatZipCd() {
		return patZipCd;
	}
	public void setPatZipCd(String patZipCd) {
		this.patZipCd = patZipCd;
	}
	public String getPatPhoneNumberId() {
		return patPhoneNumberId;
	}
	public void setPatPhoneNumberId(String patPhoneNumberId) {
		this.patPhoneNumberId = patPhoneNumberId;
	}
	public String getPatRelSubCd() {
		return patRelSubCd;
	}
	public void setPatRelSubCd(String patRelSubCd) {
		this.patRelSubCd = patRelSubCd;
	}
	public String getPatWorkCompInd() {
		return patWorkCompInd;
	}
	public void setPatWorkCompInd(String patWorkCompInd) {
		this.patWorkCompInd = patWorkCompInd;
	}
	public String getPatCntlId() {
		return patCntlId;
	}
	public void setPatCntlId(String patCntlId) {
		this.patCntlId = patCntlId;
	}
	public double getPatPaidAmt() {
		return patPaidAmt;
	}
	public void setPatPaidAmt(double patPaidAmt) {
		this.patPaidAmt = patPaidAmt;
	}
	public String getAutoOthAccdntDc() {
		return autoOthAccdntDc;
	}
	public void setAutoOthAccdntDc(String autoOthAccdntDc) {
		this.autoOthAccdntDc = autoOthAccdntDc;
	}
	public String getAutoAccdntStCd() {
		return autoAccdntStCd;
	}
	public void setAutoAccdntStCd(String autoAccdntStCd) {
		this.autoAccdntStCd = autoAccdntStCd;
	}
	public String getSubApfxId() {
		return subApfxId;
	}
	public void setSubApfxId(String subApfxId) {
		this.subApfxId = subApfxId;
	}
	public String getSubSufxId() {
		return subSufxId;
	}
	public void setSubSufxId(String subSufxId) {
		this.subSufxId = subSufxId;
	}
	public String getSubLastName() {
		return subLastName;
	}
	public void setSubLastName(String subLastName) {
		this.subLastName = subLastName;
	}
	public String getSubFirstName() {
		return subFirstName;
	}
	public void setSubFirstName(String subFirstName) {
		this.subFirstName = subFirstName;
	}
	public String getSubMiddleName() {
		return subMiddleName;
	}
	public void setSubMiddleName(String subMiddleName) {
		this.subMiddleName = subMiddleName;
	}
	public String getSubAddressLnOneDesc() {
		return subAddressLnOneDesc;
	}
	public void setSubAddressLnOneDesc(String subAddressLnOneDesc) {
		this.subAddressLnOneDesc = subAddressLnOneDesc;
	}
	public String getSubAddressLnTwoDesc() {
		return subAddressLnTwoDesc;
	}
	public void setSubAddressLnTwoDesc(String subAddressLnTwoDesc) {
		this.subAddressLnTwoDesc = subAddressLnTwoDesc;
	}
	public String getSubCityName() {
		return subCityName;
	}
	public void setSubCityName(String subCityName) {
		this.subCityName = subCityName;
	}
	public String getSubStateCd() {
		return subStateCd;
	}
	public void setSubStateCd(String subStateCd) {
		this.subStateCd = subStateCd;
	}
	public String getSubZipCd() {
		return subZipCd;
	}
	public void setSubZipCd(String subZipCd) {
		this.subZipCd = subZipCd;
	}
	public String getSubGroupId() {
		return subGroupId;
	}
	public void setSubGroupId(String subGroupId) {
		this.subGroupId = subGroupId;
	}
	public String getSubBirthDt() {
		return subBirthDt;
	}
	public void setSubBirthDt(String subBirthDt) {
		this.subBirthDt = subBirthDt;
	}
	public String getSubSexCd() {
		return subSexCd;
	}
	public void setSubSexCd(String subSexCd) {
		this.subSexCd = subSexCd;
	}
	public String getOtherCarrier() {
		return otherCarrier;
	}
	public void setOtherCarrier(String otherCarrier) {
		this.otherCarrier = otherCarrier;
	}
	public String getSubOrgName() {
		return subOrgName;
	}
	public void setSubOrgName(String subOrgName) {
		this.subOrgName = subOrgName;
	}
	public String getRlseInfoCd() {
		return rlseInfoCd;
	}
	public void setRlseInfoCd(String rlseInfoCd) {
		this.rlseInfoCd = rlseInfoCd;
	}
	public String getAccIllOnsetDt() {
		return accIllOnsetDt;
	}
	public void setAccIllOnsetDt(String accIllOnsetDt) {
		this.accIllOnsetDt = accIllOnsetDt;
	}
	public String getUnableWorkFromDt() {
		return unableWorkFromDt;
	}
	public void setUnableWorkFromDt(String unableWorkFromDt) {
		this.unableWorkFromDt = unableWorkFromDt;
	}
	public String getUnableWorkToDt() {
		return unableWorkToDt;
	}
	public void setUnableWorkToDt(String unableWorkToDt) {
		this.unableWorkToDt = unableWorkToDt;
	}
	public String getRefProvLastName() {
		return refProvLastName;
	}
	public void setRefProvLastName(String refProvLastName) {
		this.refProvLastName = refProvLastName;
	}
	public String getRefProvFirstName() {
		return refProvFirstName;
	}
	public void setRefProvFirstName(String refProvFirstName) {
		this.refProvFirstName = refProvFirstName;
	}
	public String getRefProvMiddleName() {
		return refProvMiddleName;
	}
	public void setRefProvMiddleName(String refProvMiddleName) {
		this.refProvMiddleName = refProvMiddleName;
	}
	public String getRefProvId() {
		return refProvId;
	}
	public void setRefProvId(String refProvId) {
		this.refProvId = refProvId;
	}
	public String getRefProvNpiCd() {
		return refProvNpiCd;
	}
	public void setRefProvNpiCd(String refProvNpiCd) {
		this.refProvNpiCd = refProvNpiCd;
	}
	public String getFedTaxId() {
		return fedTaxId;
	}
	public void setFedTaxId(String fedTaxId) {
		this.fedTaxId = fedTaxId;
	}
	public String getAssgBnftInd() {
		return assgBnftInd;
	}
	public void setAssgBnftInd(String assgBnftInd) {
		this.assgBnftInd = assgBnftInd;
	}
	public String getServFacilName() {
		return servFacilName;
	}
	public void setServFacilName(String servFacilName) {
		this.servFacilName = servFacilName;
	}
	public String getServFacilStreetCd() {
		return servFacilStreetCd;
	}
	public void setServFacilStreetCd(String servFacilStreetCd) {
		this.servFacilStreetCd = servFacilStreetCd;
	}
	public String getServFacilZipCd() {
		return servFacilZipCd;
	}
	public void setServFacilZipCd(String servFacilZipCd) {
		this.servFacilZipCd = servFacilZipCd;
	}
	public String getServFacilLocId() {
		return servFacilLocId;
	}
	public void setServFacilLocId(String servFacilLocId) {
		this.servFacilLocId = servFacilLocId;
	}
	public String getBillProvLastName() {
		return billProvLastName;
	}
	public void setBillProvLastName(String billProvLastName) {
		this.billProvLastName = billProvLastName;
	}
	public String getBillProvFirstName() {
		return billProvFirstName;
	}
	public void setBillProvFirstName(String billProvFirstName) {
		this.billProvFirstName = billProvFirstName;
	}
	public String getBillProvMiddleName() {
		return billProvMiddleName;
	}
	public void setBillProvMiddleName(String billProvMiddleName) {
		this.billProvMiddleName = billProvMiddleName;
	}
	public String getProvLnOneAddress() {
		return provLnOneAddress;
	}
	public void setProvLnOneAddress(String provLnOneAddress) {
		this.provLnOneAddress = provLnOneAddress;
	}
	public String getProvLnTwoAddress() {
		return provLnTwoAddress;
	}
	public void setProvLnTwoAddress(String provLnTwoAddress) {
		this.provLnTwoAddress = provLnTwoAddress;
	}
	public String getProvCityName() {
		return provCityName;
	}
	public void setProvCityName(String provCityName) {
		this.provCityName = provCityName;
	}
	public String getProvStreetName() {
		return provStreetName;
	}
	public void setProvStreetName(String provStreetName) {
		this.provStreetName = provStreetName;
	}
	public String getProvStreetCd() {
		return provStreetCd;
	}
	public void setProvStreetCd(String provStreetCd) {
		this.provStreetCd = provStreetCd;
	}
	public String getProvZipCd() {
		return provZipCd;
	}
	public void setProvZipCd(String provZipCd) {
		this.provZipCd = provZipCd;
	}
	public String getProvPhoneNumberId() {
		return provPhoneNumberId;
	}
	public void setProvPhoneNumberId(String provPhoneNumberId) {
		this.provPhoneNumberId = provPhoneNumberId;
	}
	public String getProvNpiCd() {
		return provNpiCd;
	}
	public void setProvNpiCd(String provNpiCd) {
		this.provNpiCd = provNpiCd;
	}
	public String getIcdProvSubmitVerCd() {
		return icdProvSubmitVerCd;
	}
	public void setIcdProvSubmitVerCd(String icdProvSubmitVerCd) {
		this.icdProvSubmitVerCd = icdProvSubmitVerCd;
	}
	
	
	public String getDiagCdOne() {
		return diagCdOne;
	}
	public void setDiagCdOne(String diagCdOne) {
		this.diagCdOne = diagCdOne;
	}
	public String getDiagCdTwo() {
		return diagCdTwo;
	}
	public void setDiagCdTwo(String diagCdTwo) {
		this.diagCdTwo = diagCdTwo;
	}
	public String getDiagCdThree() {
		return diagCdThree;
	}
	public void setDiagCdThree(String diagCdThree) {
		this.diagCdThree = diagCdThree;
	}
	public String getDiagCdFour() {
		return diagCdFour;
	}
	public void setDiagCdFour(String diagCdFour) {
		this.diagCdFour = diagCdFour;
	}
	public String getDiagCdFive() {
		return diagCdFive;
	}
	public void setDiagCdFive(String diagCdFive) {
		this.diagCdFive = diagCdFive;
	}
	public String getDiagCdSix() {
		return diagCdSix;
	}
	public void setDiagCdSix(String diagCdSix) {
		this.diagCdSix = diagCdSix;
	}
	public String getDiagCdSeven() {
		return diagCdSeven;
	}
	public void setDiagCdSeven(String diagCdSeven) {
		this.diagCdSeven = diagCdSeven;
	}
	public String getDiagCdEight() {
		return diagCdEight;
	}
	public void setDiagCdEight(String diagCdEight) {
		this.diagCdEight = diagCdEight;
	}
	public String getDiagCdNine() {
		return diagCdNine;
	}
	public void setDiagCdNine(String diagCdNine) {
		this.diagCdNine = diagCdNine;
	}
	public String getDiagCdTen() {
		return diagCdTen;
	}
	public void setDiagCdTen(String diagCdTen) {
		this.diagCdTen = diagCdTen;
	}
	public String getDiagCdEleven() {
		return diagCdEleven;
	}
	public void setDiagCdEleven(String diagCdEleven) {
		this.diagCdEleven = diagCdEleven;
	}
	public String getDiagCdTwelve() {
		return diagCdTwelve;
	}
	public void setDiagCdTwelve(String diagCdTwelve) {
		this.diagCdTwelve = diagCdTwelve;
	}
	public String getDiagCdThirteen() {
		return diagCdThirteen;
	}
	public void setDiagCdThirteen(String diagCdThirteen) {
		this.diagCdThirteen = diagCdThirteen;
	}
	public String getDiagCdFourteen() {
		return diagCdFourteen;
	}
	public void setDiagCdFourteen(String diagCdFourteen) {
		this.diagCdFourteen = diagCdFourteen;
	}
	public String getDiagCdFifteen() {
		return diagCdFifteen;
	}
	public void setDiagCdFifteen(String diagCdFifteen) {
		this.diagCdFifteen = diagCdFifteen;
	}
	public String getDiagCdSixteen() {
		return diagCdSixteen;
	}
	public void setDiagCdSixteen(String diagCdSixteen) {
		this.diagCdSixteen = diagCdSixteen;
	}
	public String getDiagCdSeventeen() {
		return diagCdSeventeen;
	}
	public void setDiagCdSeventeen(String diagCdSeventeen) {
		this.diagCdSeventeen = diagCdSeventeen;
	}
	public String getDiagCdEighteen() {
		return diagCdEighteen;
	}
	public void setDiagCdEighteen(String diagCdEighteen) {
		this.diagCdEighteen = diagCdEighteen;
	}
	public String getDiagCdNineteen() {
		return diagCdNineteen;
	}
	public void setDiagCdNineteen(String diagCdNineteen) {
		this.diagCdNineteen = diagCdNineteen;
	}
	public String getDiagCdTwenty() {
		return diagCdTwenty;
	}
	public void setDiagCdTwenty(String diagCdTwenty) {
		this.diagCdTwenty = diagCdTwenty;
	}
	public String getDiagCdTwentyOne() {
		return diagCdTwentyOne;
	}
	public void setDiagCdTwentyOne(String diagCdTwentyOne) {
		this.diagCdTwentyOne = diagCdTwentyOne;
	}
	public String getDiagCdTwentyTwo() {
		return diagCdTwentyTwo;
	}
	public void setDiagCdTwentyTwo(String diagCdTwentyTwo) {
		this.diagCdTwentyTwo = diagCdTwentyTwo;
	}
	public String getDiagCdTwentyThree() {
		return diagCdTwentyThree;
	}
	public void setDiagCdTwentyThree(String diagCdTwentyThree) {
		this.diagCdTwentyThree = diagCdTwentyThree;
	}
	public String getDiagCdTwentyFour() {
		return diagCdTwentyFour;
	}
	public void setDiagCdTwentyFour(String diagCdTwentyFour) {
		this.diagCdTwentyFour = diagCdTwentyFour;
	}
	
	
	public String getIcdTenDiagCdOne() {
		return icdTenDiagCdOne;
	}
	public void setIcdTenDiagCdOne(String icdTenDiagCdOne) {
		this.icdTenDiagCdOne = icdTenDiagCdOne;
	}
	public String getIcdTenDiagCdTwo() {
		return icdTenDiagCdTwo;
	}
	public void setIcdTenDiagCdTwo(String icdTenDiagCdTwo) {
		this.icdTenDiagCdTwo = icdTenDiagCdTwo;
	}
	public String getIcdTenDiagCdThree() {
		return icdTenDiagCdThree;
	}
	public void setIcdTenDiagCdThree(String icdTenDiagCdThree) {
		this.icdTenDiagCdThree = icdTenDiagCdThree;
	}
	public String getIcdTenDiagCdFour() {
		return icdTenDiagCdFour;
	}
	public void setIcdTenDiagCdFour(String icdTenDiagCdFour) {
		this.icdTenDiagCdFour = icdTenDiagCdFour;
	}
	public String getIcdTenDiagCdFive() {
		return icdTenDiagCdFive;
	}
	public void setIcdTenDiagCdFive(String icdTenDiagCdFive) {
		this.icdTenDiagCdFive = icdTenDiagCdFive;
	}
	public String getIcdTenDiagCdSix() {
		return icdTenDiagCdSix;
	}
	public void setIcdTenDiagCdSix(String icdTenDiagCdSix) {
		this.icdTenDiagCdSix = icdTenDiagCdSix;
	}
	public String getIcdTenDiagCdSeven() {
		return icdTenDiagCdSeven;
	}
	public void setIcdTenDiagCdSeven(String icdTenDiagCdSeven) {
		this.icdTenDiagCdSeven = icdTenDiagCdSeven;
	}
	public String getIcdTenDiagCdEight() {
		return icdTenDiagCdEight;
	}
	public void setIcdTenDiagCdEight(String icdTenDiagCdEight) {
		this.icdTenDiagCdEight = icdTenDiagCdEight;
	}
	public String getIcdTenDiagCdNine() {
		return icdTenDiagCdNine;
	}
	public void setIcdTenDiagCdNine(String icdTenDiagCdNine) {
		this.icdTenDiagCdNine = icdTenDiagCdNine;
	}
	public String getIcdTenDiagCdTen() {
		return icdTenDiagCdTen;
	}
	public void setIcdTenDiagCdTen(String icdTenDiagCdTen) {
		this.icdTenDiagCdTen = icdTenDiagCdTen;
	}
	public String getIcdTenDiagCdEleven() {
		return icdTenDiagCdEleven;
	}
	public void setIcdTenDiagCdEleven(String icdTenDiagCdEleven) {
		this.icdTenDiagCdEleven = icdTenDiagCdEleven;
	}
	public String getIcdTenDiagCdTwelve() {
		return icdTenDiagCdTwelve;
	}
	public void setIcdTenDiagCdTwelve(String icdTenDiagCdTwelve) {
		this.icdTenDiagCdTwelve = icdTenDiagCdTwelve;
	}
	public String getIcdTenDiagCdThirteen() {
		return icdTenDiagCdThirteen;
	}
	public void setIcdTenDiagCdThirteen(String icdTenDiagCdThirteen) {
		this.icdTenDiagCdThirteen = icdTenDiagCdThirteen;
	}
	public String getIcdTenDiagCdFourteen() {
		return icdTenDiagCdFourteen;
	}
	public void setIcdTenDiagCdFourteen(String icdTenDiagCdFourteen) {
		this.icdTenDiagCdFourteen = icdTenDiagCdFourteen;
	}
	public String getIcdTenDiagCdFifteen() {
		return icdTenDiagCdFifteen;
	}
	public void setIcdTenDiagCdFifteen(String icdTenDiagCdFifteen) {
		this.icdTenDiagCdFifteen = icdTenDiagCdFifteen;
	}
	public String getIcdTenDiagCdSixteen() {
		return icdTenDiagCdSixteen;
	}
	public void setIcdTenDiagCdSixteen(String icdTenDiagCdSixteen) {
		this.icdTenDiagCdSixteen = icdTenDiagCdSixteen;
	}
	public String getIcdTenDiagCdSeventeen() {
		return icdTenDiagCdSeventeen;
	}
	public void setIcdTenDiagCdSeventeen(String icdTenDiagCdSeventeen) {
		this.icdTenDiagCdSeventeen = icdTenDiagCdSeventeen;
	}
	public String getIcdTenDiagCdEighteen() {
		return icdTenDiagCdEighteen;
	}
	public void setIcdTenDiagCdEighteen(String icdTenDiagCdEighteen) {
		this.icdTenDiagCdEighteen = icdTenDiagCdEighteen;
	}
	public String getIcdTenDiagCdNineteen() {
		return icdTenDiagCdNineteen;
	}
	public void setIcdTenDiagCdNineteen(String icdTenDiagCdNineteen) {
		this.icdTenDiagCdNineteen = icdTenDiagCdNineteen;
	}
	public String getIcdTenDiagCdTwenty() {
		return icdTenDiagCdTwenty;
	}
	public void setIcdTenDiagCdTwenty(String icdTenDiagCdTwenty) {
		this.icdTenDiagCdTwenty = icdTenDiagCdTwenty;
	}
	public String getIcdTenDiagCdTwentyOne() {
		return icdTenDiagCdTwentyOne;
	}
	public void setIcdTenDiagCdTwentyOne(String icdTenDiagCdTwentyOne) {
		this.icdTenDiagCdTwentyOne = icdTenDiagCdTwentyOne;
	}
	public String getIcdTenDiagCdTwentyTwo() {
		return icdTenDiagCdTwentyTwo;
	}
	public void setIcdTenDiagCdTwentyTwo(String icdTenDiagCdTwentyTwo) {
		this.icdTenDiagCdTwentyTwo = icdTenDiagCdTwentyTwo;
	}
	public String getIcdTenDiagCdTwentyThree() {
		return icdTenDiagCdTwentyThree;
	}
	public void setIcdTenDiagCdTwentyThree(String icdTenDiagCdTwentyThree) {
		this.icdTenDiagCdTwentyThree = icdTenDiagCdTwentyThree;
	}
	public String getIcdTenDiagCdTwentyFour() {
		return icdTenDiagCdTwentyFour;
	}
	public void setIcdTenDiagCdTwentyFour(String icdTenDiagCdTwentyFour) {
		this.icdTenDiagCdTwentyFour = icdTenDiagCdTwentyFour;
	}
	
	
	public String getOthInsId() {
		return othInsId;
	}
	public void setOthInsId(String othInsId) {
		this.othInsId = othInsId;
	}
	public String getOthPyrNm() {
		return othPyrNm;
	}
	public void setOthPyrNm(String othPyrNm) {
		this.othPyrNm = othPyrNm;
	}
	public String getLnNum() {
		return lnNum;
	}
	public void setLnNum(String lnNum) {
		this.lnNum = lnNum;
	}
	public String getServStartDt() {
		return servStartDt;
	}
	public void setServStartDt(String servStartDt) {
		this.servStartDt = servStartDt;
	}
	public String getServEndDt() {
		return servEndDt;
	}
	public void setServEndDt(String servEndDt) {
		this.servEndDt = servEndDt;
	}
	public String getPerfProvPosInd() {
		return perfProvPosInd;
	}
	public void setPerfProvPosInd(String perfProvPosInd) {
		this.perfProvPosInd = perfProvPosInd;
	}
	public String getHcpcsProcCd() {
		return hcpcsProcCd;
	}
	public void setHcpcsProcCd(String hcpcsProcCd) {
		this.hcpcsProcCd = hcpcsProcCd;
	}
	public String getHcpcsProcmodCdOne() {
		return hcpcsProcmodCdOne;
	}
	public void setHcpcsProcmodCdOne(String hcpcsProcmodCdOne) {
		this.hcpcsProcmodCdOne = hcpcsProcmodCdOne;
	}
	public String getHcpcsProcmodCdTwo() {
		return hcpcsProcmodCdTwo;
	}
	public void setHcpcsProcmodCdTwo(String hcpcsProcmodCdTwo) {
		this.hcpcsProcmodCdTwo = hcpcsProcmodCdTwo;
	}
	public String getHcpcsProcmodCdThree() {
		return hcpcsProcmodCdThree;
	}
	public void setHcpcsProcmodCdThree(String hcpcsProcmodCdThree) {
		this.hcpcsProcmodCdThree = hcpcsProcmodCdThree;
	}
	public String getHcpcsProcmodCdFour() {
		return hcpcsProcmodCdFour;
	}
	public void setHcpcsProcmodCdFour(String hcpcsProcmodCdFour) {
		this.hcpcsProcmodCdFour = hcpcsProcmodCdFour;
	}
	public String getOthhcpcsProcmodCdFourPyrNm() {
		return othhcpcsProcmodCdFourPyrNm;
	}
	public void setOthhcpcsProcmodCdFourPyrNm(String othhcpcsProcmodCdFourPyrNm) {
		this.othhcpcsProcmodCdFourPyrNm = othhcpcsProcmodCdFourPyrNm;
	}
	public String getDiagCdIndOne() {
		return diagCdIndOne;
	}
	public void setDiagCdIndOne(String diagCdIndOne) {
		this.diagCdIndOne = diagCdIndOne;
	}
	public String getDiagCdIndTwo() {
		return diagCdIndTwo;
	}
	public void setDiagCdIndTwo(String diagCdIndTwo) {
		this.diagCdIndTwo = diagCdIndTwo;
	}
	public String getDiagCdIndThree() {
		return diagCdIndThree;
	}
	public void setDiagCdIndThree(String diagCdIndThree) {
		this.diagCdIndThree = diagCdIndThree;
	}
	public String getDiagCdIndFour() {
		return diagCdIndFour;
	}
	public void setDiagCdIndFour(String diagCdIndFour) {
		this.diagCdIndFour = diagCdIndFour;
	}
	public double getServChgAmt() {
		return servChgAmt;
	}
	public void setServChgAmt(double servChgAmt) {
		this.servChgAmt = servChgAmt;
	}
	public String getServNum() {
		return servNum;
	}
	public void setServNum(String servNum) {
		this.servNum = servNum;
	}
	public String getPerfProvTxnmyCd() {
		return perfProvTxnmyCd;
	}
	public void setPerfProvTxnmyCd(String perfProvTxnmyCd) {
		this.perfProvTxnmyCd = perfProvTxnmyCd;
	}
	
	public String getHostPlanReceiptDt() {
		return hostPlanReceiptDt;
	}
	public void setHostPlanReceiptDt(String hostPlanReceiptDt) {
		this.hostPlanReceiptDt = hostPlanReceiptDt;
	}
	public String getBillTypeCd() {
		return billTypeCd;
	}
	public void setBillTypeCd(String billTypeCd) {
		this.billTypeCd = billTypeCd;
	}
	public String getFdbPostingDt() {
		return fdbPostingDt;
	}
	public void setFdbPostingDt(String fdbPostingDt) {
		this.fdbPostingDt = fdbPostingDt;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	
	
	public String getTos() {
		return tos;
	}
	
	public void setTos(String tos) {
		this.tos = tos;
	}
	
	public String getServDate() {
		return servDate;
	}
	
	public void setServDate(String servDate) {
		this.servDate = servDate;
	}
	public String getPrcMethodCd() {
		return prcMethodCd;
	}
	public void setPrcMethodCd(String prcMethodCd) {
		this.prcMethodCd = prcMethodCd;
	}
	public String getRuleNumbId() {
		return ruleNumbId;
	}
	public void setRuleNumbId(String ruleNumbId) {
		this.ruleNumbId = ruleNumbId;
	}

	public String getOtherInsuredLastName() {
		return otherInsuredLastName;
	}
	public void setOtherInsuredLastName(String otherInsuredLastName) {
		this.otherInsuredLastName = otherInsuredLastName;
	}
	public String getOtherInsuredId() {
		return otherInsuredId;
	}
	public void setOtherInsuredId(String otherInsuredId) {
		this.otherInsuredId = otherInsuredId;
	}
	public String getOtherCarrierFinCd() {
		return otherCarrierFinCd;
	}
	public void setOtherCarrierFinCd(String otherCarrierFinCd) {
		this.otherCarrierFinCd = otherCarrierFinCd;
	}
	public String getOplValueCd() {
		return oplValueCd;
	}
	public void setOplValueCd(String oplValueCd) {
		if (oplValueCd == null){
			this.oplValueCd = "n/a";
		}
		this.oplValueCd = oplValueCd;
	}
	public String getOplValueAmt() {
		return oplValueAmt;
	}
	public void setOplValueAmt(String oplValueAmt) {
		if (oplValueAmt == null){
			this.oplValueAmt = "n/a";
		}
		this.oplValueAmt = oplValueAmt;
	}
	/**
	 * @return the totChgAmt
	 */
	public String getTotChgAmt() {
		return totChgAmt;
	}
	/**
	 * @param totChgAmt the totChgAmt to set
	 */
	public void setTotChgAmt(String totChgAmt) {
		this.totChgAmt = totChgAmt;
	}
	/**
	 * @return the programCd
	 */
	public String getProgramCd() {
		return programCd;
	}
	/**
	 * @param programCd the programCd to set
	 */
	public void setProgramCd(String programCd) {
		this.programCd = programCd;
	}
	/**
	 * @return the dlvyMethod
	 */
	public String getDlvyMethod() {
		return dlvyMethod;
	}
	/**
	 * @param dlvyMethod the dlvyMethod to set
	 */
	public void setDlvyMethod(String dlvyMethod) {
		this.dlvyMethod = dlvyMethod;
	}
	
	public String getClaimSpecNoteData() {
		return claimSpecNoteData;
	}
	public void setClaimSpecNoteData(String claimSpecNoteData) {
		if (claimSpecNoteData == null){
			this.claimSpecNoteData = "no data found";
		}
		this.claimSpecNoteData = claimSpecNoteData;
	}
	
	public String getPerfProviderNumber() {
		return perfProviderNumber;
	}
	public void setPerfProviderNumber(String perfProviderNumber) {
		this.perfProviderNumber = perfProviderNumber;
	}
	public String getClmTpCd() {
		return clmTpCd;
	}
	public void setClmTpCd(String clmTpCd) {
		this.clmTpCd = clmTpCd;
	}
	public String getBcbsProvId() {
		return bcbsProvId;
	}
	public void setBcbsProvId(String bcbsProvId) {
		this.bcbsProvId = bcbsProvId;
	}
	public String getNatlOoaCd() {
		return natlOoaCd;
	}
	public void setNatlOoaCd(String natlOoaCd) {
		this.natlOoaCd = natlOoaCd;
	}
	public String getLenStayDayNum() {
		return lenStayDayNum;
	}
	public void setLenStayDayNum(String lenStayDayNum) {
		this.lenStayDayNum = lenStayDayNum;
	}
	public String getPrcMethCdII() {
		return prcMethCdII;
	}
	public void setPrcMethCdII(String prcMethCdII) {
		this.prcMethCdII = prcMethCdII;
	}
	public String getAdmitSrcCd() {
		return admitSrcCd;
	}
	public void setAdmitSrcCd(String admitSrcCd) {
		this.admitSrcCd = admitSrcCd;
	}
	public String getAdmitDt() {
		return admitDt;
	}
	public void setAdmitDt(String admitDt) {
		this.admitDt = admitDt;
	}
	public String getStmtCovFromDt() {
		return stmtCovFromDt;
	}
	public void setStmtCovFromDt(String stmtCovFromDt) {
		this.stmtCovFromDt = stmtCovFromDt;
	}
	public String getStmtCovToDt() {
		return stmtCovToDt;
	}
	public void setStmtCovToDt(String stmtCovToDt) {
		this.stmtCovToDt = stmtCovToDt;
	}
	public String getPatStsCd() {
		return patStsCd;
	}
	public void setPatStsCd(String patStsCd) {
		this.patStsCd = patStsCd;
	}
	public String getValCd1() {
		return valCd1;
	}
	public void setValCd1(String valCd1) {
		this.valCd1 = valCd1;
	}
	public String getValCd2() {
		return valCd2;
	}
	public void setValCd2(String valCd2) {
		this.valCd2 = valCd2;
	}
	public String getValCd3() {
		return valCd3;
	}
	public void setValCd3(String valCd3) {
		this.valCd3 = valCd3;
	}
	public String getValCd4() {
		return valCd4;
	}
	public void setValCd4(String valCd4) {
		this.valCd4 = valCd4;
	}
	public String getValCd5() {
		return valCd5;
	}
	public void setValCd5(String valCd5) {
		this.valCd5 = valCd5;
	}
	public String getValCd6() {
		return valCd6;
	}
	public void setValCd6(String valCd6) {
		this.valCd6 = valCd6;
	}
	public String getValCd7() {
		return valCd7;
	}
	public void setValCd7(String valCd7) {
		this.valCd7 = valCd7;
	}
	public String getValCd8() {
		return valCd8;
	}
	public void setValCd8(String valCd8) {
		this.valCd8 = valCd8;
	}
	public String getValCd9() {
		return valCd9;
	}
	public void setValCd9(String valCd9) {
		this.valCd9 = valCd9;
	}
	public String getValCd10() {
		return valCd10;
	}
	public void setValCd10(String valCd10) {
		this.valCd10 = valCd10;
	}
	public String getValCd11() {
		return valCd11;
	}
	public void setValCd11(String valCd11) {
		this.valCd11 = valCd11;
	}
	public String getValCd12() {
		return valCd12;
	}
	public void setValCd12(String valCd12) {
		this.valCd12 = valCd12;
	}
	public String getPrincProcCd() {
		return princProcCd;
	}
	public void setPrincProcCd(String princProcCd) {
		this.princProcCd = princProcCd;
	}
	public String getPrincProcDt() {
		return princProcDt;
	}
	public void setPrincProcDt(String princProcDt) {
		this.princProcDt = princProcDt;
	}
	public String getIcd10PrincProcCd() {
		return icd10PrincProcCd;
	}
	public void setIcd10PrincProcCd(String icd10PrincProcCd) {
		this.icd10PrincProcCd = icd10PrincProcCd;
	}
	public String getIcd10ProcCd1() {
		return icd10ProcCd1;
	}
	public void setIcd10ProcCd1(String icd10ProcCd1) {
		this.icd10ProcCd1 = icd10ProcCd1;
	}
	public String getIcd10ProcCd2() {
		return icd10ProcCd2;
	}
	public void setIcd10ProcCd2(String icd10ProcCd2) {
		this.icd10ProcCd2 = icd10ProcCd2;
	}
	public String getIcd10ProcCd3() {
		return icd10ProcCd3;
	}
	public void setIcd10ProcCd3(String icd10ProcCd3) {
		this.icd10ProcCd3 = icd10ProcCd3;
	}
	public String getIcd10ProcCd4() {
		return icd10ProcCd4;
	}
	public void setIcd10ProcCd4(String icd10ProcCd4) {
		this.icd10ProcCd4 = icd10ProcCd4;
	}
	public String getIcd10ProcCd5() {
		return icd10ProcCd5;
	}
	public void setIcd10ProcCd5(String icd10ProcCd5) {
		this.icd10ProcCd5 = icd10ProcCd5;
	}
	public String getIcd10ProcCd6() {
		return icd10ProcCd6;
	}
	public void setIcd10ProcCd6(String icd10ProcCd6) {
		this.icd10ProcCd6 = icd10ProcCd6;
	}
	public String getIcd10ProcCd7() {
		return icd10ProcCd7;
	}
	public void setIcd10ProcCd7(String icd10ProcCd7) {
		this.icd10ProcCd7 = icd10ProcCd7;
	}
	public String getIcd10ProcCd8() {
		return icd10ProcCd8;
	}
	public void setIcd10ProcCd8(String icd10ProcCd8) {
		this.icd10ProcCd8 = icd10ProcCd8;
	}
	public String getIcd10ProcCd9() {
		return icd10ProcCd9;
	}
	public void setIcd10ProcCd9(String icd10ProcCd9) {
		this.icd10ProcCd9 = icd10ProcCd9;
	}
	public String getIcd10ProcCd10() {
		return icd10ProcCd10;
	}
	public void setIcd10ProcCd10(String icd10ProcCd10) {
		this.icd10ProcCd10 = icd10ProcCd10;
	}
	public String getIcd10ProcCd11() {
		return icd10ProcCd11;
	}
	public void setIcd10ProcCd11(String icd10ProcCd11) {
		this.icd10ProcCd11 = icd10ProcCd11;
	}
	public String getIcd10ProcCd12() {
		return icd10ProcCd12;
	}
	public void setIcd10ProcCd12(String icd10ProcCd12) {
		this.icd10ProcCd12 = icd10ProcCd12;
	}
	public String getIcd10ProcCd13() {
		return icd10ProcCd13;
	}
	public void setIcd10ProcCd13(String icd10ProcCd13) {
		this.icd10ProcCd13 = icd10ProcCd13;
	}
	public String getIcd10ProcCd14() {
		return icd10ProcCd14;
	}
	public void setIcd10ProcCd14(String icd10ProcCd14) {
		this.icd10ProcCd14 = icd10ProcCd14;
	}
	public String getIcd10ProcCd15() {
		return icd10ProcCd15;
	}
	public void setIcd10ProcCd15(String icd10ProcCd15) {
		this.icd10ProcCd15 = icd10ProcCd15;
	}
	public String getIcd10ProcCd16() {
		return icd10ProcCd16;
	}
	public void setIcd10ProcCd16(String icd10ProcCd16) {
		this.icd10ProcCd16 = icd10ProcCd16;
	}
	public String getIcd10ProcCd17() {
		return icd10ProcCd17;
	}
	public void setIcd10ProcCd17(String icd10ProcCd17) {
		this.icd10ProcCd17 = icd10ProcCd17;
	}
	public String getIcd10ProcCd18() {
		return icd10ProcCd18;
	}
	public void setIcd10ProcCd18(String icd10ProcCd18) {
		this.icd10ProcCd18 = icd10ProcCd18;
	}
	public String getIcd10ProcCd19() {
		return icd10ProcCd19;
	}
	public void setIcd10ProcCd19(String icd10ProcCd19) {
		this.icd10ProcCd19 = icd10ProcCd19;
	}
	public String getIcd10ProcCd20() {
		return icd10ProcCd20;
	}
	public void setIcd10ProcCd20(String icd10ProcCd20) {
		this.icd10ProcCd20 = icd10ProcCd20;
	}
	public String getIcd10ProcCd21() {
		return icd10ProcCd21;
	}
	public void setIcd10ProcCd21(String icd10ProcCd21) {
		this.icd10ProcCd21 = icd10ProcCd21;
	}
	public String getIcd10ProcCd22() {
		return icd10ProcCd22;
	}
	public void setIcd10ProcCd22(String icd10ProcCd22) {
		this.icd10ProcCd22 = icd10ProcCd22;
	}
	public String getIcd10ProcCd23() {
		return icd10ProcCd23;
	}
	public void setIcd10ProcCd23(String icd10ProcCd23) {
		this.icd10ProcCd23 = icd10ProcCd23;
	}
	public String getIcd10ProcCd24() {
		return icd10ProcCd24;
	}
	public void setIcd10ProcCd24(String icd10ProcCd24) {
		this.icd10ProcCd24 = icd10ProcCd24;
	}
	public String getProcCd1() {
		return procCd1;
	}
	public void setProcCd1(String procCd1) {
		this.procCd1 = procCd1;
	}
	public String getProcCd2() {
		return procCd2;
	}
	public void setProcCd2(String procCd2) {
		this.procCd2 = procCd2;
	}
	public String getProcCd3() {
		return procCd3;
	}
	public void setProcCd3(String procCd3) {
		this.procCd3 = procCd3;
	}
	public String getProcCd4() {
		return procCd4;
	}
	public void setProcCd4(String procCd4) {
		this.procCd4 = procCd4;
	}
	public String getProcCd5() {
		return procCd5;
	}
	public void setProcCd5(String procCd5) {
		this.procCd5 = procCd5;
	}
	public String getProcCd6() {
		return procCd6;
	}
	public void setProcCd6(String procCd6) {
		this.procCd6 = procCd6;
	}
	public String getProcCd7() {
		return procCd7;
	}
	public void setProcCd7(String procCd7) {
		this.procCd7 = procCd7;
	}
	public String getProcCd8() {
		return procCd8;
	}
	public void setProcCd8(String procCd8) {
		this.procCd8 = procCd8;
	}
	public String getProcCd9() {
		return procCd9;
	}
	public void setProcCd9(String procCd9) {
		this.procCd9 = procCd9;
	}
	public String getProcCd10() {
		return procCd10;
	}
	public void setProcCd10(String procCd10) {
		this.procCd10 = procCd10;
	}
	public String getProcCd11() {
		return procCd11;
	}
	public void setProcCd11(String procCd11) {
		this.procCd11 = procCd11;
	}
	public String getProcCd12() {
		return procCd12;
	}
	public void setProcCd12(String procCd12) {
		this.procCd12 = procCd12;
	}
	public String getProcCd13() {
		return procCd13;
	}
	public void setProcCd13(String procCd13) {
		this.procCd13 = procCd13;
	}
	public String getProcCd14() {
		return procCd14;
	}
	public void setProcCd14(String procCd14) {
		this.procCd14 = procCd14;
	}
	public String getProcCd15() {
		return procCd15;
	}
	public void setProcCd15(String procCd15) {
		this.procCd15 = procCd15;
	}
	public String getProcCd16() {
		return procCd16;
	}
	public void setProcCd16(String procCd16) {
		this.procCd16 = procCd16;
	}
	public String getProcCd17() {
		return procCd17;
	}
	public void setProcCd17(String procCd17) {
		this.procCd17 = procCd17;
	}
	public String getProcCd18() {
		return procCd18;
	}
	public void setProcCd18(String procCd18) {
		this.procCd18 = procCd18;
	}
	public String getProcCd19() {
		return procCd19;
	}
	public void setProcCd19(String procCd19) {
		this.procCd19 = procCd19;
	}
	public String getProcCd20() {
		return procCd20;
	}
	public void setProcCd20(String procCd20) {
		this.procCd20 = procCd20;
	}
	public String getProcCd21() {
		return procCd21;
	}
	public void setProcCd21(String procCd21) {
		this.procCd21 = procCd21;
	}
	public String getProcCd22() {
		return procCd22;
	}
	public void setProcCd22(String procCd22) {
		this.procCd22 = procCd22;
	}
	public String getProcCd23() {
		return procCd23;
	}
	public void setProcCd23(String procCd23) {
		this.procCd23 = procCd23;
	}
	public String getProcCd24() {
		return procCd24;
	}
	public void setProcCd24(String procCd24) {
		this.procCd24 = procCd24;
	}
	public String getProcDt1() {
		return procDt1;
	}
	public void setProcDt1(String procDt1) {
		this.procDt1 = procDt1;
	}
	public String getProcDt2() {
		return procDt2;
	}
	public void setProcDt2(String procDt2) {
		this.procDt2 = procDt2;
	}
	public String getProcDt3() {
		return procDt3;
	}
	public void setProcDt3(String procDt3) {
		this.procDt3 = procDt3;
	}
	public String getProcDt4() {
		return procDt4;
	}
	public void setProcDt4(String procDt4) {
		this.procDt4 = procDt4;
	}
	public String getProcDt5() {
		return procDt5;
	}
	public void setProcDt5(String procDt5) {
		this.procDt5 = procDt5;
	}
	public String getProcDt6() {
		return procDt6;
	}
	public void setProcDt6(String procDt6) {
		this.procDt6 = procDt6;
	}
	public String getProcDt7() {
		return procDt7;
	}
	public void setProcDt7(String procDt7) {
		this.procDt7 = procDt7;
	}
	public String getProcDt8() {
		return procDt8;
	}
	public void setProcDt8(String procDt8) {
		this.procDt8 = procDt8;
	}
	public String getProcDt9() {
		return procDt9;
	}
	public void setProcDt9(String procDt9) {
		this.procDt9 = procDt9;
	}
	public String getProcDt10() {
		return procDt10;
	}
	public void setProcDt10(String procDt10) {
		this.procDt10 = procDt10;
	}
	public String getProcDt11() {
		return procDt11;
	}
	public void setProcDt11(String procDt11) {
		this.procDt11 = procDt11;
	}
	public String getProcDt12() {
		return procDt12;
	}
	public void setProcDt12(String procDt12) {
		this.procDt12 = procDt12;
	}
	public String getProcDt13() {
		return procDt13;
	}
	public void setProcDt13(String procDt13) {
		this.procDt13 = procDt13;
	}
	public String getProcDt14() {
		return procDt14;
	}
	public void setProcDt14(String procDt14) {
		this.procDt14 = procDt14;
	}
	public String getProcDt15() {
		return procDt15;
	}
	public void setProcDt15(String procDt15) {
		this.procDt15 = procDt15;
	}
	public String getProcDt16() {
		return procDt16;
	}
	public void setProcDt16(String procDt16) {
		this.procDt16 = procDt16;
	}
	public String getProcDt17() {
		return procDt17;
	}
	public void setProcDt17(String procDt17) {
		this.procDt17 = procDt17;
	}
	public String getProcDt18() {
		return procDt18;
	}
	public void setProcDt18(String procDt18) {
		this.procDt18 = procDt18;
	}
	public String getProcDt19() {
		return procDt19;
	}
	public void setProcDt19(String procDt19) {
		this.procDt19 = procDt19;
	}
	public String getProcDt20() {
		return procDt20;
	}
	public void setProcDt20(String procDt20) {
		this.procDt20 = procDt20;
	}
	public String getProcDt21() {
		return procDt21;
	}
	public void setProcDt21(String procDt21) {
		this.procDt21 = procDt21;
	}
	public String getProcDt22() {
		return procDt22;
	}
	public void setProcDt22(String procDt22) {
		this.procDt22 = procDt22;
	}
	public String getProcDt23() {
		return procDt23;
	}
	public void setProcDt23(String procDt23) {
		this.procDt23 = procDt23;
	}
	public String getProcDt24() {
		return procDt24;
	}
	public void setProcDt24(String procDt24) {
		this.procDt24 = procDt24;
	}
	public String getPrincDiagPoaCd() {
		return princDiagPoaCd;
	}
	public void setPrincDiagPoaCd(String princDiagPoaCd) {
		this.princDiagPoaCd = princDiagPoaCd;
	}
	public String getIcd10PrincDiagCd() {
		return icd10PrincDiagCd;
	}
	public void setIcd10PrincDiagCd(String icd10PrincDiagCd) {
		this.icd10PrincDiagCd = icd10PrincDiagCd;
	}
	public String getIcd10AdmitDiagCd() {
		return icd10AdmitDiagCd;
	}
	public void setIcd10AdmitDiagCd(String icd10AdmitDiagCd) {
		this.icd10AdmitDiagCd = icd10AdmitDiagCd;
	}
	public String getDiagPoaCd1() {
		return diagPoaCd1;
	}
	public void setDiagPoaCd1(String diagPoaCd1) {
		this.diagPoaCd1 = diagPoaCd1;
	}
	public String getDiagPoaCd2() {
		return diagPoaCd2;
	}
	public void setDiagPoaCd2(String diagPoaCd2) {
		this.diagPoaCd2 = diagPoaCd2;
	}
	public String getDiagPoaCd3() {
		return diagPoaCd3;
	}
	public void setDiagPoaCd3(String diagPoaCd3) {
		this.diagPoaCd3 = diagPoaCd3;
	}
	public String getDiagPoaCd4() {
		return diagPoaCd4;
	}
	public void setDiagPoaCd4(String diagPoaCd4) {
		this.diagPoaCd4 = diagPoaCd4;
	}
	public String getDiagPoaCd5() {
		return diagPoaCd5;
	}
	public void setDiagPoaCd5(String diagPoaCd5) {
		this.diagPoaCd5 = diagPoaCd5;
	}
	public String getDiagPoaCd6() {
		return diagPoaCd6;
	}
	public void setDiagPoaCd6(String diagPoaCd6) {
		this.diagPoaCd6 = diagPoaCd6;
	}
	public String getDiagPoaCd7() {
		return diagPoaCd7;
	}
	public void setDiagPoaCd7(String diagPoaCd7) {
		this.diagPoaCd7 = diagPoaCd7;
	}
	public String getDiagPoaCd8() {
		return diagPoaCd8;
	}
	public void setDiagPoaCd8(String diagPoaCd8) {
		this.diagPoaCd8 = diagPoaCd8;
	}
	public String getDiagPoaCd9() {
		return diagPoaCd9;
	}
	public void setDiagPoaCd9(String diagPoaCd9) {
		this.diagPoaCd9 = diagPoaCd9;
	}
	public String getDiagPoaCd10() {
		return diagPoaCd10;
	}
	public void setDiagPoaCd10(String diagPoaCd10) {
		this.diagPoaCd10 = diagPoaCd10;
	}
	public String getDiagPoaCd11() {
		return diagPoaCd11;
	}
	public void setDiagPoaCd11(String diagPoaCd11) {
		this.diagPoaCd11 = diagPoaCd11;
	}
	public String getDiagPoaCd12() {
		return diagPoaCd12;
	}
	public void setDiagPoaCd12(String diagPoaCd12) {
		this.diagPoaCd12 = diagPoaCd12;
	}
	public String getDiagPoaCd13() {
		return diagPoaCd13;
	}
	public void setDiagPoaCd13(String diagPoaCd13) {
		this.diagPoaCd13 = diagPoaCd13;
	}
	public String getDiagPoaCd14() {
		return diagPoaCd14;
	}
	public void setDiagPoaCd14(String diagPoaCd14) {
		this.diagPoaCd14 = diagPoaCd14;
	}
	public String getDiagPoaCd15() {
		return diagPoaCd15;
	}
	public void setDiagPoaCd15(String diagPoaCd15) {
		this.diagPoaCd15 = diagPoaCd15;
	}
	public String getDiagPoaCd16() {
		return diagPoaCd16;
	}
	public void setDiagPoaCd16(String diagPoaCd16) {
		this.diagPoaCd16 = diagPoaCd16;
	}
	public String getDiagPoaCd17() {
		return diagPoaCd17;
	}
	public void setDiagPoaCd17(String diagPoaCd17) {
		this.diagPoaCd17 = diagPoaCd17;
	}
	public String getDiagPoaCd18() {
		return diagPoaCd18;
	}
	public void setDiagPoaCd18(String diagPoaCd18) {
		this.diagPoaCd18 = diagPoaCd18;
	}
	public String getDiagPoaCd19() {
		return diagPoaCd19;
	}
	public void setDiagPoaCd19(String diagPoaCd19) {
		this.diagPoaCd19 = diagPoaCd19;
	}
	public String getDiagPoaCd20() {
		return diagPoaCd20;
	}
	public void setDiagPoaCd20(String diagPoaCd20) {
		this.diagPoaCd20 = diagPoaCd20;
	}
	public String getDiagPoaCd21() {
		return diagPoaCd21;
	}
	public void setDiagPoaCd21(String diagPoaCd21) {
		this.diagPoaCd21 = diagPoaCd21;
	}
	public String getDiagPoaCd22() {
		return diagPoaCd22;
	}
	public void setDiagPoaCd22(String diagPoaCd22) {
		this.diagPoaCd22 = diagPoaCd22;
	}
	public String getDiagPoaCd23() {
		return diagPoaCd23;
	}
	public void setDiagPoaCd23(String diagPoaCd23) {
		this.diagPoaCd23 = diagPoaCd23;
	}
	public String getDiagPoaCd24() {
		return diagPoaCd24;
	}
	public void setDiagPoaCd24(String diagPoaCd24) {
		this.diagPoaCd24 = diagPoaCd24;
	}
	public String getRuleNumId() {
		return ruleNumId;
	}
	public void setRuleNumId(String ruleNumId) {
		this.ruleNumId = ruleNumId;
	}
	public String getPrcMethCdIO() {
		return prcMethCdIO;
	}
	public void setPrcMethCdIO(String prcMethCdIO) {
		this.prcMethCdIO = prcMethCdIO;
	}
	public String getRevCd() {
		return revCd;
	}
	public void setRevCd(String revCd) {
		this.revCd = revCd;
	}
	public String getAccomRateAmt() {
		return accomRateAmt;
	}
	public void setAccomRateAmt(String accomRateAmt) {
		this.accomRateAmt = accomRateAmt;
	}
	public String getRevTpCd() {
		return revTpCd;
	}
	public void setRevTpCd(String revTpCd) {
		this.revTpCd = revTpCd;
	}
	public String getLocRateAmt() {
		return locRateAmt;
	}
	public void setLocRateAmt(String locRateAmt) {
		this.locRateAmt = locRateAmt;
	}
	public String getHostPlanCntlId() {
		return hostPlanCntlId;
	}
	public void setHostPlanCntlId(String hostPlanCntlId) {
		this.hostPlanCntlId = hostPlanCntlId;
	}
	public String getBenefitManagementTreatmentAuthNum() {
		return benefitManagementTreatmentAuthNum;
	}
	public void setBenefitManagementTreatmentAuthNum(String benefitManagementTreatmentAuthNum) {
		this.benefitManagementTreatmentAuthNum = benefitManagementTreatmentAuthNum;
	}
	public String getAdmitTpCd() {
		return admitTpCd;
	}
	public void setAdmitTpCd(String admitTpCd) {
		this.admitTpCd = admitTpCd;
	}
	public String getCondCd1() {
		return condCd1;
	}
	public void setCondCd1(String condCd1) {
		this.condCd1 = condCd1;
	}
	public String getCondCd2() {
		return condCd2;
	}
	public void setCondCd2(String condCd2) {
		this.condCd2 = condCd2;
	}
	public String getCondCd3() {
		return condCd3;
	}
	public void setCondCd3(String condCd3) {
		this.condCd3 = condCd3;
	}
	public String getCondCd4() {
		return condCd4;
	}
	public void setCondCd4(String condCd4) {
		this.condCd4 = condCd4;
	}
	public String getCondCd5() {
		return condCd5;
	}
	public void setCondCd5(String condCd5) {
		this.condCd5 = condCd5;
	}
	public String getCondCd6() {
		return condCd6;
	}
	public void setCondCd6(String condCd6) {
		this.condCd6 = condCd6;
	}
	public String getCondCd7() {
		return condCd7;
	}
	public void setCondCd7(String condCd7) {
		this.condCd7 = condCd7;
	}
	public String getCondCd8() {
		return condCd8;
	}
	public void setCondCd8(String condCd8) {
		this.condCd8 = condCd8;
	}
	public String getCondCd9() {
		return condCd9;
	}
	public void setCondCd9(String condCd9) {
		this.condCd9 = condCd9;
	}
	public String getCondCd10() {
		return condCd10;
	}
	public void setCondCd10(String condCd10) {
		this.condCd10 = condCd10;
	}
	public String getAdmitHrNum() {
		return admitHrNum;
	}
	public void setAdmitHrNum(String admitHrNum) {
		this.admitHrNum = admitHrNum;
	}
	public String getDischrgHrNum() {
		return dischrgHrNum;
	}
	public void setDischrgHrNum(String dischrgHrNum) {
		this.dischrgHrNum = dischrgHrNum;
	}
	public String getOccrCd1() {
		return occrCd1;
	}
	public void setOccrCd1(String occrCd1) {
		this.occrCd1 = occrCd1;
	}
	public String getOccrCd2() {
		return occrCd2;
	}
	public void setOccrCd2(String occrCd2) {
		this.occrCd2 = occrCd2;
	}
	public String getOccrCd3() {
		return occrCd3;
	}
	public void setOccrCd3(String occrCd3) {
		this.occrCd3 = occrCd3;
	}
	public String getOccrCd4() {
		return occrCd4;
	}
	public void setOccrCd4(String occrCd4) {
		this.occrCd4 = occrCd4;
	}
	public String getOccrCd5() {
		return occrCd5;
	}
	public void setOccrCd5(String occrCd5) {
		this.occrCd5 = occrCd5;
	}
	public String getOccrCd6() {
		return occrCd6;
	}
	public void setOccrCd6(String occrCd6) {
		this.occrCd6 = occrCd6;
	}
	public String getOccrCd7() {
		return occrCd7;
	}
	public void setOccrCd7(String occrCd7) {
		this.occrCd7 = occrCd7;
	}
	public String getOccrCd8() {
		return occrCd8;
	}
	public void setOccrCd8(String occrCd8) {
		this.occrCd8 = occrCd8;
	}
	public String getOccrCd9() {
		return occrCd9;
	}
	public void setOccrCd9(String occrCd9) {
		this.occrCd9 = occrCd9;
	}
	public String getOccrCd10() {
		return occrCd10;
	}
	public void setOccrCd10(String occrCd10) {
		this.occrCd10 = occrCd10;
	}
	public String getOccrDt1() {
		return occrDt1;
	}
	public void setOccrDt1(String occrDt1) {
		this.occrDt1 = occrDt1;
	}
	public String getOccrDt2() {
		return occrDt2;
	}
	public void setOccrDt2(String occrDt2) {
		this.occrDt2 = occrDt2;
	}
	public String getOccrDt3() {
		return occrDt3;
	}
	public void setOccrDt3(String occrDt3) {
		this.occrDt3 = occrDt3;
	}
	public String getOccrDt4() {
		return occrDt4;
	}
	public void setOccrDt4(String occrDt4) {
		this.occrDt4 = occrDt4;
	}
	public String getOccrDt5() {
		return occrDt5;
	}
	public void setOccrDt5(String occrDt5) {
		this.occrDt5 = occrDt5;
	}
	public String getOccrDt6() {
		return occrDt6;
	}
	public void setOccrDt6(String occrDt6) {
		this.occrDt6 = occrDt6;
	}
	public String getOccrDt7() {
		return occrDt7;
	}
	public void setOccrDt7(String occrDt7) {
		this.occrDt7 = occrDt7;
	}
	public String getOccrDt8() {
		return occrDt8;
	}
	public void setOccrDt8(String occrDt8) {
		this.occrDt8 = occrDt8;
	}
	public String getOccrDt9() {
		return occrDt9;
	}
	public void setOccrDt9(String occrDt9) {
		this.occrDt9 = occrDt9;
	}
	public String getOccrDt10() {
		return occrDt10;
	}
	public void setOccrDt10(String occrDt10) {
		this.occrDt10 = occrDt10;
	}
	public String getBillTpCd() {
		return billTpCd;
	}
	public void setBillTpCd(String billTpCd) {
		this.billTpCd = billTpCd;
	}
	public String getMedRecId() {
		return medRecId;
	}
	public void setMedRecId(String medRecId) {
		this.medRecId = medRecId;
	}
	public String getPatRsnVisDiagCd1() {
		return patRsnVisDiagCd1;
	}
	public void setPatRsnVisDiagCd1(String patRsnVisDiagCd1) {
		this.patRsnVisDiagCd1 = patRsnVisDiagCd1;
	}
	public String getPatRsnVisDiagCd2() {
		return patRsnVisDiagCd2;
	}
	public void setPatRsnVisDiagCd2(String patRsnVisDiagCd2) {
		this.patRsnVisDiagCd2 = patRsnVisDiagCd2;
	}
	public String getPatRsnVisDiagCd3() {
		return patRsnVisDiagCd3;
	}
	public void setPatRsnVisDiagCd3(String patRsnVisDiagCd3) {
		this.patRsnVisDiagCd3 = patRsnVisDiagCd3;
	}
	public String getIcd10ExtCauseInjCd1() {
		return icd10ExtCauseInjCd1;
	}
	public void setIcd10ExtCauseInjCd1(String icd10ExtCauseInjCd1) {
		this.icd10ExtCauseInjCd1 = icd10ExtCauseInjCd1;
	}
	public String getIcd10ExtCauseInjCd2() {
		return icd10ExtCauseInjCd2;
	}
	public void setIcd10ExtCauseInjCd2(String icd10ExtCauseInjCd2) {
		this.icd10ExtCauseInjCd2 = icd10ExtCauseInjCd2;
	}
	public String getIcd10ExtCauseInjCd3() {
		return icd10ExtCauseInjCd3;
	}
	public void setIcd10ExtCauseInjCd3(String icd10ExtCauseInjCd3) {
		this.icd10ExtCauseInjCd3 = icd10ExtCauseInjCd3;
	}
	public String getIcd10ExtCauseInjCd4() {
		return icd10ExtCauseInjCd4;
	}
	public void setIcd10ExtCauseInjCd4(String icd10ExtCauseInjCd4) {
		this.icd10ExtCauseInjCd4 = icd10ExtCauseInjCd4;
	}
	public String getIcd10ExtCauseInjCd5() {
		return icd10ExtCauseInjCd5;
	}
	public void setIcd10ExtCauseInjCd5(String icd10ExtCauseInjCd5) {
		this.icd10ExtCauseInjCd5 = icd10ExtCauseInjCd5;
	}
	public String getIcd10ExtCauseInjCd6() {
		return icd10ExtCauseInjCd6;
	}
	public void setIcd10ExtCauseInjCd6(String icd10ExtCauseInjCd6) {
		this.icd10ExtCauseInjCd6 = icd10ExtCauseInjCd6;
	}
	public String getIcd10ExtCauseInjCd7() {
		return icd10ExtCauseInjCd7;
	}
	public void setIcd10ExtCauseInjCd7(String icd10ExtCauseInjCd7) {
		this.icd10ExtCauseInjCd7 = icd10ExtCauseInjCd7;
	}
	public String getIcd10ExtCauseInjCd8() {
		return icd10ExtCauseInjCd8;
	}
	public void setIcd10ExtCauseInjCd8(String icd10ExtCauseInjCd8) {
		this.icd10ExtCauseInjCd8 = icd10ExtCauseInjCd8;
	}
	public String getIcd10ExtCauseInjCd9() {
		return icd10ExtCauseInjCd9;
	}
	public void setIcd10ExtCauseInjCd9(String icd10ExtCauseInjCd9) {
		this.icd10ExtCauseInjCd9 = icd10ExtCauseInjCd9;
	}
	public String getIcd10ExtCauseInjCd10() {
		return icd10ExtCauseInjCd10;
	}
	public void setIcd10ExtCauseInjCd10(String icd10ExtCauseInjCd10) {
		this.icd10ExtCauseInjCd10 = icd10ExtCauseInjCd10;
	}
	public String getIcd10ExtCauseInjCd11() {
		return icd10ExtCauseInjCd11;
	}
	public void setIcd10ExtCauseInjCd11(String icd10ExtCauseInjCd11) {
		this.icd10ExtCauseInjCd11 = icd10ExtCauseInjCd11;
	}
	public String getIcd10ExtCauseInjCd12() {
		return icd10ExtCauseInjCd12;
	}
	public void setIcd10ExtCauseInjCd12(String icd10ExtCauseInjCd12) {
		this.icd10ExtCauseInjCd12 = icd10ExtCauseInjCd12;
	}
	public String getNatlProvId() {
		return natlProvId;
	}
	public void setNatlProvId(String natlProvId) {
		this.natlProvId = natlProvId;
	}
	public String getSubscriberFirstNm() {
		return subscriberFirstNm;
	}
	public void setSubscriberFirstNm(String subscriberFirstNm) {
		this.subscriberFirstNm = subscriberFirstNm;
	}
	public String getSubscriberLastNm() {
		return subscriberLastNm;
	}
	public void setSubscriberLastNm(String subscriberLastNm) {
		this.subscriberLastNm = subscriberLastNm;
	}
	public String getSubscriberMiNm() {
		return subscriberMiNm;
	}
	public void setSubscriberMiNm(String subscriberMiNm) {
		this.subscriberMiNm = subscriberMiNm;
	}
	public String getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}
	public String getCfaStatusCd() {
		return cfaStatusCd;
	}
	public void setCfaStatusCd(String cfaStatusCd) {
		this.cfaStatusCd = cfaStatusCd;
	}
	public String getCheckVoucherNumber() {
		return checkVoucherNumber;
	}
	public void setCheckVoucherNumber(String checkVoucherNumber) {
		this.checkVoucherNumber = checkVoucherNumber;
	}
	public String getCfaProcessingDt() {
		return cfaProcessingDt;
	}
	public void setCfaProcessingDt(String cfaProcessingDt) {
		this.cfaProcessingDt = cfaProcessingDt;
	}
	public String getNationalProviderId() {
		return nationalProviderId;
	}
	public void setNationalProviderId(String nationalProviderId) {
		this.nationalProviderId = nationalProviderId;
	}

}


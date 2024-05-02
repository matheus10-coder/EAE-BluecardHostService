package net.abcbs.rpa.javabeans;
/***********************************************************************************************************************************************************************
 * @author ABCBS resource
 * 
 * Description: BluecardJavaBean class will be used to perform the proper connection with Oracle database and query the correct value required by the user 
 * 
 * Project: Bluecard Host Adjustment 
 ***********************************************************************************************************************************************************************/

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.abcbs.issh.util.pub.javabeans.IsSharedJavaBean;
import net.abcbs.rpa.dto.BluecardDTO;
import net.abcbs.rpa.dto.BlueSquareDTO;

public class BluecardJavaBean extends IsSharedJavaBean {
	private static Logger logger = LogManager.getLogger(BluecardJavaBean.class);
	private static final String INNERJOIN = "INNER JOIN";
	private static final String LEFTJOIN = "LEFT JOIN";

	public List<BluecardDTO> queryBlueSquare(String dataSource, String scheme, String sccfId) {
		this.setDbFunctionDelete(dbFunctionDelete);
		ArrayList<BluecardDTO> arrayList = new ArrayList<>();

		try {
			this.initializeConnection(dataSource, "");

			sqlStatement.append("SELECT A.SCCF_ID");//1
			sqlStatement.append(", A.HOST_PLAN_CNTL_ID");//2
			sqlStatement.append(", C.PAT_FIRST_NM");//3
			sqlStatement.append(", C.PAT_LAST_NM");//4
			sqlStatement.append(", C.PAT_MI_NM");//5
			sqlStatement.append(", C.PAT_BRTH_DT");//6
			sqlStatement.append(", C.PAT_SEX_CD");//7
			sqlStatement.append(", C.PAT_ADDR_LN_1_DESC");//8
			sqlStatement.append(", C.PAT_ADDR_LN_2_DESC");//9
			sqlStatement.append(", C.PAT_CITY_NM");//10
			sqlStatement.append(", C.PAT_ST_CD");//11
			sqlStatement.append(", C.PAT_ZIP_CD");//12
			sqlStatement.append(", C.PAT_PHONE_NUM_ID");//13
			sqlStatement.append(", D.PAT_REL_SUB_CD");//14
			sqlStatement.append(", E.PAT_WRK_COMP_IND");//15
			sqlStatement.append(", E.AUTO_OTH_ACCDNT_CD");//16 
			sqlStatement.append(", E.AUTO_ACCDNT_ST_CD");//17 
			sqlStatement.append(", D.SUB_APFX_ID");//18
			sqlStatement.append(", D.SUB_SUFX_ID");//19
			sqlStatement.append(", D.SUB_LAST_NM");//20
			sqlStatement.append(", D.SUB_FIRST_NM");//21
			sqlStatement.append(", D.SUB_MI_NM");//22
			sqlStatement.append(", D.SUB_ADDR_LN_1_DESC");//23
			sqlStatement.append(", D.SUB_ADDR_LN_2_DESC");//24
			sqlStatement.append(", D.SUB_CITY_NM");//25
			sqlStatement.append(", D.SUB_ST_CD");//26
			sqlStatement.append(", D.SUB_ZIP_CD");//27
			sqlStatement.append(", D.SUB_GRP_ID");//28
			sqlStatement.append(", D.SUB_BRTH_DT");//29 
			sqlStatement.append(", D.SUB_SEX_CD");//30
			sqlStatement.append(", C.OTH_CARR_IND");//31
			sqlStatement.append(", D.RLSE_INFO_CD");//32
			sqlStatement.append(", E.ACC_ILL_ONSET_DT");//33
			sqlStatement.append(", E.UNABLE_WRK_FROM_DT");//34 
			sqlStatement.append(", E.UNABLE_WRK_TO_DT");//35 
			sqlStatement.append(", E.REF_PROV_LAST_NM");//36
			sqlStatement.append(", E.REF_PROV_FIRST_NM");//37
			sqlStatement.append(", E.REF_PROV_MI_NM");//38
			sqlStatement.append(", C.REF_PROV_ID");//39
			sqlStatement.append(", E.PERF_PROV_NPI_CD");//40
			sqlStatement.append(", C.FED_TAX_ID");//41
			sqlStatement.append(", C.PAT_CNTL_ID");//42 
			sqlStatement.append(", D.ASSG_BNFT_IND");//43
			sqlStatement.append(", C.PAT_PAID_AMT");//44 
			sqlStatement.append(", E.SERV_FACIL_NM");//45
			sqlStatement.append(", E.SERV_FACIL_ST_CD");//46
			sqlStatement.append(", E.SERV_FACIL_ZIP_CD");//47
			sqlStatement.append(", E.SERV_FACIL_LOC_ID");//48
			sqlStatement.append(", E.BILL_PROV_LAST_NM");//49
			sqlStatement.append(", E.BILL_PROV_FIRST_NM");//50
			sqlStatement.append(", E.BILL_PROV_MI_NM");//51
			sqlStatement.append(", E.SUB_ORG_NM");//52 
			sqlStatement.append(", C.PROV_LN_1_ADDR");//53
			sqlStatement.append(", C.PROV_LN_2_ADDR");//54
			sqlStatement.append(", C.PROV_CITY_NM");//55
			sqlStatement.append(", C.PROV_ST_CD");//56
			sqlStatement.append(", C.PROV_ZIP_CD");//57
			sqlStatement.append(", C.PROV_PHONE_NUM_ID");//58
			sqlStatement.append(", C.PROV_NPI_CD");//59
			sqlStatement.append(", C.ICD_PROV_SUBMIT_VER_CD");//60
			sqlStatement.append(", DIAG_CD_1");//61
			sqlStatement.append(", DIAG_CD_2");//62
			sqlStatement.append(", DIAG_CD_3");//63
			sqlStatement.append(", DIAG_CD_4");//64
			sqlStatement.append(", DIAG_CD_5");//65
			sqlStatement.append(", DIAG_CD_6");//66
			sqlStatement.append(", DIAG_CD_7");//67
			sqlStatement.append(", DIAG_CD_8");//68
			sqlStatement.append(", DIAG_CD_9");//69
			sqlStatement.append(", DIAG_CD_10");//70
			sqlStatement.append(", DIAG_CD_11");//71
			sqlStatement.append(", DIAG_CD_12");//72
			sqlStatement.append(", DIAG_CD_13");//73
			sqlStatement.append(", DIAG_CD_14");//74
			sqlStatement.append(", DIAG_CD_15");//75
			sqlStatement.append(", DIAG_CD_16");//76
			sqlStatement.append(", DIAG_CD_17");//77
			sqlStatement.append(", DIAG_CD_18");//78
			sqlStatement.append(", DIAG_CD_19");//79
			sqlStatement.append(", DIAG_CD_20");//80
			sqlStatement.append(", DIAG_CD_21");//81
			sqlStatement.append(", DIAG_CD_22");//82
			sqlStatement.append(", DIAG_CD_23");//83
			sqlStatement.append(", DIAG_CD_24");//84
			sqlStatement.append(", ICD_10_DIAG_CD_1");//85
			sqlStatement.append(", ICD_10_DIAG_CD_2");//86
			sqlStatement.append(", ICD_10_DIAG_CD_3");//87
			sqlStatement.append(", ICD_10_DIAG_CD_4");//88
			sqlStatement.append(", ICD_10_DIAG_CD_5");//89
			sqlStatement.append(", ICD_10_DIAG_CD_6");//90
			sqlStatement.append(", ICD_10_DIAG_CD_7");//91
			sqlStatement.append(", ICD_10_DIAG_CD_8");//92
			sqlStatement.append(", ICD_10_DIAG_CD_9");//93
			sqlStatement.append(", ICD_10_DIAG_CD_10");//94
			sqlStatement.append(", ICD_10_DIAG_CD_11");//95
			sqlStatement.append(", ICD_10_DIAG_CD_12");//96
			sqlStatement.append(", ICD_10_DIAG_CD_13");//97
			sqlStatement.append(", ICD_10_DIAG_CD_14");//98
			sqlStatement.append(", ICD_10_DIAG_CD_15");//99
			sqlStatement.append(", ICD_10_DIAG_CD_16");//100
			sqlStatement.append(", ICD_10_DIAG_CD_17");//101
			sqlStatement.append(", ICD_10_DIAG_CD_18");//102
			sqlStatement.append(", ICD_10_DIAG_CD_19");//103
			sqlStatement.append(", ICD_10_DIAG_CD_20");//104
			sqlStatement.append(", ICD_10_DIAG_CD_21");//105
			sqlStatement.append(", ICD_10_DIAG_CD_22");//106
			sqlStatement.append(", ICD_10_DIAG_CD_23");//107
			sqlStatement.append(", ICD_10_DIAG_CD_24");//108
			sqlStatement.append(", G.OTH_INS_ID");//109
			sqlStatement.append(", G.OTH_PYR_NM");//110
			sqlStatement.append(", H.LN_NUM");//111
			sqlStatement.append(", H.SERV_START_DT");//112
			sqlStatement.append(", I.SERV_END_DT");//113
			sqlStatement.append(", I.PERF_PROV_POS_IND");//114
			sqlStatement.append(", H.HCPCS_PROC_CD");//115
			sqlStatement.append(", H.HCPCS_PROCMOD_CD_1");//116
			sqlStatement.append(", H.HCPCS_PROCMOD_CD_2");//117
			sqlStatement.append(", H.HCPCS_PROCMOD_CD_3");//118
			sqlStatement.append(", H.HCPCS_PROCMOD_CD_4");//119
			sqlStatement.append(", H.DIAG_CD_IND_1");//120
			sqlStatement.append(", H.DIAG_CD_IND_2");//121
			sqlStatement.append(", H.DIAG_CD_IND_3");//122
			sqlStatement.append(", H.DIAG_CD_IND_4");//123
			sqlStatement.append(", H.SERV_CHG_AMT");//124
			sqlStatement.append(", H.SERV_NUM");//125
			sqlStatement.append(", H.PERF_PROV_TXNMY_CD");//126
			sqlStatement.append(", A.STS_CD");//127
			sqlStatement.append(", A.CLM_TXN_TP_CD");//128
			sqlStatement.append(", A.HOST_PLAN_RCPT_DT");//129
			sqlStatement.append(", A.FMT_DB_POST_DT");//130
			sqlStatement.append(", C.BILL_TP_CD");//131
			sqlStatement.append(", I.PLACE_SERV_CD");//132
			sqlStatement.append(", I.TP_SERV_CD");//133
			sqlStatement.append(", A.SERV_DT");//134
			sqlStatement.append(", H.PRC_METH_CD");//135
			sqlStatement.append(", H.RULE_NUM_ID");//136
			sqlStatement.append(", G.OTH_INS_LAST_NM");//137
			sqlStatement.append(", G.OTH_INS_ID");//138
			sqlStatement.append(", G.CLM_OTH_CARR_FNCL_CD");//139
			sqlStatement.append(", B.OPL_VAL_CD");//140
			sqlStatement.append(", B.OPL_VAL_AMT");//141
			sqlStatement.append(", A.TOT_CHG_AMT");//142
			sqlStatement.append(", A.PGM_CD");//143
			sqlStatement.append(", A.DLVY_METH_CD");//144 
			sqlStatement.append(", J.SPCL_NOTE_TXT");//145
			sqlStatement.append(", I.PERF_PROV_ID");//146
			sqlStatement.append(", I.PERF_PROV_NPI_CD");//147



			sqlStatement.append(" FROM " + scheme + ".IPP_CLM_SEARCH A");
			sqlStatement.append(" " + LEFTJOIN + " " + scheme + ".CLM_OPL B ON A.SCCF_ID = B.SCCF_ID");
			sqlStatement.append( " " + INNERJOIN + " " + scheme + ".CLM_SUBM C ON A.SCCF_ID = C.SCCF_ID");
			sqlStatement.append( " " + INNERJOIN + " " + scheme + ".CLM_SUB_PROF D ON A.SCCF_ID = D.SCCF_ID");
			sqlStatement.append( " " + INNERJOIN + " " + scheme + ".CLM_SUBM_PROF E ON A.SCCF_ID = E.SCCF_ID");
			sqlStatement.append( " " + INNERJOIN + " " + scheme + ".CLM_SUBM_DIAG F ON A.SCCF_ID = F.SCCF_ID");
			sqlStatement.append( " " + LEFTJOIN + " " + scheme + ".CLM_SUB_OTH_PRF G ON A.SCCF_ID = G.SCCF_ID");
			sqlStatement.append( " " + INNERJOIN + " " + scheme + ".CLM_LN H ON A.SCCF_ID = H.SCCF_ID");
			sqlStatement.append( " " + INNERJOIN + " " + scheme + ".CLM_LN_PROF I ON A.SCCF_ID = I.SCCF_ID AND H.LN_NUM = I.LN_NUM");
			sqlStatement.append( " " + LEFTJOIN + " " + scheme + ".CLM_SPCL_NOTE J ON A.SCCF_ID = J.SCCF_ID AND A.BUS_OWNER_ID = J.BUS_OWNER_ID");
			sqlStatement.append(" WHERE A.SCCF_ID = ? AND A.CLM_TXN_TP_CD = 'SF' WITH UR");


			logger.info("SQL query for BlueCard Professional: {}", sqlStatement);
			preparedStatement = connection.prepareStatement(sqlStatement.toString());
			preparedStatement.setString(1, sccfId);
			resultSet = preparedStatement.executeQuery();



			while (resultSet.next()) {
				BluecardDTO bluecardOutput = new BluecardDTO();

				bluecardOutput.setSccf(resultSet.getString(1));
				bluecardOutput.setHostPlan(resultSet.getString(2));
				bluecardOutput.setPatFirstName(resultSet.getString(3));
				bluecardOutput.setPatLastName(resultSet.getString(4));
				bluecardOutput.setPatMiNm(resultSet.getString(5));
				bluecardOutput.setPatBirthDt(resultSet.getString(6));
				bluecardOutput.setPatSexCd(resultSet.getString(7));
				bluecardOutput.setPatAddressLnOneDesc(resultSet.getString(8));
				bluecardOutput.setPatAddressLnTwoDesc(resultSet.getString(9));
				bluecardOutput.setPatCityName(resultSet.getString(10));
				bluecardOutput.setPatStateCd(resultSet.getString(11));
				bluecardOutput.setPatZipCd(resultSet.getString(12));
				bluecardOutput.setPatPhoneNumberId(resultSet.getString(13));
				bluecardOutput.setPatRelSubCd(resultSet.getString(14));
				bluecardOutput.setPatWorkCompInd(resultSet.getString(15));
				bluecardOutput.setAutoOthAccdntDc(resultSet.getString(16));
				bluecardOutput.setAutoAccdntStCd(resultSet.getString(17));
				bluecardOutput.setSubApfxId(resultSet.getString(18));
				bluecardOutput.setSubSufxId(resultSet.getString(19));
				bluecardOutput.setSubLastName(resultSet.getString(20));
				bluecardOutput.setSubFirstName(resultSet.getString(21));
				bluecardOutput.setSubMiddleName(resultSet.getString(22));
				bluecardOutput.setSubAddressLnOneDesc(resultSet.getString(23));
				bluecardOutput.setSubAddressLnTwoDesc(resultSet.getString(24));
				bluecardOutput.setSubCityName(resultSet.getString(25));
				bluecardOutput.setSubStateCd(resultSet.getString(26));
				bluecardOutput.setSubZipCd(resultSet.getString(27));
				bluecardOutput.setSubGroupId(resultSet.getString(28));
				bluecardOutput.setSubBirthDt(resultSet.getString(29));
				bluecardOutput.setSubSexCd(resultSet.getString(30));
				bluecardOutput.setOtherCarrier(resultSet.getString(31));
				bluecardOutput.setRlseInfoCd(resultSet.getString(32)); 
				bluecardOutput.setAccIllOnsetDt(resultSet.getString(33)); 
				bluecardOutput.setUnableWorkFromDt(resultSet.getString(34)); 
				bluecardOutput.setUnableWorkToDt(resultSet.getString(35)); 
				bluecardOutput.setRefProvLastName(resultSet.getString(36));
				bluecardOutput.setRefProvFirstName(resultSet.getString(37));
				bluecardOutput.setRefProvMiddleName(resultSet.getString(38)); 
				bluecardOutput.setRefProvId(resultSet.getString(39));
				bluecardOutput.setRefProvNpiCd(resultSet.getString(40));
				bluecardOutput.setFedTaxId(resultSet.getString(41));
				bluecardOutput.setPatCntlId(resultSet.getString(42)); 
				bluecardOutput.setAssgBnftInd(resultSet.getString(43));
				bluecardOutput.setPatPaidAmt(resultSet.getDouble(44)); 
				bluecardOutput.setServFacilName(resultSet.getString(45));
				bluecardOutput.setServFacilStreetCd(resultSet.getString(46));
				bluecardOutput.setServFacilZipCd(resultSet.getString(47));
				bluecardOutput.setServFacilLocId(resultSet.getString(48));
				bluecardOutput.setBillProvLastName(resultSet.getString(49));
				bluecardOutput.setBillProvFirstName(resultSet.getString(50));
				bluecardOutput.setBillProvMiddleName(resultSet.getString(51));
				bluecardOutput.setSubOrgName(resultSet.getString(52)); 
				bluecardOutput.setProvLnOneAddress(resultSet.getString(53));
				bluecardOutput.setProvLnTwoAddress(resultSet.getString(54));
				bluecardOutput.setProvCityName(resultSet.getString(55));
				bluecardOutput.setProvStreetCd(resultSet.getString(56));
				bluecardOutput.setProvZipCd(resultSet.getString(57));
				bluecardOutput.setProvPhoneNumberId(resultSet.getString(58));
				bluecardOutput.setProvNpiCd(resultSet.getString(59));
				bluecardOutput.setIcdProvSubmitVerCd(resultSet.getString(60));
				bluecardOutput.setDiagCdOne(resultSet.getString(61));
				bluecardOutput.setDiagCdTwo(resultSet.getString(62));
				bluecardOutput.setDiagCdThree(resultSet.getString(63));
				bluecardOutput.setDiagCdFour(resultSet.getString(64));
				bluecardOutput.setDiagCdFive(resultSet.getString(65));
				bluecardOutput.setDiagCdSix(resultSet.getString(66));
				bluecardOutput.setDiagCdSeven(resultSet.getString(67));
				bluecardOutput.setDiagCdEight(resultSet.getString(68));
				bluecardOutput.setDiagCdNine(resultSet.getString(69));
				bluecardOutput.setDiagCdTen(resultSet.getString(70));
				bluecardOutput.setDiagCdEleven(resultSet.getString(71));
				bluecardOutput.setDiagCdTwelve(resultSet.getString(72));
				bluecardOutput.setDiagCdThirteen(resultSet.getString(73));
				bluecardOutput.setDiagCdFourteen(resultSet.getString(74));
				bluecardOutput.setDiagCdFifteen(resultSet.getString(75));
				bluecardOutput.setDiagCdSixteen(resultSet.getString(76));
				bluecardOutput.setDiagCdSeventeen(resultSet.getString(77));
				bluecardOutput.setDiagCdEighteen(resultSet.getString(78));
				bluecardOutput.setDiagCdNineteen(resultSet.getString(79));
				bluecardOutput.setDiagCdTwenty(resultSet.getString(80));
				bluecardOutput.setDiagCdTwentyOne(resultSet.getString(81));
				bluecardOutput.setDiagCdTwentyTwo(resultSet.getString(82));
				bluecardOutput.setDiagCdTwentyThree(resultSet.getString(83));
				bluecardOutput.setDiagCdTwentyFour(resultSet.getString(84));
				bluecardOutput.setIcdTenDiagCdOne(resultSet.getString(85));
				bluecardOutput.setIcdTenDiagCdTwo(resultSet.getString(86));
				bluecardOutput.setIcdTenDiagCdThree(resultSet.getString(87));
				bluecardOutput.setIcdTenDiagCdFour(resultSet.getString(88));
				bluecardOutput.setIcdTenDiagCdFive(resultSet.getString(89));
				bluecardOutput.setIcdTenDiagCdSix(resultSet.getString(90));
				bluecardOutput.setIcdTenDiagCdSeven(resultSet.getString(91));
				bluecardOutput.setIcdTenDiagCdEight(resultSet.getString(92));
				bluecardOutput.setIcdTenDiagCdNine(resultSet.getString(93));
				bluecardOutput.setIcdTenDiagCdTen(resultSet.getString(94));
				bluecardOutput.setIcdTenDiagCdEleven(resultSet.getString(95));
				bluecardOutput.setIcdTenDiagCdTwelve(resultSet.getString(96));
				bluecardOutput.setIcdTenDiagCdThirteen(resultSet.getString(97));
				bluecardOutput.setIcdTenDiagCdFourteen(resultSet.getString(98));
				bluecardOutput.setIcdTenDiagCdFifteen(resultSet.getString(99));
				bluecardOutput.setIcdTenDiagCdSixteen(resultSet.getString(100));
				bluecardOutput.setIcdTenDiagCdSeventeen(resultSet.getString(101));
				bluecardOutput.setIcdTenDiagCdEighteen(resultSet.getString(102));
				bluecardOutput.setIcdTenDiagCdNineteen(resultSet.getString(103));
				bluecardOutput.setIcdTenDiagCdTwenty(resultSet.getString(104));
				bluecardOutput.setIcdTenDiagCdTwentyOne(resultSet.getString(105));
				bluecardOutput.setIcdTenDiagCdTwentyTwo(resultSet.getString(106));
				bluecardOutput.setIcdTenDiagCdTwentyThree(resultSet.getString(107));
				bluecardOutput.setIcdTenDiagCdTwentyFour(resultSet.getString(108));
				bluecardOutput.setOthInsId(resultSet.getString(109));
				bluecardOutput.setOthPyrNm(resultSet.getString(110));
				bluecardOutput.setLnNum(resultSet.getString(111));
				bluecardOutput.setServStartDt(resultSet.getString(112));
				bluecardOutput.setServEndDt(resultSet.getString(113));
				bluecardOutput.setPerfProvPosInd(resultSet.getString(114));
				bluecardOutput.setHcpcsProcCd(resultSet.getString(115));
				bluecardOutput.setHcpcsProcmodCdOne(resultSet.getString(116));
				bluecardOutput.setHcpcsProcmodCdTwo(resultSet.getString(117));
				bluecardOutput.setHcpcsProcmodCdThree(resultSet.getString(118));
				bluecardOutput.setHcpcsProcmodCdFour(resultSet.getString(119));
				bluecardOutput.setDiagCdIndOne(resultSet.getString(120));
				bluecardOutput.setDiagCdIndTwo(resultSet.getString(121));
				bluecardOutput.setDiagCdIndThree(resultSet.getString(122));
				bluecardOutput.setDiagCdIndFour(resultSet.getString(123));
				bluecardOutput.setServChgAmt(resultSet.getDouble(124));
				bluecardOutput.setServNum(resultSet.getString(125));
				bluecardOutput.setPerfProvTxnmyCd(resultSet.getString(126));
				bluecardOutput.setStatusCd(resultSet.getString(127));
				bluecardOutput.setFormat(resultSet.getString(128));
				bluecardOutput.setHostPlanReceiptDt(resultSet.getString(129));
				bluecardOutput.setFdbPostingDt(resultSet.getString(130));
				bluecardOutput.setBillTypeCd(resultSet.getString(131));
				bluecardOutput.setPos(resultSet.getString(132));
				bluecardOutput.setTos(resultSet.getString(133));
				bluecardOutput.setServDate(resultSet.getString(134));
				bluecardOutput.setPrcMethodCd(resultSet.getString(135));
				bluecardOutput.setRuleNumbId(resultSet.getString(136));
				bluecardOutput.setOtherInsuredLastName(resultSet.getString(137));
				bluecardOutput.setOtherInsuredId(resultSet.getString(138));
				bluecardOutput.setOtherCarrierFinCd(resultSet.getString(139));
				bluecardOutput.setOplValueCd(resultSet.getString(140));
				bluecardOutput.setOplValueAmt(resultSet.getString(141));
				bluecardOutput.setTotChgAmt(resultSet.getString(142));
				bluecardOutput.setProgramCd(resultSet.getString(143));
				bluecardOutput.setDlvyMethod(resultSet.getString(144));
				bluecardOutput.setClaimSpecNoteData(resultSet.getString(145)); 
				bluecardOutput.setPerfProviderNumber(resultSet.getString(146)); 
				bluecardOutput.setNationalProviderId(resultSet.getString(147));

				arrayList.add(bluecardOutput);
			}

			// STRY0103767 - Adding new reimbursement fields
			// check how many RF rows exist
			String rfCountSql = "SELECT COUNT(*) FROM " + scheme + ".IPP_CLM_REC_PROF_V"
					+ " WHERE SCCF_ID = '" + sccfId + "'";
			logger.info("Initial RF row count SQL: {}", rfCountSql);
			preparedStatement = connection.prepareStatement(rfCountSql);
			resultSet = preparedStatement.executeQuery();

			String newSccfId;
			// if more than 1 RF row we will modify SCCF for the latest
			if (resultSet.next() && resultSet.getInt(1) > 1) {
				// remove last two characters of the sccf#
				newSccfId = sccfId.substring(0, sccfId.length() - 2);
				newSccfId = newSccfId + "01";
			} else {
				newSccfId = sccfId;
			}

			// new query for these specific results
			// some fields may not be included in output, but are included here 
			// to ensure we get the latest result
			String cfaSql = "SELECT"
					+ " SCCF_ID"
					+ ", CFA_STS_CD"
					+ ", CHK_VCHR_ID"
					+ ", CFA_PRCS_DT"
					+ ", MAX(PAID_DT) AS PAID_DT"
					+ " FROM " + scheme + ".IPP_CLM_REC_PROF_V"
					+ " WHERE SCCF_ID = '" + newSccfId + "'"
					+ " GROUP BY SCCF_ID, CFA_STS_CD, CHK_VCHR_ID, CFA_PRCS_DT";

			logger.info("Second SQL for facility output: {}", cfaSql);
			preparedStatement = connection.prepareStatement(cfaSql);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				BluecardDTO bluecardOutput = new BluecardDTO();
				bluecardOutput.setSccf(resultSet.getString(1));
				bluecardOutput.setCfaStatusCd(resultSet.getString(2));
				bluecardOutput.setCheckVoucherNumber(resultSet.getString(3));
				bluecardOutput.setCfaProcessingDt(resultSet.getString(4));

				arrayList.add(bluecardOutput);
			}
		}
		catch (SQLException se) {
			this.processException(se);
		}
		catch (Exception e) {
			this.processException(e);
		}
		finally {
			displayResults();
			this.closeConnections();
		}

		return arrayList;
	}

	public List<BluecardDTO> queryBlueSquareFacility(String dataSource, String scheme, String sccfId) {
		this.setDbFunctionDelete(dbFunctionDelete);
		ArrayList<BluecardDTO> arrayList = new ArrayList<>();

		try {
			this.initializeConnection(dataSource, "");

			sqlStatement.append("SELECT A.SCCF_ID");//1
			sqlStatement.append(", A.CLM_TP_CD");//2
			sqlStatement.append(", A.TOT_CHG_AMT");//3
			sqlStatement.append(", A.SERV_DT");//4
			sqlStatement.append(", A.BCBS_PROV_ID");//5
			sqlStatement.append(", A.PGM_CD");//6
			sqlStatement.append(", A.DLVY_METH_CD");//7
			sqlStatement.append(", B.NATL_OOA_CD");//8
			sqlStatement.append(", B.LEN_STAY_DAY_NUM");//9
			sqlStatement.append(", B.PRC_METH_CD AS PRC_METH_CD_II");//10
			sqlStatement.append(", B.ADMIT_SRC_CD");//11
			sqlStatement.append(", B.ADMIT_DT");//12
			sqlStatement.append(", B.STMT_COV_FROM_DT");//13
			sqlStatement.append(", B.STMT_COV_TO_DT");//14
			sqlStatement.append(", B.PAT_STS_CD");//15
			sqlStatement.append(", B.VAL_CD_1");//16
			sqlStatement.append(", B.VAL_CD_2");//17
			sqlStatement.append(", B.VAL_CD_3");//18 
			sqlStatement.append(", B.VAL_CD_4");//19
			sqlStatement.append(", B.VAL_CD_5");//20
			sqlStatement.append(", B.VAL_CD_6");//21
			sqlStatement.append(", B.VAL_CD_7");//22
			sqlStatement.append(", B.VAL_CD_8");//23
			sqlStatement.append(", B.VAL_CD_9");//24
			sqlStatement.append(", B.VAL_CD_10");//25
			sqlStatement.append(", B.VAL_CD_11");//26
			sqlStatement.append(", B.VAL_CD_12");//27
			sqlStatement.append(", C.PRINC_PROC_CD");//28
			sqlStatement.append(", C.PRINC_PROC_DT");//29
			sqlStatement.append(", C.ICD_10_PRINC_PROC_CD");//30 
			sqlStatement.append(", C.ICD_10_PROC_CD_1");//31
			sqlStatement.append(", C.ICD_10_PROC_CD_2");//32
			sqlStatement.append(", C.ICD_10_PROC_CD_3");//33
			sqlStatement.append(", C.ICD_10_PROC_CD_4");//34
			sqlStatement.append(", C.ICD_10_PROC_CD_5");//35
			sqlStatement.append(", C.ICD_10_PROC_CD_6");//36
			sqlStatement.append(", C.ICD_10_PROC_CD_7");//37
			sqlStatement.append(", C.ICD_10_PROC_CD_8");//38
			sqlStatement.append(", C.ICD_10_PROC_CD_9");//39
			sqlStatement.append(", C.ICD_10_PROC_CD_10");//40
			sqlStatement.append(", C.ICD_10_PROC_CD_11");//41
			sqlStatement.append(", C.ICD_10_PROC_CD_12");//42
			sqlStatement.append(", C.ICD_10_PROC_CD_13");//43
			sqlStatement.append(", C.ICD_10_PROC_CD_14");//44
			sqlStatement.append(", C.ICD_10_PROC_CD_15");//45
			sqlStatement.append(", C.ICD_10_PROC_CD_16");//46
			sqlStatement.append(", C.ICD_10_PROC_CD_17");//47
			sqlStatement.append(", C.ICD_10_PROC_CD_18");//48
			sqlStatement.append(", C.ICD_10_PROC_CD_19");//49
			sqlStatement.append(", C.ICD_10_PROC_CD_20");//50
			sqlStatement.append(", C.ICD_10_PROC_CD_21");//51
			sqlStatement.append(", C.ICD_10_PROC_CD_22");//52
			sqlStatement.append(", C.ICD_10_PROC_CD_23");//53
			sqlStatement.append(", C.ICD_10_PROC_CD_24");//54
			sqlStatement.append(", C.PROC_CD_1");//55
			sqlStatement.append(", C.PROC_CD_2");//56
			sqlStatement.append(", C.PROC_CD_3");//57
			sqlStatement.append(", C.PROC_CD_4");//58
			sqlStatement.append(", C.PROC_CD_5");//59
			sqlStatement.append(", C.PROC_CD_6");//60
			sqlStatement.append(", C.PROC_CD_7");//61
			sqlStatement.append(", C.PROC_CD_8");//62
			sqlStatement.append(", C.PROC_CD_9");//63
			sqlStatement.append(", C.PROC_CD_10");//64
			sqlStatement.append(", C.PROC_CD_11");//65
			sqlStatement.append(", C.PROC_CD_12");//66
			sqlStatement.append(", C.PROC_CD_13");//67
			sqlStatement.append(", C.PROC_CD_14");//68
			sqlStatement.append(", C.PROC_CD_15");//69
			sqlStatement.append(", C.PROC_CD_16");//70
			sqlStatement.append(", C.PROC_CD_17");//71
			sqlStatement.append(", C.PROC_CD_18");//72
			sqlStatement.append(", C.PROC_CD_19");//73
			sqlStatement.append(", C.PROC_CD_20");//74
			sqlStatement.append(", C.PROC_CD_21");//75
			sqlStatement.append(", C.PROC_CD_22");//76
			sqlStatement.append(", C.PROC_CD_23");//77
			sqlStatement.append(", C.PROC_CD_24");//78
			sqlStatement.append(", C.PROC_DT_1");//79
			sqlStatement.append(", C.PROC_DT_2");//80
			sqlStatement.append(", C.PROC_DT_3");//81
			sqlStatement.append(", C.PROC_DT_4");//82
			sqlStatement.append(", C.PROC_DT_5");//83
			sqlStatement.append(", C.PROC_DT_6");//84
			sqlStatement.append(", C.PROC_DT_7");//85
			sqlStatement.append(", C.PROC_DT_8");//86
			sqlStatement.append(", C.PROC_DT_9");//87
			sqlStatement.append(", C.PROC_DT_10");//88
			sqlStatement.append(", C.PROC_DT_11");//89
			sqlStatement.append(", C.PROC_DT_12");//90
			sqlStatement.append(", C.PROC_DT_13");//91
			sqlStatement.append(", C.PROC_DT_14");//92
			sqlStatement.append(", C.PROC_DT_15");//93
			sqlStatement.append(", C.PROC_DT_16");//94
			sqlStatement.append(", C.PROC_DT_17");//95
			sqlStatement.append(", C.PROC_DT_18");//96
			sqlStatement.append(", C.PROC_DT_19");//97
			sqlStatement.append(", C.PROC_DT_20");//98
			sqlStatement.append(", C.PROC_DT_21");//99
			sqlStatement.append(", C.PROC_DT_22");//100
			sqlStatement.append(", C.PROC_DT_23");//101
			sqlStatement.append(", C.PROC_DT_24");//102
			sqlStatement.append(", C.PRINC_DIAG_POA_CD");//103
			sqlStatement.append(", C.ICD_10_PRINC_DIAG_CD");//104
			sqlStatement.append(", C.ICD_10_ADMIT_DIAG_CD");//105
			sqlStatement.append(", D.DIAG_CD_1");//106
			sqlStatement.append(", D.DIAG_CD_2");//107
			sqlStatement.append(", D.DIAG_CD_3");//108
			sqlStatement.append(", D.DIAG_CD_4");//109
			sqlStatement.append(", D.DIAG_CD_5");//110
			sqlStatement.append(", D.DIAG_CD_6");//111
			sqlStatement.append(", D.DIAG_CD_7");//112
			sqlStatement.append(", D.DIAG_CD_8");//113
			sqlStatement.append(", D.DIAG_CD_9");//114
			sqlStatement.append(", D.DIAG_CD_10");//115
			sqlStatement.append(", D.DIAG_CD_11");//116
			sqlStatement.append(", D.DIAG_CD_12");//117
			sqlStatement.append(", D.DIAG_CD_13");//118
			sqlStatement.append(", D.DIAG_CD_14");//119
			sqlStatement.append(", D.DIAG_CD_15");//120
			sqlStatement.append(", D.DIAG_CD_16");//121
			sqlStatement.append(", D.DIAG_CD_17");//122
			sqlStatement.append(", D.DIAG_CD_18");//123
			sqlStatement.append(", D.DIAG_CD_19");//124
			sqlStatement.append(", D.DIAG_CD_20");//125
			sqlStatement.append(", D.DIAG_CD_21");//126
			sqlStatement.append(", D.DIAG_CD_22");//127
			sqlStatement.append(", D.DIAG_CD_23");//128
			sqlStatement.append(", D.DIAG_CD_24");//129
			sqlStatement.append(", D.DIAG_POA_CD_1");//130
			sqlStatement.append(", D.DIAG_POA_CD_2");//131
			sqlStatement.append(", D.DIAG_POA_CD_3");//132
			sqlStatement.append(", D.DIAG_POA_CD_4");//133
			sqlStatement.append(", D.DIAG_POA_CD_5");//134
			sqlStatement.append(", D.DIAG_POA_CD_6");//135
			sqlStatement.append(", D.DIAG_POA_CD_7");//136
			sqlStatement.append(", D.DIAG_POA_CD_8");//137
			sqlStatement.append(", D.DIAG_POA_CD_9");//138
			sqlStatement.append(", D.DIAG_POA_CD_10");//139
			sqlStatement.append(", D.DIAG_POA_CD_11");//140
			sqlStatement.append(", D.DIAG_POA_CD_12");//141
			sqlStatement.append(", D.DIAG_POA_CD_13");//142
			sqlStatement.append(", D.DIAG_POA_CD_14");//143
			sqlStatement.append(", D.DIAG_POA_CD_15");//144
			sqlStatement.append(", D.DIAG_POA_CD_16");//145
			sqlStatement.append(", D.DIAG_POA_CD_17");//146
			sqlStatement.append(", D.DIAG_POA_CD_18");//147
			sqlStatement.append(", D.DIAG_POA_CD_19");//148
			sqlStatement.append(", D.DIAG_POA_CD_20");//149
			sqlStatement.append(", D.DIAG_POA_CD_21");//150
			sqlStatement.append(", D.DIAG_POA_CD_22");//151
			sqlStatement.append(", D.DIAG_POA_CD_23");//152
			sqlStatement.append(", D.DIAG_POA_CD_24");//153
			sqlStatement.append(", D.ICD_10_DIAG_CD_1");//154
			sqlStatement.append(", D.ICD_10_DIAG_CD_2");//155
			sqlStatement.append(", D.ICD_10_DIAG_CD_3");//156
			sqlStatement.append(", D.ICD_10_DIAG_CD_4");//157
			sqlStatement.append(", D.ICD_10_DIAG_CD_5");//158
			sqlStatement.append(", D.ICD_10_DIAG_CD_6");//159
			sqlStatement.append(", D.ICD_10_DIAG_CD_7");//160
			sqlStatement.append(", D.ICD_10_DIAG_CD_8");//161
			sqlStatement.append(", D.ICD_10_DIAG_CD_9");//162
			sqlStatement.append(", D.ICD_10_DIAG_CD_10");//163
			sqlStatement.append(", D.ICD_10_DIAG_CD_11");//164
			sqlStatement.append(", D.ICD_10_DIAG_CD_12");//165
			sqlStatement.append(", D.ICD_10_DIAG_CD_13");//166
			sqlStatement.append(", D.ICD_10_DIAG_CD_14");//167
			sqlStatement.append(", D.ICD_10_DIAG_CD_15");//168
			sqlStatement.append(", D.ICD_10_DIAG_CD_16");//169
			sqlStatement.append(", D.ICD_10_DIAG_CD_17");//170
			sqlStatement.append(", D.ICD_10_DIAG_CD_18");//171
			sqlStatement.append(", D.ICD_10_DIAG_CD_19");//172
			sqlStatement.append(", D.ICD_10_DIAG_CD_20");//173
			sqlStatement.append(", D.ICD_10_DIAG_CD_21");//174
			sqlStatement.append(", D.ICD_10_DIAG_CD_22");//175
			sqlStatement.append(", D.ICD_10_DIAG_CD_23");//176
			sqlStatement.append(", D.ICD_10_DIAG_CD_24");//177
			sqlStatement.append(", E.LN_NUM");//178
			sqlStatement.append(", E.RULE_NUM_ID");//179
			sqlStatement.append(", E.PRC_METH_CD AS PRC_METH_CD_IO");//180
			sqlStatement.append(", F.REV_CD");//181
			sqlStatement.append(", F.ACCOM_RATE_AMT");//182
			sqlStatement.append(", F.REV_TP_CD");//183
			sqlStatement.append(", F.LOC_RATE_AMT");//184
			sqlStatement.append(", B.BMGMT_TRMT_AUTH_ID");//185
			sqlStatement.append(", B.ADMIT_TP_CD");//186
			sqlStatement.append(", B.COND_CD_1");//187
			sqlStatement.append(", B.COND_CD_2");//188
			sqlStatement.append(", B.COND_CD_3");//189
			sqlStatement.append(", B.COND_CD_4");//190
			sqlStatement.append(", B.COND_CD_5");//191
			sqlStatement.append(", B.COND_CD_6");//192
			sqlStatement.append(", B.COND_CD_7");//193
			sqlStatement.append(", B.COND_CD_8");//194
			sqlStatement.append(", B.COND_CD_9");//195
			sqlStatement.append(", B.COND_CD_10");//196
			sqlStatement.append(", B.ADMIT_HR_NUM");//197
			sqlStatement.append(", B.DISCHRG_HR_NUM");//198
			sqlStatement.append(", B.OCCR_CD_1");//199
			sqlStatement.append(", B.OCCR_CD_2");//200
			sqlStatement.append(", B.OCCR_CD_3");//201
			sqlStatement.append(", B.OCCR_CD_4");//202
			sqlStatement.append(", B.OCCR_CD_5");//203
			sqlStatement.append(", B.OCCR_CD_6");//204
			sqlStatement.append(", B.OCCR_CD_7");//205
			sqlStatement.append(", B.OCCR_CD_8");//206
			sqlStatement.append(", B.OCCR_CD_9");//207
			sqlStatement.append(", B.OCCR_CD_10");//208
			sqlStatement.append(", B.OCCR_DT_1");//209
			sqlStatement.append(", B.OCCR_DT_2");//210
			sqlStatement.append(", B.OCCR_DT_3");//211
			sqlStatement.append(", B.OCCR_DT_4");//212
			sqlStatement.append(", B.OCCR_DT_5");//213
			sqlStatement.append(", B.OCCR_DT_6");//214
			sqlStatement.append(", B.OCCR_DT_7");//215
			sqlStatement.append(", B.OCCR_DT_8");//216
			sqlStatement.append(", B.OCCR_DT_9");//217
			sqlStatement.append(", B.OCCR_DT_10");//218
			sqlStatement.append(", B.BILL_TP_CD");//219
			sqlStatement.append(", C.MED_REC_ID");//220
			sqlStatement.append(", C.PAT_RSN_VIS_DIAG_CD_1");//221
			sqlStatement.append(", C.PAT_RSN_VIS_DIAG_CD_2");//222
			sqlStatement.append(", C.PAT_RSN_VIS_DIAG_CD_3");//223
			sqlStatement.append(", G.PAT_CNTL_ID");//224
			sqlStatement.append(", G.PAT_FIRST_NM");//225
			sqlStatement.append(", G.PAT_LAST_NM");//226
			sqlStatement.append(", G.PAT_MI_NM");//227
			sqlStatement.append(", G.PAT_SEX_CD");//228
			sqlStatement.append(", G.PAT_BRTH_DT");//229
			sqlStatement.append(", G.ICD_10_EXT_CAUSE_INJ_CD_1");//230
			sqlStatement.append(", G.ICD_10_EXT_CAUSE_INJ_CD_2");//231
			sqlStatement.append(", G.ICD_10_EXT_CAUSE_INJ_CD_3");//232
			sqlStatement.append(", G.ICD_10_EXT_CAUSE_INJ_CD_4");//233
			sqlStatement.append(", G.ICD_10_EXT_CAUSE_INJ_CD_5");//234
			sqlStatement.append(", G.ICD_10_EXT_CAUSE_INJ_CD_6");//235
			sqlStatement.append(", G.ICD_10_EXT_CAUSE_INJ_CD_7");//236
			sqlStatement.append(", G.ICD_10_EXT_CAUSE_INJ_CD_8");//237
			sqlStatement.append(", G.ICD_10_EXT_CAUSE_INJ_CD_9");//238
			sqlStatement.append(", G.ICD_10_EXT_CAUSE_INJ_CD_10");//239
			sqlStatement.append(", G.ICD_10_EXT_CAUSE_INJ_CD_11");//240
			sqlStatement.append(", G.ICD_10_EXT_CAUSE_INJ_CD_12");//241
			sqlStatement.append(", A.PROV_NPI_CD");//242
			sqlStatement.append(", B.PAT_FIRST_NM");//243
			sqlStatement.append(", B.PAT_LAST_NM");//244
			sqlStatement.append(", B.PAT_MI_NM");//245
			sqlStatement.append(", B.PAT_REL_SUB_CD");//246
			sqlStatement.append(", E.SERV_NUM");//247
			sqlStatement.append(", E.SERV_CHG_AMT");//248
			sqlStatement.append(", H.SPCL_NOTE_TXT");//249
			sqlStatement.append(", B.INP_SUB_APFX_ID");//250
			sqlStatement.append(", B.INP_SUB_SUFX_ID");//251
			sqlStatement.append(", E.HCPCS_PROC_CD");//252
			sqlStatement.append(", I.OPL_VAL_CD");//253
			sqlStatement.append(", I.OPL_VAL_AMT");//254
			sqlStatement.append(", E.HCPCS_PROCMOD_CD_1");//255
			sqlStatement.append(", E.HCPCS_PROCMOD_CD_2");//256
			sqlStatement.append(", E.HCPCS_PROCMOD_CD_3");//257
			sqlStatement.append(", E.HCPCS_PROCMOD_CD_4");//258

			sqlStatement.append(" FROM " + scheme + ".IPP_CLM_SEARCH A");
			sqlStatement.append(" " + INNERJOIN + " " + scheme + ".IPP_CLM_SF_INST_V B ON A.SCCF_ID = B.SCCF_ID");
			sqlStatement.append(" " + INNERJOIN + " " + scheme + ".CLM_SUBM_INST C ON A.SCCF_ID = C.SCCF_ID");
			sqlStatement.append(" " + LEFTJOIN + " " + scheme + ".CLM_SUBM_DIAG D ON A.SCCF_ID = D.SCCF_ID");
			sqlStatement.append(" " + LEFTJOIN + " " + scheme + ".CLM_LN E ON A.SCCF_ID = E.SCCF_ID");
			sqlStatement.append(" " + LEFTJOIN + " " + scheme + ".CLM_LN_INST F ON A.SCCF_ID = F.SCCF_ID AND E.LN_NUM = F.LN_NUM");
			sqlStatement.append(" " + INNERJOIN + " " + scheme + ".CLM_SUBM G ON A.SCCF_ID = G.SCCF_ID");
			sqlStatement.append(" " + LEFTJOIN + " " + scheme + ".CLM_SPCL_NOTE H ON A.SCCF_ID = H.SCCF_ID AND A.BUS_OWNER_ID = H.BUS_OWNER_ID AND H.SPCL_NOTE_TXT != ''");
			sqlStatement.append(" " + LEFTJOIN + " " + scheme + ".CLM_OPL I ON A.SCCF_ID = I.SCCF_ID");
			sqlStatement.append(" WHERE A.SCCF_ID = ? AND A.CLM_TXN_TP_CD = 'SF' WITH UR");

			logger.info("SQL query for BlueCard Facility: {}", sqlStatement);
			preparedStatement = connection.prepareStatement(sqlStatement.toString());
			preparedStatement.setString(1, sccfId);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				BluecardDTO bluecardOutput = new BluecardDTO();

				bluecardOutput.setSccf(resultSet.getString(1));
				bluecardOutput.setClmTpCd(resultSet.getString(2));
				bluecardOutput.setTotChgAmt(resultSet.getString(3));
				bluecardOutput.setServDate(resultSet.getString(4));
				bluecardOutput.setBcbsProvId(resultSet.getString(5));
				bluecardOutput.setProgramCd(resultSet.getString(6));
				bluecardOutput.setDlvyMethod(resultSet.getString(7));
				bluecardOutput.setNatlOoaCd(resultSet.getString(8));
				bluecardOutput.setLenStayDayNum(resultSet.getString(9));
				bluecardOutput.setPrcMethCdII(resultSet.getString(10));
				bluecardOutput.setAdmitSrcCd(resultSet.getString(11));
				bluecardOutput.setAdmitDt(resultSet.getString(12));
				bluecardOutput.setStmtCovFromDt(resultSet.getString(13));
				bluecardOutput.setStmtCovToDt(resultSet.getString(14));
				bluecardOutput.setPatStsCd(resultSet.getString(15));
				bluecardOutput.setValCd1(resultSet.getString(16));
				bluecardOutput.setValCd2(resultSet.getString(17));
				bluecardOutput.setValCd3(resultSet.getString(18));
				bluecardOutput.setValCd4(resultSet.getString(19));
				bluecardOutput.setValCd5(resultSet.getString(20));
				bluecardOutput.setValCd6(resultSet.getString(21));
				bluecardOutput.setValCd7(resultSet.getString(22));
				bluecardOutput.setValCd8(resultSet.getString(23));
				bluecardOutput.setValCd9(resultSet.getString(24));
				bluecardOutput.setValCd10(resultSet.getString(25));
				bluecardOutput.setValCd11(resultSet.getString(26));
				bluecardOutput.setValCd12(resultSet.getString(27));
				bluecardOutput.setPrincProcCd(resultSet.getString(28));
				bluecardOutput.setPrincProcDt(resultSet.getString(29));
				bluecardOutput.setIcd10PrincProcCd(resultSet.getString(30));
				bluecardOutput.setIcd10ProcCd1(resultSet.getString(31));
				bluecardOutput.setIcd10ProcCd2(resultSet.getString(32));
				bluecardOutput.setIcd10ProcCd3(resultSet.getString(33));
				bluecardOutput.setIcd10ProcCd4(resultSet.getString(34));
				bluecardOutput.setIcd10ProcCd5(resultSet.getString(35));
				bluecardOutput.setIcd10ProcCd6(resultSet.getString(36));
				bluecardOutput.setIcd10ProcCd7(resultSet.getString(37));
				bluecardOutput.setIcd10ProcCd8(resultSet.getString(38));
				bluecardOutput.setIcd10ProcCd9(resultSet.getString(39));
				bluecardOutput.setIcd10ProcCd10(resultSet.getString(40));
				bluecardOutput.setIcd10ProcCd11(resultSet.getString(41));
				bluecardOutput.setIcd10ProcCd12(resultSet.getString(42));
				bluecardOutput.setIcd10ProcCd13(resultSet.getString(43));
				bluecardOutput.setIcd10ProcCd14(resultSet.getString(44));
				bluecardOutput.setIcd10ProcCd15(resultSet.getString(45));
				bluecardOutput.setIcd10ProcCd16(resultSet.getString(46));
				bluecardOutput.setIcd10ProcCd17(resultSet.getString(47));
				bluecardOutput.setIcd10ProcCd18(resultSet.getString(48));
				bluecardOutput.setIcd10ProcCd19(resultSet.getString(49));
				bluecardOutput.setIcd10ProcCd20(resultSet.getString(50));
				bluecardOutput.setIcd10ProcCd21(resultSet.getString(51));
				bluecardOutput.setIcd10ProcCd22(resultSet.getString(52));
				bluecardOutput.setIcd10ProcCd23(resultSet.getString(53));
				bluecardOutput.setIcd10ProcCd24(resultSet.getString(54));
				bluecardOutput.setProcCd1(resultSet.getString(55));
				bluecardOutput.setProcCd2(resultSet.getString(56));
				bluecardOutput.setProcCd3(resultSet.getString(57));
				bluecardOutput.setProcCd4(resultSet.getString(58));
				bluecardOutput.setProcCd5(resultSet.getString(59));
				bluecardOutput.setProcCd6(resultSet.getString(60));
				bluecardOutput.setProcCd7(resultSet.getString(61));
				bluecardOutput.setProcCd8(resultSet.getString(62));
				bluecardOutput.setProcCd9(resultSet.getString(63));
				bluecardOutput.setProcCd10(resultSet.getString(64));
				bluecardOutput.setProcCd11(resultSet.getString(65));
				bluecardOutput.setProcCd12(resultSet.getString(66));
				bluecardOutput.setProcCd13(resultSet.getString(67));
				bluecardOutput.setProcCd14(resultSet.getString(68));
				bluecardOutput.setProcCd15(resultSet.getString(69));
				bluecardOutput.setProcCd16(resultSet.getString(70));
				bluecardOutput.setProcCd17(resultSet.getString(71));
				bluecardOutput.setProcCd18(resultSet.getString(72));
				bluecardOutput.setProcCd19(resultSet.getString(73));
				bluecardOutput.setProcCd20(resultSet.getString(74));
				bluecardOutput.setProcCd21(resultSet.getString(75));
				bluecardOutput.setProcCd22(resultSet.getString(76));
				bluecardOutput.setProcCd23(resultSet.getString(77));
				bluecardOutput.setProcCd24(resultSet.getString(78));
				bluecardOutput.setProcDt1(resultSet.getString(79));
				bluecardOutput.setProcDt2(resultSet.getString(80));
				bluecardOutput.setProcDt3(resultSet.getString(81));
				bluecardOutput.setProcDt4(resultSet.getString(82));
				bluecardOutput.setProcDt5(resultSet.getString(83));
				bluecardOutput.setProcDt6(resultSet.getString(84));
				bluecardOutput.setProcDt7(resultSet.getString(85));
				bluecardOutput.setProcDt8(resultSet.getString(86));
				bluecardOutput.setProcDt9(resultSet.getString(87));
				bluecardOutput.setProcDt10(resultSet.getString(88));
				bluecardOutput.setProcDt11(resultSet.getString(89));
				bluecardOutput.setProcDt12(resultSet.getString(90));
				bluecardOutput.setProcDt13(resultSet.getString(91));
				bluecardOutput.setProcDt14(resultSet.getString(92));
				bluecardOutput.setProcDt15(resultSet.getString(93));
				bluecardOutput.setProcDt16(resultSet.getString(94));
				bluecardOutput.setProcDt17(resultSet.getString(95));
				bluecardOutput.setProcDt18(resultSet.getString(96));
				bluecardOutput.setProcDt19(resultSet.getString(97));
				bluecardOutput.setProcDt20(resultSet.getString(98));
				bluecardOutput.setProcDt21(resultSet.getString(99));
				bluecardOutput.setProcDt22(resultSet.getString(100));
				bluecardOutput.setProcDt23(resultSet.getString(101));
				bluecardOutput.setProcDt24(resultSet.getString(102));
				bluecardOutput.setPrincDiagPoaCd(resultSet.getString(103));
				bluecardOutput.setIcd10PrincDiagCd(resultSet.getString(104));
				bluecardOutput.setIcd10AdmitDiagCd(resultSet.getString(105));
				bluecardOutput.setDiagCdOne(resultSet.getString(106));
				bluecardOutput.setDiagCdTwo(resultSet.getString(107));
				bluecardOutput.setDiagCdThree(resultSet.getString(108));
				bluecardOutput.setDiagCdFour(resultSet.getString(109));
				bluecardOutput.setDiagCdFive(resultSet.getString(110));
				bluecardOutput.setDiagCdSix(resultSet.getString(111));
				bluecardOutput.setDiagCdSeven(resultSet.getString(112));
				bluecardOutput.setDiagCdEight(resultSet.getString(113));
				bluecardOutput.setDiagCdNine(resultSet.getString(114));
				bluecardOutput.setDiagCdTen(resultSet.getString(115));
				bluecardOutput.setDiagCdEleven(resultSet.getString(116));
				bluecardOutput.setDiagCdTwelve(resultSet.getString(117));
				bluecardOutput.setDiagCdThirteen(resultSet.getString(118));
				bluecardOutput.setDiagCdFourteen(resultSet.getString(119));
				bluecardOutput.setDiagCdFifteen(resultSet.getString(120));
				bluecardOutput.setDiagCdSixteen(resultSet.getString(121));
				bluecardOutput.setDiagCdSeventeen(resultSet.getString(122));
				bluecardOutput.setDiagCdEighteen(resultSet.getString(123));
				bluecardOutput.setDiagCdNineteen(resultSet.getString(124));
				bluecardOutput.setDiagCdTwenty(resultSet.getString(125));
				bluecardOutput.setDiagCdTwentyOne(resultSet.getString(126));
				bluecardOutput.setDiagCdTwentyTwo(resultSet.getString(127));
				bluecardOutput.setDiagCdTwentyThree(resultSet.getString(128));
				bluecardOutput.setDiagCdTwentyFour(resultSet.getString(129));
				bluecardOutput.setDiagPoaCd1(resultSet.getString(130));
				bluecardOutput.setDiagPoaCd2(resultSet.getString(131));
				bluecardOutput.setDiagPoaCd3(resultSet.getString(132));
				bluecardOutput.setDiagPoaCd4(resultSet.getString(133));
				bluecardOutput.setDiagPoaCd5(resultSet.getString(134));
				bluecardOutput.setDiagPoaCd6(resultSet.getString(135));
				bluecardOutput.setDiagPoaCd7(resultSet.getString(136));
				bluecardOutput.setDiagPoaCd8(resultSet.getString(137));
				bluecardOutput.setDiagPoaCd9(resultSet.getString(138));
				bluecardOutput.setDiagPoaCd10(resultSet.getString(139));
				bluecardOutput.setDiagPoaCd11(resultSet.getString(140));
				bluecardOutput.setDiagPoaCd12(resultSet.getString(141));
				bluecardOutput.setDiagPoaCd13(resultSet.getString(142));
				bluecardOutput.setDiagPoaCd14(resultSet.getString(143));
				bluecardOutput.setDiagPoaCd15(resultSet.getString(144));
				bluecardOutput.setDiagPoaCd16(resultSet.getString(145));
				bluecardOutput.setDiagPoaCd17(resultSet.getString(146));
				bluecardOutput.setDiagPoaCd18(resultSet.getString(147));
				bluecardOutput.setDiagPoaCd19(resultSet.getString(148));
				bluecardOutput.setDiagPoaCd20(resultSet.getString(149));
				bluecardOutput.setDiagPoaCd21(resultSet.getString(150));
				bluecardOutput.setDiagPoaCd22(resultSet.getString(151));
				bluecardOutput.setDiagPoaCd23(resultSet.getString(152));
				bluecardOutput.setDiagPoaCd24(resultSet.getString(153));
				bluecardOutput.setIcdTenDiagCdOne(resultSet.getString(154));
				bluecardOutput.setIcdTenDiagCdTwo(resultSet.getString(155));
				bluecardOutput.setIcdTenDiagCdThree(resultSet.getString(156));
				bluecardOutput.setIcdTenDiagCdFour(resultSet.getString(157));
				bluecardOutput.setIcdTenDiagCdFive(resultSet.getString(158));
				bluecardOutput.setIcdTenDiagCdSix(resultSet.getString(159));
				bluecardOutput.setIcdTenDiagCdSeven(resultSet.getString(160));
				bluecardOutput.setIcdTenDiagCdEight(resultSet.getString(161));
				bluecardOutput.setIcdTenDiagCdNine(resultSet.getString(162));
				bluecardOutput.setIcdTenDiagCdTen(resultSet.getString(163));
				bluecardOutput.setIcdTenDiagCdEleven(resultSet.getString(164));
				bluecardOutput.setIcdTenDiagCdTwelve(resultSet.getString(165));
				bluecardOutput.setIcdTenDiagCdThirteen(resultSet.getString(166));
				bluecardOutput.setIcdTenDiagCdFourteen(resultSet.getString(167));
				bluecardOutput.setIcdTenDiagCdFifteen(resultSet.getString(168));
				bluecardOutput.setIcdTenDiagCdSixteen(resultSet.getString(169));
				bluecardOutput.setIcdTenDiagCdSeventeen(resultSet.getString(170));
				bluecardOutput.setIcdTenDiagCdEighteen(resultSet.getString(171));
				bluecardOutput.setIcdTenDiagCdNineteen(resultSet.getString(172));
				bluecardOutput.setIcdTenDiagCdTwenty(resultSet.getString(173));
				bluecardOutput.setIcdTenDiagCdTwentyOne(resultSet.getString(174));
				bluecardOutput.setIcdTenDiagCdTwentyTwo(resultSet.getString(175));
				bluecardOutput.setIcdTenDiagCdTwentyThree(resultSet.getString(176));
				bluecardOutput.setIcdTenDiagCdTwentyFour(resultSet.getString(177));
				bluecardOutput.setLnNum(resultSet.getString(178));
				bluecardOutput.setRuleNumId(resultSet.getString(179));
				bluecardOutput.setPrcMethCdIO(resultSet.getString(180));
				bluecardOutput.setRevCd(resultSet.getString(181));
				bluecardOutput.setAccomRateAmt(resultSet.getString(182));
				bluecardOutput.setRevTpCd(resultSet.getString(183));
				bluecardOutput.setLocRateAmt(resultSet.getString(184));
				bluecardOutput.setBenefitManagementTreatmentAuthNum(resultSet.getString(185));
				bluecardOutput.setAdmitTpCd(resultSet.getString(186));
				bluecardOutput.setCondCd1(resultSet.getString(187));
				bluecardOutput.setCondCd2(resultSet.getString(188));
				bluecardOutput.setCondCd3(resultSet.getString(189));
				bluecardOutput.setCondCd4(resultSet.getString(190));
				bluecardOutput.setCondCd5(resultSet.getString(191));
				bluecardOutput.setCondCd6(resultSet.getString(192));
				bluecardOutput.setCondCd7(resultSet.getString(193));
				bluecardOutput.setCondCd8(resultSet.getString(194));
				bluecardOutput.setCondCd9(resultSet.getString(195));
				bluecardOutput.setCondCd10(resultSet.getString(196));
				bluecardOutput.setAdmitHrNum(resultSet.getString(197));
				bluecardOutput.setDischrgHrNum(resultSet.getString(198));
				bluecardOutput.setOccrCd1(resultSet.getString(199));
				bluecardOutput.setOccrCd2(resultSet.getString(200));
				bluecardOutput.setOccrCd3(resultSet.getString(201));
				bluecardOutput.setOccrCd4(resultSet.getString(202));
				bluecardOutput.setOccrCd5(resultSet.getString(203));
				bluecardOutput.setOccrCd6(resultSet.getString(204));
				bluecardOutput.setOccrCd7(resultSet.getString(205));
				bluecardOutput.setOccrCd8(resultSet.getString(206));
				bluecardOutput.setOccrCd9(resultSet.getString(207));
				bluecardOutput.setOccrCd10(resultSet.getString(208));
				bluecardOutput.setOccrDt1(resultSet.getString(209));
				bluecardOutput.setOccrDt2(resultSet.getString(210));
				bluecardOutput.setOccrDt3(resultSet.getString(211));
				bluecardOutput.setOccrDt4(resultSet.getString(212));
				bluecardOutput.setOccrDt5(resultSet.getString(213));
				bluecardOutput.setOccrDt6(resultSet.getString(214));
				bluecardOutput.setOccrDt7(resultSet.getString(215));
				bluecardOutput.setOccrDt8(resultSet.getString(216));
				bluecardOutput.setOccrDt9(resultSet.getString(217));
				bluecardOutput.setOccrDt10(resultSet.getString(218));
				bluecardOutput.setBillTpCd(resultSet.getString(219));
				bluecardOutput.setMedRecId(resultSet.getString(220));
				bluecardOutput.setPatRsnVisDiagCd1(resultSet.getString(221));
				bluecardOutput.setPatRsnVisDiagCd2(resultSet.getString(222));
				bluecardOutput.setPatRsnVisDiagCd3(resultSet.getString(223));
				bluecardOutput.setPatCntlId(resultSet.getString(224));
				bluecardOutput.setPatFirstName(resultSet.getString(225));
				bluecardOutput.setPatLastName(resultSet.getString(226));
				bluecardOutput.setPatMiNm(resultSet.getString(227));
				bluecardOutput.setPatSexCd(resultSet.getString(228));
				bluecardOutput.setPatBirthDt(resultSet.getString(229));
				bluecardOutput.setIcd10ExtCauseInjCd1(resultSet.getString(230));
				bluecardOutput.setIcd10ExtCauseInjCd2(resultSet.getString(231));
				bluecardOutput.setIcd10ExtCauseInjCd3(resultSet.getString(232));
				bluecardOutput.setIcd10ExtCauseInjCd4(resultSet.getString(233));
				bluecardOutput.setIcd10ExtCauseInjCd5(resultSet.getString(234));
				bluecardOutput.setIcd10ExtCauseInjCd6(resultSet.getString(235));
				bluecardOutput.setIcd10ExtCauseInjCd7(resultSet.getString(236));
				bluecardOutput.setIcd10ExtCauseInjCd8(resultSet.getString(237));
				bluecardOutput.setIcd10ExtCauseInjCd9(resultSet.getString(238));
				bluecardOutput.setIcd10ExtCauseInjCd10(resultSet.getString(239));
				bluecardOutput.setIcd10ExtCauseInjCd11(resultSet.getString(240));
				bluecardOutput.setIcd10ExtCauseInjCd12(resultSet.getString(241));
				bluecardOutput.setNatlProvId(resultSet.getString(242));
				bluecardOutput.setSubscriberFirstNm(resultSet.getString(243));
				bluecardOutput.setSubscriberLastNm(resultSet.getString(244));
				bluecardOutput.setSubscriberMiNm(resultSet.getString(245));
				bluecardOutput.setPatRelSubCd(resultSet.getString(246));
				bluecardOutput.setServNum(resultSet.getString(247));
				bluecardOutput.setServChgAmt(resultSet.getDouble(248));
				bluecardOutput.setClaimSpecNoteData(resultSet.getString(249));
				bluecardOutput.setSubscriberId(resultSet.getString(250).trim() + resultSet.getString(251).trim());
				bluecardOutput.setHcpcsProcCd(resultSet.getString(252));
				bluecardOutput.setOplValueCd(resultSet.getString(253));
				bluecardOutput.setOplValueAmt(resultSet.getString(254));
				bluecardOutput.setHcpcsProcmodCdOne(resultSet.getString(255));
				bluecardOutput.setHcpcsProcmodCdTwo(resultSet.getString(256));
				bluecardOutput.setHcpcsProcmodCdThree(resultSet.getString(257));
				bluecardOutput.setHcpcsProcmodCdFour(resultSet.getString(258));


				arrayList.add(bluecardOutput);
			}
			facilityCodeToText(arrayList);

			// STRY0103208 - Adding new reimbursement fields
			// check how many RF rows exist
			String rfCountSql = "SELECT COUNT(*) FROM " + scheme + ".IPP_CLM_REC_INST_V"
					+ " WHERE SCCF_ID = '" + sccfId + "'";
			logger.info("Initial RF row count SQL: {}", rfCountSql);
			preparedStatement = connection.prepareStatement(rfCountSql);
			resultSet = preparedStatement.executeQuery();

			String newSccfId;
			// if more than 1 RF row we will modify SCCF for the latest
			if (resultSet.next() && resultSet.getInt(1) > 1) {
				// remove last two characters of the sccf#
				newSccfId = sccfId.substring(0, sccfId.length() - 2);
				newSccfId = newSccfId + "01";
			} else {
				newSccfId = sccfId;
			}

			// new query for these specific results
			// some fields may not be included in output, but are included here 
			// to ensure we get the latest result
			String cfaSql = "SELECT"
					+ " SCCF_ID"
					+ ", CFA_STS_CD"
					+ ", CHK_VCHR_ID"
					+ ", CFA_PRCS_DT"
					+ ", MAX(PAID_DT) AS PAID_DT"
					+ " FROM " + scheme + ".IPP_CLM_REC_INST_V"
					+ " WHERE SCCF_ID = '" + newSccfId + "'"
					+ " GROUP BY SCCF_ID, CFA_STS_CD, CHK_VCHR_ID, CFA_PRCS_DT";

			logger.info("Second SQL for facility output: {}", cfaSql);
			preparedStatement = connection.prepareStatement(cfaSql);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				BluecardDTO bluecardOutput = new BluecardDTO();
				bluecardOutput.setSccf(resultSet.getString(1));
				bluecardOutput.setCfaStatusCd(resultSet.getString(2));
				bluecardOutput.setCheckVoucherNumber(resultSet.getString(3));
				bluecardOutput.setCfaProcessingDt(resultSet.getString(4));

				arrayList.add(bluecardOutput);
			}
		}
		catch (SQLException se) {
			this.processException(se);
		}
		catch (Exception e) {
			this.processException(e);
		}
		finally {
			displayResults();
			this.closeConnections();
		}

		return arrayList;
	}

	// this translates the database result into something matching Blue2's UI
	public void facilityCodeToText(List<BluecardDTO> bluecardArray) {
		for (BluecardDTO bluecard : bluecardArray) {
			// delivery method
			if (bluecard.getDlvyMethod().trim().equals("0")) {
				bluecard.setDlvyMethod("0 - Not specified or other (NOT SPECIF)");
			} else if (bluecard.getDlvyMethod().trim().equals("1")) {
				bluecard.setDlvyMethod("1 - Traditional (TRADITIONAL)");
			} else if (bluecard.getDlvyMethod().trim().equals("2")) {
				bluecard.setDlvyMethod("2 - PPO & BlueCard PPO Program");
			} else if (bluecard.getDlvyMethod().trim().equals("3")) {
				bluecard.setDlvyMethod("3 - Point of Service (POS)");
			} else if (bluecard.getDlvyMethod().trim().equals("4")) {
				bluecard.setDlvyMethod("4 - BlueCard POS");
			} else if (bluecard.getDlvyMethod().trim().equals("5")) {
				bluecard.setDlvyMethod("5 - HMO");
			} else if (bluecard.getDlvyMethod().trim().equals("6")) {
				bluecard.setDlvyMethod("6 - Medicare complementary");
			} else if (bluecard.getDlvyMethod().trim().equals("7")) {
				bluecard.setDlvyMethod("7 - Medicare Advantage PPO without Reciprocity");
			} else if (bluecard.getDlvyMethod().trim().equals("8")) {
				bluecard.setDlvyMethod("8 - Medicaid");
			} else if (bluecard.getDlvyMethod().trim().equals("9")) {
				bluecard.setDlvyMethod("9 - Medicare Carve-out");
			} else if (bluecard.getDlvyMethod().trim().equals("A")) {
				bluecard.setDlvyMethod("A - Medicare Advantage PPO with Reciprocity");
			} else if (bluecard.getDlvyMethod().trim().equals("B")) {
				bluecard.setDlvyMethod("B - Medicare Advantage Regional PPO with Reciprocity");
			} else if (bluecard.getDlvyMethod().trim().equals("C")) {
				bluecard.setDlvyMethod("C - Medicare Advantage HMO");
			} else if (bluecard.getDlvyMethod().trim().equals("D")) {
				bluecard.setDlvyMethod("D - Medicare Advantage Private Fee for Service (PFFS)");
			} else if (bluecard.getDlvyMethod().trim().equals("E")) {
				bluecard.setDlvyMethod("E - Medicare Advantage Special Needs Plan (SNP)");
			} else if (bluecard.getDlvyMethod().trim().equals("F")) {
				bluecard.setDlvyMethod("F - Medicare Advantage Cost Product");
			} else if (bluecard.getDlvyMethod().trim().equals("G")) {
				bluecard.setDlvyMethod("G - Custom Network with PPO Wrap");
			} else if (bluecard.getDlvyMethod().trim().equals("H")) {
				bluecard.setDlvyMethod("H - Custom Network with Traditional Wrap");
			} else if (bluecard.getDlvyMethod().trim().equals("I")) {
				bluecard.setDlvyMethod("I - Custom Network with No Wrap");
			} else if (bluecard.getDlvyMethod().trim().equals("J")) {
				bluecard.setDlvyMethod("J - AltNet Network");
			} else if (bluecard.getDlvyMethod().trim().equals("K")) {
				bluecard.setDlvyMethod("K - Qualified PPO");
			} else if (bluecard.getDlvyMethod().trim().equals("L")) {
				bluecard.setDlvyMethod("L - Qualified PPO Custom");
			} else if (bluecard.getDlvyMethod().trim().equals("M")) {
				bluecard.setDlvyMethod("M - High Performance Network without Tiers");
			} else if (bluecard.getDlvyMethod().trim().equals("N")) {
				bluecard.setDlvyMethod("N - High Performance Network with Tiers");
			} 

			// national/ooa codes
			if (bluecard.getNatlOoaCd().trim().equals("1")) {
				bluecard.setNatlOoaCd("1 - National Account");
			} else if (bluecard.getNatlOoaCd().trim().equals("2")) {
				bluecard.setNatlOoaCd("2 - Out-of-Area");
			} else if (bluecard.getNatlOoaCd().trim().equals("3")) {
				bluecard.setNatlOoaCd("3 - National PPO Reduce Rate");
			}
		}
	}


	public List<BlueSquareDTO> queryBlueSquareMessageType(String dataSource, String scheme, String claimNumber) {
		this.setDbFunctionDelete(dbFunctionDelete);
		ArrayList<BlueSquareDTO> arrayList = new ArrayList<>();

		try {
			this.initializeConnection(dataSource, "");

			//SELECT
			sqlStatement.append("SELECT SCCF_ID");//1
			sqlStatement.append(", RSN_CD AS REASON_CODE");//2
			sqlStatement.append(", MSG_TP_CD AS MESSAGE_TYPE_CODE");//3
			//FROM
			sqlStatement.append(" FROM " + scheme + ".IPP_MSG_SEARCH");
			//WHERE
			sqlStatement.append(" WHERE PRCSG_SITE_CNTL_ID = ? ");


			logger.info("SQL query for message type: {}", sqlStatement);
			preparedStatement = connection.prepareStatement(sqlStatement.toString());
			preparedStatement.setString(1, claimNumber);
			resultSet = preparedStatement.executeQuery();



			while (resultSet.next()) {
				BlueSquareDTO bluecardOutput = new BlueSquareDTO();

				bluecardOutput.setSccfId(resultSet.getString(1));
				bluecardOutput.setReasonCode(resultSet.getString(2));
				bluecardOutput.setMessageTypeCode(resultSet.getString(3));


				arrayList.add(bluecardOutput);
			}
		}
		catch (SQLException se) {
			this.processException(se);
		}
		catch (Exception e) {
			this.processException(e);
		}
		finally {
			displayResults();
			this.closeConnections();
		}

		return arrayList;
	}

}



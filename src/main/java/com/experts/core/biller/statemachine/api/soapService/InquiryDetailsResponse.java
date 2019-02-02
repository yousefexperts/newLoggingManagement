package com.experts.core.biller.statemachine.api.soapService;



import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.sql.Timestamp;
import java.util.Date;




@XmlRootElement(name = "InquiryDetailsResponse")
public class InquiryDetailsResponse {

    private static final long serialVersionUID = 1111648120;

    @XmlElement(name  = "agreementId" , required = false , nillable = false)
    public String agreementId;

    @XmlElement(name  = "agreementSerial" , required = false , nillable = false)
    public String agreementSerial ;

    @XmlElement(name  = "allowAmt" , required = false , nillable = false)
    public String allowAmt ;

    @XmlElement(name  = "areaId" , required = false , nillable = false)
    public String areaId ;

    @XmlElement(name  = "baseAmt" , required = false , nillable = false)
    public String baseAmt ;

    @XmlElement(name  = "benSystemNo" , required = false , nillable = false)
    public String benSystemNo ;

    @XmlElement(name  = "branchId" , required = false , nillable = false)
    public String branchId ;

    @XmlElement(name  = "calcDate" , required = false , nillable = false)
    public String calcDate ;

    @XmlElement(name  = "classCode" , required = false , nillable = false)
    public String classCode ;

    @XmlElement(name  = "combinCodeCr" , required = false , nillable = false)
    public String combinCodeCr ;

    @XmlElement(name  = "combinCodeDb" , required = false , nillable = false)
    public String combinCodeDb ;

    @XmlElement(name  = "compId" , required = false , nillable = false)
    public String compId ;

    @XmlElement(name  = "constantAmt" , required = false , nillable = false)
    public String constantAmt ;

    @XmlElement(name  = "consumptionAmt" , required = false , nillable = false)
    public String consumptionAmt ;

    @XmlElement(name  = "consumptionQty" , required = false , nillable = false)
    public String consumptionQty ;

    @XmlElement(name  = "consumptionType" , required = false , nillable = false)
    public String consumptionType ;

    @XmlElement(name  = "crateAmt" , required = false , nillable = false)
    public String crateAmt ;

    @XmlElement(name  = "crateDate" , required = false , nillable = false)
    public String crateDate ;

    @XmlElement(name  = "crateTypeCode" , required = false , nillable = false)
    public String crateTypeCode ;

    @XmlElement(name  = "creditAmt" , required = false , nillable = false)
    public String creditAmt ;

    @XmlElement(name  = "creditQty" , required = false , nillable = false)
    public String creditQty ;

    @XmlElement(name  = "currencyId" , required = false , nillable = false)
    public String currencyId ;

    @XmlElement(name  = "customerType" , required = false , nillable = false)
    public String customerType ;

    @XmlElement(name  = "cycleSerial" , required = false , nillable = false)
    public String cycleSerial ;

    @XmlElement(name  = "debtsAmt" , required = false , nillable = false)
    public String debtsAmt ;

    @XmlElement(name  = "debtType" , required = false , nillable = false)
    public String debtType ;

    @XmlElement(name  = "deductionAmt" , required = false , nillable = false)
    public String deductionAmt;

    @XmlElement(name  = "distAreaCode" , required = false , nillable = false)
    public String distAreaCode ;

    @XmlElement(name  = "distributionDay" , required = false , nillable = false)
    public String distributionDay ;

    @XmlElement(name  = "distributionRoute" , required = false , nillable = false)
    public String distributionRoute ;

    @XmlElement(name  = "dstrctCode" , required = false , nillable = false)
    public String dstrctCode ;

    @XmlElement(name  = "dtimeStamp" , required = false , nillable = false)
    public String dtimeStamp ;

    @XmlElement(name  = "duserId" , required = false , nillable = false)
    public String duserId ;

    @XmlElement(name  = "exemptionAmt" , required = false , nillable = false)
    public String exemptionAmt ;

    @XmlElement(name  = "extraAmt" , required = false , nillable = false)
    public String extraAmt ;

    @XmlElement(name  = "feeAmt" , required = false , nillable = false)
    public String feeAmt ;

    @XmlElement(name  = "feeCode" , required = false , nillable = false)
    public String feeCode ;

    @XmlElement(name  = "feesVoucherNo" , required = false , nillable = false)
    public String feesVoucherNo ;

    @XmlElement(name  = "fixedAmt" , required = false , nillable = false)
    public String fixedAmt ;

    @XmlElement(name  = "glBaseAmt" , required = false , nillable = false)
    public String glBaseAmt ;

    @XmlElement(name  = "glCrateAmt" , required = false , nillable = false)
    public String glCrateAmt ;

    @XmlElement(name  = "glCrateDate" , required = false , nillable = false)
    public String glCrateDate ;

    @XmlElement(name  = "glCrateTypeCode" , required = false , nillable = false)
    public String glCrateTypeCode ;

    @XmlElement(name  = "glPosted" , required = false , nillable = false)
    public String glPosted ;

    @XmlElement(name  = "glPostedDate" , required = false , nillable = false)
    public String glPostedDate ;

    @XmlElement(name  = "glPostedUser" , required = false , nillable = false)
    public String glPostedUser ;

    @XmlElement(name  = "glTransNo" , required = false , nillable = false)
    public String glTransNo ;

    @XmlElement(name  = "immovableType" , required = false , nillable = false)
    public String immovableType ;

    @XmlElement(name  = "isOldDebt" , required = false , nillable = false)
    public String isOldDebt ;

    @XmlElement(name  = "isPosted" , required = false , nillable = false)
    public String isPosted ;

    @XmlElement(name  = "isPrinted" , required = false , nillable = false)
    public String isPrinted ;

    @XmlElement(name  = "isUpdated" , required = false , nillable = false)
    public String isUpdated ;

    @XmlElement(name  = "itimeStamp" , required = false , nillable = false)
    public String itimeStamp ;

    @XmlElement(name  = "iuserId" , required = false , nillable = false)
    public String iuserId ;

    @XmlElement(name  = "kvrAmt" , required = false , nillable = false)
    public String kvrAmt ;

    @XmlElement(name  = "lastDueDate" , required = false , nillable = false)
    public String lastDueDate ;

    @XmlElement(name  = "lastFeeDate" , required = false , nillable = false)
    public String lastFeeDate ;

    @XmlElement(name  = "lateAmt" , required = false , nillable = false)
    public String lateAmt ;

    @XmlElement(name  = "lateFeesAmt" , required = false , nillable = false)
    public String lateFeesAmt ;

    @XmlElement(name  = "locatCode" , required = false , nillable = false)
    public String locatCode ;

    @XmlElement(name  = "locationId" , required = false , nillable = false)
    public String locationId;

    @XmlElement(name  = "lowerLimitAmt" , required = false , nillable = false)
    public String lowerLimitAmt ;

    @XmlElement(name  = "maintenanceAmt" , required = false , nillable = false)
    public String maintenanceAmt ;

    @XmlElement(name  = "manVoucherMaster" , required = false , nillable = false)
    public String manVoucherMaster ;

    @XmlElement(name  = "meterFees" , required = false , nillable = false)
    public String meterFees ;

    @XmlElement(name  = "miscellanyAmt" , required = false , nillable = false)
    public String miscellanyAmt ;

    @XmlElement(name  = "netAmt" , required = false , nillable = false)
    public String netAmt ;

    @XmlElement(name  = "newLateAmt" , required = false , nillable = false)
    public String newLateAmt ;

    @XmlElement(name  = "noOfUnits" , required = false , nillable = false)
    public String noOfUnits ;

    @XmlElement(name  = "oldDebtAmt" , required = false , nillable = false)
    public String oldDebtAmt;

    @XmlElement(name  = "oldDebtPaid" , required = false , nillable = false)
    public String oldDebtPaid ;

    @XmlElement(name  = "oldFeeDate" , required = false , nillable = false)
    public String oldFeeDate ;

    @XmlElement(name  = "oldNetAmt" , required = false , nillable = false)
    public String oldNetAmt ;

    @XmlElement(name  = "oldNotes" , required = false , nillable = false)
    public String oldNotes ;

    @XmlElement(name  = "oldVoucherDate" , required = false , nillable = false)
    public String oldVoucherDate;

    @XmlElement(name  = "oldVoucherNo" , required = false , nillable = false)
    public String oldVoucherNo ;

    @XmlElement(name  = "originalPrintNo" , required = false , nillable = false)
    public String originalPrintNo ;

    @XmlElement(name  = "ownerSystemNo" , required = false , nillable = false)
    public String ownerSystemNo ;

    @XmlElement(name  = "paidAmt" , required = false , nillable = false)
    public String paidAmt ;

    @XmlElement(name  = "paidOnLateAmt" , required = false , nillable = false)
    public String paidOnLateAmt ;

    @XmlElement(name  = "paidOnLatePrc" , required = false , nillable = false)
    public String paidOnLatePrc ;

    @XmlElement(name  = "paymentDate" , required = false , nillable = false)
    public String paymentDate ;

    @XmlElement(name  = "periodicalAmt" , required = false , nillable = false)
    public String periodicalAmt ;

    @XmlElement(name  = "prevDiscCheckDone" , required = false , nillable = false)
    public String prevDiscCheckDone ;

    @XmlElement(name  = "prevDiscountAmt" , required = false , nillable = false)
    public String prevDiscountAmt ;

    @XmlElement(name  = "prevDiscountPrevAmt" , required = false , nillable = false)
    public String prevDiscountPrevAmt;

    @XmlElement(name  = "previousAmt" , required = false , nillable = false)
    public String previousAmt ;

    @XmlElement(name  = "previousBaseAmt" , required = false , nillable = false)
    public String previousBaseAmt ;

    @XmlElement(name  = "prevPaidAmt" , required = false , nillable = false)
    public String prevPaidAmt;

    @XmlElement(name  = "prevToleranceAmt" , required = false , nillable = false)
    public String prevToleranceAmt ;

    @XmlElement(name  = "printCount" , required = false , nillable = false)
    public String printCount ;

    @XmlElement(name  = "printDate" , required = false , nillable = false)
    public String printDate ;

    @XmlElement(name  = "readAreaCode" , required = false , nillable = false)
    public String readAreaCode ;

    @XmlElement(name  = "readingDay" , required = false , nillable = false)
    public String readingDay ;

    @XmlElement(name  = "readingRoute" , required = false , nillable = false)
    public String readingRoute ;

    @XmlElement(name  = "refNo" , required = false , nillable = false)
    public String refNo ;

    @XmlElement(name  = "refType" , required = false , nillable = false)
    public String refType;

    @XmlElement(name  = "remainAmt" , required = false , nillable = false)
    public String remainAmt ;

    @XmlElement(name  = "remainNotPaid" , required = false , nillable = false)
    public String remainNotPaid ;

    @XmlElement(name  = "resorcCode" , required = false , nillable = false)
    public String resorcCode ;

    @XmlElement(name  = "roundAmt" , required = false , nillable = false)
    public String roundAmt ;

    @XmlElement(name  = "routeCode" , required = false , nillable = false)
    public String routeCode ;

    @XmlElement(name  = "sbranchId" , required = false , nillable = false)
    public String sbranchId ;

    @XmlElement(name  = "servsType" , required = false , nillable = false)
    public String servsType ;

    @XmlElement(name  = "sewageAmt" , required = false , nillable = false)
    public String sewageAmt ;

    @XmlElement(name  = "systemNo" , required = false , nillable = false)
    public String systemNo ;

    @XmlElement(name  = "systemVoucherNo" , required = false , nillable = false)
    public String systemVoucherNo ;

    @XmlElement(name  = "usageType" , required = false , nillable = false)
    public String usageType ;

    @XmlElement(name  = "utimeStamp" , required = false , nillable = false)
    public String utimeStamp ;

    @XmlElement(name  = "uuserId" , required = false , nillable = false)
    public String uuserId ;

    @XmlElement(name  = "year" , required = false , nillable = false)
    public String vatAmt ;

    @XmlElement(name  = "year" , required = false , nillable = false)
    public String vatcatCode ;

    @XmlElement(name  = "vatValue" , required = false , nillable = false)
    public String vatValue ;

    @XmlElement(name  = "voucherAmt" , required = false , nillable = false)
    public String voucherAmt;

    @XmlElement(name  = "voucherDate" , required = false , nillable = false)
    public String voucherDate ;

    @XmlElement(name  = "voucherDocNo" , required = false , nillable = false)
    public String voucherDocNo ;

    @XmlElement(name  = "alid" , required = false , nillable = false)
    public String alid ;

    @XmlElement(name  = "voucherNo" , required = false , nillable = false)
    public String voucherNo ;

    @XmlElement(name  = "voucherStatus" , required = false , nillable = false)
    public String voucherStatus;

    @XmlElement(name  = "voucherType" , required = false , nillable = false)
    public String voucherType ;

    @XmlElement(name  = "voucherTypeSeq" , required = false , nillable = false)
    public String voucherTypeSeq ;

    @XmlElement(name  = "COMP_ID" , required = false , nillable = false)
    private String COMP_ID;

    @XmlElement(name  = "SERVS_TYPE" , required = false , nillable = false)
    private String SERVS_TYPE;

    @XmlElement(name  = "VOUCHER_NO" , required = false , nillable = false)
    private String VOUCHER_NO;

    @XmlElement(name  = "AGREEMENT_ID" , required = false , nillable = false)
    private String AGREEMENT_ID;

    @XmlElement(name  = "CUSTOMER_TYPE" , required = false , nillable = false)
    private String CUSTOMER_TYPE;

    @XmlElement(name  = "DSTRCT_CODE" , required = false , nillable = false)
    private String DSTRCT_CODE;

    @XmlElement(name  = "LOCAT_CODE" , required = false , nillable = false)
    private String LOCAT_CODE;

    @XmlElement(name  = "ROUTE_CODE" , required = false , nillable = false)
    private String ROUTE_CODE;

    @XmlElement(name  = "AGREEMENT_SERIAL" , required = false , nillable = false)
    private String AGREEMENT_SERIAL;

    @XmlElement(name  = "LOCATION_ID" , required = false , nillable = false)
    private String LOCATION_ID;

    @XmlElement(name  = "RESORC_CODE" , required = false , nillable = false)
    private String RESORC_CODE;

    @XmlElement(name  = "CONSUMPTION_TYPE" , required = false , nillable = false)
    private String CONSUMPTION_TYPE;

    @XmlElement(name  = "VATCAT_CODE" , required = false , nillable = false)
    private String VATCAT_CODE;

    @XmlElement(name  = "VAT_VALUE" , required = false , nillable = false)
    private String VAT_VALUE;

    @XmlElement(name  = "CLASS_CODE" , required = false , nillable = false)
    private String CLASS_CODE;

    @XmlElement(name  = "CURRENCY_ID" , required = false , nillable = false)
    private String CURRENCY_ID;

    @XmlElement(name  = "VOUCHER_DOC_NO" , required = false , nillable = false)
    private String VOUCHER_DOC_NO;

    @XmlElement(name  = "IMMOVABLE_TYPE" , required = false , nillable = false)
    private String IMMOVABLE_TYPE;

    @XmlElement(name  = "USAGE_TYPE" , required = false , nillable = false)
    private String USAGE_TYPE;

    @XmlElement(name  = "VOUCHER_TYPE" , required = false , nillable = false)
    private Date VOUCHER_TYPE;

    @XmlElement(name  = "VOUCHER_DATE" , required = false , nillable = false)
    private Date VOUCHER_DATE;

    @XmlElement(name  = "LAST_DUE_DATE" , required = false , nillable = false)
    private Date LAST_DUE_DATE;

    @XmlElement(name  = "PAYMENT_DATE" , required = false , nillable = false)
    private Date PAYMENT_DATE;

    @XmlElement(name  = "VOUCHER_STATUS" , required = false , nillable = false)
    private String VOUCHER_STATUS;

    @XmlElement(name  = "IS_POSTED" , required = false , nillable = false)
    private String IS_POSTED;

    @XmlElement(name  = "IS_PRINTED" , required = false , nillable = false)
    private String IS_PRINTED;

    @XmlElement(name  = "REF_TYPE" , required = false , nillable = false)
    private String REF_TYPE;

    @XmlElement(name  = "REF_NO" , required = false , nillable = false)
    private String REF_NO;

    @XmlElement(name  = "CONSUMPTION_QTY" , required = false , nillable = false)
    private String CONSUMPTION_QTY;

    @XmlElement(name  = "CONSUMPTION_AMT" , required = false , nillable = false)
    private String CONSUMPTION_AMT;

    @XmlElement(name  = "KVR_AMT" , required = false , nillable = false)
    private String KVR_AMT;

    @XmlElement(name  = "LOWER_LIMIT_AMT" , required = false , nillable = false)
    private String LOWER_LIMIT_AMT;

    @XmlElement(name  = "CONSTANT_AMT" , required = false , nillable = false)
    private String CONSTANT_AMT;

    @XmlElement(name  = "PERIODICAL_AMT" , required = false , nillable = false)
    private String PERIODICAL_AMT;

    @XmlElement(name  = "LATE_AMT" , required = false , nillable = false)
    private String LATE_AMT;

    @XmlElement(name  = "LATE_FEES_AMT" , required = false , nillable = false)
    private String LATE_FEES_AMT;

    @XmlElement(name  = "MISCELLANY_AMT" , required = false , nillable = false)
    private String MISCELLANY_AMT;

    @XmlElement(name  = "EXTRA_AMT" , required = false , nillable = false)
    private String EXTRA_AMT;

    @XmlElement(name  = "DEDUCTION_AMT" , required = false , nillable = false)
    private String DEDUCTION_AMT;

    @XmlElement(name  = "EXEMPTION_AMT" , required = false , nillable = false)
    private String EXEMPTION_AMT;

    @XmlElement(name  = "PREVIOUS_AMT" , required = false , nillable = false)
    private String PREVIOUS_AMT;

    @XmlElement(name  = "ROUND_AMT" , required = false , nillable = false)
    private String ROUND_AMT;

    @XmlElement(name  = "VAT_AMT" , required = false , nillable = false)
    private String VAT_AMT;

    @XmlElement(name  = "ALLOW_AMT" , required = false , nillable = false)
    private String ALLOW_AMT;

    @XmlElement(name  = "VOUCHER_AMT" , required = false , nillable = false)
    private String VOUCHER_AMT;

    @XmlElement(name  = "NET_AMT" , required = false , nillable = false)
    private String NET_AMT;

    @XmlElement(name  = "PAID_AMT" , required = false , nillable = false)
    private String PAID_AMT;

    @XmlElement(name  = "CREDIT_QTY" , required = false , nillable = false)
    private String CREDIT_QTY;

    @XmlElement(name  = "CREDIT_AMT" , required = false , nillable = false)
    private String CREDIT_AMT;

    @XmlElement(name  = "CRATE_TYPE_CODE" , required = false , nillable = false)
    private String CRATE_TYPE_CODE;

    @XmlElement(name  = "CRATE_AMT" , required = false , nillable = false)
    private String CRATE_AMT;

    @XmlElement(name  = "BASE_AMT" , required = false , nillable = false)
    private String BASE_AMT;

    @XmlElement(name  = "CRATE_DATE" , required = false , nillable = false)
    private Date CRATE_DATE;

    @XmlElement(name  = "GL_CRATE_TYPE_CODE" , required = false , nillable = false)
    private String GL_CRATE_TYPE_CODE;

    @XmlElement(name  = "GL_CRATE_AMT" , required = false , nillable = false)
    private String GL_CRATE_AMT;

    @XmlElement(name  = "GL_CRATE_DATE" , required = false , nillable = false)
    private Date GL_CRATE_DATE;

    @XmlElement(name  = "GL_BASE_AMT" , required = false , nillable = false)
    private String GL_BASE_AMT;

    @XmlElement(name  = "GL_POSTED" , required = false , nillable = false)
    private String GL_POSTED;

    @XmlElement(name  = "GL_POSTED_DATE" , required = false , nillable = false)
    private Date GL_POSTED_DATE;

    @XmlElement(name  = "GL_TRANS_NO" , required = false , nillable = false)
    private String GL_TRANS_NO;

    @XmlElement(name  = "GL_POSTED_USER" , required = false , nillable = false)
    private String GL_POSTED_USER;

    @XmlElement(name  = "NO_OF_UNITS" , required = false , nillable = false)
    private String NO_OF_UNITS;

    @XmlElement(name  = "ITIME_STAMP" , required = false , nillable = false)
    private String ITIME_STAMP;

    @XmlElement(name  = "IUSER_ID" , required = false , nillable = false)
    private String IUSER_ID;

    @XmlElement(name  = "UTIME_STAMP" , required = false , nillable = false)
    private Date UTIME_STAMP;

    @XmlElement(name  = "UUSER_ID" , required = false , nillable = false)
    private String UUSER_ID;

    @XmlElement(name  = "DTIME_STAMP" , required = false , nillable = false)
    private Timestamp DTIME_STAMP;

    @XmlElement(name  = "DUSER_ID" , required = false , nillable = false)
    private String DUSER_ID;

    @XmlElement(name  = "VOUCHER_ISVALID" , required = false , nillable = false)
    private String VOUCHER_ISVALID;

    @XmlElement(name  = "REMAIN_AMT" , required = false , nillable = false)
    private String REMAIN_AMT;

    @XmlElement(name  = "LAST_FEE_DATE" , required = false , nillable = false)
    private Date LAST_FEE_DATE;

    @XmlElement(name  = "OLD_FEE_DATE" , required = false , nillable = false)
    private Date OLD_FEE_DATE;

    @XmlElement(name  = "FEES_VOUCHER_NO" , required = false , nillable = false)
    private String FEES_VOUCHER_NO;

    @XmlElement(name  = "PREVIOUS_BASE_AMT" , required = false , nillable = false)
    private String PREVIOUS_BASE_AMT;

    @XmlElement(name  = "SYSTEM_VOUCHER_NO" , required = false , nillable = false)
    private String SYSTEM_VOUCHER_NO;

    @XmlElement(name  = "CYCLE_SERIAL" , required = false , nillable = false)
    private String CYCLE_SERIAL;

    @XmlElement(name  = "ORIGINAL_PRINT_NO" , required = false , nillable = false)
    private String ORIGINAL_PRINT_NO;

    @XmlElement(name  = "CALC_DATE" , required = false , nillable = false)
    private Date CALC_DATE;

    @XmlElement(name  = "VOUCHER_TYPE_SEQ" , required = false , nillable = false)
    private String VOUCHER_TYPE_SEQ;

    @XmlElement(name  = "FEE_AMT" , required = false , nillable = false)
    private String FEE_AMT;

    @XmlElement(name  = "MAINTENANCE_AMT" , required = false , nillable = false)
    private String MAINTENANCE_AMT;

    @XmlElement(name  = "METER_FEES" , required = false , nillable = false)
    private String METER_FEES;

    @XmlElement(name  = "OWNER_SYSTEM_NO" , required = false , nillable = false)
    private String OWNER_SYSTEM_NO;

    @XmlElement(name  = "BEN_SYSTEM_NO" , required = false , nillable = false)
    private String BEN_SYSTEM_NO;

    @XmlElement(name  = "SEWAGE_AMT" , required = false , nillable = false)
    private String SEWAGE_AMT;

    @XmlElement(name  = "DEBTS_AMT" , required = false , nillable = false)
    private String DEBTS_AMT;

    @XmlElement(name  = "YEAR" , required = false , nillable = false)
    private String YEAR;

    @XmlElement(name  = "PRINT_COUNT" , required = false , nillable = false)
    private String PRINT_COUNT;

    @XmlElement(name  = "READING_ROUTE" , required = false , nillable = false)
    private String READING_ROUTE;

    @XmlElement(name  = "DISTRIBUTION_ROUTE" , required = false , nillable = false)
    private String DISTRIBUTION_ROUTE;

    @XmlElement(name  = "DIST_AREA_CODE" , required = false , nillable = false)
    private String DIST_AREA_CODE;

    @XmlElement(name  = "READ_AREA_CODE" , required = false , nillable = false)
    private String READ_AREA_CODE;

    @XmlElement(name  = "DISTRIBUTION_DAY" , required = false , nillable = false)
    private String DISTRIBUTION_DAY;

    @XmlElement(name  = "READING_DAY" , required = false , nillable = false)
    private String READING_DAY;

    @XmlElement(name  = "IS_OLD_DEBT" , required = false , nillable = false)
    private String IS_OLD_DEBT;

    @XmlElement(name  = "OLD_DEBT_AMT" , required = false , nillable = false)
    private String OLD_DEBT_AMT;

    @XmlElement(name  = "OLD_DEBT_PAID" , required = false , nillable = false)
    private String OLD_DEBT_PAID;

    @XmlElement(name  = "DEBT_TYPE" , required = false , nillable = false)
    private String DEBT_TYPE;

    @XmlElement(name  = "FEE_CODE" , required = false , nillable = false)
    private String FEE_CODE;

    @XmlElement(name  = "PREV_DISCOUNT_AMT" , required = false , nillable = false)
    private String PREV_DISCOUNT_AMT;

    @XmlElement(name  = "PREV_DISC_CHECK_DONE" , required = false , nillable = false)
    private String  PREV_DISC_CHECK_DONE;

    @XmlElement(name  = "PREV_TOLERANCE_AMT" , required = false , nillable = false)
    private String PREV_TOLERANCE_AMT;

    @XmlElement(name  = "MAN_VOUCHER_MASTER" , required = false , nillable = false)
    private String MAN_VOUCHER_MASTER;

    @XmlElement(name  = "PREV_DISCOUNT_PREV_AMT" , required = false , nillable = false)
    private String PREV_DISCOUNT_PREV_AMT;

    @XmlElement(name  = "PREV_PAID_AMT" , required = false , nillable = false)
    private String PREV_PAID_AMT;

    @XmlElement(name  = "OLD_VOUCHER_NO" , required = false , nillable = false)
    private String OLD_VOUCHER_NO;

    @XmlElement(name  = "OLD_NOTES" , required = false , nillable = false)
    private String OLD_NOTES;

    @XmlElement(name  = "OLD_VOUCHER_DATE" , required = false , nillable = false)
    private String OLD_VOUCHER_DATE;

    @XmlElement(name  = "IS_UPDATED" , required = false , nillable = false)
    private String IS_UPDATED;

    @XmlElement(name  = "BRANCH_ID" , required = false , nillable = false)
    private String BRANCH_ID;

    @XmlElement(name  = "SBRANCH_ID" , required = false , nillable = false)
    private String SBRANCH_ID;

    @XmlElement(name  = "AREA_ID" , required = false , nillable = false)
    private String AREA_ID;

    @XmlElement(name  = "FIXED_AMT" , required = false , nillable = false)
    private String FIXED_AMT;

    @XmlElement(name  = "NEW_LATE_AMT" , required = false , nillable = false)
    private String NEW_LATE_AMT;

    @XmlElement(name  = "PAID_ON_LATE_AMT" , required = false , nillable = false)
    private String PAID_ON_LATE_AMT;

    @XmlElement(name  = "PAID_ON_LATE_PRC" , required = false , nillable = false)
    private String PAID_ON_LATE_PRC;

    @XmlElement(name  = "REMAIN_NOT_PAID" , required = false , nillable = false)
    private String REMAIN_NOT_PAID;

    @XmlElement(name  = "OLD_NET_AMT" , required = false , nillable = false)
    private String OLD_NET_AMT;

    @XmlElement(name  = "COMBIN_CODE_DB" , required = false , nillable = false)
    private String COMBIN_CODE_DB;

    @XmlElement(name  = "COMBIN_CODE_CR" , required = false , nillable = false)
    private String COMBIN_CODE_CR;

    @XmlElement(name  = "PRINT_DATE" , required = false , nillable = false)
    private Date PRINT_DATE;


    @XmlElement(name  = "billCode" , required = false , nillable = false)
    private String billCode;

    @XmlElement(name  = "billName" , required = false , nillable = false)
    private String billName;

    @XmlElement(name  = "billerName" , required = false , nillable = false)
    private String billerName;

    @XmlElement(name  = "billerCode" , required = false , nillable = false)
    private String billerCode;

    @XmlElement(name  = "billerAddress" , required = false , nillable = false)
    private String billerAddress;

    @XmlElement(name  = "clientId" , required = false , nillable = false)
    private String clientId;

    @XmlElement(name  = "onServiceBy" , required = false , nillable = true)
    private String onServiceBy;

    @XmlElement(name  = "bankId" , required = false , nillable = false)
    private String bankId;

    @XmlElement(name  = "bankName" , required = false , nillable = false)
    private String bankName;

    @XmlElement(name  = "bankAddress" , required = false , nillable = false)
    private String bankAddress;

    @XmlElement(name  = "bankCode" , required = false , nillable = false)
    private String bankCode;

}

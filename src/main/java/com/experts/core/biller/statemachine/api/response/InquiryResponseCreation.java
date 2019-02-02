package com.experts.core.biller.statemachine.api.response;

import lombok.*;

import org.hibernate.id.GUIDGenerator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Data
@Setter
@Getter
@Service("inquiryResponseCreation")
@Component
public class InquiryResponseCreation implements Serializable {


    public static String create()
            throws javax.xml.parsers.ParserConfigurationException,
            javax.xml.transform.TransformerException,
            javax.xml.transform.TransformerConfigurationException {

        DocumentBuilderFactory factory
                = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        DOMImplementation impl = builder.getDOMImplementation();

        Document doc = impl.createDocument(null, null, null);
        Element mfep = doc.createElement("MFEP");
        doc.appendChild(mfep);


        Element msgHeader = doc.createElement("MsgHeader");
        doc.appendChild(msgHeader);
        Node tstmp = doc.createElement("TmStp");
        SimpleDateFormat format = new SimpleDateFormat("yyy-MM-ddThh:mm:ss");
        tstmp.setTextContent(format.format(new Date()));
        msgHeader.appendChild(tstmp);

        Node guid = doc.createElement("GUID");
        UUID uuid = UUID.randomUUID();
        guid.setTextContent(uuid.toString());
        msgHeader.appendChild(guid);

        Node transfer = doc.createElement("TrsInf");
        Node rcvCode = doc.createElement("RcvCode");
        rcvCode.setTextContent("2");

        Node resType = doc.createElement("ResType");

        resType.setTextContent("ACCTIUNQRS");

        transfer.appendChild(rcvCode);
        transfer.appendChild(resType);

        msgHeader.appendChild(transfer);

        Node result = doc.createElement("Result");
        Node errorCode = doc.createElement("ErrorCode");

        errorCode.setTextContent("0");

        Node errorDesc = doc.createElement("ErrorDesc");

        errorDesc.setTextContent("success");

        Node severity = doc.createElement("Severity");

        severity.setTextContent("Info");

        result.appendChild(errorCode);
        result.appendChild(errorDesc);
        result.appendChild(severity);

        msgHeader.appendChild(result);

        Element acct = doc.createElement("Acct");

        Element msgBody = doc.createElement("MsgBody");

        Node body_result = doc.createElement("Result");
        Node bodyErrorCode = doc.createElement("ErrorCode");

        bodyErrorCode.setTextContent("0");

        Node bodyErrorDesc = doc.createElement("ErrorDesc");

        bodyErrorDesc.setTextContent("success");

        Node bodySeverity = doc.createElement("Severity");

        bodySeverity.setTextContent("Info");

        result.appendChild(bodyErrorCode);
        result.appendChild(bodyErrorDesc);
        result.appendChild(bodySeverity);

        acct.appendChild(body_result);


        Element custId = doc.createElement("CustId");

        Element IdType = doc.createElement("IdType");

        IdType.setTextContent("PAS");

        Element Id = doc.createElement("Id");

        Id.setTextContent("21341234345");

        Element Nation = doc.createElement("Nation");

        Nation.setTextContent("UA");

        custId.appendChild(IdType);
        custId.appendChild(Id);
        custId.appendChild(Nation);

        acct.appendChild(custId);

        Node JOEBPPSNo = doc.createElement("JOEBPPSNo");
        JOEBPPSNo.setTextContent("21");
        acct.appendChild(JOEBPPSNo);

        Node RecCount = doc.createElement("RecCount");
        JOEBPPSNo.setTextContent("1");
        acct.appendChild(RecCount);

        Node BillingRecs = doc.createElement("BillingRecs");

        Node BillingRec = doc.createElement("BillingRec");

        Node BillingCode = doc.createElement("BillingCode");

        BillingCode.setTextContent("13");

        Node BillingNo = doc.createElement("BillingNo");

        BillingNo.setTextContent("07999999999");

        Node BillingType = doc.createElement("BillingType");

        BillingType.setTextContent("FixedLine");

        Node BillingStatus = doc.createElement("BillingStatus");

        BillingStatus.setTextContent("Active");

        BillingRec.appendChild(BillingCode);
        BillingRec.appendChild(BillingNo);
        BillingRec.appendChild(BillingStatus);
        BillingRec.appendChild(BillingType);

        BillingRecs.appendChild(BillingRec);
        acct.appendChild(BillingRecs);

        msgBody.appendChild(acct);
        doc.appendChild(msgBody);

        Node MsgFooter = doc.createElement("MsgFooter");
        Node Security = doc.createElement("Security");
        Node Signature = doc.createElement("Signature");

        Signature.setTextContent("12548465465465d6sfadsafsdffds5f4s65df4s6f54sd65f46s4d6f5");
        Security.appendChild(Signature);
        MsgFooter.appendChild(Security);

        return doc.getXmlEncoding();

    }
}


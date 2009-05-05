/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.intermediate.macro;

import java.util.LinkedList;
import java.util.List;

public class MText {

    private final String pName;

    private final String pSelfRef;

    private final MText mText = this;

    private final List<Object> eParam = new LinkedList<Object>();

    private final List<Object> eAncestorRef = new LinkedList<Object>();

    private final List<Object> eParamRef = new LinkedList<Object>();

    private final List<Object> eStringPart_EolPart_ParamInsertPart_TextInsertPart = new LinkedList<Object>();

    public MText(
            String pName,
            String pSelfRef) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
        if (pSelfRef == null) {
            throw new NullPointerException();
        }
        this.pSelfRef = pSelfRef;
    }

    public MParam newParam(
            String pName,
            String pIndent) {

        MParam lParam = new MParam(pName, pIndent);
        this.eParam.add(lParam);
        return lParam;
    }

    public MAncestorRef newAncestorRef(
            String pName,
            String pIndent) {

        MAncestorRef lAncestorRef = new MAncestorRef(pName, pIndent);
        this.eAncestorRef.add(lAncestorRef);
        return lAncestorRef;
    }

    public MParamRef newParamRef(
            String pName,
            String pContextName) {

        MParamRef lParamRef = new MParamRef(pName, pContextName);
        this.eParamRef.add(lParamRef);
        return lParamRef;
    }

    public MStringPart newStringPart(
            String pString) {

        MStringPart lStringPart = new MStringPart(pString);
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart
                .add(lStringPart);
        return lStringPart;
    }

    public MEolPart newEolPart() {

        MEolPart lEolPart = new MEolPart();
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart.add(lEolPart);
        return lEolPart;
    }

    public MParamInsertPart newParamInsertPart(
            String pName) {

        MParamInsertPart lParamInsertPart = new MParamInsertPart(pName);
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart
                .add(lParamInsertPart);
        return lParamInsertPart;
    }

    public MTextInsertPart newTextInsertPart() {

        MTextInsertPart lTextInsertPart = new MTextInsertPart();
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart
                .add(lTextInsertPart);
        return lTextInsertPart;
    }

    String pName() {

        return this.pName;
    }

    String pSelfRef() {

        return this.pSelfRef;
    }

    private String rName() {

        return this.mText.pName();
    }

    private String rSelfRef() {

        return this.mText.pSelfRef();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("text {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  name = ");
        sb.append(rName());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        for (Object oParam : this.eParam) {
            sb.append(oParam.toString());
        }
        sb.append("  self_ref = ");
        sb.append(rSelfRef());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        for (Object oAncestorRef : this.eAncestorRef) {
            sb.append(oAncestorRef.toString());
        }
        for (Object oParamRef : this.eParamRef) {
            sb.append(oParamRef.toString());
        }
        for (Object oStringPart_EolPart_ParamInsertPart_TextInsertPart : this.eStringPart_EolPart_ParamInsertPart_TextInsertPart) {
            sb.append(oStringPart_EolPart_ParamInsertPart_TextInsertPart
                    .toString());
        }
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}

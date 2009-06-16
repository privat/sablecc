/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

import java.util.LinkedList;
import java.util.List;

public class MMacroCreator {

    private final String pPname;

    private final MMacroCreator mMacroCreator = this;

    private final MFile mFile;

    private final List<Object> eParamParam = new LinkedList<Object>();

    private final List<Object> eParamArg_AncestorArg = new LinkedList<Object>();

    private final List<Object> eAddToExpand = new LinkedList<Object>();

    MMacroCreator(
            String pPname,
            MFile mFile) {

        if (pPname == null) {
            throw new NullPointerException();
        }
        this.pPname = pPname;
        if (mFile == null) {
            throw new NullPointerException();
        }
        this.mFile = mFile;
    }

    public MAddToExpand newAddToExpand(
            String pSignature) {

        MAddToExpand lAddToExpand = new MAddToExpand(pSignature, this.mFile,
                this.mMacroCreator);
        this.eAddToExpand.add(lAddToExpand);
        return lAddToExpand;
    }

    public MParamParam newParamParam(
            String pPname) {

        MParamParam lParamParam = new MParamParam(pPname);
        this.eParamParam.add(lParamParam);
        return lParamParam;
    }

    public MParamArg newParamArg(
            String pPname) {

        MParamArg lParamArg = new MParamArg(pPname);
        this.eParamArg_AncestorArg.add(lParamArg);
        return lParamArg;
    }

    public MAncestorArg newAncestorArg(
            String pPname) {

        MAncestorArg lAncestorArg = new MAncestorArg(pPname, this.mFile);
        this.eParamArg_AncestorArg.add(lAncestorArg);
        return lAncestorArg;
    }

    String pPname() {

        return this.pPname;
    }

    private String rPname() {

        return this.mMacroCreator.pPname();
    }

    private String rName() {

        return this.mFile.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("M");
        sb.append(rPname());
        sb.append("* M");
        sb.append(rName());
        sb.append("_new");
        sb.append(rPname());
        sb.append("(M");
        sb.append(rName());
        sb.append("* m");
        sb.append(rName());
        if (this.eParamParam.size() > 0) {
            sb.append(", ");
        }
        {
            boolean first = true;
            for (Object oParamParam : this.eParamParam) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(oParamParam.toString());
            }
        }
        sb.append(") {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  M");
        sb.append(rPname());
        sb.append("* l");
        sb.append(rPname());
        sb.append(" = M");
        sb.append(rPname());
        sb.append("_init(");
        {
            boolean first = true;
            for (Object oParamArg_AncestorArg : this.eParamArg_AncestorArg) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(oParamArg_AncestorArg.toString());
            }
        }
        sb.append(");");
        sb.append(System.getProperty("line.separator"));
        for (Object oAddToExpand : this.eAddToExpand) {
            sb.append(oAddToExpand.toString());
        }
        sb.append("  return l");
        sb.append(rPname());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}

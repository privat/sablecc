/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MParamField {

    private final String pPname;

    private final MParamField mParamField = this;

    MParamField(
            String pPname) {

        if (pPname == null) {
            throw new NullPointerException();
        }
        this.pPname = pPname;
    }

    String pPname() {

        return this.pPname;
    }

    private String rPname() {

        return this.mParamField.pPname();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  char* _p");
        sb.append(rPname());
        sb.append("_;");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}

/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.intermediate.macro;

public class MStringArg {

    private final String pString;

    private final String pIndent;

    private final MStringArg mStringArg = this;

    public MStringArg(
            String pString,
            String pIndent) {

        if (pString == null) {
            throw new NullPointerException();
        }
        this.pString = pString;
        if (pIndent == null) {
            throw new NullPointerException();
        }
        this.pIndent = pIndent;
    }

    String pString() {

        return this.pString;
    }

    String pIndent() {

        return this.pIndent;
    }

    private String rIndent() {

        return this.mStringArg.pIndent();
    }

    private String rString() {

        return this.mStringArg.pString();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(rIndent());
        sb.append("    arg = ");
        sb.append(rString());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
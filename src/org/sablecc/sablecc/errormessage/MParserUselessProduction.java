/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.errormessage;

public class MParserUselessProduction {

    private final String pName;

    private final MParserUselessProduction mParserUselessProduction = this;

    public MParserUselessProduction(
            String pName) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
    }

    String pName() {

        return this.pName;
    }

    private String rName() {

        return this.mParserUselessProduction.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MSemanticErrorHead().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("The \"");
        sb.append(rName());
        sb.append("\" production is useless; it cannot match any finite sentence.");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}

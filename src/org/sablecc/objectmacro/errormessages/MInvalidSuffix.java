/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessages;

public class MInvalidSuffix {

    private final String pFileName;

    private final MInvalidSuffix mInvalidSuffix = this;

    public MInvalidSuffix(
            String pFileName) {

        if (pFileName == null) {
            throw new NullPointerException();
        }
        this.pFileName = pFileName;
    }

    String pFileName() {

        return this.pFileName;
    }

    private String rFileName() {

        return this.mInvalidSuffix.pFileName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MCommandLineErrorHead().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("The macro file, \"");
        sb.append(rFileName());
        sb.append("\", does not have a .objectmacro suffix.");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append(new MCommandLineErrorTail().toString());
        return sb.toString();
    }

}

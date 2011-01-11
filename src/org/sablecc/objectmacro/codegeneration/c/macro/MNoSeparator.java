/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MNoSeparator {

    private final MFile mFile;

    private final MExpandInsertPart mExpandInsertPart;

    MNoSeparator(
            MFile mFile,
            MExpandInsertPart mExpandInsertPart) {

        if (mFile == null) {
            throw new NullPointerException();
        }
        this.mFile = mFile;
        if (mExpandInsertPart == null) {
            throw new NullPointerException();
        }
        this.mExpandInsertPart = mExpandInsertPart;
    }

    private String rFileName() {

        return this.mFile.pFileName();
    }

    private String rName() {

        return this.mExpandInsertPart.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    Node* temp = m");
        sb.append(rFileName());
        sb.append("->_e");
        sb.append(rName());
        sb.append("_->_first_;");
        sb.append(System.getProperty("line.separator"));
        sb.append("    while(temp != NULL) {");
        sb.append(System.getProperty("line.separator"));
        sb.append("      struct AbstractMacro* Mtemp = temp->_elem_;");
        sb.append(System.getProperty("line.separator"));
        sb.append("      sizeString += List_pushback(listString, Mtemp->toString(Mtemp));");
        sb.append(System.getProperty("line.separator"));
        sb.append("      temp = temp->_next_;");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}

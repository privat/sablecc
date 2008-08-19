/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.macro;

public class Macro_add_to_expand {

    // parameter declarations
    private final String param_expand_name;

    private final String param_macro_name;

    private final String param_indent;

    // nested macro declarations

    // constructor
    Macro_add_to_expand(
            String param_expand_name,
            String param_macro_name,
            String param_indent) {

        this.param_expand_name = param_expand_name;
        this.param_macro_name = param_macro_name;
        this.param_indent = param_indent;
    }

    // toString
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(this.param_indent);
        sb.append("    e");
        sb.append(this.param_expand_name);
        sb.append(".add(v");
        sb.append(this.param_macro_name);
        sb.append(");");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

    // nested macros

}
/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.errormessages;

public class M_input_error
        extends Macro {

    // ---- constructor ----

    public M_input_error(
            String p_file_name,
            String p_message) {

        this.p_file_name = p_file_name;
        this.p_message = p_message;
    }

    // ---- parent ----

    @Override
    Macro get_parent() {

        return null;
    }

    // ---- parameters ----

    private final String p_file_name;

    String get_local_p_file_name() {

        return this.p_file_name;
    }

    private final String p_message;

    String get_local_p_message() {

        return this.p_message;
    }

    // ---- parameter accessors ----

    private String cached_p_file_name;

    private String get_p_file_name() {

        String result = this.cached_p_file_name;

        if (result == null) {
            Macro current = this;

            while (!(current instanceof M_input_error)) {
                current = current.get_parent();
            }

            result = ((M_input_error) current).get_local_p_file_name();
            this.cached_p_file_name = result;
        }

        return result;
    }

    private String cached_p_message;

    private String get_p_message() {

        String result = this.cached_p_message;

        if (result == null) {
            Macro current = this;

            while (!(current instanceof M_input_error)) {
                current = current.get_parent();
            }

            result = ((M_input_error) current).get_local_p_message();
            this.cached_p_message = result;
        }

        return result;
    }

    // ---- appendTo ----

    @Override
    public void appendTo(
            StringBuilder sb) {

        sb.append("*** I/O ERROR ***");
        sb.append(EOL);
        sb.append(EOL);
        sb.append("The following system error happened while reading \"");
        sb.append(get_p_file_name());
        sb.append("\":");
        sb.append(EOL);
        sb.append(" ");
        sb.append(get_p_message());
        sb.append(EOL);
    }

}
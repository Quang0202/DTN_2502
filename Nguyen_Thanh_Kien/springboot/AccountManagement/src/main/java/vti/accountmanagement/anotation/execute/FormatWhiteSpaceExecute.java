package vti.accountmanagement.anotation.execute;

import com.fasterxml.jackson.databind.util.StdConverter;


public class FormatWhiteSpaceExecute extends StdConverter<String,String> {
    @Override
    public String convert(String s) {
        s = s.replaceAll("\\s+", " ").trim();
        return s;
    }
}

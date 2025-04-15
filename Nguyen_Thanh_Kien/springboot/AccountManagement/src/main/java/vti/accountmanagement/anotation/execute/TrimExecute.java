package vti.accountmanagement.anotation.execute;

import com.fasterxml.jackson.databind.util.StdConverter;

public class TrimExecute extends StdConverter<String,String> {
    @Override
    public String convert(String s) {
        return s.trim();
    }
}

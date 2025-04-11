package vti.accountmanagement.anotation;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import vti.accountmanagement.anotation.execute.FormatWhiteSpaceExecute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@JacksonAnnotationsInside
@JsonSerialize(converter = FormatWhiteSpaceExecute.class)
@JsonDeserialize(converter = FormatWhiteSpaceExecute.class)
public @interface FormatWhiteSpace {
}

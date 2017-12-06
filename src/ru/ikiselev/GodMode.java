package ru.ikiselev;

import com.sun.xml.internal.ws.dump.MessageDumping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@MessageDumping
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.ANNOTATION_TYPE,
        ElementType.CONSTRUCTOR,
        ElementType.FIELD,
        ElementType.LOCAL_VARIABLE,
        ElementType.METHOD})
public @interface GodMode {

    boolean isActive() default true;

    boolean isWarningsSuppressed() default  true;

    boolean isCodeSmellsSuppressed() default  true;

    boolean isErrorSuppressed() default  true;


}

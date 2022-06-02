package com.web.school.infrastructure.validation;

import org.hibernate.validator.constraints.ConstraintComposition;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static org.hibernate.validator.constraints.CompositionType.OR;

@ConstraintComposition(OR)
@ReportAsSingleViolation
@CPF(message = "{document.number.invalid}")
@CNPJ(message = "{document.number.invalid}")
@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = {})
@Documented
public @interface BRDocument {

    String message() default "{document.number.invalid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
}

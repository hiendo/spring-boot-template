package com.github.hiendo.springboot.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * A validator that is acts on all {@link ValidationMethod}-annotated methods within an object.
 */
public class MethodValidator implements ConstraintValidator<ValidationMethod, Boolean> {
    @Override
    public void initialize(ValidationMethod constraintAnnotation) {
    }

    @Override
    public boolean isValid(Boolean value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        return value;
    }
}

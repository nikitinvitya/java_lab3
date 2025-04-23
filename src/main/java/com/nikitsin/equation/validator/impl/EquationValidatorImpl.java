package com.nikitsin.equation.validator.impl;

import com.nikitsin.equation.entity.QuadraticEquation;
import com.nikitsin.equation.validator.EquationValidator;

public class EquationValidatorImpl implements EquationValidator {
    @Override
    public boolean isValid(QuadraticEquation eq) {
        return eq.getA() != 0;
    }
}

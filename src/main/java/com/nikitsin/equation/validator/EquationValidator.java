package com.nikitsin.equation.validator;

import com.nikitsin.equation.entity.QuadraticEquation;

public interface EquationValidator {
    boolean isValid(QuadraticEquation eq);
}

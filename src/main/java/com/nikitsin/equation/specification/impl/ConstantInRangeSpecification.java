package com.nikitsin.equation.specification.impl;

import com.nikitsin.equation.entity.QuadraticEquation;
import com.nikitsin.equation.specification.EquationSpecification;

public class ConstantInRangeSpecification implements EquationSpecification {
    @Override
    public boolean specified(QuadraticEquation equation) {
        double c = equation.getC();
        return c >= -10 && c <= 10;
    }
}

package com.nikitsin.equation.specification.impl;

import com.nikitsin.equation.entity.QuadraticEquation;
import com.nikitsin.equation.specification.EquationSpecification;

public class PositiveACoefficientSpecification implements EquationSpecification {
    @Override
    public boolean specified(QuadraticEquation equation) {
        return equation.getA() > 0;
    }
}

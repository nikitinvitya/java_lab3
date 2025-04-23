package com.nikitsin.equation.specification.impl;

import com.nikitsin.equation.entity.QuadraticEquation;
import com.nikitsin.equation.entity.EquationState;
import com.nikitsin.equation.specification.EquationSpecification;

public class OneRootSpecification implements EquationSpecification {
    @Override
    public boolean specified(QuadraticEquation equation) {
        return equation.getState() == EquationState.ONE_REAL_ROOT;
    }
}

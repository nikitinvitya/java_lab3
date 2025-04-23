package com.nikitsin.equation.specification.impl;

import com.nikitsin.equation.entity.QuadraticEquation;
import com.nikitsin.equation.entity.EquationState;
import com.nikitsin.equation.specification.EquationSpecification;

public class TwoRootsSpecification implements EquationSpecification {
    @Override
    public boolean specified(QuadraticEquation equation) {
        return equation.getState() == EquationState.TWO_REAL_ROOTS;
    }
}

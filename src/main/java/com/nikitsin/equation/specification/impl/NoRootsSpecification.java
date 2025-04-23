package com.nikitsin.equation.specification.impl;

import com.nikitsin.equation.entity.QuadraticEquation;
import com.nikitsin.equation.entity.EquationState;
import com.nikitsin.equation.specification.EquationSpecification;

public class NoRootsSpecification implements EquationSpecification {
    @Override
    public boolean specified(QuadraticEquation equation) {
        return equation.getState() == EquationState.NO_REAL_ROOTS;
    }
}

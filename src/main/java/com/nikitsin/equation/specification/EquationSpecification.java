package com.nikitsin.equation.specification;

import com.nikitsin.equation.entity.QuadraticEquation;

public interface EquationSpecification {
    boolean specified(QuadraticEquation equation);
}

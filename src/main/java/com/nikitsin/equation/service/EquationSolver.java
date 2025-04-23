package com.nikitsin.equation.service;

import com.nikitsin.equation.entity.QuadraticEquation;
import java.util.List;

public interface EquationSolver {
    List<Double> findRoots(QuadraticEquation eq);
}

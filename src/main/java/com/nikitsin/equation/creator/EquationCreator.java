package com.nikitsin.equation.creator;
import com.nikitsin.equation.entity.QuadraticEquation;
import java.util.Optional;

public interface EquationCreator {
    Optional<QuadraticEquation> createEquation(double a, double b, double c);
}

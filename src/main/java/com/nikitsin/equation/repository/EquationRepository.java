package com.nikitsin.equation.repository;

import com.nikitsin.equation.entity.QuadraticEquation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EquationRepository {
    private final Set<QuadraticEquation> equations;

    public EquationRepository() {
        this.equations = new HashSet<>();
    }

    public void add(QuadraticEquation equation) {
        equations.add(equation);
    }

    public void remove(QuadraticEquation equation) {
        equations.remove(equation);
    }

    public Set<QuadraticEquation> getAll() {
        return equations;
    }

    public List<QuadraticEquation> sortByA() {
        List<QuadraticEquation> sorted = new ArrayList<>(equations);
        sorted.sort(Comparator.comparingDouble(QuadraticEquation::getA));
        return sorted;
    }

    public List<QuadraticEquation> sortByB() {
        List<QuadraticEquation> sorted = new ArrayList<>(equations);
        sorted.sort(Comparator.comparingDouble(QuadraticEquation::getB));
        return sorted;
    }

    public List<QuadraticEquation> sortByC() {
        List<QuadraticEquation> sorted = new ArrayList<>(equations);
        sorted.sort(Comparator.comparingDouble(QuadraticEquation::getC));
        return sorted;
    }

    public List<QuadraticEquation> sortByDiscriminant() {
        List<QuadraticEquation> sorted = new ArrayList<>(equations);
        sorted.sort(Comparator.comparingDouble(QuadraticEquation::getDiscriminant));
        return sorted;
    }
}

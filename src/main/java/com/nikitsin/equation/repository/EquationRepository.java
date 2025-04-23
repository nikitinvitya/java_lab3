package com.nikitsin.equation.repository;

import com.nikitsin.equation.entity.QuadraticEquation;
import com.nikitsin.equation.pool.EquationComparator;
import com.nikitsin.equation.specification.Specification;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Comparator;

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
        return sort(EquationComparator.byA());
    }

    public List<QuadraticEquation> sortByB() {
        return sort(EquationComparator.byB());
    }

    public List<QuadraticEquation> sortByC() {
        return sort(EquationComparator.byC());
    }

    public List<QuadraticEquation> sortByDiscriminant() {
        return sort(EquationComparator.byDiscriminant());
    }

    public List<QuadraticEquation> sortByRootCount() {
        return sort(EquationComparator.byRootCount());
    }

    public List<QuadraticEquation> query(Specification<QuadraticEquation> specification) {
        List<QuadraticEquation> result = new ArrayList<>();
        for (QuadraticEquation equation : equations) {
            if (specification.isSatisfiedBy(equation)) {
                result.add(equation);
            }
        }
        return result;
    }

    private List<QuadraticEquation> sort(Comparator<QuadraticEquation> comparator) {
        List<QuadraticEquation> sorted = new ArrayList<>(equations);
        sorted.sort(comparator);
        return sorted;
    }
}

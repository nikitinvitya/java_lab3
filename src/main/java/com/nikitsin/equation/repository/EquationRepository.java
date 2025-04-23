package com.nikitsin.equation.repository;

import com.nikitsin.equation.entity.QuadraticEquation;
import com.nikitsin.equation.pool.EquationComparator;

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

    // Сортировка по A
    public List<QuadraticEquation> sortByA() {
        return sort(EquationComparator.byA());
    }

    // Сортировка по B
    public List<QuadraticEquation> sortByB() {
        return sort(EquationComparator.byB());
    }

    // Сортировка по C
    public List<QuadraticEquation> sortByC() {
        return sort(EquationComparator.byC());
    }

    // Сортировка по дискриминанту
    public List<QuadraticEquation> sortByDiscriminant() {
        return sort(EquationComparator.byDiscriminant());
    }

    // Сортировка по количеству корней
    public List<QuadraticEquation> sortByRootCount() {
        return sort(EquationComparator.byRootCount());
    }

    // Метод сортировки
    private List<QuadraticEquation> sort(Comparator<QuadraticEquation> comparator) {
        List<QuadraticEquation> sorted = new ArrayList<>(equations);
        sorted.sort(comparator);
        return sorted;
    }
}

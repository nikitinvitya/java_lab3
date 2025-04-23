package com.nikitsin.equation.repository;

import com.nikitsin.equation.entity.QuadraticEquation;
import com.nikitsin.equation.pool.Observer;
import com.nikitsin.equation.pool.Warehouse;

import java.util.HashSet;
import java.util.Set;

public class EquationRepository {
    private final Set<QuadraticEquation> equations;
    private final Set<Observer> observers;

    public EquationRepository() {
        this.equations = new HashSet<>();
        this.observers = new HashSet<>();
        addObserver(Warehouse.getInstance());
    }

    public void add(QuadraticEquation equation) {
        equations.add(equation);
        notifyObservers(equation);
    }

    public void remove(QuadraticEquation equation) {
        equations.remove(equation);
        notifyObservers(equation);
    }

    public Set<QuadraticEquation> getAll() {
        return equations;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(QuadraticEquation equation) {
        for (Observer observer : observers) {
            observer.update(equation);
        }
    }
}

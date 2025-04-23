package com.nikitsin.equation.main;

import com.nikitsin.equation.facade.EquationSolverFacade;

public class Main {
    public static void main(String[] args) {
        EquationSolverFacade facade = new EquationSolverFacade();
        facade.processEquations("data/equations.txt");
    }
}

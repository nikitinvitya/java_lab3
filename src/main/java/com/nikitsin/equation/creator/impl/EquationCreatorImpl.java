package com.nikitsin.equation.creator.impl;

import com.nikitsin.equation.creator.EquationCreator;
import com.nikitsin.equation.entity.QuadraticEquation;
import com.nikitsin.equation.validator.EquationValidator;
import com.nikitsin.equation.validator.impl.EquationValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class EquationCreatorImpl implements EquationCreator {
    private static final Logger logger = LogManager.getLogger(EquationCreatorImpl.class);
    private final EquationValidator validator;

    public EquationCreatorImpl() {
        this.validator = new EquationValidatorImpl();
    }

    @Override
    public Optional<QuadraticEquation> createEquation(double a, double b, double c) {
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if (validator.isValid(equation)) {
            return Optional.of(equation);
        } else {
            logger.warn("Invalid equation attempted to be created: {}x^2 + {}x + {}", a, b, c);
            return Optional.empty();
        }
    }
}

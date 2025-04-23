package com.nikitsin.equation.pool;

import com.nikitsin.equation.entity.QuadraticEquation;

public interface Observer {
    void update(QuadraticEquation equation);
}

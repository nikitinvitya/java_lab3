package com.nikitsin.equation.specification;

public interface Specification<T> {
    boolean isSatisfiedBy(T item);
}

package com.atul.generic;

/**
 * EmployeeBuilder extends a parameterized Type called PersonBuilder<EmployeeBuilder> here.
 * */
public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder worksAt(String position) {
        person.position = position;
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}

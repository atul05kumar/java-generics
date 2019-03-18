package com.atul.generic;

/**
 * Example explaining recursive generics.
 * PersonBuilder can accept any concrete type which is a subtype of PersonBuilder<SELF>
 * Since EmployeeBuilder is a subtype of PersonBuilder this is valid.
 * */
public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

    protected Person person = new Person();

    public SELF withName(String name) {
        person.name = name;
        return self();
    }

    public Person build() {
        return person;
    }

    protected SELF self() {
        return (SELF) this;
    }

}

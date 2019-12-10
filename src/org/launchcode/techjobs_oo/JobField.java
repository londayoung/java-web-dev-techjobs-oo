package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
// shared fields
    private int id;
    private static int nextId = 1;
    private String value;

// shared  constructors
public JobField() {
    id = nextId;
    nextId++;
}

    public JobField(String aValue) {
        this();
        this.value = aValue;
    }


    // shared custom  methods

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }




    // shared getters and setters

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }
}

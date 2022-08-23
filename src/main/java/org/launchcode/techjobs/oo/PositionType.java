package org.launchcode.techjobs.oo;

import java.util.Objects;

class PositionType extends JobField {

      private final int id;
      private static int nextId = 1;
      private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

      @Override
      public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        if (value == null || value.isEmpty()) {
            return "Data not available";
        }
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
package com.Library.LibraryManagmentSystem.constant;

public enum Operator {
    EQUALS("="),NOT_EQUALS("!="),GREATER_THAN(">"),LESS_THAN("<"),GREATER_THAN_OR_EQUALS(">="),LESS_THAN_OR_EQUALS("<="),

    LIKE("like");

    private String value;
    Operator(String value) {
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

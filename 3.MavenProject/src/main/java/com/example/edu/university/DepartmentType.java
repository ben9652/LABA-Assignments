package com.example.edu.university;

public enum DepartmentType {
    COMPUTER_SCIENCE("CS", "Department of Computer Science"),
    MATHEMATICS("MATH", "Department of Mathematics"),
    PHYSICS("PHYS", "Department of Physics");

    private String code;
    private String description;

    DepartmentType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static DepartmentType getByCode(String code) {
        for (DepartmentType d : DepartmentType.values()) {
            if (d.code.equalsIgnoreCase(code)) {
                return d;
            }
        }
        throw new IllegalArgumentException("Invalid department code: " + code);
    }

    @Override
    public String toString() {
        return code + ": " + description;
    }
}

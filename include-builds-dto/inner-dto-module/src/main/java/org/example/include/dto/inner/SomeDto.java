package org.example.include.dto.inner;

public class SomeDto {
    private final String  name;
    private final boolean isActive;

    public SomeDto(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }
}

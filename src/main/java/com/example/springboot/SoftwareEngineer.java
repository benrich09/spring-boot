package com.example.springboot;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SoftwareEngineer {
    private int id;
    private String name;
    private List<String> techStack;

    public SoftwareEngineer() {}

    public SoftwareEngineer(int id, String name, String techStack) {
        this.id = id;
        this.name = name;
        this.techStack = Collections.singletonList(techStack);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = Collections.singletonList(techStack);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack);
    }
}


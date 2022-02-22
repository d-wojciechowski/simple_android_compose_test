package com.dwojciechowski.simpleandroid1.model;

import java.util.List;

public class Recipee implements Detailed {

    private String name;
    private List<String> steps;

    public Recipee() {
    }

    public Recipee(String name, List<String> steps) {
        this.name = name;
        this.steps = steps;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDetails() {
        return String.join("\n", steps);
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }
}

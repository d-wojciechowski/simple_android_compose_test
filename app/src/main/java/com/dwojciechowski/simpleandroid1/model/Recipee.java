package com.dwojciechowski.simpleandroid1.model;

import java.util.List;

public class Recipee implements Detailed, Abbreviated {

    private String name;
    private List<String> steps;

    public Recipee() {
    }

    public Recipee(String name, List<String> steps) {
        this.name = name;
        this.steps = steps;
    }

    @Override
    public String getLogo() {
        return getName().substring(0, Math.min(13, getName().length()));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDetails() {
        return String.join("\n", steps);
    }

    @Override
    public String getShortDescription() {
        return getDetails().replace('\n',' ').substring(0, Math.min(100, getDetails().length()));
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

package com.edu.beans;

public class Module {
    protected String name;
    protected String description;
    protected int nbrOfStudents;
    protected int duration;

    public Module(String name, String description, int nbrOfStudents, int duration) {
        this.name = name;
        this.description = description;
        this.nbrOfStudents = nbrOfStudents;
        this.duration = duration;
    }

    public Module() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNbrOfStudents() {
        return nbrOfStudents;
    }

    public int getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNbrOfStudents(int nbrOfStudents) {
        this.nbrOfStudents = nbrOfStudents;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}

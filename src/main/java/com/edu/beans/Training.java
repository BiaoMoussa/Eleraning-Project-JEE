package com.edu.beans;

import java.util.ArrayList;
import java.util.List;

public class Training {
    private String name;
    private List<Module> modules = new ArrayList<>();

    public Training(String name) {
        this.name = name;
    }

    public Training() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Module> getModules() {
        return modules;
    }


    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
   
    public int getNbrOfStudents(){
        int nbrOfStudents = -1;
        for (Module module : modules) {
            if ((nbrOfStudents == -1) || (module.getNbrOfStudents() < nbrOfStudents)) {
                nbrOfStudents = module.getNbrOfStudents();
            }
        }

        return nbrOfStudents;
    }

    public int getDuration () {
        int duration = 0;

        for (Module module : modules) {
            duration += module.getDuration();
        }

        return duration;
    }

    @Override
    public String toString() {
        return "Training{" +
                "name='" + name + '\'' +
                ", modules=" + modules +
                ", nbrOfStudents="+ getNbrOfStudents()+
                ", duration=" + getDuration()+
                '}';
    }
}

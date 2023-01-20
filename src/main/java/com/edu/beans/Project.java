package com.edu.beans;

public class Project extends Module {
    private int nbrOfGroups;
    private int nbrOfStudentsPerGroup;
    
    public Project(String name, String description, int nbrOfStudents, int duration, int nbrOfGroups,
            int nbrOfStudentsPerGroup, int nbrOfStudents2) {
        super(name, description, nbrOfStudents, duration);
        this.nbrOfGroups = nbrOfGroups;
        this.nbrOfStudentsPerGroup = nbrOfStudentsPerGroup;
        nbrOfStudents = nbrOfStudents2;
    }
    public Project(int nbrOfGroups, int nbrOfStudentsPerGroup, int nbrOfStudents) {
        this.nbrOfGroups = nbrOfGroups;
        this.nbrOfStudentsPerGroup = nbrOfStudentsPerGroup;
        this.nbrOfStudents = nbrOfStudents;
    }
    public Project() {
    }
    
    public void setNbrOfGroups(int nbrOfGroups) {
        this.nbrOfGroups = nbrOfGroups;
    }
    public int getNbrOfStudentsPerGroup() {
        return nbrOfStudentsPerGroup;
    }
    public void setNbrOfStudentsPerGroup(int nbrOfStudentsPerGroup) {
        this.nbrOfStudentsPerGroup = nbrOfStudentsPerGroup;
    }
    @Override
    public int getNbrOfStudents() {
       
        return nbrOfGroups * nbrOfStudentsPerGroup;
    }
    @Override
    public void setNbrOfStudents(int nbrOfStudents) {
        throw new UnsupportedOperationException("Tutorial does not support nbrOfStudents");
    }
    public int getNbrOfGroups() {
        return nbrOfGroups;
    }

    @Override
    public String toString() {
        return "Project{" +
                "nbrOfGroups=" + nbrOfGroups +
                ", nbrOfStudentsPerGroup=" + nbrOfStudentsPerGroup +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", nbrOfStudents=" + getNbrOfStudents() +
                ", duration=" + duration +
                '}';
    }
}

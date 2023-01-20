package com.edu.beans;

public class Course extends Module {
    private String classroom;

    public Course(String name, String description, int nbrOfStudents, int duration, String classroom) {
        super(name, description, nbrOfStudents, duration);
        this.classroom = classroom;
    }

    public Course(String classroom) {
        this.classroom = classroom;
    }

    public Course() {
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Course{" +
                "classroom='" + classroom + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", nbrOfStudents=" + nbrOfStudents +
                ", duration=" + duration +
                '}';
    }
}

package com.edu.beans;

public class Tutorial extends Module {
    private String videoLink;

    public Tutorial(String name, String description, int nbrOfStudents, int duration, String videoLink) {
        super(name, description, nbrOfStudents, duration);
        this.videoLink = videoLink;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "videoLink='" + videoLink + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", nbrOfStudents=" + nbrOfStudents +
                ", duration=" + duration +
                '}';
    }

    public Tutorial(String videoLink) {
        this.videoLink = videoLink;
    }

    public Tutorial() {
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    @Override
    public int getNbrOfStudents() {
        // On lève une exception, un tutorial n'a pas de nombre limite d'étudiants 
        throw new UnsupportedOperationException("Tutorialbdoes not support nbrOfStudents"); 
    }

    @Override
    public void setDescription(String description) {
        throw new UnsupportedOperationException("Tutorialbdoes not support nbrOfStudents");
    }

    
    

}

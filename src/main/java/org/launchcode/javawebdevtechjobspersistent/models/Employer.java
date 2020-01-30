package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(min=3, max=100)
    private String location;

    //constructors

    public Employer(@NotNull @Size(min = 3, max = 100) String location) {
        this.location = location;
    }

    public Employer() {}


    //getters and setters

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

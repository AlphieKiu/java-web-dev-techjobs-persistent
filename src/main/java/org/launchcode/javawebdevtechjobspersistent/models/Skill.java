package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(min=3, max=255)
    private String description;

    //constructors
    public Skill(@NotNull @Size(min = 3, max = 255) String description) {
        this.description = description;
    }

    public Skill() {}

    //getters and setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
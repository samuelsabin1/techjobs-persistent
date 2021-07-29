package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Please enter Location")
    @Size(min = 1, max = 70, message = "Location must be between 1 and 70 characters")
    private String location;

    public Employer() {
    }
    public Employer(String location) {
        this.location = location;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

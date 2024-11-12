package org.example.model;

import org.example.data.Location;
import org.example.description.Lie;

import java.util.Objects;

public abstract class PersonModel extends Lie {
    private String gender;
    private int age;
    private String name;
    private int height;
    private Location location;
    private String speech;
    private boolean lie;

    public PersonModel(String gender,
                       int age,
                       String name,
                       int height,
                       Location location,
                       String speech,
                       boolean lie) {
        this.gender = gender;
        this.age = age;
        this.name = name;
        this.height = height;
        this.location = location;
        this.speech = speech;
        this.lie = lie;
    }

    public Location getLocation() {
        return this.location;
    }



    public void setLocation(Location location) {
        this.location = location;
    }


    public boolean getLie() {
        return lie;
    }

    public void setLie(boolean lie) {
        this.lie = lie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonModel that = (PersonModel) o;
        return age == that.age && height == that.height && lie == that.lie && Objects.equals(gender, that.gender) && Objects.equals(name, that.name) && location == that.location && Objects.equals(speech, that.speech);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, age, name, height, location, speech, lie);
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", location=" + location +
                ", speech='" + speech + '\'' +
                ", lie=" + lie +
                '}';
    }
}


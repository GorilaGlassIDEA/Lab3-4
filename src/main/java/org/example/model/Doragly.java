package org.example.model;

import org.example.data.Location;
import org.example.description.LocationInterface;
import org.example.description.PersonInterface;
import org.example.description.RelativesInterface;

public class Doragly extends PersonModel implements PersonInterface,
        RelativesInterface, LocationInterface {
    Location location;

    public Doragly(String gender, int age, String name, int height, Location location) {
        super(gender, age, name, height);
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location.name();
    }

    @Override
    public boolean hasPerson(Location location) {
        return location == this.location;
    }

    @Override
    public void say(String words) {
    }

    @Override
    public void showPlace() {

    }

    @Override
    public boolean see(Location location) {
        return false;
    }

    @Override
    public void travelTo(Location from, Location to) {

    }

    @Override
    public boolean decide(PersonModel person) {
        return false;
    }

    @Override
    public String extractTruth(PersonModel person) {
        return "";
    }
}

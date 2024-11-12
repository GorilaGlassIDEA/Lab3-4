package org.example.data.Person;

import org.example.data.Location;
import org.example.description.LocationInterface;
import org.example.description.PersonInterface;
import org.example.description.RelativesInterface;
import org.example.model.PersonModel;

public class Doragly extends PersonModel implements PersonInterface, LocationInterface {


    public Doragly(String gender, int age, String name, int height, Location location, String speech, boolean lie) {
        super(gender, age, name, height, location, speech, lie);

    }

    public Doragly(String women, int age, String doragly, int height, Location location) {
        this(women, age, doragly, height, location, "", false);
    }

    @Override
    public void travelTo(Location to) {
        setLocation(to);
    }


    @Override
    public boolean hasPerson(Location location) {
        return location == getLocation();
    }

    @Override
    public String say(String words) {
        return ("Она сказала так: " + words);
    }

    @Override
    public void showPlace() {
        say(getLocation() + " это очень красивое место");
    }


    @Override
    public String sayLie(String lie) {
        setLie(false);
        return("Верьте мне, ведь " + lie);
    }

    @Override
    public String sayTruth(String lie) {
        setLie(true);
        return ("Верьте мне, ведь " + lie);
    }
}

package org.example.data.Person;

import org.example.data.Location;
import org.example.model.PersonModel;

public class Husband extends PersonModel {
    public Husband(String gender, int age, String name, int height, Location location, String speech, boolean lie) {
        super(gender, age, name, height, location, speech, lie);
    }

    @Override
    public void sayLie(String lie) {

    }

    @Override
    protected void sayTruth(String lie) {

    }
}

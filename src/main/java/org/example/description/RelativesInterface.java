package org.example.description;

import org.example.data.Location;
import org.example.model.PersonModel;

public interface RelativesInterface {
    boolean decide(PersonModel person);
    String extractTruth(PersonModel person);
}

package org.example.data.action;

import org.example.data.models.FullPerson;

import java.util.NoSuchElementException;

public interface SimpleAction {
    FullPerson goActions() throws NoSuchElementException;


    void move(ActionEnum actionEnum);
}

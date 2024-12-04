package org.example.action;

import org.example.data.models.FullPerson;
import org.example.description.ActionEnum;

import java.util.ArrayList;

public interface SimpleAction {
    //TODO Реализация простых действий присущих всем Person (Interface)
    void goActions(ArrayList<FullPerson> whoseActionNext);
    void move(ActionEnum actionEnum);
}

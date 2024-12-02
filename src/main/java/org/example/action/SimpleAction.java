package org.example.action;

import org.example.data.models.Contact;
import org.example.data.models.FullPerson;
import org.example.data.person.Husband;
import org.example.data.person.MainPerson;
import org.example.data.person.Mother;
import org.example.data.person.Sister;
import org.example.description.ActionEnum;

public interface SimpleAction {
    //TODO Реализация простых действий присущих всем Person (Interface)

    default void contactWith(FullPerson person1, FullPerson person2){
        // TODO продумать как сделать родстенные связи (есть идея сделать список
        //  где на первом месете стоят все родсветнники для данного человека, а на
        //  втором те кто родсвтенниками не являются
    }
    void move(ActionEnum obj);
    void goActions(FullPerson whoseActionNext);
    void anotherAction(ActionEnum obj);
}

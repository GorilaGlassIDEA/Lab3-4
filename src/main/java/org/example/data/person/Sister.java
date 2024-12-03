package org.example.data.person;

import org.example.data.models.Contact;
import org.example.data.models.FullPerson;

public abstract class Sister extends FullPerson {
    public Sister(String name) {
        super(name, Contact.NOT_EXIST);
    }
}

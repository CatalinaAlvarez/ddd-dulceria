package co.com.sofka.dulceria.personal;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.dulceria.personal.value.PersonalId;

public class Personal extends Entity<PersonalId> {

    public Personal(PersonalId entityId) {
        super(entityId);
    }
}

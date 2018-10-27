package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> speacilities = new HashSet<>();

    public Set<Speciality> getSpeacilities() {
        return speacilities;
    }

    public void setSpeacilities(Set<Speciality> speacilities) {
        this.speacilities = speacilities;
    }
}

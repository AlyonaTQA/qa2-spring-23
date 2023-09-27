package modal.tickets;

import org.apache.commons.lang3.RandomStringUtils;

public class Passenger {
    private String firstName;
    private String lastName;

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Passenger() {
    }

    public String getFirstName() {
        return firstName;
    }

    public Passenger setFirstName(String firstName) {
        if (firstName.equals("random")) {
            this.firstName = RandomStringUtils.randomAlphabetic(10);
        } else {
            this.firstName = firstName;
        }
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Passenger setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}

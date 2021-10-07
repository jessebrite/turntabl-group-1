package com.trade;

import java.util.UUID;

public class Client {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private Membership membership;

    public Client(UUID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", membership=" + membership +
                '}';
    }
}

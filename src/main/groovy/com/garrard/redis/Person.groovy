package com.garrard.redis

import org.springframework.data.redis.core.RedisHash;

// value attr is optional. It allows to specific the prefix key (alternative to the config way seen above)
// timeToLive attr is optional. Expressed in seconds.
@RedisHash(value = "people", timeToLive = 86400L) // 1 days
public class Person {

    @org.springframework.data.annotation.Id
    private Long id;
    private String firstname;
    private String lastname;

    public Person() {
    }

    public Person(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}

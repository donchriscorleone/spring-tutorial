package com.example.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.gemfire.mapping.annotation.Region;

import java.util.concurrent.atomic.AtomicLong;

@Data
@Region("People")
public class Person {
    private static AtomicLong COUNT = new AtomicLong(0L);

    @Id
    private Long id;

    private String firstName;
    private String lastName;

    @PersistenceConstructor()
    public Person() {
        this.id = COUNT.incrementAndGet();
    }
}

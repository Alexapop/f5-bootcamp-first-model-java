package com.ioana;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Year;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void shouldInitializeAllAttributes() {
        int yearOfBirth = 2000;
        Person person = new Person("TestFirstName", "TestLastName", "TEST-ID-001", yearOfBirth);

        assertEquals("TestFirstName", person.getFirstName());
        assertEquals("TestLastName", person.getLastName());
        assertEquals("TEST-ID-001", person.getIdCardNumber());
        assertEquals(yearOfBirth, person.getYearOfBirth());
        assertEquals(Year.now().getValue() - yearOfBirth, person.getAge());
    }

    @Test
void shouldUpdateAttributesUsingSetters() {
    Person person = new Person("Maria", "Gonzalez", "ID-001", 2000);

    person.setFirstName("Laura");
    person.setLastName("Pinar");
    person.setIdCardNumber("ID-002");

    assertEquals("Laura", person.getFirstName());
    assertEquals("Pinar", person.getLastName());
    assertEquals("ID-002", person.getIdCardNumber());
}
    @Test
    void shouldCalculateAgeFromYearOfBirth() {
        int yearOfBirth = 2000;
        Person person = new Person("TestFirstName", "TestLastName", "TEST-ID-001", yearOfBirth);

        assertEquals(
                Year.now().getValue() - yearOfBirth,
                person.calculateAge());
    }


    @Test
void shouldBeEqualWhenIdCardNumbersAreEqual() {
    Person firstPerson = new Person("Ana", "Pop", "ID-001", 2000);
    Person secondPerson = new Person("Maria", "Ione", "ID-001", 1995);

    assertEquals(firstPerson, secondPerson);
    assertEquals(firstPerson.hashCode(), secondPerson.hashCode());
}

}

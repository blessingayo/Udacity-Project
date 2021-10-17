package UdacityProject;


import UdacityProject.personTester.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Blessing", "Asuelimen", "F");
    }

    @Test
void personFname(){
        person.setFname("Blessing");
        assertEquals("Blessing", person.getFname());
    }
@Test
void personLname(){
    person.setLname("Asuelimen");
    assertEquals("Asuelimen", person.getLname());
}

@Test
    void personSex(){
        person.setFname("F");
        assertEquals("F", person.getSex());
    }
}
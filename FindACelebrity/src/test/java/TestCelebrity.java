import Models.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestCelebrity {

    Person person1;
    Person person2;
    Person person3;
    Person person4;
    Person person5;
    Set<Person> people1;
    Set<Person> people2;
    Set<Person> people4;
    Set<Person> people5;
    Map<Person, Set<Person>> celebrityTeam;

    @Before
    public void setUp(){
        person1 = new Person("A");
        person2 = new Person("B");
        person3 = new Person("C");
        person4 = new Person("D");
        person5 = new Person("E");

        people1 = new HashSet<>();
        people1.add(person2);
        people1.add(person3);
        people1.add(person4);
        people1.add(person5);

        people2 = new HashSet<>();
        people2.add(person1);
        people2.add(person3);
        people2.add(person5);

        people4 = new HashSet<>();
        people4.add(person1);
        people4.add(person3);
        people4.add(person5);

        people5 = new HashSet<>();
        people5.add(person2);
        people5.add(person3);
        people5.add(person4);

        celebrityTeam = new HashMap();

        celebrityTeam.put(person1, people1);
        celebrityTeam.put(person2, people2);
        celebrityTeam.put(person3, new HashSet<>());
        celebrityTeam.put(person4, people4);
        celebrityTeam.put(person5, people5);

    }

    @Test
    public void testFindCelebrity(){

        Assert.assertEquals(person3, new Celebrity().find(celebrityTeam));

    }

    @Test
    public void testFindCelebrityNotEquals(){

        Assert.assertNotEquals(person1, new Celebrity().find(celebrityTeam));

    }
}

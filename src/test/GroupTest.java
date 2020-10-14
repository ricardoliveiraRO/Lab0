package test;
import lab0.Group;
import lab0.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GroupTest {
    @Test
    public void groupTest(){
        Person p1 = new Person(1, "A");
        Group g1 = new Group(p1);
        assertEquals("A", p1.getName());
    }
}

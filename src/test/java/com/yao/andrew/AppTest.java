package com.yao.andrew;


import org.junit.*;
import static org.junit.Assert.*;
import com.yao.andrew.Person;
/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigourous Test :-)
     */

    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testPersonReturnsName() {
        Person person = new Person("Andrew", 43);
        String actual = person.getName();
        String expected = "Andrew";

        assertEquals(expected, actual);
    }
    @Test
    public void testItFails() {
        assertEquals(1, 1);
    }

}
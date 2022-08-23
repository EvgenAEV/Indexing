package ru.ageev;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PortTest {

    @Test
    public void stringToNumberTest() {
        Port port = new Port(new String[]{"1", "2", "3"});
        Integer[] arrInt = {1,2,3};
        Assert.assertArrayEquals(arrInt,port.stringToNumber());

    }
}
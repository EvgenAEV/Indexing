package ru.ageev;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        Port s = new Port(new String[]{"1,2", "3-4", "5"});
        System.out.println(Arrays.toString(s.stringToNumber()));
        s.returnOfPossibleOptions();


    }
}

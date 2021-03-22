package org.iesfm.lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ListExercisesTests {

    @Test
    public void firstElementTest(){
        ArrayList<String> listTest = new ArrayList<>();
        listTest.add("1");
        listTest.add("4");
        listTest.add("8");

        String firstElement = ListExercises.firstElement(listTest);

        Assert.assertEquals("1", firstElement);
    }
}

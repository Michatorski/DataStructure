package org.iesfm.lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    @Test
    public void firstElementEmptyListTest(){
        ArrayList<String > listTest = new ArrayList<>();

        String firstElement = ListExercises.firstElement(listTest);

        Assert.assertNull(firstElement);
    }

    @Test
    public void lastElementListTest(){
        ListExercises listExercises = new ListExercises();
        ArrayList<String> listTest = new ArrayList<>();
        listTest.add("1");
        listTest.add("4");
        listTest.add("8");

        String firstElement = listExercises.lastElement(listTest);

        Assert.assertEquals("8", firstElement);
    }

    @Test
    public void lastElementEmptyListTest(){
        ArrayList<String > listTest = new ArrayList<>();

        String lastElement = ListExercises.lastElement(listTest);


        Assert.assertNull(lastElement);
    }

    @Test
    public void insertFirstTest (){
        ListExercises listExercises = new ListExercises();
        List<String> names = new LinkedList<>();
        names.add("Mikel");

        List<String> insert = listExercises.insertFirst(names, "Mikel");

        List<String> expected = new LinkedList<>();
        expected.add("Mikel");
        expected.add("Jose");

        Assert.assertEquals(expected, insert);
    }

    @Test
    public void insertFirstInEmptyListTest () {
        ListExercises listExercises = new ListExercises();
        List<String> names = new LinkedList<>();

        List<String> insert = listExercises.insertFirst(names, "Jose");

        List<String> expected = new LinkedList<>();
        expected.add("Jose");


        Assert.assertEquals(expected, insert);
    }

    @Test
    public void replacePositionTest(){
        ListExercises listExercises = new ListExercises();
        List<String> names = new LinkedList<>();
        names.add("Pedro");
        names.add("Sergio");

        List<String> replaceName = listExercises.replacePosition(names, 1, "Raul");

        List<String > expected = new LinkedList<>();
        expected.add("Pedro");
        expected.add("Raul");

        Assert.assertEquals(expected, replaceName);

    }

    @Test
    public void replacePositionN(){
        ListExercises listExercises = new ListExercises();
        List<String> names = new LinkedList<>();
        names.add("Mikel");
        names.add("Sergio");

        List<String> replaceName = listExercises.replacePosition(names, 1, "Raul");

        List<String > expected = new LinkedList<>();
        expected.add("Pedro");
        expected.add("Raul");

        Assert.assertEquals(expected, replaceName);

    }

}

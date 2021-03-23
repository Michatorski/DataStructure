package org.iesfm.sets;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class SetexercisesTest {

    SetExercises setExercises = new SetExercises();

    @Test
    public void checkMemberTest(){
        Set<String > members = new TreeSet<>();
        members.add("Jorge");
        members.add("Juan");

        boolean res = setExercises.checkMember(members, "Jorge");
        Assert.assertTrue(res);
    }

    @Test
    public void checkMemberIsFalseTest(){
        Set<String > members = new TreeSet<>();
        members.add("Jorge");
        members.add("Juan");

        boolean res = setExercises.checkMember(members, "Raquel");
        Assert.assertFalse(res);
    }

    @Test
    public void insertDataTest(){
        Set<String> stringName = new HashSet<>();
        stringName.add("Palabra");

        setExercises.insertData(stringName, "Palabro");

        Set<String> expected = new HashSet<>();
        expected.add("Palabra");
        expected.add("Palabro");

        Assert.assertEquals(expected, stringName);

    }

    @Test
    public void insertDataSameWordTest(){
        Set<String> stringName = new HashSet<>();
        stringName.add("Palabra");

        setExercises.insertData(stringName, "Palabra");

        Set<String> expected = new HashSet<>();
        expected.add("Palabra");

        Assert.assertEquals(expected, stringName);

    }

    @Test
    public void toListTreeSetTest(){
        setExercises = new SetExercises();

        Set<String > tree = new TreeSet<>();
        tree.add("A");
        tree.add("C");
        tree.add("B");

        List<String > lists = setExercises.toList(tree);

        List<String > expected = new ArrayList<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");

        Assert.assertEquals(expected,lists);
    }

    @Test
    public void toListHashSetTest(){
        setExercises = new SetExercises();

        Set<String > hash = new HashSet<>();
        hash.add("AA");
        hash.add("CC");
        hash.add("BB");
        hash.add("DD");
        hash.add("EE");
        hash.add("FF");

        List<String > lists = setExercises.toList(hash);

        List<String> expected = new ArrayList<>();
        expected.add("AA");
        expected.add("CC");
        expected.add("BB");
        expected.add("DD");
        expected.add("EE");
        expected.add("FF");

        Assert.assertEquals(expected,lists);
    }

    @Test
    public void toSetTest(){
        setExercises = new SetExercises();

        List<String > list = new ArrayList<>();
        list.add("hola");
        list.add("adios");
        list.add("que");

        TreeSet<String > set = setExercises.toSet(list);

        List<String> expected = new ArrayList<>();
        expected.add("que");
        expected.add("hola");
        expected.add("adios");


        Assert.assertEquals(expected,setExercises.toList(set));
    }
}

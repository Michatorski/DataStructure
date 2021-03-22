package org.iesfm.sets;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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
}

package org.iesfm.sets;

import java.util.*;

public class SetExercises {
    //set y un string, devuelve true o faLSE
    public boolean checkMember (Set<String> members, String member ){

    return members.contains(member);

    }

    public Set<String> insertData(Set<String > setStringName, String stringName){
         setStringName.add(stringName);
         return setStringName;
    }

    public List<String> toList (Set<String> set){
        List<String> list = new ArrayList<>(set);

        return list;

    }

    public TreeSet<String > toSet (List<String> list){
        Comparator <String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        TreeSet<String> set = new TreeSet<>(comparator);
        set.addAll(list);
        return set;
    }

}

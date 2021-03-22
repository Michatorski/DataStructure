package org.iesfm.lists;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {
    //Un metodo que dada una lista  de Strings, me devuelve el primer elemento (si existe)
    public static String  firstElement (List<String> list){

        if (list.isEmpty()){
            return null;
        } else {
            return  list.get(0);
        }
    }
    //Un metodo que dada una lista de String, me devuelve el ultimo eloemento (si existe)

    public static String  lastElement (List<String> list){

        if (list.isEmpty()){
            return null;
        } else {
            int lastIndex = list.size() - 1;
            return  list.get(lastIndex);
        }
    }
    //Un metodo que dada una lista de String y un String, lo inserta en la PRIMERA posicion
    public List<String> insertFirst(List<String> names, String name){
        names.add(0, name);

        return  names;
    }
    // un metodo que dada una lista de string, una posicion y un string sustituya
    public List<String> replacePosition(List<String> names, int position, String name){
        names.set(position, name);

        return names;
    }
}

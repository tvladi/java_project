package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main (String [] args) {
        // массив
        //String[] letters = new String[4];
        String[] letters = {"a", "b", "c", "d"};

        for (int i = 1; i < letters.length; i++) {
            System.out.println("слова:" + letters[i]);
        }

        for (String l : letters ) {
            System.out.println("буквы:" + l);
        }

        //***

        //список (коллекция)
        /*List<String> words = new ArrayList<String>();
        words.add("JS");*/
        List<String> words = Arrays.asList("JS", "PHP", "CSS");

        for (int i = 1; i < words.size(); i++) {
            System.out.println("слова:" + words.get(i));
        }

        for (String l : words ) {
            System.out.println("слова:" + l);
        }
    }
}

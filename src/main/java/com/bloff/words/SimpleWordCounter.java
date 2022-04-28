package com.bloff.words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SimpleWordCounter {


    public int wordsCounter(String text) {

        Character[] forbiddenLetter = {'0','1','2','3','4','5','6','7','8','9','*','+','-','/'};
        List<Character> forbiddenList = new ArrayList<>(Arrays.asList(forbiddenLetter));

        String[] textTable = text.split(" ");
        Stream<String> textTable1 = Stream.of(textTable);
        List<String> wordsList = new ArrayList<>(Arrays.asList(textTable));
        for (int i = 0; i < wordsList.size() ; i++) {
            String word = wordsList.get(i).trim();
            if (word.length()<2) {
                wordsList.remove(word);
                continue;
            }
            for (int j = 0; j < word.length(); j++) {
                if(forbiddenList.contains(word.charAt(j))){
                    wordsList.remove(word);
                }
            }
        }

        int number = wordsList.size();
        return number;
    }
}

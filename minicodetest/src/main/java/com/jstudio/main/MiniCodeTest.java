package com.jstudio.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class MiniCodeTest {

    public static ArrayList<String> digitalConvertToLetter(int[] number, int n, String[] table){
        ArrayList<String> resList = new ArrayList<String>();
        Queue<String> letterQueue = new LinkedList<String>();
        letterQueue.add("");

        while(!letterQueue.isEmpty()) {
            String letter = letterQueue.remove();
            if (letter.length() == n) {
                resList.add(letter);
            }else{
                String letterStr = table[number[letter.length()]];
                for (int i = 0; i < letterStr.length(); i++) {
                    letterQueue.add(letter + letterStr.charAt(i));
                }
            }
        }
        return resList;
    }

    public static void digitalConverts(int[] number, int n) {
        String[] table = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        ArrayList<String> list = digitalConvertToLetter(number, n, table);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String args[]) {
        int[] number = { 2, 3 };
        int n = number.length;
        digitalConverts(number, n);
    }
}

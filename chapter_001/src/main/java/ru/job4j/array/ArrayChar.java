package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length - 1; index++) {
                if (word[index+1] == pref[index+1]) {
                    break;
                } else {
                    return false;
                }
            }
        return result;
    }
}




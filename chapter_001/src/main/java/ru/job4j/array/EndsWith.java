package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int index = 0; index < post.length+1; index++){
            if (word[index+1] != post[index+1]) {
                break;
            }
            else {
                return true;
            }
        }
        return result;
    }
}

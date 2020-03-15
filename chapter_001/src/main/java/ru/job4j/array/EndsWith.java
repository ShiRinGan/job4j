package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int lastPost = post.length - 1;
        int lastWord = word.length - 1;
        for (int i = 0; i < lastPost-1; i++){
            if (lastWord[i] != lastPost[i]){
               lastPost --;
               lastWord --;
                result = false;
               break;
            }
        }
        return result;
    }
}

package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String result = "Неизвестное слово. " + eng;
        return result;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String frase = word.engToRus("Swift");
        System.out.println(frase);
    }
}

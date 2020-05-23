package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        }
        if (position == 2) {
            System.out.println("Спокойной ночи");
        }
        if (position >= 3) {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox pesnya = new Jukebox();
        pesnya.music(1);
        pesnya.music(2);
        pesnya.music(3);
    }
}

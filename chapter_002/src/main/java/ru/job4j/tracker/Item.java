package ru.job4j.tracker;

public class Item {
    public Item() {
    }

    public Item(String name) {
    }

    public Item(String name, String id) {
    }


    public static void main(String[] args) {
        Item item = new Item();
        Item onlyName = new Item("Filipp");
        Item nameAndId = new Item("Filipp", 28);
    }
}
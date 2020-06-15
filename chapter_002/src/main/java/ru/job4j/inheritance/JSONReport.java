package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String gnerate(String name, String body) {
        return "{"
                + System.lineSeparator() +
                "\"name\"" + ':' + '\"' + name + '\"'
                + System.lineSeparator() +
                "\"body\"" + ':' + '\"' + body + '\"'
                + System.lineSeparator()
                + "}";
    }
}
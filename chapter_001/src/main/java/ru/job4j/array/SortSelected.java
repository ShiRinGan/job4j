package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i=0; i<data.length; i++) { // начинаем работы с создания цикла, с которым будем работать.
            int min = MinDiapason.findMin(data, i, data.length-1); // первым шагом будет поиск минимального элемента в текущем списке. data.length-1!!! главное -1 иначе ошибка
            // int min = data[start]; тут стартом будет являтся переменная i
            //        for (int index = start ; index <= finish; index++) { тут финиш это data.length-1!!! главное -1 иначе ошибка
            //            if (data[index]<min){
            //            min = data[index];
            int index = FindLoop.indexOf(data, min, i, data.length); // поиск элемента в массиве
            // for (int index = start; index < finish; index++){ цикл
            //            if (data[index] == el){ элементов в даннои цикле будет являтся min, которое мы нашли прошлом методе
            //                rst = index; результат
            //                break;
            int temp=data[i]; // создаём переменную для замены.
            data[i]=data[index]; // сопоставляем элементы
            data[index]=temp; // меняем местами
        }
        return data;
}}

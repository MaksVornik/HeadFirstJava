package PracticeForStarter.Day12;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> arrayList = new LinkedList<>();
        arrayList.add("Ford");
        arrayList.add("Porsh");
        arrayList.add("Lamba");
        arrayList.add("Toyota");
        arrayList.add("Oudi");
        System.out.println(arrayList);

        arrayList.add(arrayList.size() / 2 , "Ferari");
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}


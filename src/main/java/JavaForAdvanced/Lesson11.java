package JavaForAdvanced;

import java.util.*;

public class Lesson11 {
    public static void main(String[] args) {
        List<Human> peopleList = new ArrayList<>();
        Set<Human> peopleSet = new TreeSet<>();
        addElements(peopleSet);
        addElements(peopleList);

        Collections.sort(peopleList);


        System.out.println(peopleList);
        System.out.println(peopleSet);
    }
    private static void addElements(Collection collection) {
        collection.add(new Human(1, "Bob"));
        collection.add(new Human(2, "Tom"));
        collection.add(new Human(3, "Katy"));
        collection.add(new Human(4, "George"));
    }
}
class Human implements Comparable<Human>{
    private int id;
    private String name;

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (id != human.id) return false;
        return name != null ? name.equals(human.name) : human.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        if (this.name.length() > o.getName().length()) {
            return 1;
        }
        else if (this.name.length() < o.getName().length()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}

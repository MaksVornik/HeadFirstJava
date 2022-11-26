package JavaForAdvanced;

import java.util.*;

public class lesson10 {
    public static void main(String[] args) {
        List<Person3> people = new ArrayList<>();
        people.add(new Person3(2, "Bob"));
        people.add(new Person3(3, "Katy"));
        people.add(new Person3(1, "Mike"));
        Collections.sort(people, new Comparator<Person3>() {
            @Override
            public int compare(Person3 o1, Person3 o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(people);
        List<MomsBusinessmen> group = new ArrayList<>();
        group.add(new MomsBusinessmen(3, "Maksim Vornik"));
        group.add(new MomsBusinessmen(4, "Andrey Gramatik"));
        group.add(new MomsBusinessmen(2, "Dima Milev"));
        group.add(new MomsBusinessmen(1, "Maksim Mazohov"));
        Collections.sort(group, new SecondComparator());
        System.out.println(group);
    }
}
class SecondComparator implements Comparator<MomsBusinessmen> {

    @Override
    public int compare(MomsBusinessmen o1, MomsBusinessmen o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        }
        else if (o1.getId() < o2.getId()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
class Person3 {
    private int id;
    private String name;

    public Person3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class MomsBusinessmen {
    private int id;
    private String name;

    public MomsBusinessmen(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MomsBusinessmen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
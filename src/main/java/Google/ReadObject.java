package Google;


import java.io.*;

public class ReadObject {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                Person person1 = (Person) ois.readObject();
                Person person2 = (Person) ois.readObject();
                System.out.println(person1);
                System.out.println(person2);
                ois.close();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

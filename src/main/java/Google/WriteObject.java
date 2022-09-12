package Google;


import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("people.bin");
        PrintWriter pw = new PrintWriter(file);
        System.out.println(System.in);
        pw.println("ewaewaeawae");
        pw.println("ewaewaeawae");
        pw.println("ewaewaeawae");
        pw.println("ewaewaeawae");
        pw.println("ewaewaeawae");
        pw.println("ewaewaeawae");
        pw.println("ewaewaeawae");
        pw.println("ewaewaeawae");
        pw.close();
    }
}

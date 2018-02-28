import java.io.*;
import java.util.*;
public class ParentPortal{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter Student roll no.");
      int number = s.nextInt();
      ParticularStudent ps = new ParticularStudent();
      ps.display(number);

    }
}

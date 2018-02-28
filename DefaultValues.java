import java.util.*;
import java.io.*;
public class DefaultValues{
  public static void main(String[] args) {
    String filename = "student.ser";
    ArrayList<Course> c = new ArrayList<Course>();
    ArrayList<Events> eve = new ArrayList<Events>();
    Student s1 = new Student("name", 0, "XXX", "XYZ@gmail.com", "12345", c, eve);
    try{
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
      out.writeObject(s1);
    }
    catch(Exception e){
      ;
    }
  }
}

import java.io.*;
import java.util.*;
public class ReadStudent extends StudentsList{
    Scanner s = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<Student>();
      System.out.println("Enter Student name");
      String name;
      name = s.next();
      System.out.println("Enter rollno.");
      int roll;
      roll = s.nextInt();
      System.out.println("Enter Branch: ");
      String br;
      br = s.next();

      try{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("mini.txt"));
        out.writeObject(students);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("mini.txt"));
        ArrayList<Student> p = (ArrayList<Student>)in.readObject();
        for(int i=0;i<p.size();i++){
              System.out.println("Name:"+p.get(i).getName()+"Rollno:"+p.get(i).getRollNo());
            }
            p.add(new Student(name,roll,br));
            in.close();
      }
      catch(Exception e){
        ;
      }
}

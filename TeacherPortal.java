import java.io.*;
import java.util.*;
public class TeacherPortal{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList<StudentMarks> stml = new ArrayList<StudentMarks>();
    System.out.println("1. To upload PeriodicalMarks");
    //System.out.println("2. To get TotalMarks");
  //  System.out.println("3. Change marks of a student");
    System.out.println("Select your desired action");
    int index = s.nextInt();
    if(index == 1){
      System.out.println("Enter Student rollno.");
      int roll = s.nextInt();

      System.out.println("Enter FirstPeriodicalMarks (For 15 marks)");

      int m = s.nextInt();
      FirstPeriodicalMarks fp = new FirstPeriodicalMarks(m);
      System.out.println("Enter SecondPeriodicalMarks (For 15 marks)");
      int n = s.nextInt();
      SecondPeriodicalMarks sp = new SecondPeriodicalMarks(n);

      System.out.println("Enter EndSemMarks (For 70 marks)");
      int o = s.nextInt();
      EndSemMarks es = new EndSemMarks(o);

      StudentMarks stm = new StudentMarks(roll, fp, sp, es);
      stml.add(stm);
      try{
        String filename = "studentmarks.ser";

        //ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream(filename));
        //os.writeObject(stml);
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
        ArrayList<StudentMarks> p = (ArrayList<StudentMarks>)is.readObject();
        p.add(stm);
        ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream(filename));
        os.writeObject(p);
      //  System.out.println(p);
      }
      catch(Exception e){
        ;
      }
    }
  /*  if(index == 2){
      TotalMarks t = new TotalMarks();
      String file = "particularStudentsMarks";
      ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream(file));
      os.writeObject(stml);
      ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
      ArrayList<StudentMarks> q = (ArrayList<StudentMarks>)is.readObject();
      System.out.println("TotalMarks: " + t.totalMarks(q.getFmarks(), q.getSmarks(), q.getEmarks()));
    }*/
  }
}

import java.util.*;
import java.io.*;
public class DisplayMarks{
  public static void main(String[] args) {
    try{
        String filename = "studentmarks.ser";

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
        ArrayList<StudentMarks> p = (ArrayList<StudentMarks>)is.readObject();
        for(int i=0;i<p.size();i++){
          System.out.println();
          System.out.println("Student Rollno: " + p.get(i).getNo());
          System.out.println("FirstPeriodicalMarks: " + p.get(i).getFmarks());
          System.out.println("SecondPeriodicalMarks: " + p.get(i).getSmarks());
          System.out.println("EndSemMarks: " + p.get(i).getEmarks());
          TotalMarks t = new TotalMarks();
          System.out.println("TotalMarks: " + t.totalMarks(p.get(i).getFmarks(), p.get(i).getSmarks(), p.get(i).getEmarks()));
          System.out.println();
        }
      }
      catch(Exception e){
        e.printStackTrace ();
    }
  }
}

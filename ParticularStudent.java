import java.util.*;
import java.io.*;
public class ParticularStudent
{
  public void display(int a){
    try{
      String filename = "student.ser";
      ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
      ArrayList<Student> p = (ArrayList<Student>)is.readObject();

      String file = "studentmarks.ser";

      ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
      ArrayList<StudentMarks> q = (ArrayList<StudentMarks>)in.readObject();
      for(int i=0;i<p.size();i++){
        if(p.get(i).getRollNo() == a){
          System.out.println();
          System.out.println("Name: "+p.get(i).getName());
          System.out.println("Roll no: " + p.get(i).getRollNo());
          System.out.println("branch: " + p.get(i).getBranch());
          System.out.println("MailId: "+ p.get(i).getEmail());
          System.out.println("Phone: " +p.get(i).getNo());
          System.out.println("Courses: " + p.get(i).getStudentCourses());
          System.out.println("Events: " + p.get(i).getStudentEvents());
          System.out.println("Achievements: " + p.get(i).getStudentAchievements());
          System.out.println("Workshops: " + p.get(i).getStudentWorkshops());
          System.out.println("FirstPeriodicalMarks: " + q.get(i).getFmarks());
          System.out.println("SecondPeriodicalMarks: " + q.get(i).getSmarks());
          System.out.println("EndSemMarks: " + q.get(i).getEmarks());
          TotalMarks t = new TotalMarks();
          System.out.println("TotalMarks: " + t.totalMarks(q.get(i).getFmarks(), q.get(i).getSmarks(), q.get(i).getEmarks()));

          System.out.println();
        }
      }
    }
    catch(Exception e){
      ;
    }
  }
}

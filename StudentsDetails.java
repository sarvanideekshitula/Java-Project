import java.util.*;
import java.io.*;
public class StudentsDetails{
  public static void main(String[] args) {

    try{
        String filename = "student.ser";
        //os.writeObject(stu);

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
        ArrayList<Student> p = (ArrayList<Student>)is.readObject();
      /*  ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream(filename));
        os.writeObject(p);*/
        for(int i=0;i<p.size();i++){
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
          System.out.println();
        }
      }
      catch(Exception e){
        e.printStackTrace ();
    }
  }
}

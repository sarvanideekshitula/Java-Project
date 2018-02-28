import java.util.ArrayList;
public class StudentCourse{
  CourseList cl = new CourseList();
  ArrayList <Course> studentCourses = new ArrayList<Course>();
  public void inputStudentCourse(int i){
    studentCourses.add(cl.allCourses.get(i));
  }
}

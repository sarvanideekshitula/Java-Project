import java.util.ArrayList;
public class CourseList {//extends Course{
  ArrayList <Course> courselist = new ArrayList<Course>();
  public void inputCourses()
	{
		courselist.add(new Course("MATHS",4));
		courselist.add(new Course("PHYSICS",2));
		courselist.add(new Course("CHEMISTRY",2));
		courselist.add(new Course("EEE",2));
		courselist.add(new Course("Cultural",2));
		courselist.add(new Course("ELECTIVE",1));
    courselist.add(new Course("Mechanical",2));
    courselist.add(new Course("Engineering Drawing",2));
    courselist.add(new Course("OOPS",3));
    courselist.add(new Course("DSA",4));
    courselist.add(new Course("DCS",3));
    courselist.add(new Course("Computer Essentials",1));
	}
}

import java.io.*;
import java.util.*;
public class Student implements Serializable{
	private String name;
	  private int rollno;
		private String branch;
		private String email;
		private String phoneno;
		ArrayList<Course> studentCourses = new ArrayList<Course>();
		ArrayList<Events> studentEvents = new ArrayList<Events>();
		ArrayList<Achievements> studentAchievements = new ArrayList<Achievements>();
		ArrayList<Workshops> studentWorkshops = new ArrayList<Workshops>();
	  public Student(String name, int rollno, String bran, String e, String n, ArrayList<Course> c, ArrayList<Events> eve, ArrayList<Achievements> ach, ArrayList<Workshops> work){
	    this.name = name;
	    this.rollno = rollno;
			this.branch = bran;
			this.email = e;
			this.phoneno = n;
			studentCourses.addAll(c);
			studentEvents.addAll(eve);
			studentAchievements.addAll(ach);
			studentWorkshops.addAll(work);
	  }
	  public String getName(){
	    return name;
	  }
	  public int getRollNo(){
	    return rollno;
	  }
		public String getBranch(){
	    return branch;
	  }
		public String getEmail(){
			return email;
		}
		public String getNo(){
			return phoneno;
		}
		public ArrayList <Course> getStudentCourses()
		{
		return studentCourses;
		}
		public ArrayList <Events> getStudentEvents()
		{
		return studentEvents;
		}
		public ArrayList <Achievements> getStudentAchievements()
		{
		return studentAchievements;
		}
		public ArrayList <Workshops> getStudentWorkshops()
		{
		return studentWorkshops;
		}
	  public void setName(String name){
	    this.name = name;
	  }
	  public void setRollNo(int rollno){
	    this.rollno = rollno;
	  }
		public void setEmail(String mail){
			this.email = mail;
		}
		public void setPhoneno(String n){
			this.phoneno = n;
		}
	  public String toString(){
		  return name + " " + rollno + " "+ branch + " " + email + " " + phoneno + " " + studentCourses + " " + studentEvents + " " + studentAchievements+ " " + studentWorkshops;
	  }
  }

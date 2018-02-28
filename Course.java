import java.io.*;
public class Course implements Serializable{
	 public int credits;
	  public String subjectName;
	  public Course(String subjectName, int credits){
	    this.credits = credits;
	    this.subjectName = subjectName;
	  }
	  public int getCredits(){
	    return credits;
	  }
	  public String getsubjectName(){
	    return subjectName;
	  }
	  public String toString(){
		  return subjectName + "-" + credits;
	  }
}

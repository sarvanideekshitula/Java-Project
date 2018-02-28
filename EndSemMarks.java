import java.io.*;
import java.util.*;
public class EndSemMarks implements Marks, Serializable{
  private int marks;
  public EndSemMarks(int marks){
    this.marks = marks;
  }
  public int getMarks(){
    return marks;
  }
  public void setMarks(int m){
    marks = m;
  }
  public int getHighest(){
    return 100;
  }
  public int getPercentage(){
    return (marks/this.getHighest())*100;
  }
}

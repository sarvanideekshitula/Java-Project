import java.io.*;
import java.util.*;
public class FirstPeriodicalMarks implements Marks, Serializable{
  private int marks;
  public FirstPeriodicalMarks(int marks){
    this.marks = marks;
  }
  public int getMarks(){
    return marks;
  }
  public void setMarks(int m){
    marks = m;
  }
  public int getHighest(){
    return 50;
  }
  public int getPercentage(){
    return (marks/this.getHighest())*100;
  }
  public String toString(){
    return "Marks: " + marks;
  }
}

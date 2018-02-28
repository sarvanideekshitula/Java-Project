import java.io.*;
import java.util.*;
public class StudentMarks implements Serializable{
  int rollno;
  FirstPeriodicalMarks fm;
  SecondPeriodicalMarks sm;
  EndSemMarks em;
  public StudentMarks(int no, FirstPeriodicalMarks f, SecondPeriodicalMarks s, EndSemMarks e){
    rollno = no;
    fm = f;
    sm = s;
    em = e;
  }
  public int getNo(){
    return rollno;
  }
  public void setNo(int n){
    rollno = n;
  }
  public int getFmarks(){
    return fm.getMarks();
  }
  public int getSmarks(){
    return sm.getMarks();
  }
  public int getEmarks(){
    return em.getMarks();
  }
  public String toString(){
    return "Roll no: " + rollno + " FirstPeriodicalMarks: " + fm.getMarks() + " SecondPeriodicalMarks: " + sm.getMarks() + " EndSemMarks: " + em.getMarks();
  }
}

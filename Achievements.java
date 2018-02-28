import java.io.*;
public class Achievements implements Serializable{
  private String achievement;
  public Achievements(String ach){
    this.achievement = ach;
  }
  public String getAchievement(){
    return achievement;
  }
  public void setAchievement(String ach){
    achievement = ach;
  }
  public String toString(){
    return achievement;
  }
}

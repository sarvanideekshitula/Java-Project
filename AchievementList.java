import java.util.ArrayList;
public class AchievementList{
  ArrayList <Achievements> achievementlist = new ArrayList<Achievements>();
  public void inputAchievements(){
    achievementlist.add(new Achievements("Scholarship - 90%"));
    achievementlist.add(new Achievements("Scholarship - 50%"));
    achievementlist.add(new Achievements("Scholarship - 30%"));
    achievementlist.add(new Achievements("CodeIT!"));
    achievementlist.add(new Achievements("ACM-ICPC"));
    achievementlist.add(new Achievements("Wed development workshop"));
    achievementlist.add(new Achievements("Google summer of code"));
    achievementlist.add(new Achievements("RGsoc"));
    achievementlist.add(new Achievements("Kalotsavam - events"));
    achievementlist.add(new Achievements("Sports meet - games"));
    achievementlist.add(new Achievements("None"));

  }
}

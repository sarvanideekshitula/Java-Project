import java.util.*;
import java.io.*;
public class Workshops implements Serializable{
  String workshopName;
  String date;
  public Workshops(String name, String date){
    this.workshopName = name;
    this.date = date;
  }
  public String getWorkshop(){
    return workshopName;
  }
  public String getWorkshopDate(){
    return this.date;
  }
  public String toString(){
    return workshopName + "-" + date;
  }
}

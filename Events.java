import java.io.*;
public class Events implements Serializable{
  String EventName;
  String EventDate;
  public Events(String name, String date){
    this.EventName = name;
    this.EventDate = date;
  }
  public String getEventName(){
    return EventName;
  }
  public String getEventDate(){
    return EventDate;
  }
  public String toString(){
    return EventName + "-" + EventDate;
  }
}

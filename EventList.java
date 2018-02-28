import java.util.ArrayList;
public class EventList{
  ArrayList <Events> eventlist = new ArrayList<Events>();
  public void inputEvents(){
    eventlist.add(new Events("Amala Bharatam" , "25-09-2017"));
    eventlist.add(new Events("Anokha", "24-02-2016"));
    eventlist.add(new Events("Vidyut", "05-03-2018"));
    eventlist.add(new Events("Kalotsavam", "4-02-1016"));
  }
}

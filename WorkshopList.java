import java.util.*;
public class WorkshopList{
  ArrayList<Workshops> workshoplist = new ArrayList<Workshops>();
  public void inputWorkshop(){
    workshoplist.add(new Workshops("Wed Development", "23-03-2017"));
    workshoplist.add(new Workshops("Cyber Security", "24-03-2017"));
    workshoplist.add(new Workshops("Android App development", "23-03-2017"));
    workshoplist.add(new Workshops("Electrical and electronical machine analysis", "23-03-2017"));
    workshoplist.add(new Workshops("Mechanical", "23-03-2017"));
    workshoplist.add(new Workshops("EEE workshop", "23-03-2017"));
    workshoplist.add(new Workshops("Soft skills", "23-03-2017"));

  }
}

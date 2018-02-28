import java.io.*;
import java.util.*;
public class StudentPortal{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //ArrayList<Student> stu= new ArrayList<Student>();
    Date date = new Date();
    System.out.println("                    Hello! Welcome to student portal");
    System.out.println();
    System.out.println("                  Today's date: " + date.toString());

    System.out.println("\nSelect your desired action");
    System.out.println("1. To add new Student");
    System.out.println("2. Change Student details");
    System.out.println("Enter 0 to exit the portal");
    int cnt = 0;
    while(cnt == 0){
      int index = s.nextInt();
      System.out.println();
      if(index == 0){
        break;
      }
      else{
        if(index == 1){

          System.out.println("Enter Student name");
          String name;
          name = s.next();
          System.out.println("Enter rollno.");
          int roll;
          roll = s.nextInt();
          System.out.println("Enter Branch: ");
          String br;
          br = s.next();
          System.out.println("Enter MailId");
          String m = s.next();
          System.out.println("Enter phone number");
          String n;
          n = s.next();


          ArrayList<Course> c = new ArrayList<Course>();
          CourseList cl = new CourseList();
          cl.inputCourses();
          for(int i=0;i<cl.courselist.size();i++){
            System.out.println(i+1 + " " + cl.courselist.get(i).getsubjectName());
          }
          System.out.println("Enter no.of courses");
          int k = s.nextInt();
          for(int i=0;i<k;i++){
            int l = s.nextInt();
            c.add(cl.courselist.get(i));
          }

          ArrayList<Events> eve = new ArrayList<Events>();
          EventList el = new EventList();
          el.inputEvents();
          for(int i=0;i<el.eventlist.size();i++){
            System.out.println(i+1 + " " + el.eventlist.get(i).getEventName());
          }
          System.out.println("Enter no.of events");
          int h = s.nextInt();
          for(int i=0;i<h;i++){
            System.out.println("Enter event number");
            int l = s.nextInt();
            eve.add(el.eventlist.get(i));
          }

          ArrayList<Achievements> achev = new ArrayList<Achievements>();
          AchievementList achevl = new AchievementList();
          achevl.inputAchievements();
          for(int i=0;i<achevl.achievementlist.size();i++){
            System.out.println(i+1 + " - " + achevl.achievementlist.get(i).getAchievement());
          }
          System.out.println("Enter no.of Achievements");
          int b = s.nextInt();
          for(int i=0;i<b;i++){
            System.out.println("Enter Achievement number");
            int l = s.nextInt();
            achev.add(achevl.achievementlist.get(i));
          }

          ArrayList<Workshops> works = new ArrayList<Workshops>();
          WorkshopList wl = new WorkshopList();
          wl.inputWorkshop();
          for(int i=0;i<wl.workshoplist.size();i++){
            System.out.println(i+1 + "-" + wl.workshoplist.get(i).getWorkshop());
          }
          System.out.println("Enter no.of Workshops");
          int x = s.nextInt();
          for(int i=0;i<x;i++){
            System.out.println("Enter workshop number");
            int p = s.nextInt();
            works.add(wl.workshoplist.get(i));
          }


          Student s1 = new Student(name, roll, br, m, n, c, eve, achev, works);
          //stu.add(s1);
            try{
              String filename = "student.ser";

              //os.writeObject(stu);

              ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
              ArrayList<Student> p = (ArrayList<Student>)is.readObject();
              p.add(s1);
              ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream(filename));
              os.writeObject(p);
             System.out.println(p);
            /*  ObjectInputStream ks = new ObjectInputStream(new FileInputStream(filename));
              ArrayList<Student> q = (ArrayList<Student>)ks.readObject();
              System.out.println(q);*/
            }
            catch(Exception e){
              ;
            }
        }
        if(index == 2){
          try{
          System.out.println("Enter Students rollno");
          int adm = s.nextInt();
          ParticularStudent ps = new ParticularStudent();
          ps.display(adm);
          System.out.println("Enter field to change");
          String field = s.next();
          String filename = "student.ser";
          ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
          ArrayList<Student> r = (ArrayList<Student>)is.readObject();
          for(int j=0;j<r.size();j++){
            if(r.get(j).getRollNo() == adm){
              if(field.equals("branch")){
                System.out.println("Enter the change to be done");
                String newName = s.next();
                  r.get(j).setName(newName);
                }
              if(field.equals("MailId")){
                System.out.println("Enter the change to be done");
                String newMailId = s.next();
                  r.get(j).setEmail(newMailId);

                }
                if(field.equals("Phone")){
                  System.out.println("Enter the change to be done");
                  String newphone = s.next();
                    r.get(j).setPhoneno(newphone);

                  }
            }
          }
            ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream(filename));
            os.writeObject(r);
          }
          catch(Exception e){
            ;
          }
      }
    }

    }
  }
}

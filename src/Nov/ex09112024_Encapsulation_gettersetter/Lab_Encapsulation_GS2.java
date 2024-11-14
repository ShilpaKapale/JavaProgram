package Nov.ex09112024_Encapsulation_gettersetter;

public class Lab_Encapsulation_GS2 {
    public static void main(String[] args) {
        Student_RVK s = new Student_RVK();
       s.setName("Sony");
        s.setRollno(11);
        System.out.println(s.getName());
        System.out.println(s.getRollno());
        s.setRollno(21);
        s.setRollno(55);
    }

}
class Student_RVK
{
    private String name;
    private int rollno;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
       if(rollno <= 51) {
           this.rollno = rollno;
           System.out.println(this.rollno+" Roll number valid" );
       }
       else
       {
           System.out.println(rollno +"  Roll number invalid" );
       }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

package Nov.ex09112024_Encapsulation_gettersetter;

public class Lab_Encapsulation_GS2 {
    public static void main(String[] args) {
        Student_RVK s = new Student_RVK();
       s.setName("Sony");
        s.setRollno(11);
        System.out.println(s.getName());
        System.out.println(s.getRollno());
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
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

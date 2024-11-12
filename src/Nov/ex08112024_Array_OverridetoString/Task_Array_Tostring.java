package Nov.ex08112024_Array_OverridetoString;

public class Task_Array_Tostring {
    public static void main(String[] args) {

        //Array of Student objects
        Student[] student = new Student[3];
        //Passing student details
        student[0] = new Student("Roshni",34);
        student[1] = new Student("Kirthi",356);
        student[2] = new Student("Roshni",421);

        for(Student details: student)
        {
                System.out.println(details.toString());

        }


    }
}

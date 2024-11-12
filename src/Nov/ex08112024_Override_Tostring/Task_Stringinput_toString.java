package Nov.ex08112024_Override_Tostring;

public class Task_Stringinput_toString {
    public static void main(String[] args) {

//Below two line are were jvm calls toString method internally for displaying string data
//        String data = "Hello World";
//        System.out.println(data.toString());

// We can override toString method to display string data in our own way
        Task_employee employee = new Task_employee(234,"Kavya");
        System.out.println(employee.toString());

   }
}

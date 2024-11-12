package Nov.ex08112024_Array_OverridetoString;

public class Student {

    //Attribute
    String name;
    int id;

    //Argument Constructor
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString()
    {
        return "name='" + name + '\'' + ", id=" + id ;
    }


}

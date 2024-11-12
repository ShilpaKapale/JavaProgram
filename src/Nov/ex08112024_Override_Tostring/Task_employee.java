package Nov.ex08112024_Override_Tostring;

public class Task_employee
{
    private int id;

      private String name;

    //Getter and Setter
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //Constructor
    public Task_employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "id=" + id + ", name=" + name ;
    }


}

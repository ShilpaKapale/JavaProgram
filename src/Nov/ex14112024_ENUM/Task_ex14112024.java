package Nov.ex14112024_ENUM;

public class Task_ex14112024 {
    public static void main(String[] args)
    {

        System.out.println(Day.Sunday);
        System.out.println(Day.Monday);

        System.out.println(URL.Chrome);
        System.out.println(URL.Safari);
    }
}

enum Day
{
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
}
enum URL
{
    Chrome,Firefox,Safari,Edge,IE;
}

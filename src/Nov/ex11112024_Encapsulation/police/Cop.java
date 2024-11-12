package Nov.ex11112024_Encapsulation.police;

public class Cop {

    private int gun;
    private String icard;

    public Cop(int gun, String icard) {
        this.gun = gun;
        this.icard = icard;
    }

    protected void canshoot()
    {
        System.out.println("Yes, you can shoot!");
    }




}

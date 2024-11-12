package Nov.ex11112024_Encapsulation.police;

public class JrCop {
    public static void main(String[] args) {

        Cop c1 = new Cop(5,"CopJ123");
        System.out.println("Cop you have gun, yes you can shoot");
        c1.canshoot();
    }
}

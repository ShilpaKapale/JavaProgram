package Nov.ex11112024_Encapsulation.criminal;

import Nov.ex11112024_Encapsulation.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c = new Cop(8,"thief42345");
        //We can't access the access modifier is protected and which we can, but we can access with in same package
      //  C.canshoot();
    }
}

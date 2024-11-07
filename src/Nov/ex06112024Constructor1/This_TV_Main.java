package Nov.ex06112024Constructor1;

public class This_TV_Main {
    public static void main(String[] args) {
       //DC
        SonyTV sonyTV = new SonyTV();
        System.out.println(sonyTV.model);
        System.out.println(sonyTV.year);
        //PC
        SonyTV sonyTV1 = new SonyTV("Bravia", 2020,100,200);
        System.out.println(sonyTV1.model);
        System.out.println(sonyTV1.year);
        //here constructor is confused which variable is class variable or constructor variable hence
        // it display zero when same name is used same variable name as in class and constructor and method
        //if we still want to use same name than use this keyword to differentiate class variable with
        // constructor or method variable
        System.out.println(sonyTV1.x);
        System.out.println(sonyTV1.y);

        // Calling method
        //Even for method we use this keyword if we want to use same variable name as that in class variable name
        sonyTV.feature(500,600);

    }
}

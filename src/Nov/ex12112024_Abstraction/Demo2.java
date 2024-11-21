package Nov.ex12112024_Abstraction;

public class Demo2 extends ADemo {
    int m;
    int n;

    public Demo2(int i, int j, int m, int n) {
        super(i, j);//This is been replaced for below local instance or static variable
        //this.i=i;
        // this.j=j;
        this.m=m;
        this.n=n;

    }
}

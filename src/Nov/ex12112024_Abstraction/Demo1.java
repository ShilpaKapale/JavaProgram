package Nov.ex12112024_Abstraction;

public class Demo1 extends ADemo {
    int k;
    int l;

    public Demo1(int i,int j,int k,int l)
    {
        super(i,j);//This is been replaced for below local instance or static variable
        //this.i=i;
       // this.j=j;
        this.k = k;
        this.l=l;
    }
}

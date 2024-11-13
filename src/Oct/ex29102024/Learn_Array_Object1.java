package Oct.ex29102024;
//Example of creating and using an array of objects:
public class Read_Array_Object1 {

   public static void main(String[] args) {
            // Create an array of Student objects
            Children[] child = new Children[3];

            // Initialize the array elements
            child[0] = new Children("Alice", 20);
            child[1] = new Children("Bob", 22);
            child[2] = new Children("Charlie", 21);

            // Access and print child information
            for (Children obj : child) {
                System.out.println("Name: " + obj.name + ", Age: " + obj.age);
            }
        }

}
class Children {
    String name;
    int age;

    public Children(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

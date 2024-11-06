package ex025102024;

public class Task_JavaStringSolutions {
    public static void main(String[] args) {
        String s1 = "Save tree";
        int length = s1.length();
        System.out.println(length);

        char ch = s1.charAt(5);
        System.out.println(ch);

        String s2 = s1.substring(3,6);
        System.out.println(s2);

        String s3 = "Protect Earth";
        boolean  result = s3.equals(s1);
        System.out.println(result);

        String output = s3.toUpperCase();
        System.out.println(output);

        String s4 = "protect earth";
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));

        System.out.println(s4.substring(3));
        String s5 = s4.substring(0,9);
        System.out.println(s5);

        String s6 = "Mist";
        String s7 = "Rain";
        System.out.println(s6.compareTo(s7));


    }
}

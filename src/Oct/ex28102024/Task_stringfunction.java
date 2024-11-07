package Oct.ex28102024;

public class Task_stringfunction {
    public static void main(String[] args)
    {
        String str = "Kavitha";
        String str1= str.substring(2,4);
        System.out.println(str1);

        String s1 ="Kavitha";
        String s2 = s1.concat(" Kaya");
        System.out.println(s2);

        String a1 = "Hello";
        String a2 = " World";
        String a3 = " ji";
        System.out.println(a1+a2+a3);

        String b1 = "Berry,Orange,Apple";
        String[] b2 = b1.split(",");
        System.out.println(b2[0]);
        System.out.println(b2[1]);
        System.out.println(b2[2]);

        String c1 = "Orange";
        System.out.println(c1.charAt(3));

        String d1 = " Solutions ";
        System.out.println(d1.trim());

        System.out.println(d1.indexOf("t"));
        System.out.println(d1.indexOf("s"));
        System.out.println(d1.contains("on"));
        System.out.println(d1.lastIndexOf("o"));
        System.out.println(d1.replace("i","d"));
        System.out.println(d1.startsWith(" So"));
        System.out.println(d1.endsWith("ns "));

        String d2 = "Banana";
        String d3 = d2.replaceAll("a","p");
        System.out.println(d3);

        String e1 = "Mast123Maja456Madi";
        String e2 = e1.replaceAll("\\d"," ");
        String e3 = e1.replaceAll("\\s"," ");
        System.out.println(e2);
        System.out.println(e3);

        StringBuffer f1 = new StringBuffer("Books");
        System.out.println(f1.append("NCERT"));


       StringBuilder f2 = new StringBuilder("Kavitha");
        System.out.println(f2.append("Noor"));
        System.out.println(f2.reverse());


    }
}

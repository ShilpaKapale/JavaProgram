package Oct.ex022102024;

public class Task_Countvowelsconsonantswhile {
    public static void main(String[] args) {
        String str = "Good Day";
        str = str.toLowerCase();

        int vCount=0;
        int cCount = 0;

        int i =0;
        while(i<str.length())
        {
            char ch = str.charAt(i);

            if(ch=='a'  || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vCount++;
            }
            else if(ch>='a' && ch<='z')
            {
                cCount++;
            }
            i++;
        }
        System.out.println("Total number of vowels in string is: "+vCount);
        System.out.println("Total number of consonant in a string is: "+cCount);
    }
}

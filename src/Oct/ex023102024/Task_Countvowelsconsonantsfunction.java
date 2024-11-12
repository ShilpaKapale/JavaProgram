package Oct.ex023102024;

public class Task_Countvowelsconsonantsfunction {
    public static void main(String[] args) {
        String str = "Sandeep M";

        countvowels_consonant(str);

    }

//    private static void countvowels_consonant(String str)
//    {
//        int vCount=0;
//        int cCount=0;
//        str = str.toLowerCase();
//        System.out.println(str.length());
//        for(int i=0;i<str.length();i++)
//        {
//
//            //char ch = str.charAt(i);
//            if(isVowel(str.charAt(i)))
//                    //ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
//            {
//                vCount++;
//            }
//            else
//                //if(ch >='a'&& ch<='z')
//            {
//                cCount++;
//            }
//
//        }
//
//        System.out.println("Total number of vowels in string is: "+vCount);
//        System.out.println("Total number of consonant in a string is: "+cCount);
//    }
//
//    private static boolean isVowel(char ch)
//    {
//        ch = Character.toLowerCase(ch);
//        return( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
//
//    }
  //  below program is using only one function
    private static void countvowels_consonant(String str)
    {
        int vCount=0;
        int cCount=0;
        str = str.toLowerCase();
        System.out.println(str.length());
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')

            {
                vCount++;
            }
            else if(ch >='a'&& ch<='z')

            {
                cCount++;
            }

        }

        System.out.println("Total number of vowels in string is: "+vCount);
        System.out.println("Total number of consonant in a string is: "+cCount);
    }

}

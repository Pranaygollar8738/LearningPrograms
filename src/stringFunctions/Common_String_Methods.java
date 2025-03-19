package stringFunctions;

import java.util.Arrays;

public class Common_String_Methods {
    public static void main(String[] args) {


       // 2. Common String Methods, length(), charAt(index),substring(start, end), contains(str), indexOf(str)
        //lastIndexOf(str), toUpperCase(), toLowerCase(), trim(), replace(old, new), split(regex)
        //equals(str), equalsIgnoreCase(str), startsWith(prefix), endsWith(suffix), isEmpty(),
        // join(delimiter, elements...)

         String str = new String(" Pranay ");
         String str1 = new String("Golhar");
         String str2 = new String("I'm a handsome guy");
         String str3 = new String("Bhumi Reshma Pranay");
         String[] text= str3.split(" ");



        System.out.println(str.length()  + " " + str);
        System.out.println(str.concat(str1));
        System.out.println(str.charAt(3) + "\n"+ str1.charAt(4));
        System.out.println(str2.substring(4, 8));
        System.out.println(str2.substring(4));
        System.out.println(str1.contains("G"));
        System.out.println(str1.indexOf("r"));
        System.out.println(str2.indexOf("a"));
        System.out.println(str2.lastIndexOf("handsome"));
        System.out.println(str2.lastIndexOf("guy"));
        System.out.println(str.lastIndexOf("y"));
        System.out.println(str.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str2.trim());
        System.out.println(str2.replace("guy", "boy"));
        System.out.println(str2.replace("m", "u"));
        System.out.println(Arrays.toString(text));




    }
}

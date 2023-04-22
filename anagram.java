


import java.util.Arrays;
import java.util.Scanner;

public class anagram {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

String str1=sc.nextLine();
String str2=sc.nextLine();

str1=str1.replaceAll("\\\\s", "");
str2=str2.replaceAll("\\\\s", "");

str1=str1.toLowerCase();
str2=str2.toLowerCase();

String strArray1[]=null;
String strArray2[]=null;

strArray1=str1.split("");
strArray2=str2.split("");

Arrays.sort(strArray1);
Arrays.sort(strArray2);

String str3=Arrays.toString(strArray1);
String str4=Arrays.toString(strArray2);

if(str3.equals(str4))
{
System.out.println("Anagrams");
}

else
{
System.out.println("Not Anagrams");
}

}
}
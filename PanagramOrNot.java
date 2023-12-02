package javaAssignment.programs;
import java.util.HashSet;
import java.util.Scanner;
public class PanagramOrNot 
{
public static boolean isPangram(String str)
{
str = str.toLowerCase();
HashSet<Character> charSet = new HashSet<>();
for (char c : str.toCharArray())
{
if (Character.isLetter(c)) 
{
charSet.add(c);
}
}
return charSet.size() == 26; 
}
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Give The Input");
String input = sc.nextLine();
boolean isPangram = isPangram(input);
if (isPangram) 
{
System.out.println("Entered Input is Panagram");
} 
else 
{
System.out.println("Entered Input is not a pangram.");
}
}
}

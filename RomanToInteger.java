package javaAssignment.programs;
import java.util.HashMap;
public class RomanToInteger
{
 public static void main(String[] args)
 {
String str = "IMMV"; 
if (str==null || str.length()==0) 
{
System.out.println("Entered string is empty");
}
HashMap<Character, Integer> romanValues = new HashMap<>();
romanValues.put('I', 1);
romanValues.put('V', 5);
romanValues.put('X', 10);
romanValues.put('L', 50);
romanValues.put('C', 100);
romanValues.put('D', 500);
romanValues.put('M', 1000);
int result=0;
int prevValue=0;
for (int i=str.length() - 1; i >= 0; i--) 
{
int currentValue = romanValues.get(str.charAt(i));
if (currentValue < prevValue)
{
result=result-currentValue;
} 
else 
{
result=result+currentValue;
}
prevValue=currentValue;
}
System.out.println("Integer Value Of "+ str +" is " +result);
}
}



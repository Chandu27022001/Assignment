package javaAssignment.programs;
import java.util.Arrays;
import java.util.Random;
public class shuffleArray 
{ 
public static void shuffleArray(int[] array) 
{
int size = array.length;
Random rand = new Random();
for (int i=size-1; i > 0; i--)
{
int j = rand.nextInt(i + 1);
int temp = array[i];
array[i] = array[j];
array[j] = temp;
}
}
public static void main(String[] args)
{
int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
shuffleArray(originalArray);
System.out.println("Shuffled Array is:" + Arrays.toString(originalArray));
}
}

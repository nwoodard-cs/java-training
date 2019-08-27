import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {

    int[] numbers = new int[5];
    numbers[0] = 31;
    numbers[1] = 45;
    numbers[2] = 22;
    numbers[3] = 98;
    numbers[4] = 10;
    int[] inlineNumbers = { 31, 45, 22, 98, 10 };
    
    System.out.println(Arrays.toString(numbers));
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    String[] favoriteBooks = { "The Hobbit", "GEB", "Anthem", "Enchiridion" };

    System.out.print(favoriteBooks[favoriteBooks.length-1] + " is the same as " + 
                     Array.get(favoriteBooks, favoriteBooks.length-1));
  }
}

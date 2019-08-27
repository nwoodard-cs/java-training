import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("What's your user number?");
    int userNumber = sc.nextInt();
    System.out.println("Enter a word:");
    String userInput = sc.next();
    String upperUserInput = userInput.toUpperCase();
    char firstUserChar = userInput.charAt(0);
    System.out.println("Enter a search string: ");
    String searchString = sc.next();
    boolean hasDing = userInput.contains("ding".toLowerCase());
    System.out.println("User #" + userNumber + " " + 
                        upperUserInput + " " + firstUserChar + ". Has " + 
                        searchString + "? "+ hasDing);
    sc.close();

  }
}

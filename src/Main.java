public class Main {
  public static void main(String[] args) {
    String userInput = "reading";
    String upperUserInput = userInput.toUpperCase();
    char firstUserChar = userInput.charAt(0);
    boolean hasDing = userInput.contains("ding");
    System.out.println(upperUserInput + " " + firstUserChar + "Has ding? " + hasDing);

  }
}

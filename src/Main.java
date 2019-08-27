import java.awt.*;

public class Main {
  public static void main(String[] args) {
    Car fordTaurus = new Car(15, "48WI12", Color.ORANGE, false);
    Car hondaFit = new Car(40, "C984EK", Color.LIGHT_GRAY, true);
    hondaFit.setPaintColor(Color.GREEN);
    System.out.println(hondaFit.paintColor.toString() + " " + fordTaurus.paintColor.toString());
  }
}

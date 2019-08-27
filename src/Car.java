import java.awt.*;

public class Car {
  double avgMPG;
  String licensePlate;
  Color paintColor;
  boolean tailLightsWork;

  public Car(double _avgMPG, 
             String _licensePlate, 
             Color _paintColor, 
             boolean _tailLightsWork) {
    this.avgMPG = _avgMPG;
    this.licensePlate = _licensePlate;
    this.paintColor = _paintColor;
    this.tailLightsWork = _tailLightsWork;
  }

  public void setPaintColor(Color newPaintColor) {
    this.paintColor = newPaintColor;
  }

  public double speedUp(double currentSpeed) {
    return currentSpeed += 20;
  }
}


public class Dog {
  int age;
  int weight;
  String noiseType;

  public Dog(int _age, int _weight, String _noiseType) {
    this.age = _age;
    this.weight = _weight;
    this.noiseType = _noiseType;
  }

  public String makeNoise() {
    return noiseType + " " + noiseType + " " + noiseType + "!";
  }

  public void ageUp() {
    ++this.age;
  }

  public void feed() {
    ++this.weight;
  }

}

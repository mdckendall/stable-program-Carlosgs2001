//Create the Horse class here.
public class Horse {
String name;
double weight;
boolean tame;

  public Horse(String name, double weight, boolean tame){
    this.name = name;
    this.weight = weight;
    this.tame = tame;
  }
  public void addName(String nameh){
    this.name = nameh;
  }
  public void addWeight(double weighth){
    this.weight = weighth;
  }
  public void addTame(boolean tameh){
    this.tame = tameh;
  }
}
//Create the Stable class here.
import java.util.ArrayList;

public class Stable{
  String adress;
  ArrayList <Horse> horses = new ArrayList<>();
  public Stable(String adress){
    this.adress = adress;
  }
public void addHorse(Horse horsesa){
  horses.add(horsesa);
}
int x = 1;
public void printArr(){
for(int i=0;i < horses.size();i++){
  
  System.out.println("Horse # "+ x +" Name: "+ horses.get(i).name);
  System.out.println(" Weight: " + horses.get(i).weight);
  System.out.println(" Tame: " + horses.get(i).tame);
  x++;
}
}


}
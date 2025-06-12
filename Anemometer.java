import java.util.*;
import Finch.*;

public class Anemometer {
  Finch bird = new Finch();  
  private int rotations; 
  private int seconds; 
  private double speed; 

  
  public static void main(String[] args) {
    seconds = 30;
    rotations = calculateNumRotations(measure(seconds));


    System.out.println("RPM over " + seconds + " seconds: " + calculateSpeed(rotations, seconds));
  }


  // Measure distances to be used in later calculations
  public static ArrayList<Integer> measure(int len) {
    ArrayList<Integer> distances = new ArrayList<>();
    for (int i = 0; i < len; i++) {
      distances.add(bird.getDistance());
    }

    return distances;
  }

  // Calculate the number of rotations to be used in later calculations
  public static int calculateNumRotations(ArrayList<Integer> list, int seconds) {
    int r = 0;

    for (int d : list) {
      // If the sensor picked something up close (the turbine), it adds a rotation.
      if (d < 15) {
        r++;
      }
    }

    return r;
  }

  public static double calculateSpeed(int rotations, int seconds) {
    return (double) rotations / seconds;
  }

  
}

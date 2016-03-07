public class DrunkenSailor {
  public static void main(String[] args) {
    int steps = Integer.parseInt(args[0]);
  
    int[] position = new int[2];
    position[0] = 0;
    position[1] = 0;
    
    int[] furthest = new int[2];
    furthest[0] = 0;
    furthest[1] = 0;
    double furthestDistance = Math.hypot(furthest[0], furthest[1]);
    
    for (int i = 0; i < steps; i++) {
      //int r = Math.random // get a random number

      int r = (int)(Math.random()*100);
      if (r > 0 && r <= 25) {
        position[0]++;
      }
      if (r > 25 && r <= 50) {
        position[0]--;
      }
      if (r > 50 && r <= 75) {
        position[1]++;
      } 
      if (r > 75 && r <= 100) {
        position[1]--;
      }
  
    System.out.print("(" + position[0] + ", ");
    System.out.println(position[1]+ ")");
    if (Math.hypot(position[0], position[1]) > furthestDistance) {
      furthest[0] = position[0];
      furthest[1] = position[1];
    }
    
    //Euclidean distance, store into variable
    }
    
    //print Euclidean distance
    System.out.println("Final distance = " + Math.hypot(position[0], position[1]));
    System.out.println("Furthest point = (" + furthest[0] + ", " + furthest[1] + ")");
  }
}
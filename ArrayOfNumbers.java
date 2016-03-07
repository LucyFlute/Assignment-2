public class ArrayOfNumbers {
  public static void main(String[] args) {
    int[] array = {2, 3, 4, 4};
    System.out.println(findMissingNum(4, array));
    System.out.println(findMostFrequent(4, array));
  }
  
  public static String findMissingNum(int a, int[] b) {
    String missingNumbers = "";
    for (int i = 1; i <= a; i++) {
      int j = 0;
      boolean numberMatch = false;
      while (numberMatch = false) {
        if (j >= b.length) {
          break;
        }
        if (b[j] == i) {
          numberMatch = true;
          j++;
        }
      }
      if (numberMatch == false) {
        missingNumbers += i;
      }
    }
    return missingNumbers;
  }
  
  public static int findMostFrequent(int a, int[] b) {
    int[] frequencies = new int[a];
    for (int i = 1; i <= a; i++) {
      int count = 0;
      for (int j = 0; j < b.length; j++) {
        if (b[j] == i) {
          count++;
        }
      }
      frequencies[i-1] = count;
    }
    int mostFrequent = 0;
    for (int i = 0; i < frequencies.length; i++) {
      if (frequencies[i] > mostFrequent) {
        mostFrequent = i + 1;
      }
    }
    return mostFrequent;
  }
  
}
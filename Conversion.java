public class BinaryConverter {
  public static void main(String[] args) {
    //if number is not binary, invalid input message
    if (!isBinary(args[0])) {
      System.out.println("The input is not binary!");
    }
    
    //conversion - if input is binary
    //decimal is the final value - set to 0 at first
    int decimal = 0; //101
    if (isBinary(args[0])) {
      for (int i = (args[0].length() - 1); i >= 0; i--) { //for each char in args[0]
        if (args[0].charAt(i) == '1') { //if it is 1, add 2 to the appropriate power
         int power = 1;
          for (int j = 0; j < i; j++) { 
            power = power*2;
          }
          decimal += power; //add this number to decimal, move on to next digit
        }
        
      }
      System.out.println("The binary number " + args[0] + " is " + decimal + " in base 10.");
    }
  }
  
  //check if input is binary - if any char is not 0 or 1, return false, otherwise return true
  public static boolean isBinary(String a) {
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != '0' && a.charAt(i) != '1') {
        return false;
      }
    }
    return true;
  }
  
  
}
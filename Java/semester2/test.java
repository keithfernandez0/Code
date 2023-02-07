package semester2;

public class test {
  public static void main(String[] args) {
    
    // create 3 boolean variables
    boolean a = true;
    boolean b = false;
    boolean c = true;

    boolean result;

    // check if two are true
    if(a) {

      // if first is true
      // and one of the second and third is true
      // result will be true
      result = b || c;
    }
    else {

      // if first is false
      // both the second and third should be true
      // so result will be true
      result = b && c;
    }

    if(result) {
      System.out.println("Two boolean variables are true.");
    }
    else {
      System.out.println("Two boolean variables are not true.");
    }
  }

}
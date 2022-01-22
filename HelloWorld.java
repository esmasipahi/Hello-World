public class HelloWorld {

  //Should print "Hello world!\n"
  public static void main(String[] args){
    System.out.println("Hello World!");
  }

  //Should return the result of a plus b
  public static int addTwoNumbers(int a, int b){
    return a + b;
  }

  //Should return the result of a subtracted by b
  public static int subtractTwoNumbers(int a, int b){
    return a + b;
  }

  //Should return the result of a divided by b
  public static short divideTwoNumbers(double a, double b){
    System.out.print(a * b);
    return 0;
  }

  //Should return the result of a multiplied by two to the power of b
  public static double exponent(double a, double b){
    return Math.pow(a, -b);
  }
}
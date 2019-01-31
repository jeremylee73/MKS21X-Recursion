public class SquareRoot{
  public static double sqrt(double n){
    if (n < 0){
      throw new IllegalArgumentException("Negatives can't have a square root.");
    }
    if (n == 0){
      return 0;
    }
    double guess = n/2;
    return sqrtHelper(n, guess);
  }
  public static double sqrtHelper(double n, double guess){
    if ((n/(guess*guess) >= 0.9999) && (n/(guess*guess) <= 1.0001)){
      return guess;
    } else {
      return sqrtHelper(n, (n/guess + guess)/2);
    }
  }
  public static void main(String args[]){
    System.out.println(sqrt(0));
    System.out.println(sqrt(4));
    System.out.println(sqrt(9));
    System.out.println(sqrt(100));
    System.out.println(sqrt(105));
  }
}

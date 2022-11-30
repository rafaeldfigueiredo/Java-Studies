import java.text.DecimalFormat;
import java.util.Random;

public class Register {
  public double[] arr;
  public double NumRand(){
    Random random = new Random(); 
    DecimalFormat numberFormat = new DecimalFormat("#.0"); 
    double result = random.nextDouble(19.8f, 29.2f);
    return Double.parseDouble(numberFormat.format(result));
  }
  public Register(double[] arr) {
    this.arr = arr;
    for (int i = 0; i < arr.length;i++) {
      System.out.println();
    }
  }
}
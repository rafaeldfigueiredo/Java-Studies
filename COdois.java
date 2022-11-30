import java.util.Random;
import java.text.DecimalFormat;

public interface COdois {
  static Random random = new Random();
  DecimalFormat numberFormat = new DecimalFormat("#.0"); 
  public static double[] RegCO2 = new double[48];
  // Lembrar de fazer RegCO2Time.

  static void setCODois() {
    for (int i = 0; i < RegCO2.length;i++) {
      double result = random.nextDouble(19.8f, 29.2f);
      System.out.println(Double.parseDouble(numberFormat.format(result)));
    }
  }

  public static void main(String[] args) {
    setCODois();
  }
}
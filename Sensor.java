import java.text.DecimalFormat;
import java.util.Random;

public class Sensor {
  //Objetos contendo pacotes.
  private Random random = new Random();
  private DecimalFormat numberFormat = new DecimalFormat("#.00");

  // Método para valores aleatórios.
  public double numRand() {
    double result = random.nextDouble(19.8f, 29.2f); // Adquire um valor entre estes fornecidos
    return Double.parseDouble(numberFormat.format(result)); // Formata o valor para menor saída.
  }

  public static void main(String[] args) {
    Sensor ss = new Sensor();
    System.out.println(ss.numRand());
  }
}
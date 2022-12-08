import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Sensor {
    String resultado[][] = new String[48][48];

    // Metodos para horários(iniciando à 00:00)
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    // Método de número aleatório(com o propósito de popular RegCO2)
    double numRand(double min, double max) {
        return Math.round((Math.random() * ((max - min) + 1)) + min);
    }

    // Registro dos dados;
    public void setData(double min, double max) {
        // Adiciona valores à lista

        LocalTime x = LocalTime.of(0, 0);
        for (int index = 0; index <= 47; index++) {
            resultado[0][index] = Double.toString(numRand(min, max));
            for (int h = 0;h < 48;h++){
                resultado[1][h] = x.format(formatter); 
                x = x.plusMinutes(30);
            }
        }
    }

    public static void main(String[] args) {
        // Criação de objeto
        Sensor ss = new Sensor();

        ss.setData(0, 100);
        for (int index = 0; index < 47; index++) {
            System.out.printf("%s - %s\n", ss.resultado[0][index], ss.resultado[1][index]);
        }
    }
}

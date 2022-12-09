import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Sensor {
    String resultado[][] = new String[48][48]; //Lista final
    double valMin,valMax;

    // Metodos para formatar horários(iniciando à 00:00)
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    LocalTime horaLeitura = LocalTime.of(0, 0); //Horário inicial

    // Método de número aleatório(com o propósito de popular RegCO2)
    double numRand(double min, double max) {
        return Math.round((Math.random() * ((max - min) + 1)) + min);
    }

    // Registro dos dados;
    public void setData(double min, double max) {
    // Adiciona valores à lista
        for (int index = 0; index <= 47; index++) {
            resultado[0][index] = Double.toString(numRand(min, max));//Adiciona valor numérico à primeira lista
            for (int h = 0;h < 48;h++){
                resultado[1][h] = horaLeitura.format(formatter); 
                horaLeitura = horaLeitura.plusMinutes(30);
            } 
        }
    }
}
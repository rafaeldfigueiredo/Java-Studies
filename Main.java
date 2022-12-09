import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Main extends Sensor {
    String name;

    public Main(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Menu
        System.out.print("Qual bioma você pretende acessar?\n1. Tropical\n2. Frio\n3. Temperado\n4. Desértico\nR:");

        try {
            int choice = read.nextInt();

            switch (choice) {
                case 1:
                    Main t = new Main("Tropical");
                    System.out.printf("Bioma %s :\n", t.getName());

                    System.out.println("\nTemperatura:");
                    t.setData(18, 36);
                    Arrays.sort(t.resultado[0]);
                    for (int index = 0; index < 48; index++) {
                        System.out.printf("%s ° C - %s / ", t.resultado[0][index], t.resultado[1][index]);
                    }

                    System.out.println("\nNíveis de carbono:");
                    t.setData(0, 100);
                    Arrays.sort(t.resultado[0]);
                    for (int index = 0; index < 48; index++) {
                        System.out.printf("%s - %s / ", t.resultado[0][index], t.resultado[1][index]);
                    }

                    System.out.println("\nNíveis de umidade:");
                    t.setData(60, 80);
                    Arrays.sort(t.resultado[0], Collections.reverseOrder());
                    for (int index = 0; index < 48; index++) {
                        System.out.printf("%s %% - %s / ", t.resultado[0][index], t.resultado[1][index]);
                    }
                    System.out.println("");
                    break;

                case 2:
                    Main f = new Main("Frio");
                    System.out.printf("Bioma %s :\n", f.getName());

                    System.out.println("\nTemperatura:");
                    f.setData(-2, -10);
                    Arrays.sort(f.resultado[0]);
                    for (int index = 0; index < 48; index++) {
                        System.out.printf("%s ° C - %s / ", f.resultado[0][index], f.resultado[1][index]);
                    }

                    System.out.println("\nNíveis de emissão de carbono:");
                    f.setData(0, 100);
                    Arrays.sort(f.resultado[0]);
                    for (int index = 0; index < 48; index++) {
                        System.out.printf("%s %% - %s / ", f.resultado[0][index], f.resultado[1][index]);
                    }

                    System.out.println("\nNíveis de umidade:");
                    f.setData(53.0, 78.0);
                    Arrays.sort(f.resultado[0], Collections.reverseOrder());
                    for (int index = 0; index < 48; index++) {
                        System.out.printf("%s %% - %s / ", f.resultado[0][index], f.resultado[1][index]);
                    }
                    System.out.println("");
                    break;
                case 3:
                    Main tmp = new Main("Temperado");
                    System.out.printf("Bioma %s :\n", tmp.getName());

                    System.out.println("\nTemperatura:");
                    tmp.setData(9, 27);
                    Arrays.sort(tmp.resultado[0]);
                    for (int index = 0; index < 48; index++) {
                        System.out.printf("%s ° C - %s / ", tmp.resultado[0][index], tmp.resultado[1][index]);
                    }

                    System.out.println("\nNíveis de emissão de carbono:");
                    tmp.setData(0, 100);
                    Arrays.sort(tmp.resultado[0]);
                    for (int index = 0; index < 48; index++) {
                        System.out.printf("%s - %s / ", tmp.resultado[0][index], tmp.resultado[1][index]);
                    }

                    System.out.println("\nNíveis de umidade:");
                    tmp.setData(60, 80);
                    Arrays.sort(tmp.resultado[0], Collections.reverseOrder());
                    for (int index = 0; index < 48; index++) {
                        System.out.printf("%s %% - %s / ", tmp.resultado[0][index], tmp.resultado[1][index]);
                    }
                    System.out.println("");
                    break;
                case 4:
                    Main d = new Main("Desértico");
                    System.out.printf("Bioma %s :\n", d.getName());

                    System.out.println("\nTemperatura:");
                    d.setData(11, 41);
                    Arrays.sort(d.resultado[0]);
                    for (int index = 0; index < 48; index++) {
                        System.out.printf("%s ° C - %s / ", d.resultado[0][index], d.resultado[1][index]);
                    }

                    System.out.println("\nNíveis de emissão de carbono:");
                    d.setData(0, 100);
                    Arrays.sort(d.resultado[0]);
                    for (int index = 0; index < 48; index++) {
                        System.out.printf("%s - %s / ", d.resultado[0][index], d.resultado[1][index]);
                    }

                    System.out.println("\nNíveis de umidade:");
                    d.setData(30, 60);
                    Arrays.sort(d.resultado[0], Collections.reverseOrder());
                    for (int index = 0; index < 48; index++) {
                        System.out.printf("%s %% - %s / ", d.resultado[0][index], d.resultado[1][index]);
                    }
                    System.out.println("");

                    break;
                default:
                    System.out.println("Nenhuma opção selecionada.\n");
                    break;
            }
        } catch (Exception e) {
            System.err.println("Esta não é uma opção.");

        } finally {
            read.close();
        }
    }
}
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Menu
        System.out.println("Qual bioma você pretende acessar?\n1. Tropical\n2. Frio\n3. Temperado\n4. Desértico\nR:");
        int choice = read.nextInt();
        switch (choice) {
            case 1:
                Biome t = new Biome("Tropical");
                t.getName();
                break;
            case 2:
                Biome f = new Biome("Frio");
                f.getName();
                break;
            case 3:
                Biome tmp = new Biome("Temperado");
                tmp.getName();
                break;
            case 4:
                Biome d = new Biome("Desértico");
                d.getName();
                break;
            default:
                break;
        }
        read.close();
    }
}
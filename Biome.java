import java.util.Scanner;

public class Biome {
  String name;

  public Biome(String name) {
    this.name = name;
  }
  public void getName(){
    System.out.println(name);
  }

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    // Menu
    System.out.println("""
        Qual bioma você pretende acessar?
        1. Tropical
        2. Frio
        3. Temperado
        4. Desértico
        R:
        """);
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

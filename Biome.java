public class Biome implements Umi,COdois,Temp{
  String name;
  public Biome(String name){
    this.name = name;
  }
  public static void main(String[] args) {
    //Menu
    System.out.println("""
        Qual bioma você pretende acessar?
        1. Tropical
        2. Frio
        3. Temperado
        4. Desértico
        R: 
        """);
  }
}

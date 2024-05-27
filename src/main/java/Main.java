public class Main {
  public static void main(String[] args) {
    System.out.println("Programa para calcular Potência e Consumo Elétrico");
    System.out.println("");
    System.out.println("Sua fórmula é:");
    System.out.println("Consumo Elétrico = Potência x tempo");
    System.out.println("                   ----------------");
    System.out.println("                          1000");
    System.out.println("");
    System.out.println("Exemplo:");
    System.out.println("");
    System.out.println("1) Uma TV de 200 watts fica ligada aproximadamente 5h diariamente. Determine o consumo elétrico mensal da TV.");
    System.out.println("");
    System.out.println("A potencia considerada é:");
    int potencia = 200;
    System.out.println(potencia);
    System.out.println("");
    System.out.println("O tempo considerado é:");
    int tempo = 5;
    System.out.println(tempo);
    System.out.println("");
    System.out.println("O mensal considerado é:");
    int mensal = 30;
    System.out.println(mensal);
    System.out.println("");
    System.out.println("O resultado será de:");
    int potenciaeConsumoEletrico = 200 * 5 * 30 / 1000;
    System.out.println(potenciaeConsumoEletrico);
    System.out.println("");
    System.out.println("O consumo elétrico da TV mensalmente é de 30watts");
    
    
      }

}
// import java.util.Scanner;

// public class veiculo {

//     private double capacidadeMaxima;
//     private double combustivelAtual;

//     public veiculo(double capacidadeMaxima) {
//         this.capacidadeMaxima = capacidadeMaxima;
//         this.combustivelAtual = 0;
//     }

//     public void abastecer(double litros) {
//         if (litros < 0) {
//             System.out.println("Quantidade inválida para abastecimento.");
//             return;
//         }
//         if (combustivelAtual + litros > capacidadeMaxima) {
//             combustivelAtual = capacidadeMaxima;
//             System.out.println("Tanque cheio! Excedente não foi adicionado.");
//         } else {
//             combustivelAtual += litros;
//             System.out.println("Abastecido com sucesso.");
//         }
//     }

//     public double getCombustivelAtual() {
//         return combustivelAtual;
//     }

//     public static void main(String[] var0) {
//         Scanner var1 = new Scanner(System.in);

//         System.out.print("Digite a capacidade máxima do tanque: ");
//         double var2 = var1.nextDouble();
//         veiculo var3 = new veiculo(var2);

//         System.out.print("Digite a quantidade de litros para abastecer: ");
//         double var4 = var1.nextDouble();
//         var3.abastecer(var4);

//         System.out.printf("A quantidade de combustível atual é: %.2f\n", var3.getCombustivelAtual());
//     }
// }
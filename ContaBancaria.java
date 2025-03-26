// import java.util.Scanner;

// public class ContaBancaria {
//     private double saldo;

    
//     public ContaBancaria() {
//         this.saldo = 0.0;
//     }

//     public void deposito(double valor) {
//         if (valor > 0) {
//             saldo += valor;
//         } else {
//             System.out.println("Valor de depósito inválido.");
//         }
//     }

//     public void saque(double valor) {
//         if (valor > 0 && valor <= saldo) {
//             saldo -= valor;
//         } else if (valor > saldo) {
//             System.out.println("Erro: Saldo insuficiente para realizar o saque.");
//         } else {
//             System.out.println("Valor de saque inválido.");
//         }
//     }

//     public double getSaldo() {
//         return saldo;
//     }

//     public static void main(String[] args) {
//         Scanner ler = new Scanner(System.in);
//         ContaBancaria conta = new ContaBancaria();

//         System.out.print("Digite o valor do depósito: ");
//         double deposito = ler.nextDouble();
//         conta.deposito(deposito);

//         System.out.print("Digite o valor do saque: ");
//         double saque = ler.nextDouble();
//         conta.saque(saque);

//         System.out.printf("O valor do depósito foi: %.2f\n", deposito);
//         System.out.printf("O valor do saque foi: %.2f\n", saque);
//         System.out.printf("O saldo atual da conta é: %.2f\n", conta.getSaldo());
        
//     }
// }

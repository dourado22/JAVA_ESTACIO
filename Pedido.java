// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class Pedido {
//     private String nome;
//     private double preco;

//     public Pedido(String nome, double preco) {
//         this.nome = nome;
//         this.preco = preco;
//     }



// public class Pedido {
//     private List<Pedido> itens;

//     public Pedido() {
//         this.itens = new ArrayList<>();
//     }

//     public void adicionarItem(Pedido produto) {
//         itens.add(produto);
//     }

//     public double calcularValorTotal() {
//         double total = 0;
//         for (Pedido produto : itens) {
//             total += produto.getPreco();
//         }
//         return total;
//     }

//     public void exibirResumo() {
//         System.out.println("\nResumo do Pedido:");
//         for (Pedido p : itens) {
//             System.out.println(p.getNome() + " - R$ " + p.getPreco());
//         }
//         System.out.println("Valor Total: R$ " + calcularValorTotal());
//     }

//     public static void Pedido(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         Pedido pedido = new Pedido();

//         while (true) {
//             System.out.println("\nDigite o nome do produto (ou 'sair' para finalizar): ");
//             String nome = scanner.nextLine();
//             if (nome.equalsIgnoreCase("sair")) {
//                 break;
//             }

//             System.out.println("Digite o preço do produto: ");
//             double preco = scanner.nextDouble();
//             scanner.nextLine(); // Consumir a quebra de linha

//             Pedido produto = new Pedido(nome, preco);
//             pedido.adicionarItem(produto);
//             System.out.println("Produto adicionado com sucesso!");
//         }

//         pedido.exibirResumo();
//         scanner.close();
//     }
// }

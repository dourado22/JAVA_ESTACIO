import java.util.ArrayList;
import java.util.List;

public class agenda {
    private List<Contato> contatos;

    public agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    public boolean removerContato(String nome) {
        return contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public static class Contato {
        private String nome;
        private String telefone;

        public Contato(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
        }

        public String getNome() {
            return nome;
        }

        public String getTelefone() {
            return telefone;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Telefone: " + telefone;
        }
    }

    public static void main(String[] args) {
        agenda a = new agenda();

        System.out.print("Adicionar nome contato: ");
        String nome = System.console().readLine();

        System.out.print("Adicionar telefone contato: ");
        String telefone = System.console().readLine();

        a.adicionarContato(nome, telefone);

        System.out.printf("Contato %s adicionado com sucesso!\n", nome);
        System.out.println("Telefone adicionado com sucesso: " + telefone);

    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Problema {
    static class Pessoa {
        int numero;
        String nome;
        String telefone;
        String endereco;
        String cpf;

        public Pessoa(int numero, String nome, String telefone, String endereco, String cpf) {
            this.numero = numero;
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
            this.cpf = cpf;
        }

        public String toString() {
            return "Pessoa{"+"numero=" +numero+", nome='" +nome+ '\'' +'}';
        }
    }

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
    
        for (int i = 1; i <= 20; i++) {
            pessoas.add(new Pessoa(i, "Pessoa " +i, "Telefone " +i, "Endereço " +i, "CPF " + i));
        }

        Random random = new Random();
        int m = random.nextInt(20) + 1;
        System.out.println("Número m escolhido: " +m);

        int index = 0;
        while (pessoas.size() > 1) {
            index = (index + m - 1) % pessoas.size();
            Pessoa eliminada = pessoas.remove(index);
            System.out.println("Eliminada: " +eliminada.nome+ " (Número: " +eliminada.numero+ ")");
        }

        Pessoa sobrevivente = pessoas.get(0);
        System.out.println("A pessoa sobrevivente é: " +sobrevivente.nome+ ", número: " +sobrevivente.numero);
    }
}

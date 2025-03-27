import java.util.*;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1; // Gera um número aleatório entre 1 e 100
        int palpite;

        System.out.println("Adivinhe o número (entre 1 e 100)!");

        // Continua pedindo até o usuário acertar
        do {
            System.out.print("Seu palpite: ");
            palpite = s.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Tente um número menor!");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou.");
        s.close();
    }
}

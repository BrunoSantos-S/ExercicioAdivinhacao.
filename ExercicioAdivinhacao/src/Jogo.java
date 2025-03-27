import java.util.*;

public class Jogo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = new Random().nextInt(100) + 1, t = 0; // Gera um número aleatório entre 1 e 100

        // Enquanto o jogador não acertar, continua pedindo um palpite
        while (t != n) {
            System.out.print("Tente: ");
            t = s.nextInt();

            // Dica para o jogador
            System.out.println(t < n ? "Maior!" : t > n ? "Menor!" : "Acertou!");
        }
        s.close(); // Fecha o scanner
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Logica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do campeonato: ");
        String nomeCampeonato = scan.nextLine();

        String[] todosOsTimes = new String[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o nome de um time: ");
            todosOsTimes[i] = scan.nextLine();
        }

        String[][] jogosQuartas = new String[4][2];

        int linhaMatriz = 0;

        for (int i = 0; i < 8; i += 2) {
            jogosQuartas[linhaMatriz][0] = todosOsTimes[i];
            jogosQuartas[linhaMatriz][1] = todosOsTimes[i + 1];

            linhaMatriz++;
        }

        System.out.println(Arrays.deepToString(jogosQuartas));

        scan.close();
    }
}

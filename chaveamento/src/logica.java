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
        jogosQuartas = montarJogos(jogosQuartas, todosOsTimes);

        System.out.println(Arrays.deepToString(jogosQuartas));

        int pontosTimeA, pontosTimeB;

        for (int i = 0; i < 4; i++) {
            System.out.println(jogosQuartas[i][0] + " x " + jogosQuartas[i][1]);
            System.out.printf("Jogo %s \n", i + 1);

            System.out.printf("Total de pontos do time %s: ", jogosQuartas[i][0]);
            pontosTimeA = scan.nextInt();
            scan.nextLine();

            System.out.printf("Total de pontos do time %s: ", jogosQuartas[i][1]);
            pontosTimeB = scan.nextInt();
            scan.nextLine();

            System.out.println(pontosTimeA + " x " + pontosTimeB);
        }

        scan.close();
    }

    public static String[][] montarJogos(String[][] jogos, String[] times) {
        int linhaMatriz = 0;

        for (int i = 0; i < 8; i += 2) {
            jogos[linhaMatriz][0] = times[i];
            jogos[linhaMatriz][1] = times[i + 1];

            linhaMatriz++;
        }

        return jogos;
    }
}

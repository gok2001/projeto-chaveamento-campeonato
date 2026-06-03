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

        int[][] resultadoQuartas = new int[4][2];

        resultadoQuartas = registrarPontuacao(jogosQuartas, resultadoQuartas);

        System.out.println(Arrays.deepToString(resultadoQuartas));

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

    public static int[][] registrarPontuacao(String[][] jogos, int[][] resultado) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.printf("Jogo %s \n", i + 1);
            System.out.println(jogos[i][0] + " x " + jogos[i][1]);
            System.out.println();

            System.out.printf("Total de pontos %s: ", jogos[i][0]);
            resultado[i][0] = scan.nextInt();
            scan.nextLine();

            System.out.printf("Total de pontos %s: ", jogos[i][1]);
            resultado[i][1] = scan.nextInt();
            scan.nextLine();
            System.out.println();
        }

        scan.close();
        return resultado;
    }
}

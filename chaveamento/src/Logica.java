import java.util.Arrays;
import java.util.Scanner;

public class Logica {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o nome do campeonato: ");
        String nomeCampeonato = scan.nextLine();

        String[] todosOsTimes = new String[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o nome de um time: ");
            todosOsTimes[i] = scan.nextLine();
        }

        System.out.println();

        String[][] jogosQuartas = new String[4][2];
        jogosQuartas = montarJogos(jogosQuartas, todosOsTimes);

        int[][] resultadoQuartas = new int[4][2];
        resultadoQuartas = registrarPontuacao(jogosQuartas, resultadoQuartas);

        String[] vencedoresQuartas = new String[4];
        vencedoresQuartas = obterVencedores(jogosQuartas, resultadoQuartas);

        String[][] jogosSemi = new String[2][2];
        jogosSemi = montarJogos(jogosSemi, vencedoresQuartas);

        int[][] resultadoSemi = new int[2][2];
        resultadoSemi = registrarPontuacao(jogosSemi, resultadoSemi);

        String[] vencedoresSemi = new String[2];
        vencedoresSemi = obterVencedores(jogosSemi, resultadoSemi);

        String[][] jogoFinal = new String[1][2];
        jogoFinal = montarJogos(jogoFinal, vencedoresSemi);

        int[][] resultadoFinal = new int[1][2];
        resultadoFinal = registrarPontuacao(jogoFinal, resultadoFinal);

        String[] vencedor = new String[1];
        vencedor = obterVencedores(jogoFinal, resultadoFinal);

        System.out.println(Arrays.toString(vencedor));

        scan.close();
    }

    public static String[][] montarJogos(String[][] jogos, String[] times) {
        int linhaMatriz = 0;

        for (int i = 0; i < times.length; i += 2) {
            jogos[linhaMatriz][0] = times[i];
            jogos[linhaMatriz][1] = times[i + 1];

            linhaMatriz++;
        }

        return jogos;
    }

    public static int[][] registrarPontuacao(String[][] jogos, int[][] resultado) {
        for (int i = 0; i < jogos.length; i++) {
            System.out.printf("Jogo %s \n", i + 1);
            System.out.println(jogos[i][0] + " x " + jogos[i][1]);

            System.out.printf("Total de pontos %s: ", jogos[i][0]);
            resultado[i][0] = scan.nextInt();
            scan.nextLine();

            System.out.printf("Total de pontos %s: ", jogos[i][1]);
            resultado[i][1] = scan.nextInt();
            scan.nextLine();

            System.out.println();
        }

        return resultado;
    }

    public static String[] obterVencedores(String[][] jogos, int[][] resultado) {
        String[] vencedores = new String[jogos.length];

        for (int i = 0; i < resultado.length; i++) {
            if (resultado[i][0] > resultado[i][1]) {
                vencedores[i] = jogos[i][0];
            } else {
                vencedores[i] = jogos[i][1];
            }
        }

        return vencedores;
    }
}

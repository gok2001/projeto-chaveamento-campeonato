package chaveamentoDev;

import java.util.Arrays;
import java.util.Scanner;

public class Logica {
    public static Scanner scan = new Scanner(System.in);
    
    public static String[] todosOsTimes = new String[8];
    
    
    public static String[][] jogosQuartas = new String[4][2];
    public static int[][] resultadoQuartas = new int[4][2];
    public static String[] vencedoresQuartas = new String[4];
    
    
    public static String[][] jogosSemi = new String[2][2];
    public static int[][] resultadoSemi = new int[2][2];
    public static String[] vencedoresSemi = new String[2];
    
    
    public static String[][] jogoFinal = new String[1][2];
    public static int[][] resultadoFinal = new int[1][2];
    
    
    public static String nomeCampeonato;

    public static void main(String[] args) {

        System.out.print("Digite o nome do campeonato: ");
        String nomeCampeonato = scan.nextLine();

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o nome de um time: ");
            todosOsTimes[i] = scan.nextLine();
        }

        System.out.println();
        
        jogosQuartas = montarJogos(jogosQuartas, todosOsTimes);
        
        resultadoQuartas = registrarPontuacao(jogosQuartas, resultadoQuartas);

        for (int i = 0; i < resultadoQuartas.length; i++) {
            if (resultadoQuartas[i][0] > resultadoQuartas[i][1]) {
                vencedoresQuartas[i] = jogosQuartas[i][0];
            } else {
                vencedoresQuartas[i] = jogosQuartas[i][1];
            }
        }

        
        jogosSemi = montarJogos(jogosSemi, vencedoresQuartas);

        resultadoSemi = registrarPontuacao(jogosSemi, resultadoSemi);

        for (int i = 0; i < resultadoSemi.length; i++) {
            if (resultadoSemi[i][0] > resultadoSemi[i][1]) {
                vencedoresSemi[i] = jogosSemi[i][0];
            } else {
                vencedoresSemi[i] = jogosSemi[i][1];
            }
        }

        
        jogoFinal = montarJogos(jogoFinal, vencedoresSemi);

        
        resultadoFinal = registrarPontuacao(jogoFinal, resultadoFinal);

        String vencedor;

        if (resultadoFinal[0][0] > resultadoFinal[0][1]) {
            vencedor = jogoFinal[0][0];
        } else {
            vencedor = jogoFinal[0][1];
        }

        System.out.println(vencedor);

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
    
    public static void registrarTime(String nome, int i) {
    	todosOsTimes[i] = nome;
    }
    
    public static String exibirTimes(){
    	String res = Arrays.toString(todosOsTimes);
    	return res;
    }
    
    public static void registrarNomeCamp(String nome) {
    	nomeCampeonato = nome;
    }
    
    public static String montarJogosQuartas(int i, int j) {
    	jogosQuartas = montarJogos(jogosQuartas, todosOsTimes);
    	String res = jogosQuartas[i][j];
    	
    	return res;
    }
    
    public static void registrarPontuacao(int j, int k, int ponto) {
    	resultadoQuartas[j][k] = ponto;  
    }
    
    public static String calcularPontuacao(int i) {
    	if (resultadoQuartas[i][0] > resultadoQuartas[i][1]) {
            vencedoresQuartas[i] = jogosQuartas[i][0];
        } else {
            vencedoresQuartas[i] = jogosQuartas[i][1];
        }
    	String res = vencedoresQuartas[i];
    	return res;
    }
    
    
    public static String montarJogosSemi(int i, int j) {
    	jogosSemi = montarJogos(jogosSemi, vencedoresQuartas);
    	String res = jogosSemi[i][j];
    	
    	return res;
    }
    
    
    public static void registrarPontuacaoSemi(int j, int k, int ponto) {
    	resultadoSemi[j][k] = ponto;  
    }
    
    public static String calcularPontuacaoSemi(int i) {
    	if (resultadoSemi[i][0] > resultadoSemi[i][1]) {
            vencedoresSemi[i] = jogosSemi[i][0];
        } else {
            vencedoresSemi[i] = jogosSemi[i][1];
        }
    	String res = vencedoresSemi[i];
    	return res;
    }
    
    public static String montarJogoFinal(int i, int j) {
    	jogoFinal = montarJogos(jogoFinal, vencedoresSemi);
    	String res = jogoFinal[i][j];
    	
    	return res;
    }
    
    public static void registrarPontuacaoFinal(int j, int k, int ponto) {
    	resultadoFinal[j][k] = ponto;  
    }
    
    public static String calcularPontuacaoFinal(int i) {
    	String vencedor;
    	if (resultadoFinal[i][0] > resultadoFinal[i][1]) {
             vencedor = jogoFinal[i][0];
        } else {
            vencedor = jogosSemi[i][1];
        }
    	return vencedor;
    }
}

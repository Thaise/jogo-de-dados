/**
*Jogo de dados
*/
import java.util.Scanner;
import java.util.Random;
public class JogoDeDados{
	
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o palpite? ");
		int palpite = entrada.nextInt();
		
		Random sorteiaValor = new Random();
		int valorDado = sorteiaValor.nextInt(6)+1;//se n�o fosse adicionado 1, ele verificaria s� de 0 a 5
		
		System.out.print(verificarPalpite(palpite, valorDado));
	}
	
	public static String verificarPalpite(int palpite, int valorDado){
		String resultado = "";
		if(palpite == valorDado){
			resultado = "Parab�ns! Voc� acertou! \nValor do dado = "+valorDado;
		}else{
			resultado = "Voc� errou...N�o foi dessa vez!\nValor do dado = "+valorDado;
		}
		return resultado;
	}

}
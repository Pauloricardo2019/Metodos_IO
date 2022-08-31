import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class TstMenu{

	public static void main(String arg[]){

//String frase = JOptionPane.showInputDialog(null, "Informe seu nominho", "Escreva", 1);
//System.out.println("\n A frase eh: "+frase);

		boolean vai = true;
		int val1 = 0, val2 = 0, opcao = 0;
		String result ="";

		//CAPUTRAR VALOR1
		result = entDados("\n Informe o valor1: ");
		val1 = Integer.parseInt(result);

		//CAPTURAR VALOR2
		result = entDados("\n Informe o valor2: ");
		val2 = Integer.parseInt(result);

		while(vai){

			System.out.println("\n ====== MENU ======");
			System.out.println("1) Somar");		
			System.out.println("2) Subtrair");		
			System.out.println("3) Dividir");		
			System.out.println("4) Multiplicar");	
			System.out.println("5) Sair");

			result = entDados("\n Escolha uma opcao: ");		
			opcao = Integer.parseInt(result);

			switch(opcao){

				case 1:{
					System.out.println("\nA soma eh: "+ somar(val1, val2));
					break;
				}
				case 2:{
					System.out.println("\nA subtrair eh: "+ subtrair(val1, val2));
					break;
				}
				case 3:{
					System.out.println("\nA divisao eh: "+ dividir(val1, val2));
					break;
				}
				case 4:{
					System.out.println("\nA multiplicar eh: "+ multiplicar(val1, val2));
					break;
				}
				case 5:{
					System.out.println("\nEscolheu SAIR");
					vai = false;
					//System.exit(0);
					break;
				}

				default:{
					System.out.println("\nO valor deve estar entre 1 e 5");
					break;
				}				

			}//fim switch
		
			
		}//fim do while
	
		
	}//fim do main
	
	public static int somar(int a, int b){
		return(a+b);
	}
	
	public static int subtrair(int a, int b){
		return (a-b);
	}
	
	public static int dividir(int a, int b){
		return (a/b);
	}
	
	public static int multiplicar(int a, int b){
		return (a*b);
	}
	
	public static String entDados(String rotulo){
		
			System.out.println(rotulo);			
			
			String resp = "";
			
			InputStreamReader teclado = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(teclado);

			try{
				resp = buff.readLine();
			}
			catch(IOException ioe){
				System.out.println("\nERRO");
			}
			return resp;
	}

	
}//fim da classe
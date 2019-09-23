package main;

import java.util.Scanner;

public class Trabalho1 {
	static String[][] A = new String[3][3];
	static int[][] B = new int[3][3];
	static double[][] C = new double[3][3];
	static double[][] D = new double[7][3];
	static Scanner scanner = new Scanner(System.in);
	
	public static void setBankData() {
		A[0][0] = "Tibúrcio";
		A[0][1] = "Ricardo";
		A[0][2] = "João";
		A[1][0] = "Felisbino";
		A[1][1] = "Seu Zé";
		A[1][2] = "Dona Maria";
		A[2][0] = "Gedonstrôncio";
		A[2][1] = "Batman";
		A[2][2] = "Homem de Ferro";
		
		B[0][0] = 111;
		B[0][1] = 222;
		B[0][2] = 333;
		B[1][0] = 444;
		B[1][1] = 555;
		B[1][2] = 666;
		B[2][0] = 777;
		B[2][1] = 888;
		B[2][2] = 999;
		
		C[0][0] = 0.0;
		C[0][1] = 0.0;
		C[0][2] = 0.0;
		C[1][0] = 0.0;
		C[1][1] = 0.0;
		C[1][2] = 0.0;
		C[2][0] = 0.0;
		C[2][1] = 0.0;
		C[2][2] = 0.0;
	}
	
	
	public static void main(String args[]){
		run_();
	}
	public static void run_() {
		setBankData();
		menu();
	}
	public static void menu() {
		boolean flag = true;
		while(flag == true ) {
			System.out.println("1.reception  2.payment  3.showBankData 4.mostRichAccount  5.orderedSalaries  6.SAIR" );
			System.out.println("Choose: ");
			int n = scanner.nextInt();
			switch(n) {
				case 1:
					reception();
					break;
			  	case 2:
			  		payment();
			  		break;
			  	case 3:
			  		showBankData();
			  		break;
			  	case 4:
			  		mostRichAccount();
			  		break;
			  	case 5:
			  		orderedSalaries();
			  		break;
			  	case 6:
					flag = false;
			  		break;	  
			}
		}
	}
	
	public static void reception() {
		System.out.println("Insira o numero da sua conta: ");
		int accountNumber = scanner.nextInt();  
		System.out.println("Insira o valor na qual será adicionado: ");
		int receivedValor = scanner.nextInt();  
		
		boolean flag = false;
		boolean notFound = false;
		for (int i = 0; i < B.length; i++) {
			if (flag == true) {
				break;
			}
			for (int i2 = 0; i2 < B.length; i2++) {
				if (B[i][i2] == accountNumber) {
					C[i][i2] += receivedValor;
					System.out.println(A[i][i2] + " seu saldo atual é de: " + C[i][i2]);
					flag = true;
					notFound = false;
					break;
				} else {
					notFound = true;
				}
			}
		}
		if (notFound == true) {
			System.out.println("Account NOT FOUND");
		}
	}
	public static void payment() {
		System.out.println("Insira o numero da sua conta: ");
		int accountNumber = scanner.nextInt();  
		System.out.println("Insira o valor do pagamento: ");
		int paymentValor = scanner.nextInt();  
		
		boolean flag = false;
		boolean notFound = false;
		for (int i = 0; i < B.length; i++) {
			if (flag == true) {
				break;
			}
			for (int i2 = 0; i2 < B.length; i2++) {
				if (B[i][i2] == accountNumber) {
					C[i][i2] -= paymentValor;
					System.out.println(A[i][i2] + " seu saldo atual é de: " + C[i][i2]);
					flag = true;
					notFound = false;
					break;
				} else {
					notFound = true;
				}
			}
		}
		if (notFound == true) {
			System.out.println("Account NOT FOUND");
		}
	}
	public static void showBankData() {
		System.out.println("--------------------------------------------------------------------------------------------");
		for (int i = 0; i < B.length; i++) {
			for (int i2 = 0; i2 < B.length; i2++) {
				System.out.print(A[i][i2] + "||||" + B[i][i2] + "||||" + C[i][i2] + "\n");
			}
		}
	}
	public static void mostRichAccount() {
		int a = 0;
		int b = 0;
		boolean flag = false;
		for (int i = 0; i < B.length; i++) {
			for (int i2 = 0; i2 < B.length; i2++) {
				if (C[a][b] < C[i][i2]) {
					a = i;
					b = i2;
					flag = true;
				}
				if (C[0][0] > C[i][i2]) {
					flag = true;
				}
			}
		}
		if (flag == true) {
			System.out.println("O correntista mais rico é: " + A[a][b] + "||||" + B[a][b] + "||||" + C[a][b]);
		} else {
			System.out.println("Existe mais de um correntista com o maior salario.");
		}
	}
	public static void orderedSalaries() {
		double[] vector = {C[0][0],C[0][1],C[0][2],C[1][0],C[1][1],C[1][2],C[2][0],C[2][1],C[2][2]};
		double aux = 0;
		for (int i = 0; i < vector.length; i++) {
             for (int j = 0; j < vector.length; j++) {
                 if (vector[i] < vector[j]) {
                     aux = vector[i];
                     vector[i] = vector[j];
                     vector[j] = aux;
                 }
             }
         }
		for (int k = 0; k < vector.length; k++) {
            System.out.print(vector[k] + "||||");                
        }
	}
}
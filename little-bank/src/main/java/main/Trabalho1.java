package main;

import java.util.Scanner;

public class Trabalho1 {
	static String[][] A = new String[3][3];
	static int[][] B = new int[3][3];
	static double[][] C = new double[3][3];
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
		reception();
	}
	
	public static void reception() {
		System.out.println("Insira o numero da conta na qual você ira tranferir: ");
		int accountNumber = scanner.nextInt();  
		System.out.println("Insira o valor na qual será transferido: ");
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
}
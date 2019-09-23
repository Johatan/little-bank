package main;

public class Trabalho1 {
	static String[][] A = new String[3][3];
	static int[][] B = new int[3][3];
	static double[][] C = new double[3][3];
	
	public static void setVariables() {
		A[0][0] = "Tibúrcio";
		A[0][1] = "Ricardo";
		A[0][2] = "João";
		A[1][0] = "Felisbino";
		A[1][1] = "Seu Zé";
		A[1][2] = "Dona Maria";
		A[2][0] = "Gedonstrôncio";
		A[2][1] = "Batman";
		A[2][2] = "Homem deFerro";
		
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
		setVariables();
	}
}
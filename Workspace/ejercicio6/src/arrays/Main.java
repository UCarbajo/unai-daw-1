package arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String[] mes = {"","Enero", "Febrero","Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Novimebre", "Diciembre" };
		int numeroMes = entrada.nextInt();
		
		System.out.println(mes[numeroMes]);
		}

	}


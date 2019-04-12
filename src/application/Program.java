package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entites.Desk;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <Desk>list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	
		
		for (int i=1; i<=n; i++) {
			
		System.out.println("Chamado Número:" + i+"#");
	    System.out.println();
	    System.out.print("cliente: ");
	    String cliente = sc.nextLine();
		System.out.print("Data: ");
		String data = sc.nextLine(); 
		System.out.print("Responsavel: ");
		String responsavel = sc.nextLine();
		
		System.out.println("Descrição:");
		String descricao = sc.nextLine();
		}
        	
		
		
		
	sc.close();	
	}
	
}

package Atividade2;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date data1  = new Date();
		Date data2 = new Date();
		data2.getTime();

		Produtos<Integer> p = new Produtos<>(1,2450.34,data1,data2);
		
		System.out.println(p.toString());
		
		Produtos<String> p2 = new Produtos<>("C123",2450.34,data1,data2);
		
		System.out.println(p2.toString());
	}

}

package desafiodiopoo.dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java Dio");
		curso1.setDescricao("DEscricao curso java");
		curso1.setCargahoraria(8);
		
		System.out.println(curso1);
		
		
		 Mentoria mentoria = new Mentoria();
		 
		 mentoria.setTitulo("mentoria Java");
		 mentoria.setDescricao("descricao mentoria java");
		 mentoria.setData(LocalDate.now());
		 
		 System.out.println(mentoria);
		 
	}

}

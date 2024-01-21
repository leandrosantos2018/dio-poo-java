package desafiodiopoo.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	public Mentoria(){
		
	}
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", Descricao=" + getDescricao() + ", data=" + data + ", getTitulo()="
				+ getTitulo() + ", getDescricao()=" + getDescricao() + ", getData()=" + getData() + "]";
	}


	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

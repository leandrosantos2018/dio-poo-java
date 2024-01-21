package desafiodiopoo.dominio;

public class Curso  extends Conteudo{
	
	  int cargahoraria;
	
	public Curso() {
		
	}
	
	public int getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargahoraria=" + cargahoraria
				+ ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao() + ", getCargahoraria()="
				+ getCargahoraria() + "]";
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	 
	

}

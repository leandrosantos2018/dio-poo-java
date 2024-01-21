package desafiodiopoo.dominio;

public abstract class Conteudo {
	
	public static final double XP_PADRAO =10; 

	private String titulo;
	private String Descricao;
	public abstract double calcularXp();
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
	
}

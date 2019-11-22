package modelo;


public class Filme {
	
	private Integer idFilme;
	private String titulo;
	private Integer anoLancamento;
	private Integer duracao;
	private String genero;
	
	public Filme();

	public filme (Integer idFilme, String titulo, Integer anoLancamento, Integer duracao, String genero) {
		this.idFilme = idFilme;
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.duracao = duracao;
		this.genero = genero;
	}
	
	public Integer getIdfilme() {
		return idFilme;
	}
	
	public void setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo (String titulo) {
		this.titulo = titulo;
	}
	
	public Integer getAnoLancamento() {
		return anoLancamento;
	}
	
	public void setAnoLancamento (Integer anoLacament0) {
		this.anoLancamento = anoLancamento;
	}
	
	public Integer getDuracao() {
		return duracao;
	}
	
	public void setDuracao (Integer Duracao) {
		this.duracao = duracao;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero (String genero) {
		this.genero = genero;
	}
	
	
}



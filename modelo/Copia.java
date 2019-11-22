package modelo;

public class Copia {

	private integer status;
	private String tipo;
	private BigDecimal valorDiaria;
	private Filme filme;
	
	public Copia();
	
	public Copia (integer status, String tipo, BigDecimal valorDiaria, Filme filme) {
		this.status = status;
		this.tipo = tipo;
		this.valorDiaria = valorDiaria;
		this.Filme = filme;
	}
	
	public integer getStatus() {
		return status;
	}
	public void setStatus ( int status) {
		this.status = status;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo( String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getValorDiaria() {
		return valorDiaria;
	}
	
	public void setValorDiaria (BidDecimal valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	public Filme getFilme() {
		return filme;
	}
	
	public void setFilme( Filme filme) {
		this.filme = filme;
	}
}

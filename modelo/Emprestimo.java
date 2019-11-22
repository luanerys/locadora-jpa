package modelo;

public class Emprestimo {
	
	private date dataLocacao;
	private date dataDevolucao;
	private BigDecimal valorAluguel;
	private boolean status;
	private Cliente cliente;
	private Filme filme;
	
	public Emprestimo();
	
	public Emprestimo (date dataLocacao, date dataDevolucao, BigDecimal valorAluguel, boolean status, Cliente cliente, Filme filme) {
		this.dataLocacao = dataLocacao;
		this.dataDevolucao = dataDevolucao;
		this.valorAluguel = valorAluguel;
		this.status = status;
		this.cliente = cliente;
		this.filme = filme;
	}
	
	public date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao( date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	
	public date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao( date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public BigDecimal getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel( BigDecimal valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus( boolean status) {
		this.status = status;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Filme getFilme() {
		return filme;
	}
	public void setFilme( Filme filme) {
		this.filme = filme;
		
	}
}

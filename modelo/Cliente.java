package modelo;

public class Cliente {
	
	private Integer idCliente;
	private String cpf;
	private String endereco;
	private String telefone;
	
	public Cliente ();
	
	public Cliente (Integer idCliente, String cpf, String endereco, String telefone) {
		this.idCliente = idCliente;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Integer getIdCliente() {
		return idCliente;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	
	
	
	

}

package entites;

import java.util.Date;

public class Desk {
	
	private String cliente;
	private Date data;
	private String responsavel;
	private String descricao;
	public Desk() {
		super();
	}

	public Desk(String cliente, Date data, String responsavel,String descricao) {
		super();
		this.cliente = cliente;
		this.data = data;
		this.responsavel = responsavel;
		this.descricao = descricao;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String Descricao) {
		this.descricao = descricao;
	}
	
	

}

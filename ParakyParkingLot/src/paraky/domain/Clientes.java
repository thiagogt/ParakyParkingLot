package paraky.domain;

import java.util.Date;

public class Clientes {
    private Integer idCliente;

	private String nome;

	private String sobrenome;

	private Boolean titularDaVaga;

	private Date aniversario;


	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Boolean getTitularDaVaga() {
		return titularDaVaga;
	}
	public void setTitularDaVaga(Boolean titularDaVaga) {
		this.titularDaVaga = titularDaVaga;
	}
	public Date getAniversario() {
		return aniversario;
	}
	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	

}
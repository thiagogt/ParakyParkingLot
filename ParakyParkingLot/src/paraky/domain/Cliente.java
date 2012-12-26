package paraky.domain;

import java.util.Date;

public class Cliente {
	Integer idCliente;
	String nome;
	String sobrenome;
	Boolean titularDaVaga;
	Date aniversario;
	Integer[] idCarro;
	
	public Cliente(){
		
	}
	public Cliente(String nome,	String sobrenome,	Boolean titularDaVaga,	Date aniversario, boolean temCarroParaCadastrar, Carros[] carros){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.titularDaVaga = titularDaVaga;
		this.aniversario = aniversario;
		int proximoId = ultimoClienteIdFromBD() + 1;
		idCliente = proximoId;
		
	}
	
	private void cadastraCarros(Carros[] carros) {
		// TODO Auto-generated method stub
		
	}
	private int ultimoClienteIdFromBD() {
		// TODO Auto-generated method stub
		return 0;
	}
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
	public Integer[] getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(Integer[] idCarro) {
		this.idCarro = idCarro;
	}
}

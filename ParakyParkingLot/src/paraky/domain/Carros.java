package paraky.domain;

public class Carros {
	Integer idCarro;
	
	String placa;
	String cor;
	String modelo;
	Integer ano;
	String marca;
	
	public Carros(){
		
	}
	public Carros(String placa,	String cor,	String modelo,	Integer ano,String marca){
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
		
		int proximoId = ultimoClienteIdFromBD() + 1;
		this.idCarro = proximoId;
	}
	
	private int ultimoClienteIdFromBD() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Integer getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(Integer idCarro) {
		this.idCarro = idCarro;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}

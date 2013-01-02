package paraky.bean;

import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;

import paraky.domain.Boletos;
import paraky.mapper.BoletosMapper;
import paraky.sqlFactory.SQLFactory;

@ManagedBean(name="boletos")
public class BoletosBean {
	ArrayList<Boletos> doDia;
	Integer idBoleto;
	
	
	public String gerarBoleto(Integer idBoleto){
		this.idBoleto = idBoleto;
		return "paginaDoBoleto.xhtml";
	}
	
	public ArrayList<Boletos> getDoDia() {
		BoletosMapper boletoMapper = SQLFactory.section.getMapper(BoletosMapper.class);
		Date data = new Date();
		
		ArrayList<Boletos> listaDeBoletos = new ArrayList<Boletos>(); 
		listaDeBoletos = boletoMapper.selectByPayDay(data);
		doDia = listaDeBoletos;
		return doDia;
	}

	public void setDoDia(ArrayList<Boletos> doDia) {
		this.doDia = doDia;
	}
	
	public Integer getIdBoleto() {
		return idBoleto;
	}

	public void setIdBoleto(Integer idBoleto) {
		this.idBoleto = idBoleto;
	}
	
}

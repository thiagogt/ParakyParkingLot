package paraky.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import paraky.domain.Boletos;
import paraky.mapper.BoletosMapper;
import paraky.sqlFactory.SQLFactory;

@ManagedBean(name="boletos")
public class BoletosBean {
	List<Boletos> doDia;
	Integer idBoleto;
	
	
	public String gerarBoleto(Integer idBoleto){
		this.idBoleto = idBoleto;
		return "paginaDoBoleto.xhtml";
	}
	
	public List<Boletos> getDoDia() {
		BoletosMapper boletoMapper = SQLFactory.section.getMapper(BoletosMapper.class);
		//Date data = new Date();
		//System.out.println("Essa eh a data: "+data);
		List<Boletos> listaDeBoletos = new ArrayList<Boletos>(); 
		//listaDeBoletos = boletoMapper.selectByPayDay(data);
		listaDeBoletos = boletoMapper.selectByExample(null);
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

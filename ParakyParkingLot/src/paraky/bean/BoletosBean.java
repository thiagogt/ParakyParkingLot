package paraky.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import paraky.domain.Boletos;
import paraky.domain.Cliente;
import paraky.domain.ClienteFamilia;
import paraky.domain.ClienteFamiliaExample;
import paraky.domain.Clientes;
import paraky.mapper.BoletosMapper;
import paraky.mapper.ClienteFamiliaMapper;
import paraky.mapper.ClientesMapper;
import paraky.sqlFactory.SQLFactory;

@ManagedBean(name="boletos")
public class BoletosBean {
	List<Boletos> doDia;
	Integer idBoleto;
	
	
	public String gerarBoleto(Integer idBoleto){
		this.idBoleto = idBoleto;
		return "paginaDoBoleto.xhtml";
	}
	public String idFamiliaParaNomeFamiliaConverter(Integer id){
		
		
		Clientes clienteTitular = new Clientes();
		
		ClienteFamiliaMapper cfMapper = SQLFactory.section.getMapper(ClienteFamiliaMapper.class);
		ClienteFamiliaExample example = new ClienteFamiliaExample();
		example.createCriteria().andFamiliaEqualTo(id);
		List<ClienteFamilia> clienteFamiliaLista = cfMapper.selectByExample(example);
		
		ClientesMapper cMapper = SQLFactory.section.getMapper(ClientesMapper.class);
		for (ClienteFamilia clienteFamilia : clienteFamiliaLista) {
			clienteTitular = cMapper.selectByPrimaryKey(clienteFamilia.getCliente());
			if(clienteTitular.getTitularDaVaga())
				return clienteTitular.getNome();
			
			
			 
		}
		
		return "Nome nao encontrado";
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

package paraky.test;

import java.util.ArrayList;
import java.sql.Date;

import org.junit.Test;

import paraky.domain.Boletos;
import paraky.mapper.BoletosMapper;
import paraky.sqlFactory.SQLFactory;

public class BoletosTeste {
	@Test
	public void TestaDoDia(){
		BoletosMapper boletoMapper = SQLFactory.section.getMapper(BoletosMapper.class);
		Date data = new Date(System.currentTimeMillis());
		
		ArrayList<Boletos> listaDeBoletos = new ArrayList<Boletos>(); 
		System.out.println("Essa eh a data de hoje: "+data);
		listaDeBoletos = boletoMapper.selectByPayDay(data);
		for (Boletos boletos : listaDeBoletos) {
			System.out.println(boletos.getIdFamilia());
		}
	}
	
}

package paraky.test;


import org.junit.Test;

import paraky.domain.Clientes;
import paraky.mapper.ClientesMapper;
import paraky.sqlFactory.SQLFactory;

public class BDtest {
	
	@Test
	public void testCatchBrothers() {
		
		ClientesMapper bookshelf = SQLFactory.section.getMapper(ClientesMapper.class);
		
		Clientes realBookShelf = new Clientes(); 
				realBookShelf = bookshelf.selectByPrimaryKey(1);
		
		System.out.println(realBookShelf.getNome());
		
		
		
		
	}
}

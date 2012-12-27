package paraky.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import paraky.domain.Clientes;
import paraky.domain.ClientesExample;

public interface ClientesMapper {
    int countByExample(ClientesExample example);

    int deleteByExample(ClientesExample example);

    int deleteByPrimaryKey(Integer idCliente);

    int insert(Clientes record);

    int insertSelective(Clientes record);

    List<Clientes> selectByExample(ClientesExample example);

    Clientes selectByPrimaryKey(Integer idCliente);

    int updateByExampleSelective(@Param("record") Clientes record, @Param("example") ClientesExample example);

    int updateByExample(@Param("record") Clientes record, @Param("example") ClientesExample example);

    int updateByPrimaryKeySelective(Clientes record);

    int updateByPrimaryKey(Clientes record);
}
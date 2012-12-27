package paraky.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import paraky.domain.ClienteFamilia;
import paraky.domain.ClienteFamiliaExample;

public interface ClienteFamiliaMapper {
    int countByExample(ClienteFamiliaExample example);

    int deleteByExample(ClienteFamiliaExample example);

    int deleteByPrimaryKey(Integer cliente);

    int insert(ClienteFamilia record);

    int insertSelective(ClienteFamilia record);

    List<ClienteFamilia> selectByExample(ClienteFamiliaExample example);

    ClienteFamilia selectByPrimaryKey(Integer cliente);

    int updateByExampleSelective(@Param("record") ClienteFamilia record, @Param("example") ClienteFamiliaExample example);

    int updateByExample(@Param("record") ClienteFamilia record, @Param("example") ClienteFamiliaExample example);

    int updateByPrimaryKeySelective(ClienteFamilia record);

    int updateByPrimaryKey(ClienteFamilia record);
}
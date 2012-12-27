package paraky.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import paraky.domain.ClienteCarro;
import paraky.domain.ClienteCarroExample;

public interface ClienteCarroMapper {
    int countByExample(ClienteCarroExample example);

    int deleteByExample(ClienteCarroExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClienteCarro record);

    int insertSelective(ClienteCarro record);

    List<ClienteCarro> selectByExample(ClienteCarroExample example);

    ClienteCarro selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClienteCarro record, @Param("example") ClienteCarroExample example);

    int updateByExample(@Param("record") ClienteCarro record, @Param("example") ClienteCarroExample example);

    int updateByPrimaryKeySelective(ClienteCarro record);

    int updateByPrimaryKey(ClienteCarro record);
}
package paraky.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import paraky.domain.Boletos;
import paraky.domain.BoletosExample;

public interface BoletosMapper {
    int countByExample(BoletosExample example);

    int deleteByExample(BoletosExample example);

    int deleteByPrimaryKey(Integer idBoleto);

    int insert(Boletos record);

    int insertSelective(Boletos record);

    List<Boletos> selectByExample(BoletosExample example);

    Boletos selectByPrimaryKey(Integer idBoleto);

    int updateByExampleSelective(@Param("record") Boletos record, @Param("example") BoletosExample example);

    int updateByExample(@Param("record") Boletos record, @Param("example") BoletosExample example);

    int updateByPrimaryKeySelective(Boletos record);

    int updateByPrimaryKey(Boletos record);
}
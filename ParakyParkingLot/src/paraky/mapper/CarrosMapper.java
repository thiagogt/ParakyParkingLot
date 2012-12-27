package paraky.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import paraky.domain.Carros;
import paraky.domain.CarrosExample;

public interface CarrosMapper {
    int countByExample(CarrosExample example);

    int deleteByExample(CarrosExample example);

    int deleteByPrimaryKey(Integer idCarro);

    int insert(Carros record);

    int insertSelective(Carros record);

    List<Carros> selectByExample(CarrosExample example);

    Carros selectByPrimaryKey(Integer idCarro);

    int updateByExampleSelective(@Param("record") Carros record, @Param("example") CarrosExample example);

    int updateByExample(@Param("record") Carros record, @Param("example") CarrosExample example);

    int updateByPrimaryKeySelective(Carros record);

    int updateByPrimaryKey(Carros record);
}
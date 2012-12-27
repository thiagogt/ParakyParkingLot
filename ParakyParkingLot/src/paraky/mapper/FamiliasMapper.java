package paraky.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import paraky.domain.Familias;
import paraky.domain.FamiliasExample;

public interface FamiliasMapper {
    int countByExample(FamiliasExample example);

    int deleteByExample(FamiliasExample example);

    int deleteByPrimaryKey(Integer idFamilia);

    int insert(Familias record);

    int insertSelective(Familias record);

    List<Familias> selectByExample(FamiliasExample example);

    Familias selectByPrimaryKey(Integer idFamilia);

    int updateByExampleSelective(@Param("record") Familias record, @Param("example") FamiliasExample example);

    int updateByExample(@Param("record") Familias record, @Param("example") FamiliasExample example);

    int updateByPrimaryKeySelective(Familias record);

    int updateByPrimaryKey(Familias record);
}
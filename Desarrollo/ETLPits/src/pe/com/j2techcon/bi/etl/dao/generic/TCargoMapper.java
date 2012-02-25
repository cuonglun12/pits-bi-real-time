package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TCargo;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoExample;

public interface TCargoMapper {
    int countByExample(TCargoExample example);

    int deleteByExample(TCargoExample example);

    int deleteByPrimaryKey(Integer cargId);

    int insert(TCargo record);

    int insertSelective(TCargo record);

    List<TCargo> selectByExample(TCargoExample example);

    TCargo selectByPrimaryKey(Integer cargId);

    int updateByExampleSelective(@Param("record") TCargo record, @Param("example") TCargoExample example);

    int updateByExample(@Param("record") TCargo record, @Param("example") TCargoExample example);

    int updateByPrimaryKeySelective(TCargo record);

    int updateByPrimaryKey(TCargo record);
}
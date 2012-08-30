package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TCargo;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoExample;

public interface TCargoMapper {
    int countByExample(TCargoExample example) throws Exception;

    int deleteByExample(TCargoExample example) throws Exception;

    int deleteByPrimaryKey(Integer cargId) throws Exception;

    int insert(TCargo record) throws Exception;

    int insertSelective(TCargo record) throws Exception;

    List<TCargo> selectByExample(TCargoExample example) throws Exception;

    TCargo selectByPrimaryKey(Integer cargId) throws Exception;

    int updateByExampleSelective(@Param("record") TCargo record, @Param("example") TCargoExample example) throws Exception;

    int updateByExample(@Param("record") TCargo record, @Param("example") TCargoExample example) throws Exception;

    int updateByPrimaryKeySelective(TCargo record) throws Exception;

    int updateByPrimaryKey(TCargo record) throws Exception;
}
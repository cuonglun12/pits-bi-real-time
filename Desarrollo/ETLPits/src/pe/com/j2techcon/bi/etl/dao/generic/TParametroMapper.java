package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;

public interface TParametroMapper {
    int countByExample(TParametroExample example) throws Exception;

    int deleteByExample(TParametroExample example) throws Exception;

    int deleteByPrimaryKey(Integer paramId) throws Exception;

    int insert(TParametro record) throws Exception;

    int insertSelective(TParametro record) throws Exception;

    List<TParametro> selectByExample(TParametroExample example) throws Exception;

    TParametro selectByPrimaryKey(Integer paramId) throws Exception;

    int updateByExampleSelective(@Param("record") TParametro record, @Param("example") TParametroExample example) throws Exception;

    int updateByExample(@Param("record") TParametro record, @Param("example") TParametroExample example) throws Exception;

    int updateByPrimaryKeySelective(TParametro record) throws Exception;

    int updateByPrimaryKey(TParametro record) throws Exception;
}
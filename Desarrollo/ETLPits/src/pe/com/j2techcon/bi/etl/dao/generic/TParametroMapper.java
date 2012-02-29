package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;

public interface TParametroMapper {
    int countByExample(TParametroExample example);

    int deleteByExample(TParametroExample example);

    int deleteByPrimaryKey(Integer paramId);

    int insert(TParametro record);

    int insertSelective(TParametro record);

    List<TParametro> selectByExample(TParametroExample example);

    TParametro selectByPrimaryKey(Integer paramId);

    int updateByExampleSelective(@Param("record") TParametro record, @Param("example") TParametroExample example);

    int updateByExample(@Param("record") TParametro record, @Param("example") TParametroExample example);

    int updateByPrimaryKeySelective(TParametro record);

    int updateByPrimaryKey(TParametro record);
}
package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacion;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacionExample;

public interface TCotizacionMapper {
    int countByExample(TCotizacionExample example);

    int deleteByExample(TCotizacionExample example);

    int deleteByPrimaryKey(Integer cotiId);

    int insert(TCotizacion record);

    int insertSelective(TCotizacion record);

    List<TCotizacion> selectByExample(TCotizacionExample example);

    TCotizacion selectByPrimaryKey(Integer cotiId);

    int updateByExampleSelective(@Param("record") TCotizacion record, @Param("example") TCotizacionExample example);

    int updateByExample(@Param("record") TCotizacion record, @Param("example") TCotizacionExample example);

    int updateByPrimaryKeySelective(TCotizacion record);

    int updateByPrimaryKey(TCotizacion record);
}
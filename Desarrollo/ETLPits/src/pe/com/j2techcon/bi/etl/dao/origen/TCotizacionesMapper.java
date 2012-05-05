package pe.com.j2techcon.bi.etl.dao.origen;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.TCotizaciones;
import pe.com.j2techcon.bi.etl.domain.origen.TCotizacionesExample;

public interface TCotizacionesMapper {
    int countByExample(TCotizacionesExample example);

    int deleteByExample(TCotizacionesExample example);

    int deleteByPrimaryKey(@Param("coserie") String coserie, @Param("conumero") BigDecimal conumero);

    int insert(TCotizaciones record);

    int insertSelective(TCotizaciones record);

    List<TCotizaciones> selectByExample(TCotizacionesExample example);

    TCotizaciones selectByPrimaryKey(@Param("coserie") String coserie, @Param("conumero") BigDecimal conumero);

    int updateByExampleSelective(@Param("record") TCotizaciones record, @Param("example") TCotizacionesExample example);

    int updateByExample(@Param("record") TCotizaciones record, @Param("example") TCotizacionesExample example);

    int updateByPrimaryKeySelective(TCotizaciones record);

    int updateByPrimaryKey(TCotizaciones record);
}
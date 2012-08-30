package pe.com.j2techcon.bi.etl.dao.origen;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.TCotizaciones;
import pe.com.j2techcon.bi.etl.domain.origen.TCotizacionesExample;

public interface TCotizacionesMapper {
    int countByExample(TCotizacionesExample example) throws Exception;

    int deleteByExample(TCotizacionesExample example) throws Exception;

    int deleteByPrimaryKey(@Param("coserie") String coserie, @Param("conumero") BigDecimal conumero) throws Exception;

    int insert(TCotizaciones record) throws Exception;

    int insertSelective(TCotizaciones record) throws Exception;

    List<TCotizaciones> selectByExample(TCotizacionesExample example) throws Exception;

    TCotizaciones selectByPrimaryKey(@Param("coserie") String coserie, @Param("conumero") BigDecimal conumero) throws Exception;

    int updateByExampleSelective(@Param("record") TCotizaciones record, @Param("example") TCotizacionesExample example) throws Exception;

    int updateByExample(@Param("record") TCotizaciones record, @Param("example") TCotizacionesExample example) throws Exception;

    int updateByPrimaryKeySelective(TCotizaciones record) throws Exception;

    int updateByPrimaryKey(TCotizaciones record) throws Exception;
}
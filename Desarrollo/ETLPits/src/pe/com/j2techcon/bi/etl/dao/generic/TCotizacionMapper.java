package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacion;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacionExample;

public interface TCotizacionMapper {
    int countByExample(TCotizacionExample example) throws Exception;

    int deleteByExample(TCotizacionExample example) throws Exception;

    int deleteByPrimaryKey(Integer cotiId) throws Exception;

    int insert(TCotizacion record) throws Exception;

    int insertSelective(TCotizacion record) throws Exception;

    List<TCotizacion> selectByExample(TCotizacionExample example) throws Exception;

    TCotizacion selectByPrimaryKey(Integer cotiId) throws Exception;

    int updateByExampleSelective(@Param("record") TCotizacion record, @Param("example") TCotizacionExample example) throws Exception;

    int updateByExample(@Param("record") TCotizacion record, @Param("example") TCotizacionExample example) throws Exception;

    int updateByPrimaryKeySelective(TCotizacion record) throws Exception;

    int updateByPrimaryKey(TCotizacion record) throws Exception;
}
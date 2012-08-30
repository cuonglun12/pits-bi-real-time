package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacion;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacionExample;

public interface FactCotizacionMapper {
    int countByExample(FactCotizacionExample example) throws Exception;

    int deleteByExample(FactCotizacionExample example) throws Exception;

    int deleteByPrimaryKey(Integer cotizacionKey) throws Exception;

    int insert(FactCotizacion record) throws Exception;

    int insertSelective(FactCotizacion record) throws Exception;

    List<FactCotizacion> selectByExample(FactCotizacionExample example) throws Exception;

    FactCotizacion selectByPrimaryKey(Integer cotizacionKey) throws Exception;

    int updateByExampleSelective(@Param("record") FactCotizacion record, @Param("example") FactCotizacionExample example) throws Exception;

    int updateByExample(@Param("record") FactCotizacion record, @Param("example") FactCotizacionExample example) throws Exception;

    int updateByPrimaryKeySelective(FactCotizacion record) throws Exception;

    int updateByPrimaryKey(FactCotizacion record) throws Exception;
}
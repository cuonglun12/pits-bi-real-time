package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacion;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacionExample;

public interface FactCotizacionMapper {
    int countByExample(FactCotizacionExample example);

    int deleteByExample(FactCotizacionExample example);

    int deleteByPrimaryKey(Integer cotizacionKey);

    int insert(FactCotizacion record);

    int insertSelective(FactCotizacion record);

    List<FactCotizacion> selectByExample(FactCotizacionExample example);

    FactCotizacion selectByPrimaryKey(Integer cotizacionKey);

    int updateByExampleSelective(@Param("record") FactCotizacion record, @Param("example") FactCotizacionExample example);

    int updateByExample(@Param("record") FactCotizacion record, @Param("example") FactCotizacionExample example);

    int updateByPrimaryKeySelective(FactCotizacion record);

    int updateByPrimaryKey(FactCotizacion record);
}
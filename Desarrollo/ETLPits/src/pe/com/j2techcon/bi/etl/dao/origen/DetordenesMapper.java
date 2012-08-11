package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Detordenes;
import pe.com.j2techcon.bi.etl.domain.origen.DetordenesExample;

public interface DetordenesMapper {
    int countByExample(DetordenesExample example);

    int deleteByExample(DetordenesExample example);

    int deleteByPrimaryKey(@Param("serie") String serie, @Param("orden") String orden, @Param("correlativo") String correlativo, @Param("tipoingreso") String tipoingreso, @Param("userDigitacion") String userDigitacion);

    int insert(Detordenes record);

    int insertSelective(Detordenes record);

    List<Detordenes> selectByExample(DetordenesExample example);

    Detordenes selectByPrimaryKey(@Param("serie") String serie, @Param("orden") String orden, @Param("correlativo") String correlativo, @Param("tipoingreso") String tipoingreso, @Param("userDigitacion") String userDigitacion);

    int updateByExampleSelective(@Param("record") Detordenes record, @Param("example") DetordenesExample example);

    int updateByExample(@Param("record") Detordenes record, @Param("example") DetordenesExample example);

    int updateByPrimaryKeySelective(Detordenes record);

    int updateByPrimaryKey(Detordenes record);
}
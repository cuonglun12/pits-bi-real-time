package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Detordenes;
import pe.com.j2techcon.bi.etl.domain.origen.DetordenesExample;

public interface DetordenesMapper {
    int countByExample(DetordenesExample example) throws Exception;

    int deleteByExample(DetordenesExample example) throws Exception;

    int deleteByPrimaryKey(@Param("serie") String serie, @Param("orden") String orden, @Param("correlativo") String correlativo, @Param("tipoingreso") String tipoingreso, @Param("userDigitacion") String userDigitacion) throws Exception;

    int insert(Detordenes record) throws Exception;

    int insertSelective(Detordenes record) throws Exception;

    List<Detordenes> selectByExample(DetordenesExample example) throws Exception;

    Detordenes selectByPrimaryKey(@Param("serie") String serie, @Param("orden") String orden, @Param("correlativo") String correlativo, @Param("tipoingreso") String tipoingreso, @Param("userDigitacion") String userDigitacion) throws Exception;

    int updateByExampleSelective(@Param("record") Detordenes record, @Param("example") DetordenesExample example) throws Exception;

    int updateByExample(@Param("record") Detordenes record, @Param("example") DetordenesExample example) throws Exception;

    int updateByPrimaryKeySelective(Detordenes record) throws Exception;

    int updateByPrimaryKey(Detordenes record) throws Exception;
}
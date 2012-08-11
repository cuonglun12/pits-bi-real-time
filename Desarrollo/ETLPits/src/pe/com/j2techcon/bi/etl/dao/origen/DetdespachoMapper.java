package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Detdespacho;
import pe.com.j2techcon.bi.etl.domain.origen.DetdespachoExample;

public interface DetdespachoMapper {
    int countByExample(DetdespachoExample example);

    int deleteByExample(DetdespachoExample example);

    int deleteByPrimaryKey(@Param("serieguia") String serieguia, @Param("nroguia") String nroguia, @Param("serie") String serie, @Param("orden") String orden, @Param("correlativo") String correlativo);

    int insert(Detdespacho record);

    int insertSelective(Detdespacho record);

    List<Detdespacho> selectByExample(DetdespachoExample example);

    Detdespacho selectByPrimaryKey(@Param("serieguia") String serieguia, @Param("nroguia") String nroguia, @Param("serie") String serie, @Param("orden") String orden, @Param("correlativo") String correlativo);

    int updateByExampleSelective(@Param("record") Detdespacho record, @Param("example") DetdespachoExample example);

    int updateByExample(@Param("record") Detdespacho record, @Param("example") DetdespachoExample example);

    int updateByPrimaryKeySelective(Detdespacho record);

    int updateByPrimaryKey(Detdespacho record);
}
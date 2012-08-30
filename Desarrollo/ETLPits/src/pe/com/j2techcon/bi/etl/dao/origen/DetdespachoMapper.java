package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Detdespacho;
import pe.com.j2techcon.bi.etl.domain.origen.DetdespachoExample;

public interface DetdespachoMapper {
    int countByExample(DetdespachoExample example) throws Exception;

    int deleteByExample(DetdespachoExample example) throws Exception;

    int deleteByPrimaryKey(@Param("serieguia") String serieguia, @Param("nroguia") String nroguia, @Param("serie") String serie, @Param("orden") String orden, @Param("correlativo") String correlativo) throws Exception;

    int insert(Detdespacho record) throws Exception;

    int insertSelective(Detdespacho record) throws Exception;

    List<Detdespacho> selectByExample(DetdespachoExample example) throws Exception;

    Detdespacho selectByPrimaryKey(@Param("serieguia") String serieguia, @Param("nroguia") String nroguia, @Param("serie") String serie, @Param("orden") String orden, @Param("correlativo") String correlativo) throws Exception;

    int updateByExampleSelective(@Param("record") Detdespacho record, @Param("example") DetdespachoExample example) throws Exception;

    int updateByExample(@Param("record") Detdespacho record, @Param("example") DetdespachoExample example) throws Exception;

    int updateByPrimaryKeySelective(Detdespacho record) throws Exception;

    int updateByPrimaryKey(Detdespacho record) throws Exception;
}
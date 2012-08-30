package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Despacho;
import pe.com.j2techcon.bi.etl.domain.origen.DespachoExample;

public interface DespachoMapper {
    int countByExample(DespachoExample example) throws Exception;

    int deleteByExample(DespachoExample example) throws Exception;

    int deleteByPrimaryKey(@Param("serieguia") String serieguia, @Param("nroguia") String nroguia) throws Exception;

    int insert(Despacho record) throws Exception;

    int insertSelective(Despacho record) throws Exception;

    List<Despacho> selectByExample(DespachoExample example) throws Exception;

    Despacho selectByPrimaryKey(@Param("serieguia") String serieguia, @Param("nroguia") String nroguia) throws Exception;

    int updateByExampleSelective(@Param("record") Despacho record, @Param("example") DespachoExample example) throws Exception;

    int updateByExample(@Param("record") Despacho record, @Param("example") DespachoExample example) throws Exception;

    int updateByPrimaryKeySelective(Despacho record) throws Exception;

    int updateByPrimaryKey(Despacho record) throws Exception;
}
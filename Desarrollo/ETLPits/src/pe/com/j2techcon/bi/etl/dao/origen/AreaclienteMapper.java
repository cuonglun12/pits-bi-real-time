package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Areacliente;
import pe.com.j2techcon.bi.etl.domain.origen.AreaclienteExample;

public interface AreaclienteMapper {
    int countByExample(AreaclienteExample example) throws Exception;

    int deleteByExample(AreaclienteExample example) throws Exception;

    int deleteByPrimaryKey(@Param("codareacliente") String codareacliente, @Param("codcliente") String codcliente) throws Exception;

    int insert(Areacliente record) throws Exception;

    int insertSelective(Areacliente record) throws Exception;

    List<Areacliente> selectByExample(AreaclienteExample example) throws Exception;

    Areacliente selectByPrimaryKey(@Param("codareacliente") String codareacliente, @Param("codcliente") String codcliente) throws Exception;

    int updateByExampleSelective(@Param("record") Areacliente record, @Param("example") AreaclienteExample example) throws Exception;

    int updateByExample(@Param("record") Areacliente record, @Param("example") AreaclienteExample example) throws Exception;

    int updateByPrimaryKeySelective(Areacliente record) throws Exception;

    int updateByPrimaryKey(Areacliente record) throws Exception;
}
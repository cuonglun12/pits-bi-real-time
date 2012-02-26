package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Areacliente;
import pe.com.j2techcon.bi.etl.domain.origen.AreaclienteExample;

public interface AreaclienteMapper {
    int countByExample(AreaclienteExample example);

    int deleteByExample(AreaclienteExample example);

    int deleteByPrimaryKey(@Param("codareacliente") String codareacliente, @Param("codcliente") String codcliente);

    int insert(Areacliente record);

    int insertSelective(Areacliente record);

    List<Areacliente> selectByExample(AreaclienteExample example);

    Areacliente selectByPrimaryKey(@Param("codareacliente") String codareacliente, @Param("codcliente") String codcliente);

    int updateByExampleSelective(@Param("record") Areacliente record, @Param("example") AreaclienteExample example);

    int updateByExample(@Param("record") Areacliente record, @Param("example") AreaclienteExample example);

    int updateByPrimaryKeySelective(Areacliente record);

    int updateByPrimaryKey(Areacliente record);
}
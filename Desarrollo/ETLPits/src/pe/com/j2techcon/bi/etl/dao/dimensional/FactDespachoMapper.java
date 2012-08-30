package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactDespacho;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactDespachoExample;

public interface FactDespachoMapper {
    int countByExample(FactDespachoExample example) throws Exception;

    int deleteByExample(FactDespachoExample example) throws Exception;

    int deleteByPrimaryKey(Integer despachoKey) throws Exception;

    int insert(FactDespacho record) throws Exception;

    int insertSelective(FactDespacho record) throws Exception;

    List<FactDespacho> selectByExample(FactDespachoExample example) throws Exception;

    FactDespacho selectByPrimaryKey(Integer despachoKey) throws Exception;

    int updateByExampleSelective(@Param("record") FactDespacho record, @Param("example") FactDespachoExample example) throws Exception;

    int updateByExample(@Param("record") FactDespacho record, @Param("example") FactDespachoExample example) throws Exception;

    int updateByPrimaryKeySelective(FactDespacho record) throws Exception;

    int updateByPrimaryKey(FactDespacho record) throws Exception;
}
package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactDespacho;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactDespachoExample;

public interface FactDespachoMapper {
    int countByExample(FactDespachoExample example);

    int deleteByExample(FactDespachoExample example);

    int deleteByPrimaryKey(Integer despachoKey);

    int insert(FactDespacho record);

    int insertSelective(FactDespacho record);

    List<FactDespacho> selectByExample(FactDespachoExample example);

    FactDespacho selectByPrimaryKey(Integer despachoKey);

    int updateByExampleSelective(@Param("record") FactDespacho record, @Param("example") FactDespachoExample example);

    int updateByExample(@Param("record") FactDespacho record, @Param("example") FactDespachoExample example);

    int updateByPrimaryKeySelective(FactDespacho record);

    int updateByPrimaryKey(FactDespacho record);
}
package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactOrden;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactOrdenExample;

public interface FactOrdenMapper {
    int countByExample(FactOrdenExample example);

    int deleteByExample(FactOrdenExample example);

    int deleteByPrimaryKey(Integer ordenKey);

    int insert(FactOrden record);

    int insertSelective(FactOrden record);

    List<FactOrden> selectByExample(FactOrdenExample example);

    FactOrden selectByPrimaryKey(Integer ordenKey);

    int updateByExampleSelective(@Param("record") FactOrden record, @Param("example") FactOrdenExample example);

    int updateByExample(@Param("record") FactOrden record, @Param("example") FactOrdenExample example);

    int updateByPrimaryKeySelective(FactOrden record);

    int updateByPrimaryKey(FactOrden record);
}
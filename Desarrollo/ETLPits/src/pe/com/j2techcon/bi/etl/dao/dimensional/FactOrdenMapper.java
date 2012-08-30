package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactOrden;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactOrdenExample;

public interface FactOrdenMapper {
    int countByExample(FactOrdenExample example) throws Exception;

    int deleteByExample(FactOrdenExample example) throws Exception;

    int deleteByPrimaryKey(Integer ordenKey) throws Exception;

    int insert(FactOrden record) throws Exception;

    int insertSelective(FactOrden record) throws Exception;

    List<FactOrden> selectByExample(FactOrdenExample example) throws Exception;

    FactOrden selectByPrimaryKey(Integer ordenKey) throws Exception;

    int updateByExampleSelective(@Param("record") FactOrden record, @Param("example") FactOrdenExample example) throws Exception;

    int updateByExample(@Param("record") FactOrden record, @Param("example") FactOrdenExample example) throws Exception;

    int updateByPrimaryKeySelective(FactOrden record) throws Exception;

    int updateByPrimaryKey(FactOrden record) throws Exception;
}
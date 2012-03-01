package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaClienteExample;

public interface TAreaClienteMapper {
    int countByExample(TAreaClienteExample example);

    int deleteByExample(TAreaClienteExample example);

    int deleteByPrimaryKey(Integer areCliId);

    int insert(TAreaCliente record);

    int insertSelective(TAreaCliente record);

    List<TAreaCliente> selectByExample(TAreaClienteExample example);

    TAreaCliente selectByPrimaryKey(Integer areCliId);

    int updateByExampleSelective(@Param("record") TAreaCliente record, @Param("example") TAreaClienteExample example);

    int updateByExample(@Param("record") TAreaCliente record, @Param("example") TAreaClienteExample example);

    int updateByPrimaryKeySelective(TAreaCliente record);

    int updateByPrimaryKey(TAreaCliente record);
}
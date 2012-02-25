package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimCliente;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimClienteExample;

public interface DimClienteMapper {
    int countByExample(DimClienteExample example);

    int deleteByExample(DimClienteExample example);

    int deleteByPrimaryKey(Integer clienteKey);

    int insert(DimCliente record);

    int insertSelective(DimCliente record);

    List<DimCliente> selectByExample(DimClienteExample example);

    DimCliente selectByPrimaryKey(Integer clienteKey);

    int updateByExampleSelective(@Param("record") DimCliente record, @Param("example") DimClienteExample example);

    int updateByExample(@Param("record") DimCliente record, @Param("example") DimClienteExample example);

    int updateByPrimaryKeySelective(DimCliente record);

    int updateByPrimaryKey(DimCliente record);
}
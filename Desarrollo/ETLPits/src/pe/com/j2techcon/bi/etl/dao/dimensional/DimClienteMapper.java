package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimCliente;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimClienteExample;

public interface DimClienteMapper {
    int countByExample(DimClienteExample example) throws Exception;

    int deleteByExample(DimClienteExample example) throws Exception;

    int deleteByPrimaryKey(Integer clienteKey) throws Exception;

    int insert(DimCliente record) throws Exception;

    int insertSelective(DimCliente record) throws Exception;

    List<DimCliente> selectByExample(DimClienteExample example) throws Exception;

    DimCliente selectByPrimaryKey(Integer clienteKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimCliente record, @Param("example") DimClienteExample example) throws Exception;

    int updateByExample(@Param("record") DimCliente record, @Param("example") DimClienteExample example) throws Exception;

    int updateByPrimaryKeySelective(DimCliente record) throws Exception;

    int updateByPrimaryKey(DimCliente record) throws Exception;
}
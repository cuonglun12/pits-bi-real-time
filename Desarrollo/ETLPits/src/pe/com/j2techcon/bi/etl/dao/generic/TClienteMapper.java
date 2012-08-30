package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TClienteExample;

public interface TClienteMapper {
    int countByExample(TClienteExample example) throws Exception;

    int deleteByExample(TClienteExample example) throws Exception;

    int deleteByPrimaryKey(Integer cliId) throws Exception;

    int insert(TCliente record) throws Exception;

    int insertSelective(TCliente record) throws Exception;

    List<TCliente> selectByExample(TClienteExample example) throws Exception;

    TCliente selectByPrimaryKey(Integer cliId) throws Exception;

    int updateByExampleSelective(@Param("record") TCliente record, @Param("example") TClienteExample example) throws Exception;

    int updateByExample(@Param("record") TCliente record, @Param("example") TClienteExample example) throws Exception;

    int updateByPrimaryKeySelective(TCliente record) throws Exception;

    int updateByPrimaryKey(TCliente record) throws Exception;
}
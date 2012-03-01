package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TClienteExample;

public interface TClienteMapper {
    int countByExample(TClienteExample example);

    int deleteByExample(TClienteExample example);

    int deleteByPrimaryKey(Integer cliId);

    int insert(TCliente record);

    int insertSelective(TCliente record);

    List<TCliente> selectByExample(TClienteExample example);

    TCliente selectByPrimaryKey(Integer cliId);

    int updateByExampleSelective(@Param("record") TCliente record, @Param("example") TClienteExample example);

    int updateByExample(@Param("record") TCliente record, @Param("example") TClienteExample example);

    int updateByPrimaryKeySelective(TCliente record);

    int updateByPrimaryKey(TCliente record);
}
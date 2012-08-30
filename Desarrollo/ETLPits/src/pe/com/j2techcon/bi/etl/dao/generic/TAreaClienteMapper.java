package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaClienteExample;

public interface TAreaClienteMapper {
    int countByExample(TAreaClienteExample example) throws Exception;

    int deleteByExample(TAreaClienteExample example) throws Exception;

    int deleteByPrimaryKey(Integer areCliId) throws Exception;

    int insert(TAreaCliente record) throws Exception;

    int insertSelective(TAreaCliente record) throws Exception;

    List<TAreaCliente> selectByExample(TAreaClienteExample example) throws Exception;

    TAreaCliente selectByPrimaryKey(Integer areCliId) throws Exception;

    int updateByExampleSelective(@Param("record") TAreaCliente record, @Param("example") TAreaClienteExample example) throws Exception;

    int updateByExample(@Param("record") TAreaCliente record, @Param("example") TAreaClienteExample example) throws Exception;

    int updateByPrimaryKeySelective(TAreaCliente record) throws Exception;

    int updateByPrimaryKey(TAreaCliente record) throws Exception;
}
package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Cliente;
import pe.com.j2techcon.bi.etl.domain.origen.ClienteExample;

public interface ClienteMapper {
    int countByExample(ClienteExample example) throws Exception;

    int deleteByExample(ClienteExample example) throws Exception;

    int deleteByPrimaryKey(String codcliente) throws Exception;

    int insert(Cliente record) throws Exception;

    int insertSelective(Cliente record) throws Exception;

    List<Cliente> selectByExample(ClienteExample example) throws Exception;

    Cliente selectByPrimaryKey(String codcliente) throws Exception;

    int updateByExampleSelective(@Param("record") Cliente record, @Param("example") ClienteExample example) throws Exception;

    int updateByExample(@Param("record") Cliente record, @Param("example") ClienteExample example) throws Exception;

    int updateByPrimaryKeySelective(Cliente record) throws Exception;

    int updateByPrimaryKey(Cliente record) throws Exception;
}
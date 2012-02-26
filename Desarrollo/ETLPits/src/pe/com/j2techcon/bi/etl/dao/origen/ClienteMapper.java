package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Cliente;
import pe.com.j2techcon.bi.etl.domain.origen.ClienteExample;

public interface ClienteMapper {
    int countByExample(ClienteExample example);

    int deleteByExample(ClienteExample example);

    int deleteByPrimaryKey(String codcliente);

    int insert(Cliente record);

    int insertSelective(Cliente record);

    List<Cliente> selectByExample(ClienteExample example);

    Cliente selectByPrimaryKey(String codcliente);

    int updateByExampleSelective(@Param("record") Cliente record, @Param("example") ClienteExample example);

    int updateByExample(@Param("record") Cliente record, @Param("example") ClienteExample example);

    int updateByPrimaryKeySelective(Cliente record);

    int updateByPrimaryKey(Cliente record);
}
package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactEnvio;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactEnvioExample;

public interface FactEnvioMapper {
    int countByExample(FactEnvioExample example) throws Exception;

    int deleteByExample(FactEnvioExample example) throws Exception;

    int deleteByPrimaryKey(Integer envioKey) throws Exception;

    int insert(FactEnvio record) throws Exception;

    int insertSelective(FactEnvio record) throws Exception;

    List<FactEnvio> selectByExample(FactEnvioExample example) throws Exception;

    FactEnvio selectByPrimaryKey(Integer envioKey) throws Exception;

    int updateByExampleSelective(@Param("record") FactEnvio record, @Param("example") FactEnvioExample example) throws Exception;

    int updateByExample(@Param("record") FactEnvio record, @Param("example") FactEnvioExample example) throws Exception;

    int updateByPrimaryKeySelective(FactEnvio record) throws Exception;

    int updateByPrimaryKey(FactEnvio record) throws Exception;
}
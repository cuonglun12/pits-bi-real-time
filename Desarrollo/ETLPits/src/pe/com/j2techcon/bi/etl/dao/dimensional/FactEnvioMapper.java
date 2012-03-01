package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactEnvio;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactEnvioExample;

public interface FactEnvioMapper {
    int countByExample(FactEnvioExample example);

    int deleteByExample(FactEnvioExample example);

    int insert(FactEnvio record);

    int insertSelective(FactEnvio record);

    List<FactEnvio> selectByExample(FactEnvioExample example);

    int updateByExampleSelective(@Param("record") FactEnvio record, @Param("example") FactEnvioExample example);

    int updateByExample(@Param("record") FactEnvio record, @Param("example") FactEnvioExample example);
}
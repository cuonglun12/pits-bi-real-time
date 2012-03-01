package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Sedesprov;
import pe.com.j2techcon.bi.etl.domain.origen.SedesprovExample;

public interface SedesprovMapper {
    int countByExample(SedesprovExample example);

    int deleteByExample(SedesprovExample example);

    int insert(Sedesprov record);

    int insertSelective(Sedesprov record);

    List<Sedesprov> selectByExample(SedesprovExample example);

    int updateByExampleSelective(@Param("record") Sedesprov record, @Param("example") SedesprovExample example);

    int updateByExample(@Param("record") Sedesprov record, @Param("example") SedesprovExample example);
}
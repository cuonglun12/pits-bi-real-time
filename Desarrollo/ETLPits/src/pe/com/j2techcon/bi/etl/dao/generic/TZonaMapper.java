package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TZona;
import pe.com.j2techcon.bi.etl.domain.generic.TZonaExample;

public interface TZonaMapper {
    int countByExample(TZonaExample example);

    int deleteByExample(TZonaExample example);

    int deleteByPrimaryKey(Integer zonId);

    int insert(TZona record);

    int insertSelective(TZona record);

    List<TZona> selectByExample(TZonaExample example);

    TZona selectByPrimaryKey(Integer zonId);

    int updateByExampleSelective(@Param("record") TZona record, @Param("example") TZonaExample example);

    int updateByExample(@Param("record") TZona record, @Param("example") TZonaExample example);

    int updateByPrimaryKeySelective(TZona record);

    int updateByPrimaryKey(TZona record);
}
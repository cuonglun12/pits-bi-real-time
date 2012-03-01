package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TServicio;
import pe.com.j2techcon.bi.etl.domain.generic.TServicioExample;

public interface TServicioMapper {
    int countByExample(TServicioExample example);

    int deleteByExample(TServicioExample example);

    int deleteByPrimaryKey(Integer servId);

    int insert(TServicio record);

    int insertSelective(TServicio record);

    List<TServicio> selectByExample(TServicioExample example);

    TServicio selectByPrimaryKey(Integer servId);

    int updateByExampleSelective(@Param("record") TServicio record, @Param("example") TServicioExample example);

    int updateByExample(@Param("record") TServicio record, @Param("example") TServicioExample example);

    int updateByPrimaryKeySelective(TServicio record);

    int updateByPrimaryKey(TServicio record);
}
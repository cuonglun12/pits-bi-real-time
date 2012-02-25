package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempo;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempoExample;

public interface DimTiempoMapper {
    int countByExample(DimTiempoExample example);

    int deleteByExample(DimTiempoExample example);

    int deleteByPrimaryKey(Integer tiempoKey);

    int insert(DimTiempo record);

    int insertSelective(DimTiempo record);

    List<DimTiempo> selectByExample(DimTiempoExample example);

    DimTiempo selectByPrimaryKey(Integer tiempoKey);

    int updateByExampleSelective(@Param("record") DimTiempo record, @Param("example") DimTiempoExample example);

    int updateByExample(@Param("record") DimTiempo record, @Param("example") DimTiempoExample example);

    int updateByPrimaryKeySelective(DimTiempo record);

    int updateByPrimaryKey(DimTiempo record);
}
package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimZona;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimZonaExample;

public interface DimZonaMapper {
    int countByExample(DimZonaExample example);

    int deleteByExample(DimZonaExample example);

    int deleteByPrimaryKey(Integer zonaKey);

    int insert(DimZona record);

    int insertSelective(DimZona record);

    List<DimZona> selectByExample(DimZonaExample example);

    DimZona selectByPrimaryKey(Integer zonaKey);

    int updateByExampleSelective(@Param("record") DimZona record, @Param("example") DimZonaExample example);

    int updateByExample(@Param("record") DimZona record, @Param("example") DimZonaExample example);

    int updateByPrimaryKeySelective(DimZona record);

    int updateByPrimaryKey(DimZona record);
}
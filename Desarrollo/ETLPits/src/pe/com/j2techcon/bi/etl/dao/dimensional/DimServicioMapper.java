package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimServicio;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimServicioExample;

public interface DimServicioMapper {
    int countByExample(DimServicioExample example);

    int deleteByExample(DimServicioExample example);

    int deleteByPrimaryKey(Integer servicioKey);

    int insert(DimServicio record);

    int insertSelective(DimServicio record);

    List<DimServicio> selectByExample(DimServicioExample example);

    DimServicio selectByPrimaryKey(Integer servicioKey);

    int updateByExampleSelective(@Param("record") DimServicio record, @Param("example") DimServicioExample example);

    int updateByExample(@Param("record") DimServicio record, @Param("example") DimServicioExample example);

    int updateByPrimaryKeySelective(DimServicio record);

    int updateByPrimaryKey(DimServicio record);
}
package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimEstado;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimEstadoExample;

public interface DimEstadoMapper {
    int countByExample(DimEstadoExample example);

    int deleteByExample(DimEstadoExample example);

    int deleteByPrimaryKey(Integer estadoKey);

    int insert(DimEstado record);

    int insertSelective(DimEstado record);

    List<DimEstado> selectByExample(DimEstadoExample example);

    DimEstado selectByPrimaryKey(Integer estadoKey);

    int updateByExampleSelective(@Param("record") DimEstado record, @Param("example") DimEstadoExample example);

    int updateByExample(@Param("record") DimEstado record, @Param("example") DimEstadoExample example);

    int updateByPrimaryKeySelective(DimEstado record);

    int updateByPrimaryKey(DimEstado record);
}
package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimEstado;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimEstadoExample;

public interface DimEstadoMapper {
    int countByExample(DimEstadoExample example) throws Exception;

    int deleteByExample(DimEstadoExample example) throws Exception;

    int deleteByPrimaryKey(Integer estadoKey) throws Exception;

    int insert(DimEstado record) throws Exception;

    int insertSelective(DimEstado record) throws Exception;

    List<DimEstado> selectByExample(DimEstadoExample example) throws Exception;

    DimEstado selectByPrimaryKey(Integer estadoKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimEstado record, @Param("example") DimEstadoExample example) throws Exception;

    int updateByExample(@Param("record") DimEstado record, @Param("example") DimEstadoExample example) throws Exception;

    int updateByPrimaryKeySelective(DimEstado record) throws Exception;

    int updateByPrimaryKey(DimEstado record) throws Exception;
}
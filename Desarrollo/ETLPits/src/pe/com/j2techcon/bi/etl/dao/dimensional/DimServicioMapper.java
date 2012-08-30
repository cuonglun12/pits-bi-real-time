package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimServicio;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimServicioExample;

public interface DimServicioMapper {
    int countByExample(DimServicioExample example) throws Exception;

    int deleteByExample(DimServicioExample example) throws Exception;

    int deleteByPrimaryKey(Integer servicioKey) throws Exception;

    int insert(DimServicio record) throws Exception;

    int insertSelective(DimServicio record) throws Exception;

    List<DimServicio> selectByExample(DimServicioExample example) throws Exception;

    DimServicio selectByPrimaryKey(Integer servicioKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimServicio record, @Param("example") DimServicioExample example) throws Exception;

    int updateByExample(@Param("record") DimServicio record, @Param("example") DimServicioExample example) throws Exception;

    int updateByPrimaryKeySelective(DimServicio record) throws Exception;

    int updateByPrimaryKey(DimServicio record) throws Exception;
}
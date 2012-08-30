package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimZona;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimZonaExample;

public interface DimZonaMapper {
    int countByExample(DimZonaExample example) throws Exception;

    int deleteByExample(DimZonaExample example) throws Exception;

    int deleteByPrimaryKey(Integer zonaKey) throws Exception;

    int insert(DimZona record) throws Exception;

    int insertSelective(DimZona record) throws Exception;

    List<DimZona> selectByExample(DimZonaExample example) throws Exception;

    DimZona selectByPrimaryKey(Integer zonaKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimZona record, @Param("example") DimZonaExample example) throws Exception;

    int updateByExample(@Param("record") DimZona record, @Param("example") DimZonaExample example) throws Exception;

    int updateByPrimaryKeySelective(DimZona record) throws Exception;

    int updateByPrimaryKey(DimZona record) throws Exception;
}
package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimMoneda;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimMonedaExample;

public interface DimMonedaMapper {
    int countByExample(DimMonedaExample example) throws Exception;

    int deleteByExample(DimMonedaExample example) throws Exception;

    int deleteByPrimaryKey(Integer monedaKey) throws Exception;

    int insert(DimMoneda record) throws Exception;

    int insertSelective(DimMoneda record) throws Exception;

    List<DimMoneda> selectByExample(DimMonedaExample example) throws Exception;

    DimMoneda selectByPrimaryKey(Integer monedaKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimMoneda record, @Param("example") DimMonedaExample example) throws Exception;

    int updateByExample(@Param("record") DimMoneda record, @Param("example") DimMonedaExample example) throws Exception;

    int updateByPrimaryKeySelective(DimMoneda record) throws Exception;

    int updateByPrimaryKey(DimMoneda record) throws Exception;
}
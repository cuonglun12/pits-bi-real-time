package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimMoneda;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimMonedaExample;

public interface DimMonedaMapper {
    int countByExample(DimMonedaExample example);

    int deleteByExample(DimMonedaExample example);

    int deleteByPrimaryKey(Integer monedaKey);

    int insert(DimMoneda record);

    int insertSelective(DimMoneda record);

    List<DimMoneda> selectByExample(DimMonedaExample example);

    DimMoneda selectByPrimaryKey(Integer monedaKey);

    int updateByExampleSelective(@Param("record") DimMoneda record, @Param("example") DimMonedaExample example);

    int updateByExample(@Param("record") DimMoneda record, @Param("example") DimMonedaExample example);

    int updateByPrimaryKeySelective(DimMoneda record);

    int updateByPrimaryKey(DimMoneda record);
}
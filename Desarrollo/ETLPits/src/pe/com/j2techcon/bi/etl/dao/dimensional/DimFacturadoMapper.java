package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimFacturado;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimFacturadoExample;

public interface DimFacturadoMapper {
    int countByExample(DimFacturadoExample example);

    int deleteByExample(DimFacturadoExample example);

    int deleteByPrimaryKey(Integer facturadoKey);

    int insert(DimFacturado record);

    int insertSelective(DimFacturado record);

    List<DimFacturado> selectByExample(DimFacturadoExample example);

    DimFacturado selectByPrimaryKey(Integer facturadoKey);

    int updateByExampleSelective(@Param("record") DimFacturado record, @Param("example") DimFacturadoExample example);

    int updateByExample(@Param("record") DimFacturado record, @Param("example") DimFacturadoExample example);

    int updateByPrimaryKeySelective(DimFacturado record);

    int updateByPrimaryKey(DimFacturado record);
}
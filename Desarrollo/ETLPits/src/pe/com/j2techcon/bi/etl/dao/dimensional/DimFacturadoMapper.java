package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimFacturado;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimFacturadoExample;

public interface DimFacturadoMapper {
    int countByExample(DimFacturadoExample example) throws Exception;

    int deleteByExample(DimFacturadoExample example) throws Exception;

    int deleteByPrimaryKey(Integer facturadoKey) throws Exception;

    int insert(DimFacturado record) throws Exception;

    int insertSelective(DimFacturado record) throws Exception;

    List<DimFacturado> selectByExample(DimFacturadoExample example) throws Exception;

    DimFacturado selectByPrimaryKey(Integer facturadoKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimFacturado record, @Param("example") DimFacturadoExample example) throws Exception;

    int updateByExample(@Param("record") DimFacturado record, @Param("example") DimFacturadoExample example) throws Exception;

    int updateByPrimaryKeySelective(DimFacturado record) throws Exception;

    int updateByPrimaryKey(DimFacturado record) throws Exception;
}
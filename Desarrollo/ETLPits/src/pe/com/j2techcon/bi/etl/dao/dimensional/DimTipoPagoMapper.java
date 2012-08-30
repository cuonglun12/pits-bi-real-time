package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoPago;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoPagoExample;

public interface DimTipoPagoMapper {
    int countByExample(DimTipoPagoExample example) throws Exception;

    int deleteByExample(DimTipoPagoExample example) throws Exception;

    int deleteByPrimaryKey(Integer tipoPagoKey) throws Exception;

    int insert(DimTipoPago record) throws Exception;

    int insertSelective(DimTipoPago record) throws Exception;

    List<DimTipoPago> selectByExample(DimTipoPagoExample example) throws Exception;

    DimTipoPago selectByPrimaryKey(Integer tipoPagoKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimTipoPago record, @Param("example") DimTipoPagoExample example) throws Exception;

    int updateByExample(@Param("record") DimTipoPago record, @Param("example") DimTipoPagoExample example) throws Exception;

    int updateByPrimaryKeySelective(DimTipoPago record) throws Exception;

    int updateByPrimaryKey(DimTipoPago record) throws Exception;
}
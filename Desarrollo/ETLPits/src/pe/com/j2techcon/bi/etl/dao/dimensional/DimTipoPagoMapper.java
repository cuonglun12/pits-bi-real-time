package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoPago;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoPagoExample;

public interface DimTipoPagoMapper {
    int countByExample(DimTipoPagoExample example);

    int deleteByExample(DimTipoPagoExample example);

    int deleteByPrimaryKey(Integer tipoPagoKey);

    int insert(DimTipoPago record);

    int insertSelective(DimTipoPago record);

    List<DimTipoPago> selectByExample(DimTipoPagoExample example);

    DimTipoPago selectByPrimaryKey(Integer tipoPagoKey);

    int updateByExampleSelective(@Param("record") DimTipoPago record, @Param("example") DimTipoPagoExample example);

    int updateByExample(@Param("record") DimTipoPago record, @Param("example") DimTipoPagoExample example);

    int updateByPrimaryKeySelective(DimTipoPago record);

    int updateByPrimaryKey(DimTipoPago record);
}
package pe.com.j2techcon.bi.etl.dao.control;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoDetalle;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoDetalleExample;

public interface TProcesoDetalleMapper {
    int countByExample(TProcesoDetalleExample example);

    int deleteByExample(TProcesoDetalleExample example);

    int deleteByPrimaryKey(Integer proDetId);

    int insert(TProcesoDetalle record);

    int insertSelective(TProcesoDetalle record);

    List<TProcesoDetalle> selectByExample(TProcesoDetalleExample example);

    TProcesoDetalle selectByPrimaryKey(Integer proDetId);

    int updateByExampleSelective(@Param("record") TProcesoDetalle record, @Param("example") TProcesoDetalleExample example);

    int updateByExample(@Param("record") TProcesoDetalle record, @Param("example") TProcesoDetalleExample example);

    int updateByPrimaryKeySelective(TProcesoDetalle record);

    int updateByPrimaryKey(TProcesoDetalle record);
}
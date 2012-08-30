package pe.com.j2techcon.bi.etl.dao.control;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoDetalle;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoDetalleExample;

public interface TProcesoDetalleMapper {
    int countByExample(TProcesoDetalleExample example) throws Exception;

    int deleteByExample(TProcesoDetalleExample example) throws Exception;

    int deleteByPrimaryKey(Integer procDetId) throws Exception;

    int insert(TProcesoDetalle record) throws Exception;

    int insertSelective(TProcesoDetalle record) throws Exception;

    List<TProcesoDetalle> selectByExample(TProcesoDetalleExample example) throws Exception;

    TProcesoDetalle selectByPrimaryKey(Integer procDetId) throws Exception;

    int updateByExampleSelective(@Param("record") TProcesoDetalle record, @Param("example") TProcesoDetalleExample example) throws Exception;

    int updateByExample(@Param("record") TProcesoDetalle record, @Param("example") TProcesoDetalleExample example) throws Exception;

    int updateByPrimaryKeySelective(TProcesoDetalle record) throws Exception;

    int updateByPrimaryKey(TProcesoDetalle record) throws Exception;
}
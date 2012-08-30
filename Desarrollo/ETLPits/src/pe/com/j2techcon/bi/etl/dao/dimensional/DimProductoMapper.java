package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimProducto;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimProductoExample;

public interface DimProductoMapper {
    int countByExample(DimProductoExample example) throws Exception;

    int deleteByExample(DimProductoExample example) throws Exception;

    int deleteByPrimaryKey(Integer productoKey) throws Exception;

    int insert(DimProducto record) throws Exception;

    int insertSelective(DimProducto record) throws Exception;

    List<DimProducto> selectByExample(DimProductoExample example) throws Exception;

    DimProducto selectByPrimaryKey(Integer productoKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimProducto record, @Param("example") DimProductoExample example) throws Exception;

    int updateByExample(@Param("record") DimProducto record, @Param("example") DimProductoExample example) throws Exception;

    int updateByPrimaryKeySelective(DimProducto record) throws Exception;

    int updateByPrimaryKey(DimProducto record) throws Exception;
}
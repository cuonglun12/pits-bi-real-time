package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimProducto;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimProductoExample;

public interface DimProductoMapper {
    int countByExample(DimProductoExample example);

    int deleteByExample(DimProductoExample example);

    int deleteByPrimaryKey(Integer productoKey);

    int insert(DimProducto record);

    int insertSelective(DimProducto record);

    List<DimProducto> selectByExample(DimProductoExample example);

    DimProducto selectByPrimaryKey(Integer productoKey);

    int updateByExampleSelective(@Param("record") DimProducto record, @Param("example") DimProductoExample example);

    int updateByExample(@Param("record") DimProducto record, @Param("example") DimProductoExample example);

    int updateByPrimaryKeySelective(DimProducto record);

    int updateByPrimaryKey(DimProducto record);
}
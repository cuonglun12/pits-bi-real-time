package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TProducto;
import pe.com.j2techcon.bi.etl.domain.generic.TProductoExample;

public interface TProductoMapper {
    int countByExample(TProductoExample example);

    int deleteByExample(TProductoExample example);

    int deleteByPrimaryKey(Integer prodId);

    int insert(TProducto record);

    int insertSelective(TProducto record);

    List<TProducto> selectByExample(TProductoExample example);

    TProducto selectByPrimaryKey(Integer prodId);

    int updateByExampleSelective(@Param("record") TProducto record, @Param("example") TProductoExample example);

    int updateByExample(@Param("record") TProducto record, @Param("example") TProductoExample example);

    int updateByPrimaryKeySelective(TProducto record);

    int updateByPrimaryKey(TProducto record);
}
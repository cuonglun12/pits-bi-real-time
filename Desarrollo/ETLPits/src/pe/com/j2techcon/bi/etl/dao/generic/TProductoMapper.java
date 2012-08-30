package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TProducto;
import pe.com.j2techcon.bi.etl.domain.generic.TProductoExample;

public interface TProductoMapper {
    int countByExample(TProductoExample example) throws Exception;

    int deleteByExample(TProductoExample example) throws Exception;

    int deleteByPrimaryKey(Integer prodId) throws Exception;

    int insert(TProducto record) throws Exception;

    int insertSelective(TProducto record) throws Exception;

    List<TProducto> selectByExample(TProductoExample example) throws Exception;

    TProducto selectByPrimaryKey(Integer prodId) throws Exception;

    int updateByExampleSelective(@Param("record") TProducto record, @Param("example") TProductoExample example) throws Exception;

    int updateByExample(@Param("record") TProducto record, @Param("example") TProductoExample example) throws Exception;

    int updateByPrimaryKeySelective(TProducto record) throws Exception;

    int updateByPrimaryKey(TProducto record) throws Exception;
}
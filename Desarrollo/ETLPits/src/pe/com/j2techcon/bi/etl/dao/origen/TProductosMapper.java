package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.TProductos;
import pe.com.j2techcon.bi.etl.domain.origen.TProductosExample;

public interface TProductosMapper {
    int countByExample(TProductosExample example) throws Exception;

    int deleteByExample(TProductosExample example) throws Exception;

    int deleteByPrimaryKey(String codproducto) throws Exception;

    int insert(TProductos record) throws Exception;

    int insertSelective(TProductos record) throws Exception;

    List<TProductos> selectByExample(TProductosExample example) throws Exception;

    TProductos selectByPrimaryKey(String codproducto) throws Exception;

    int updateByExampleSelective(@Param("record") TProductos record, @Param("example") TProductosExample example) throws Exception;

    int updateByExample(@Param("record") TProductos record, @Param("example") TProductosExample example) throws Exception;

    int updateByPrimaryKeySelective(TProductos record) throws Exception;

    int updateByPrimaryKey(TProductos record) throws Exception;
}
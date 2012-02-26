package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.TProductos;
import pe.com.j2techcon.bi.etl.domain.origen.TProductosExample;

public interface TProductosMapper {
    int countByExample(TProductosExample example);

	int deleteByExample(TProductosExample example);

	int deleteByPrimaryKey(String codproducto);

	int insert(TProductos record);

	int insertSelective(TProductos record);

	List<TProductos> selectByExample(TProductosExample example);

	TProductos selectByPrimaryKey(String codproducto);

	int updateByExampleSelective(@Param("record") TProductos record,
			@Param("example") TProductosExample example);

	int updateByExample(@Param("record") TProductos record,
			@Param("example") TProductosExample example);

	int updateByPrimaryKeySelective(TProductos record);

	int updateByPrimaryKey(TProductos record);

	int countByExample(TProductosExample example);

    int deleteByExample(TProductosExample example);

    int deleteByPrimaryKey(String codproducto);

    int insert(TProductos record);

    int insertSelective(TProductos record);

    List<TProductos> selectByExample(TProductosExample example);

    TProductos selectByPrimaryKey(String codproducto);

    int updateByExampleSelective(@Param("record") TProductos record, @Param("example") TProductosExample example);

    int updateByExample(@Param("record") TProductos record, @Param("example") TProductosExample example);

    int updateByPrimaryKeySelective(TProductos record);

    int updateByPrimaryKey(TProductos record);
}
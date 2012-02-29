package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoria;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoriaExample;

public interface TEmpleadoCategoriaMapper {
    int countByExample(TEmpleadoCategoriaExample example);

    int deleteByExample(TEmpleadoCategoriaExample example);

    int deleteByPrimaryKey(Integer empCatId);

    int insert(TEmpleadoCategoria record);

    int insertSelective(TEmpleadoCategoria record);

    List<TEmpleadoCategoria> selectByExample(TEmpleadoCategoriaExample example);

    TEmpleadoCategoria selectByPrimaryKey(Integer empCatId);

    int updateByExampleSelective(@Param("record") TEmpleadoCategoria record, @Param("example") TEmpleadoCategoriaExample example);

    int updateByExample(@Param("record") TEmpleadoCategoria record, @Param("example") TEmpleadoCategoriaExample example);

    int updateByPrimaryKeySelective(TEmpleadoCategoria record);

    int updateByPrimaryKey(TEmpleadoCategoria record);
}
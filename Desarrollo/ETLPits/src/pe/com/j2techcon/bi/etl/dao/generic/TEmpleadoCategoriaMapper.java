package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoria;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoriaExample;

public interface TEmpleadoCategoriaMapper {
    int countByExample(TEmpleadoCategoriaExample example) throws Exception;

    int deleteByExample(TEmpleadoCategoriaExample example) throws Exception;

    int deleteByPrimaryKey(Integer empCatId) throws Exception;

    int insert(TEmpleadoCategoria record) throws Exception;

    int insertSelective(TEmpleadoCategoria record) throws Exception;

    List<TEmpleadoCategoria> selectByExample(TEmpleadoCategoriaExample example) throws Exception;

    TEmpleadoCategoria selectByPrimaryKey(Integer empCatId) throws Exception;

    int updateByExampleSelective(@Param("record") TEmpleadoCategoria record, @Param("example") TEmpleadoCategoriaExample example) throws Exception;

    int updateByExample(@Param("record") TEmpleadoCategoria record, @Param("example") TEmpleadoCategoriaExample example) throws Exception;

    int updateByPrimaryKeySelective(TEmpleadoCategoria record) throws Exception;

    int updateByPrimaryKey(TEmpleadoCategoria record) throws Exception;
}
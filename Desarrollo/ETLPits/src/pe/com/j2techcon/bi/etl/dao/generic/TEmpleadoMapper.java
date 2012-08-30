package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleado;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoExample;

public interface TEmpleadoMapper {
    int countByExample(TEmpleadoExample example) throws Exception;

    int deleteByExample(TEmpleadoExample example) throws Exception;

    int deleteByPrimaryKey(Integer empId) throws Exception;

    int insert(TEmpleado record) throws Exception;

    int insertSelective(TEmpleado record) throws Exception;

    List<TEmpleado> selectByExample(TEmpleadoExample example) throws Exception;

    TEmpleado selectByPrimaryKey(Integer empId) throws Exception;

    int updateByExampleSelective(@Param("record") TEmpleado record, @Param("example") TEmpleadoExample example) throws Exception;

    int updateByExample(@Param("record") TEmpleado record, @Param("example") TEmpleadoExample example) throws Exception;

    int updateByPrimaryKeySelective(TEmpleado record) throws Exception;

    int updateByPrimaryKey(TEmpleado record) throws Exception;
}
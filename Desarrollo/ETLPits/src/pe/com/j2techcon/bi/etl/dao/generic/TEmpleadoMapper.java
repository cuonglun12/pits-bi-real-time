package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleado;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoExample;

public interface TEmpleadoMapper {
    int countByExample(TEmpleadoExample example);

    int deleteByExample(TEmpleadoExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(TEmpleado record);

    int insertSelective(TEmpleado record);

    List<TEmpleado> selectByExample(TEmpleadoExample example);

    TEmpleado selectByPrimaryKey(Integer empId);

    int updateByExampleSelective(@Param("record") TEmpleado record, @Param("example") TEmpleadoExample example);

    int updateByExample(@Param("record") TEmpleado record, @Param("example") TEmpleadoExample example);

    int updateByPrimaryKeySelective(TEmpleado record);

    int updateByPrimaryKey(TEmpleado record);
}
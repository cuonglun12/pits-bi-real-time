package pe.com.j2techcon.bi.etl.dao.control;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.control.TProceso;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoExample;

public interface TProcesoMapper {
    int countByExample(TProcesoExample example);

    int deleteByExample(TProcesoExample example);

    int deleteByPrimaryKey(Integer procId);

    int insert(TProceso record);

    int insertSelective(TProceso record);

    List<TProceso> selectByExample(TProcesoExample example);

    TProceso selectByPrimaryKey(Integer procId);

    int updateByExampleSelective(@Param("record") TProceso record, @Param("example") TProcesoExample example);

    int updateByExample(@Param("record") TProceso record, @Param("example") TProcesoExample example);

    int updateByPrimaryKeySelective(TProceso record);

    int updateByPrimaryKey(TProceso record);
}
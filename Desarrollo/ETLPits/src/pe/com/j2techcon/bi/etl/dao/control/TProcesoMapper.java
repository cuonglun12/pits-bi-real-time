package pe.com.j2techcon.bi.etl.dao.control;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.control.TProceso;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoExample;

public interface TProcesoMapper {
    int countByExample(TProcesoExample example) throws Exception;

    int deleteByExample(TProcesoExample example) throws Exception;

    int deleteByPrimaryKey(Integer procId) throws Exception;

    int insert(TProceso record) throws Exception;

    int insertSelective(TProceso record) throws Exception;

    List<TProceso> selectByExample(TProcesoExample example) throws Exception;

    TProceso selectByPrimaryKey(Integer procId) throws Exception;

    int updateByExampleSelective(@Param("record") TProceso record, @Param("example") TProcesoExample example) throws Exception;

    int updateByExample(@Param("record") TProceso record, @Param("example") TProcesoExample example) throws Exception;

    int updateByPrimaryKeySelective(TProceso record) throws Exception;

    int updateByPrimaryKey(TProceso record) throws Exception;
}
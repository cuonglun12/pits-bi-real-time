package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TServicio;
import pe.com.j2techcon.bi.etl.domain.generic.TServicioExample;

public interface TServicioMapper {
    int countByExample(TServicioExample example) throws Exception;

    int deleteByExample(TServicioExample example) throws Exception;

    int deleteByPrimaryKey(Integer servId) throws Exception;

    int insert(TServicio record) throws Exception;

    int insertSelective(TServicio record) throws Exception;

    List<TServicio> selectByExample(TServicioExample example) throws Exception;

    TServicio selectByPrimaryKey(Integer servId) throws Exception;

    int updateByExampleSelective(@Param("record") TServicio record, @Param("example") TServicioExample example) throws Exception;

    int updateByExample(@Param("record") TServicio record, @Param("example") TServicioExample example) throws Exception;

    int updateByPrimaryKeySelective(TServicio record) throws Exception;

    int updateByPrimaryKey(TServicio record) throws Exception;
}
package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TZona;
import pe.com.j2techcon.bi.etl.domain.generic.TZonaExample;

public interface TZonaMapper {
    int countByExample(TZonaExample example) throws Exception;

    int deleteByExample(TZonaExample example) throws Exception;

    int deleteByPrimaryKey(Integer zonId) throws Exception;

    int insert(TZona record) throws Exception;

    int insertSelective(TZona record) throws Exception;

    List<TZona> selectByExample(TZonaExample example) throws Exception;

    TZona selectByPrimaryKey(Integer zonId) throws Exception;

    int updateByExampleSelective(@Param("record") TZona record, @Param("example") TZonaExample example) throws Exception;

    int updateByExample(@Param("record") TZona record, @Param("example") TZonaExample example) throws Exception;

    int updateByPrimaryKeySelective(TZona record) throws Exception;

    int updateByPrimaryKey(TZona record) throws Exception;
}
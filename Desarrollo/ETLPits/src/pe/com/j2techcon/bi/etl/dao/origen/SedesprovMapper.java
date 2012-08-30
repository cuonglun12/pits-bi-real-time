package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Sedesprov;
import pe.com.j2techcon.bi.etl.domain.origen.SedesprovExample;

public interface SedesprovMapper {
    int countByExample(SedesprovExample example) throws Exception;

    int deleteByExample(SedesprovExample example) throws Exception;

    int deleteByPrimaryKey(String codsede) throws Exception;

    int insert(Sedesprov record) throws Exception;

    int insertSelective(Sedesprov record) throws Exception;

    List<Sedesprov> selectByExample(SedesprovExample example) throws Exception;

    Sedesprov selectByPrimaryKey(String codsede) throws Exception;

    int updateByExampleSelective(@Param("record") Sedesprov record, @Param("example") SedesprovExample example) throws Exception;

    int updateByExample(@Param("record") Sedesprov record, @Param("example") SedesprovExample example) throws Exception;

    int updateByPrimaryKeySelective(Sedesprov record) throws Exception;

    int updateByPrimaryKey(Sedesprov record) throws Exception;
}
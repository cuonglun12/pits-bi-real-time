package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Zonas;
import pe.com.j2techcon.bi.etl.domain.origen.ZonasExample;

public interface ZonasMapper {
    int countByExample(ZonasExample example) throws Exception;

    int deleteByExample(ZonasExample example) throws Exception;

    int deleteByPrimaryKey(String codzona) throws Exception;

    int insert(Zonas record) throws Exception;

    int insertSelective(Zonas record) throws Exception;

    List<Zonas> selectByExample(ZonasExample example) throws Exception;

    Zonas selectByPrimaryKey(String codzona) throws Exception;

    int updateByExampleSelective(@Param("record") Zonas record, @Param("example") ZonasExample example) throws Exception;

    int updateByExample(@Param("record") Zonas record, @Param("example") ZonasExample example) throws Exception;

    int updateByPrimaryKeySelective(Zonas record) throws Exception;

    int updateByPrimaryKey(Zonas record) throws Exception;
}
package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Zonas;
import pe.com.j2techcon.bi.etl.domain.origen.ZonasExample;

public interface ZonasMapper {
    int countByExample(ZonasExample example);

    int deleteByExample(ZonasExample example);

    int deleteByPrimaryKey(String codzona);

    int insert(Zonas record);

    int insertSelective(Zonas record);

    List<Zonas> selectByExample(ZonasExample example);

    Zonas selectByPrimaryKey(String codzona);

    int updateByExampleSelective(@Param("record") Zonas record, @Param("example") ZonasExample example);

    int updateByExample(@Param("record") Zonas record, @Param("example") ZonasExample example);

    int updateByPrimaryKeySelective(Zonas record);

    int updateByPrimaryKey(Zonas record);
}
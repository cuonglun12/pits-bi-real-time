package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Ubigeos;
import pe.com.j2techcon.bi.etl.domain.origen.UbigeosExample;

public interface UbigeosMapper {
    int countByExample(UbigeosExample example);

    int deleteByExample(UbigeosExample example);

    int deleteByPrimaryKey(String ubigeo);

    int insert(Ubigeos record);

    int insertSelective(Ubigeos record);

    List<Ubigeos> selectByExample(UbigeosExample example);

    Ubigeos selectByPrimaryKey(String ubigeo);

    int updateByExampleSelective(@Param("record") Ubigeos record, @Param("example") UbigeosExample example);

    int updateByExample(@Param("record") Ubigeos record, @Param("example") UbigeosExample example);

    int updateByPrimaryKeySelective(Ubigeos record);

    int updateByPrimaryKey(Ubigeos record);
}
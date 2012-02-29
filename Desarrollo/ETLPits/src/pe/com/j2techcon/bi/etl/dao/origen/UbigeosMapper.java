package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Ubigeos;
import pe.com.j2techcon.bi.etl.domain.origen.UbigeosExample;

public interface UbigeosMapper {
    int countByExample(UbigeosExample example);

    int deleteByExample(UbigeosExample example);

    int insert(Ubigeos record);

    int insertSelective(Ubigeos record);

    List<Ubigeos> selectByExample(UbigeosExample example);

    int updateByExampleSelective(@Param("record") Ubigeos record, @Param("example") UbigeosExample example);

    int updateByExample(@Param("record") Ubigeos record, @Param("example") UbigeosExample example);
}
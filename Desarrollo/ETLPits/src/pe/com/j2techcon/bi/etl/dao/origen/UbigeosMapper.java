package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Ubigeos;
import pe.com.j2techcon.bi.etl.domain.origen.UbigeosExample;

public interface UbigeosMapper {
    int countByExample(UbigeosExample example) throws Exception;

    int deleteByExample(UbigeosExample example) throws Exception;

    int deleteByPrimaryKey(String ubigeo) throws Exception;

    int insert(Ubigeos record) throws Exception;

    int insertSelective(Ubigeos record) throws Exception;

    List<Ubigeos> selectByExample(UbigeosExample example) throws Exception;

    Ubigeos selectByPrimaryKey(String ubigeo) throws Exception;

    int updateByExampleSelective(@Param("record") Ubigeos record, @Param("example") UbigeosExample example) throws Exception;

    int updateByExample(@Param("record") Ubigeos record, @Param("example") UbigeosExample example) throws Exception;

    int updateByPrimaryKeySelective(Ubigeos record) throws Exception;

    int updateByPrimaryKey(Ubigeos record) throws Exception;
}
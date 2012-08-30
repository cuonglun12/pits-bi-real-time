package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespachoExample;

public interface TCargoDespachoMapper {
    int countByExample(TCargoDespachoExample example) throws Exception;

    int deleteByExample(TCargoDespachoExample example) throws Exception;

    int deleteByPrimaryKey(Integer carDespId) throws Exception;

    int insert(TCargoDespacho record) throws Exception;

    int insertSelective(TCargoDespacho record) throws Exception;

    List<TCargoDespacho> selectByExample(TCargoDespachoExample example) throws Exception;

    TCargoDespacho selectByPrimaryKey(Integer carDespId) throws Exception;

    int updateByExampleSelective(@Param("record") TCargoDespacho record, @Param("example") TCargoDespachoExample example) throws Exception;

    int updateByExample(@Param("record") TCargoDespacho record, @Param("example") TCargoDespachoExample example) throws Exception;

    int updateByPrimaryKeySelective(TCargoDespacho record) throws Exception;

    int updateByPrimaryKey(TCargoDespacho record) throws Exception;
}
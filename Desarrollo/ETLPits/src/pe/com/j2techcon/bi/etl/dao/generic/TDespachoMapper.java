package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TDespachoExample;

public interface TDespachoMapper {
    int countByExample(TDespachoExample example) throws Exception;

    int deleteByExample(TDespachoExample example) throws Exception;

    int deleteByPrimaryKey(Integer despId) throws Exception;

    int insert(TDespacho record) throws Exception;

    int insertSelective(TDespacho record) throws Exception;

    List<TDespacho> selectByExample(TDespachoExample example) throws Exception;

    TDespacho selectByPrimaryKey(Integer despId) throws Exception;

    int updateByExampleSelective(@Param("record") TDespacho record, @Param("example") TDespachoExample example) throws Exception;

    int updateByExample(@Param("record") TDespacho record, @Param("example") TDespachoExample example) throws Exception;

    int updateByPrimaryKeySelective(TDespacho record) throws Exception;

    int updateByPrimaryKey(TDespacho record) throws Exception;
}
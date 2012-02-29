package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TDespachoExample;

public interface TDespachoMapper {
    int countByExample(TDespachoExample example);

    int deleteByExample(TDespachoExample example);

    int deleteByPrimaryKey(Integer despId);

    int insert(TDespacho record);

    int insertSelective(TDespacho record);

    List<TDespacho> selectByExample(TDespachoExample example);

    TDespacho selectByPrimaryKey(Integer despId);

    int updateByExampleSelective(@Param("record") TDespacho record, @Param("example") TDespachoExample example);

    int updateByExample(@Param("record") TDespacho record, @Param("example") TDespachoExample example);

    int updateByPrimaryKeySelective(TDespacho record);

    int updateByPrimaryKey(TDespacho record);
}
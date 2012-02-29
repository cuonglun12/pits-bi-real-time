package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespachoExample;

public interface TCargoDespachoMapper {
    int countByExample(TCargoDespachoExample example);

    int deleteByExample(TCargoDespachoExample example);

    int deleteByPrimaryKey(Integer carDespId);

    int insert(TCargoDespacho record);

    int insertSelective(TCargoDespacho record);

    List<TCargoDespacho> selectByExample(TCargoDespachoExample example);

    TCargoDespacho selectByPrimaryKey(Integer carDespId);

    int updateByExampleSelective(@Param("record") TCargoDespacho record, @Param("example") TCargoDespachoExample example);

    int updateByExample(@Param("record") TCargoDespacho record, @Param("example") TCargoDespachoExample example);

    int updateByPrimaryKeySelective(TCargoDespacho record);

    int updateByPrimaryKey(TCargoDespacho record);
}
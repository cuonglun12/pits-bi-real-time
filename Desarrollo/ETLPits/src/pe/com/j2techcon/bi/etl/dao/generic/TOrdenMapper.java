package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TOrden;
import pe.com.j2techcon.bi.etl.domain.generic.TOrdenExample;

public interface TOrdenMapper {
    int countByExample(TOrdenExample example);

    int deleteByExample(TOrdenExample example);

    int deleteByPrimaryKey(Integer ordId);

    int insert(TOrden record);

    int insertSelective(TOrden record);

    List<TOrden> selectByExample(TOrdenExample example);

    TOrden selectByPrimaryKey(Integer ordId);

    int updateByExampleSelective(@Param("record") TOrden record, @Param("example") TOrdenExample example);

    int updateByExample(@Param("record") TOrden record, @Param("example") TOrdenExample example);

    int updateByPrimaryKeySelective(TOrden record);

    int updateByPrimaryKey(TOrden record);
}
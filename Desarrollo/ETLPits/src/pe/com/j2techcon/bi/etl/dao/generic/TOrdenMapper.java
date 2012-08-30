package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TOrden;
import pe.com.j2techcon.bi.etl.domain.generic.TOrdenExample;

public interface TOrdenMapper {
    int countByExample(TOrdenExample example) throws Exception;

    int deleteByExample(TOrdenExample example) throws Exception;

    int deleteByPrimaryKey(Integer ordId) throws Exception;

    int insert(TOrden record) throws Exception;

    int insertSelective(TOrden record) throws Exception;

    List<TOrden> selectByExample(TOrdenExample example) throws Exception;

    TOrden selectByPrimaryKey(Integer ordId) throws Exception;

    int updateByExampleSelective(@Param("record") TOrden record, @Param("example") TOrdenExample example) throws Exception;

    int updateByExample(@Param("record") TOrden record, @Param("example") TOrdenExample example) throws Exception;

    int updateByPrimaryKeySelective(TOrden record) throws Exception;

    int updateByPrimaryKey(TOrden record) throws Exception;
}
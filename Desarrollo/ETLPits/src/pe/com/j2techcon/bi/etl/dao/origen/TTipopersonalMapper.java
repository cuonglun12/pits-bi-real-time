package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.TTipopersonal;
import pe.com.j2techcon.bi.etl.domain.origen.TTipopersonalExample;

public interface TTipopersonalMapper {
    int countByExample(TTipopersonalExample example) throws Exception;

    int deleteByExample(TTipopersonalExample example) throws Exception;

    int deleteByPrimaryKey(String codtipopersonal) throws Exception;

    int insert(TTipopersonal record) throws Exception;

    int insertSelective(TTipopersonal record) throws Exception;

    List<TTipopersonal> selectByExample(TTipopersonalExample example) throws Exception;

    TTipopersonal selectByPrimaryKey(String codtipopersonal) throws Exception;

    int updateByExampleSelective(@Param("record") TTipopersonal record, @Param("example") TTipopersonalExample example) throws Exception;

    int updateByExample(@Param("record") TTipopersonal record, @Param("example") TTipopersonalExample example) throws Exception;

    int updateByPrimaryKeySelective(TTipopersonal record) throws Exception;

    int updateByPrimaryKey(TTipopersonal record) throws Exception;
}
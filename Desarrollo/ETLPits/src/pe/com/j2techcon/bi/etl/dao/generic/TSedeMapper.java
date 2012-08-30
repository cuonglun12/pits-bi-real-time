package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TSede;
import pe.com.j2techcon.bi.etl.domain.generic.TSedeExample;

public interface TSedeMapper {
    int countByExample(TSedeExample example) throws Exception;

    int deleteByExample(TSedeExample example) throws Exception;

    int deleteByPrimaryKey(Integer sedId) throws Exception;

    int insert(TSede record) throws Exception;

    int insertSelective(TSede record) throws Exception;

    List<TSede> selectByExample(TSedeExample example) throws Exception;

    TSede selectByPrimaryKey(Integer sedId) throws Exception;

    int updateByExampleSelective(@Param("record") TSede record, @Param("example") TSedeExample example) throws Exception;

    int updateByExample(@Param("record") TSede record, @Param("example") TSedeExample example) throws Exception;

    int updateByPrimaryKeySelective(TSede record) throws Exception;

    int updateByPrimaryKey(TSede record) throws Exception;
}
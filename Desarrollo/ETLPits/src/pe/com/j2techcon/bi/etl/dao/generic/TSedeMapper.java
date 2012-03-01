package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TSede;
import pe.com.j2techcon.bi.etl.domain.generic.TSedeExample;

public interface TSedeMapper {
    int countByExample(TSedeExample example);

    int deleteByExample(TSedeExample example);

    int deleteByPrimaryKey(Integer sedId);

    int insert(TSede record);

    int insertSelective(TSede record);

    List<TSede> selectByExample(TSedeExample example);

    TSede selectByPrimaryKey(Integer sedId);

    int updateByExampleSelective(@Param("record") TSede record, @Param("example") TSedeExample example);

    int updateByExample(@Param("record") TSede record, @Param("example") TSedeExample example);

    int updateByPrimaryKeySelective(TSede record);

    int updateByPrimaryKey(TSede record);
}
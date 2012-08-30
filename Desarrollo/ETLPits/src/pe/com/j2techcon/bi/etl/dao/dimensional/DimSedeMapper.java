package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimSede;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimSedeExample;

public interface DimSedeMapper {
    int countByExample(DimSedeExample example) throws Exception;

    int deleteByExample(DimSedeExample example) throws Exception;

    int deleteByPrimaryKey(Integer sedeKey) throws Exception;

    int insert(DimSede record) throws Exception;

    int insertSelective(DimSede record) throws Exception;

    List<DimSede> selectByExample(DimSedeExample example) throws Exception;

    DimSede selectByPrimaryKey(Integer sedeKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimSede record, @Param("example") DimSedeExample example) throws Exception;

    int updateByExample(@Param("record") DimSede record, @Param("example") DimSedeExample example) throws Exception;

    int updateByPrimaryKeySelective(DimSede record) throws Exception;

    int updateByPrimaryKey(DimSede record) throws Exception;
}
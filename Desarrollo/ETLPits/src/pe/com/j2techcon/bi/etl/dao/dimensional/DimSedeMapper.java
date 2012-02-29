package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimSede;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimSedeExample;

public interface DimSedeMapper {
    int countByExample(DimSedeExample example);

    int deleteByExample(DimSedeExample example);

    int deleteByPrimaryKey(Integer sedeKey);

    int insert(DimSede record);

    int insertSelective(DimSede record);

    List<DimSede> selectByExample(DimSedeExample example);

    DimSede selectByPrimaryKey(Integer sedeKey);

    int updateByExampleSelective(@Param("record") DimSede record, @Param("example") DimSedeExample example);

    int updateByExample(@Param("record") DimSede record, @Param("example") DimSedeExample example);

    int updateByPrimaryKeySelective(DimSede record);

    int updateByPrimaryKey(DimSede record);
}
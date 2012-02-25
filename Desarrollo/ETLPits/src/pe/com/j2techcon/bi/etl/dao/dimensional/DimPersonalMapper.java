package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimPersonal;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimPersonalExample;

public interface DimPersonalMapper {
    int countByExample(DimPersonalExample example);

    int deleteByExample(DimPersonalExample example);

    int deleteByPrimaryKey(Integer personalKey);

    int insert(DimPersonal record);

    int insertSelective(DimPersonal record);

    List<DimPersonal> selectByExample(DimPersonalExample example);

    DimPersonal selectByPrimaryKey(Integer personalKey);

    int updateByExampleSelective(@Param("record") DimPersonal record, @Param("example") DimPersonalExample example);

    int updateByExample(@Param("record") DimPersonal record, @Param("example") DimPersonalExample example);

    int updateByPrimaryKeySelective(DimPersonal record);

    int updateByPrimaryKey(DimPersonal record);
}
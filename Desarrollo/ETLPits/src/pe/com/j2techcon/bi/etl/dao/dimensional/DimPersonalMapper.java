package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimPersonal;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimPersonalExample;

public interface DimPersonalMapper {
    int countByExample(DimPersonalExample example) throws Exception;

    int deleteByExample(DimPersonalExample example) throws Exception;

    int deleteByPrimaryKey(Integer personalKey) throws Exception;

    int insert(DimPersonal record) throws Exception;

    int insertSelective(DimPersonal record) throws Exception;

    List<DimPersonal> selectByExample(DimPersonalExample example) throws Exception;

    DimPersonal selectByPrimaryKey(Integer personalKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimPersonal record, @Param("example") DimPersonalExample example) throws Exception;

    int updateByExample(@Param("record") DimPersonal record, @Param("example") DimPersonalExample example) throws Exception;

    int updateByPrimaryKeySelective(DimPersonal record) throws Exception;

    int updateByPrimaryKey(DimPersonal record) throws Exception;
}
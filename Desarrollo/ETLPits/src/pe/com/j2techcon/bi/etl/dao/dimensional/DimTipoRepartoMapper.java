package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoReparto;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRepartoExample;

public interface DimTipoRepartoMapper {
    int countByExample(DimTipoRepartoExample example);

    int deleteByExample(DimTipoRepartoExample example);

    int deleteByPrimaryKey(Integer tipoRepartoKey);

    int insert(DimTipoReparto record);

    int insertSelective(DimTipoReparto record);

    List<DimTipoReparto> selectByExample(DimTipoRepartoExample example);

    DimTipoReparto selectByPrimaryKey(Integer tipoRepartoKey);

    int updateByExampleSelective(@Param("record") DimTipoReparto record, @Param("example") DimTipoRepartoExample example);

    int updateByExample(@Param("record") DimTipoReparto record, @Param("example") DimTipoRepartoExample example);

    int updateByPrimaryKeySelective(DimTipoReparto record);

    int updateByPrimaryKey(DimTipoReparto record);
}
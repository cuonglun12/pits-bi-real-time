package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoReparto;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRepartoExample;

public interface DimTipoRepartoMapper {
    int countByExample(DimTipoRepartoExample example) throws Exception;

    int deleteByExample(DimTipoRepartoExample example) throws Exception;

    int deleteByPrimaryKey(Integer tipoRepartoKey) throws Exception;

    int insert(DimTipoReparto record) throws Exception;

    int insertSelective(DimTipoReparto record) throws Exception;

    List<DimTipoReparto> selectByExample(DimTipoRepartoExample example) throws Exception;

    DimTipoReparto selectByPrimaryKey(Integer tipoRepartoKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimTipoReparto record, @Param("example") DimTipoRepartoExample example) throws Exception;

    int updateByExample(@Param("record") DimTipoReparto record, @Param("example") DimTipoRepartoExample example) throws Exception;

    int updateByPrimaryKeySelective(DimTipoReparto record) throws Exception;

    int updateByPrimaryKey(DimTipoReparto record) throws Exception;
}
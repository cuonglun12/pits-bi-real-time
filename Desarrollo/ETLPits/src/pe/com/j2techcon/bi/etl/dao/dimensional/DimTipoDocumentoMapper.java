package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoDocumento;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoDocumentoExample;

public interface DimTipoDocumentoMapper {
    int countByExample(DimTipoDocumentoExample example);

    int deleteByExample(DimTipoDocumentoExample example);

    int deleteByPrimaryKey(Integer tipoDocumentoKey);

    int insert(DimTipoDocumento record);

    int insertSelective(DimTipoDocumento record);

    List<DimTipoDocumento> selectByExample(DimTipoDocumentoExample example);

    DimTipoDocumento selectByPrimaryKey(Integer tipoDocumentoKey);

    int updateByExampleSelective(@Param("record") DimTipoDocumento record, @Param("example") DimTipoDocumentoExample example);

    int updateByExample(@Param("record") DimTipoDocumento record, @Param("example") DimTipoDocumentoExample example);

    int updateByPrimaryKeySelective(DimTipoDocumento record);

    int updateByPrimaryKey(DimTipoDocumento record);
}
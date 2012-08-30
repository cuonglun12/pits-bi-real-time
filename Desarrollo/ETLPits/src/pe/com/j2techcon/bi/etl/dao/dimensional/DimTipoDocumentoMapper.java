package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoDocumento;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoDocumentoExample;

public interface DimTipoDocumentoMapper {
    int countByExample(DimTipoDocumentoExample example) throws Exception;

    int deleteByExample(DimTipoDocumentoExample example) throws Exception;

    int deleteByPrimaryKey(Integer tipoDocumentoKey) throws Exception;

    int insert(DimTipoDocumento record) throws Exception;

    int insertSelective(DimTipoDocumento record) throws Exception;

    List<DimTipoDocumento> selectByExample(DimTipoDocumentoExample example) throws Exception;

    DimTipoDocumento selectByPrimaryKey(Integer tipoDocumentoKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimTipoDocumento record, @Param("example") DimTipoDocumentoExample example) throws Exception;

    int updateByExample(@Param("record") DimTipoDocumento record, @Param("example") DimTipoDocumentoExample example) throws Exception;

    int updateByPrimaryKeySelective(DimTipoDocumento record) throws Exception;

    int updateByPrimaryKey(DimTipoDocumento record) throws Exception;
}
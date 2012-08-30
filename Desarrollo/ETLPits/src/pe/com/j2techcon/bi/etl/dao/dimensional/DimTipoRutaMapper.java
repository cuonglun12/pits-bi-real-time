package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRuta;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRutaExample;

public interface DimTipoRutaMapper {
    int countByExample(DimTipoRutaExample example) throws Exception;

    int deleteByExample(DimTipoRutaExample example) throws Exception;

    int deleteByPrimaryKey(Integer tipoRutaKey) throws Exception;

    int insert(DimTipoRuta record) throws Exception;

    int insertSelective(DimTipoRuta record) throws Exception;

    List<DimTipoRuta> selectByExample(DimTipoRutaExample example) throws Exception;

    DimTipoRuta selectByPrimaryKey(Integer tipoRutaKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimTipoRuta record, @Param("example") DimTipoRutaExample example) throws Exception;

    int updateByExample(@Param("record") DimTipoRuta record, @Param("example") DimTipoRutaExample example) throws Exception;

    int updateByPrimaryKeySelective(DimTipoRuta record) throws Exception;

    int updateByPrimaryKey(DimTipoRuta record) throws Exception;
}
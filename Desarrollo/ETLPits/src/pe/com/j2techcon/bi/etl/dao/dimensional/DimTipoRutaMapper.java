package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRuta;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRutaExample;

public interface DimTipoRutaMapper {
    int countByExample(DimTipoRutaExample example);

    int deleteByExample(DimTipoRutaExample example);

    int deleteByPrimaryKey(Integer tipoRutaKey);

    int insert(DimTipoRuta record);

    int insertSelective(DimTipoRuta record);

    List<DimTipoRuta> selectByExample(DimTipoRutaExample example);

    DimTipoRuta selectByPrimaryKey(Integer tipoRutaKey);

    int updateByExampleSelective(@Param("record") DimTipoRuta record, @Param("example") DimTipoRutaExample example);

    int updateByExample(@Param("record") DimTipoRuta record, @Param("example") DimTipoRutaExample example);

    int updateByPrimaryKeySelective(DimTipoRuta record);

    int updateByPrimaryKey(DimTipoRuta record);
}
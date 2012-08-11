package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Ordenes;
import pe.com.j2techcon.bi.etl.domain.origen.OrdenesExample;

public interface OrdenesMapper {
    int countByExample(OrdenesExample example);

    int deleteByExample(OrdenesExample example);

    int deleteByPrimaryKey(@Param("serie") String serie, @Param("orden") String orden);

    int insert(Ordenes record);

    int insertSelective(Ordenes record);

    List<Ordenes> selectByExample(OrdenesExample example);

    Ordenes selectByPrimaryKey(@Param("serie") String serie, @Param("orden") String orden);

    int updateByExampleSelective(@Param("record") Ordenes record, @Param("example") OrdenesExample example);

    int updateByExample(@Param("record") Ordenes record, @Param("example") OrdenesExample example);

    int updateByPrimaryKeySelective(Ordenes record);

    int updateByPrimaryKey(Ordenes record);
}
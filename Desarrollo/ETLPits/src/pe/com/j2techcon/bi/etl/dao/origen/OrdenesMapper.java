package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Ordenes;
import pe.com.j2techcon.bi.etl.domain.origen.OrdenesExample;

public interface OrdenesMapper {
    int countByExample(OrdenesExample example) throws Exception;

    int deleteByExample(OrdenesExample example) throws Exception;

    int deleteByPrimaryKey(@Param("serie") String serie, @Param("orden") String orden) throws Exception;

    int insert(Ordenes record) throws Exception;

    int insertSelective(Ordenes record) throws Exception;

    List<Ordenes> selectByExample(OrdenesExample example) throws Exception;

    Ordenes selectByPrimaryKey(@Param("serie") String serie, @Param("orden") String orden) throws Exception;

    int updateByExampleSelective(@Param("record") Ordenes record, @Param("example") OrdenesExample example) throws Exception;

    int updateByExample(@Param("record") Ordenes record, @Param("example") OrdenesExample example) throws Exception;

    int updateByPrimaryKeySelective(Ordenes record) throws Exception;

    int updateByPrimaryKey(Ordenes record) throws Exception;
}
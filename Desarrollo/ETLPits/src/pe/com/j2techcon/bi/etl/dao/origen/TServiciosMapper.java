package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.TServicios;
import pe.com.j2techcon.bi.etl.domain.origen.TServiciosExample;

public interface TServiciosMapper {
    int countByExample(TServiciosExample example) throws Exception;

    int deleteByExample(TServiciosExample example) throws Exception;

    int deleteByPrimaryKey(String codservicio) throws Exception;

    int insert(TServicios record) throws Exception;

    int insertSelective(TServicios record) throws Exception;

    List<TServicios> selectByExample(TServiciosExample example) throws Exception;

    TServicios selectByPrimaryKey(String codservicio) throws Exception;

    int updateByExampleSelective(@Param("record") TServicios record, @Param("example") TServiciosExample example) throws Exception;

    int updateByExample(@Param("record") TServicios record, @Param("example") TServiciosExample example) throws Exception;

    int updateByPrimaryKeySelective(TServicios record) throws Exception;

    int updateByPrimaryKey(TServicios record) throws Exception;
}
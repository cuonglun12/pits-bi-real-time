package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.TServicios;
import pe.com.j2techcon.bi.etl.domain.origen.TServiciosExample;

public interface TServiciosMapper {
    int countByExample(TServiciosExample example);

    int deleteByExample(TServiciosExample example);

    int deleteByPrimaryKey(String codservicio);

    int insert(TServicios record);

    int insertSelective(TServicios record);

    List<TServicios> selectByExample(TServiciosExample example);

    TServicios selectByPrimaryKey(String codservicio);

    int updateByExampleSelective(@Param("record") TServicios record, @Param("example") TServiciosExample example);

    int updateByExample(@Param("record") TServicios record, @Param("example") TServiciosExample example);

    int updateByPrimaryKeySelective(TServicios record);

    int updateByPrimaryKey(TServicios record);
}
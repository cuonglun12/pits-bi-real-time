package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Detdespacho;
import pe.com.j2techcon.bi.etl.domain.origen.DetdespachoExample;

public interface DetdespachoMapper {
    int countByExample(DetdespachoExample example);

    int deleteByExample(DetdespachoExample example);

    int insert(Detdespacho record);

    int insertSelective(Detdespacho record);

    List<Detdespacho> selectByExample(DetdespachoExample example);

    int updateByExampleSelective(@Param("record") Detdespacho record, @Param("example") DetdespachoExample example);

    int updateByExample(@Param("record") Detdespacho record, @Param("example") DetdespachoExample example);
}
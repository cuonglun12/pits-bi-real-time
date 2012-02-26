package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Ordenes;
import pe.com.j2techcon.bi.etl.domain.origen.OrdenesExample;

public interface OrdenesMapper {
    int countByExample(OrdenesExample example);

	int deleteByExample(OrdenesExample example);

	int insert(Ordenes record);

	int insertSelective(Ordenes record);

	List<Ordenes> selectByExample(OrdenesExample example);

	int updateByExampleSelective(@Param("record") Ordenes record,
			@Param("example") OrdenesExample example);

	int updateByExample(@Param("record") Ordenes record,
			@Param("example") OrdenesExample example);

	int countByExample(OrdenesExample example);

    int deleteByExample(OrdenesExample example);

    int insert(Ordenes record);

    int insertSelective(Ordenes record);

    List<Ordenes> selectByExample(OrdenesExample example);

    int updateByExampleSelective(@Param("record") Ordenes record, @Param("example") OrdenesExample example);

    int updateByExample(@Param("record") Ordenes record, @Param("example") OrdenesExample example);
}
package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempo;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempoExample;

public interface DimTiempoMapper {
	
	int countByExample(DimTiempoExample example) throws Exception;

	int deleteByExample(DimTiempoExample example) throws Exception;

	int deleteByPrimaryKey(Integer tiempoKey) throws Exception;
	
	int insert(DimTiempo record) throws Exception;
	
	int insertSelective(DimTiempo record) throws Exception;
	
	List<DimTiempo> selectByExample(DimTiempoExample example) throws Exception;
	
	DimTiempo selectByPrimaryKey(Integer tiempoKey) throws Exception;
	
	int updateByExampleSelective(DimTiempo record,
			DimTiempoExample example) throws Exception;

	int updateByExample(DimTiempo record, DimTiempoExample example) throws Exception;

	int updateByPrimaryKeySelective(DimTiempo record) throws Exception;

	int updateByPrimaryKey(DimTiempo record) throws Exception;
}
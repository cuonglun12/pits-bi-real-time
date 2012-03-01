package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimTiempoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempo;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempoExample;

public class DimTiempoManager {
	
	private DimTiempoMapper dimTiempoMapper;

	public DimTiempoMapper getDimTiempoMapper() {
		return dimTiempoMapper;
	}

	public void setDimTiempoMapper(DimTiempoMapper dimTiempoMapper) {
		this.dimTiempoMapper = dimTiempoMapper;
	}


	public int countByExample(DimTiempoExample example) {
		return dimTiempoMapper.countByExample(example);
	}


	public int deleteByExample(DimTiempoExample example) {
		return dimTiempoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer tiempoKey) {
		return dimTiempoMapper.deleteByPrimaryKey(tiempoKey);
	}


	public int insert(DimTiempo record) {
		return dimTiempoMapper.insert(record);
	}


	public int insertSelective(DimTiempo record) {
		return dimTiempoMapper.insertSelective(record);
	}


	public List<DimTiempo> selectByExample(DimTiempoExample example) {
		return dimTiempoMapper.selectByExample(example);
	}


	public DimTiempo selectByPrimaryKey(Integer tiempoKey) {
		return dimTiempoMapper.selectByPrimaryKey(tiempoKey);
	}


	public int updateByExampleSelective(DimTiempo record,
			DimTiempoExample example) {
		return dimTiempoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimTiempo record, DimTiempoExample example) {
		return dimTiempoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimTiempo record) {
		return dimTiempoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimTiempo record) {
		return dimTiempoMapper.updateByPrimaryKey(record);
	}

}

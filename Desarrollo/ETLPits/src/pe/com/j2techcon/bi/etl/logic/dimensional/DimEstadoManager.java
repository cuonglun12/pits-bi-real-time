package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimEstadoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimEstado;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimEstadoExample;

public class DimEstadoManager {

	private DimEstadoMapper dimEstadoMapper;
	
	public DimEstadoMapper getDimEstadoMapper() {
		return dimEstadoMapper;
	}

	public void setDimEstadoMapper(DimEstadoMapper dimEstadoMapper) {
		this.dimEstadoMapper = dimEstadoMapper;
	}


	public int countByExample(DimEstadoExample example) {
		return dimEstadoMapper.countByExample(example);
	}


	public int deleteByExample(DimEstadoExample example) {
		return dimEstadoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer estadoKey) {
		return dimEstadoMapper.deleteByPrimaryKey(estadoKey);
	}


	public int insert(DimEstado record) {
		return dimEstadoMapper.insert(record);
	}


	public int insertSelective(DimEstado record) {
		return dimEstadoMapper.insertSelective(record);
	}


	public List<DimEstado> selectByExample(DimEstadoExample example) {
		return dimEstadoMapper.selectByExample(example);
	}


	public DimEstado selectByPrimaryKey(Integer estadoKey) {
		return dimEstadoMapper.selectByPrimaryKey(estadoKey);
	}


	public int updateByExampleSelective(DimEstado record,
			DimEstadoExample example) {
		return updateByExampleSelective(record, example);
	}


	public int updateByExample(DimEstado record, DimEstadoExample example) {
		return dimEstadoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimEstado record) {
		return dimEstadoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimEstado record) {
		return dimEstadoMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimEstadoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimEstado;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimEstadoExample;

public class DimEstadoManager {

	private DimEstadoMapper dimEstadoMapper;
	
	public DimEstadoMapper getDimEstadoMapper() throws Exception {
		return dimEstadoMapper;
	}

	public void setDimEstadoMapper(DimEstadoMapper dimEstadoMapper) throws Exception {
		this.dimEstadoMapper = dimEstadoMapper;
	}


	public int countByExample(DimEstadoExample example) throws Exception {
		return dimEstadoMapper.countByExample(example);
	}


	public int deleteByExample(DimEstadoExample example) throws Exception {
		return dimEstadoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer estadoKey) throws Exception {
		return dimEstadoMapper.deleteByPrimaryKey(estadoKey);
	}


	public int insert(DimEstado record) throws Exception {
		return dimEstadoMapper.insert(record);
	}


	public int insertSelective(DimEstado record) throws Exception {
		return dimEstadoMapper.insertSelective(record);
	}


	public List<DimEstado> selectByExample(DimEstadoExample example) throws Exception {
		return dimEstadoMapper.selectByExample(example);
	}


	public DimEstado selectByPrimaryKey(Integer estadoKey) throws Exception {
		return dimEstadoMapper.selectByPrimaryKey(estadoKey);
	}


	public int updateByExampleSelective(DimEstado record,
			DimEstadoExample example) throws Exception {
		return updateByExampleSelective(record, example);
	}


	public int updateByExample(DimEstado record, DimEstadoExample example) throws Exception {
		return dimEstadoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimEstado record) throws Exception {
		return dimEstadoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimEstado record) throws Exception {
		return dimEstadoMapper.updateByPrimaryKey(record);
	}

}

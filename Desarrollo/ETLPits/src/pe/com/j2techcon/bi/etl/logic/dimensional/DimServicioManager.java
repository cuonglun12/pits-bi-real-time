package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimServicioMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimServicio;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimServicioExample;

public class DimServicioManager {
	
	private DimServicioMapper dimServicioMapper;

	public DimServicioMapper getDimServicioMapper() {
		return dimServicioMapper;
	}

	public void setDimServicioMapper(DimServicioMapper dimServicioMapper) {
		this.dimServicioMapper = dimServicioMapper;
	}


	public int countByExample(DimServicioExample example) {
		return dimServicioMapper.countByExample(example);
	}


	public int deleteByExample(DimServicioExample example) {
		return dimServicioMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer servicioKey) {
		return dimServicioMapper.deleteByPrimaryKey(servicioKey);
	}


	public int insert(DimServicio record) {
		return dimServicioMapper.insert(record);
	}


	public int insertSelective(DimServicio record) {
		return dimServicioMapper.insertSelective(record);
	}


	public List<DimServicio> selectByExample(DimServicioExample example) {
		return dimServicioMapper.selectByExample(example);
	}


	public DimServicio selectByPrimaryKey(Integer servicioKey) {
		return dimServicioMapper.selectByPrimaryKey(servicioKey);
	}


	public int updateByExampleSelective(DimServicio record,
			DimServicioExample example) {
		return dimServicioMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimServicio record, DimServicioExample example) {
		return dimServicioMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimServicio record) {
		return dimServicioMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimServicio record) {
		return dimServicioMapper.updateByPrimaryKey(record);
	}

}

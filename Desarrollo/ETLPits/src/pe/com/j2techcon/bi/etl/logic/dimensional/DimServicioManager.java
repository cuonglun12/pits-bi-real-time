package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimServicioMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimServicio;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimServicioExample;

public class DimServicioManager {
	
	private DimServicioMapper dimServicioMapper;

	public DimServicioMapper getDimServicioMapper() throws Exception {
		return dimServicioMapper;
	}

	public void setDimServicioMapper(DimServicioMapper dimServicioMapper) throws Exception {
		this.dimServicioMapper = dimServicioMapper;
	}


	public int countByExample(DimServicioExample example) throws Exception {
		return dimServicioMapper.countByExample(example);
	}


	public int deleteByExample(DimServicioExample example) throws Exception {
		return dimServicioMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer servicioKey) throws Exception {
		return dimServicioMapper.deleteByPrimaryKey(servicioKey);
	}


	public int insert(DimServicio record) throws Exception {
		return dimServicioMapper.insert(record);
	}


	public int insertSelective(DimServicio record) throws Exception {
		return dimServicioMapper.insertSelective(record);
	}


	public List<DimServicio> selectByExample(DimServicioExample example) throws Exception {
		return dimServicioMapper.selectByExample(example);
	}


	public DimServicio selectByPrimaryKey(Integer servicioKey) throws Exception {
		return dimServicioMapper.selectByPrimaryKey(servicioKey);
	}


	public int updateByExampleSelective(DimServicio record,
			DimServicioExample example) throws Exception {
		return dimServicioMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimServicio record, DimServicioExample example) throws Exception {
		return dimServicioMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimServicio record) throws Exception {
		return dimServicioMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimServicio record) throws Exception {
		return dimServicioMapper.updateByPrimaryKey(record);
	}

}

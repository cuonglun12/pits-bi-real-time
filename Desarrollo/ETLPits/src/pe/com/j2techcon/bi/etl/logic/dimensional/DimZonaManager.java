package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimZonaMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimZona;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimZonaExample;

public class DimZonaManager {
	
	private DimZonaMapper dimZonaMapper;

	public DimZonaMapper getDimZonaMapper() {
		return dimZonaMapper;
	}

	public void setDimZonaMapper(DimZonaMapper dimZonaMapper) {
		this.dimZonaMapper = dimZonaMapper;
	}


	public int countByExample(DimZonaExample example) {
		return dimZonaMapper.countByExample(example);
	}


	public int deleteByExample(DimZonaExample example) {
		return dimZonaMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer zonaKey) {
		return dimZonaMapper.deleteByPrimaryKey(zonaKey);
	}


	public int insert(DimZona record) {
		return dimZonaMapper.insert(record);
	}


	public int insertSelective(DimZona record) {
		return dimZonaMapper.insertSelective(record);
	}


	public List<DimZona> selectByExample(DimZonaExample example) {
		return dimZonaMapper.selectByExample(example);
	}


	public DimZona selectByPrimaryKey(Integer zonaKey) {
		return dimZonaMapper.selectByPrimaryKey(zonaKey);
	}


	public int updateByExampleSelective(DimZona record, DimZonaExample example) {
		return dimZonaMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimZona record, DimZonaExample example) {
		return dimZonaMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimZona record) {
		return dimZonaMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimZona record) {
		return dimZonaMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimZonaMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimZona;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimZonaExample;

public class DimZonaManager {
	
	private DimZonaMapper dimZonaMapper;

	public DimZonaMapper getDimZonaMapper() throws Exception {
		return dimZonaMapper;
	}

	public void setDimZonaMapper(DimZonaMapper dimZonaMapper) throws Exception {
		this.dimZonaMapper = dimZonaMapper;
	}


	public int countByExample(DimZonaExample example) throws Exception {
		return dimZonaMapper.countByExample(example);
	}


	public int deleteByExample(DimZonaExample example) throws Exception {
		return dimZonaMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer zonaKey) throws Exception {
		return dimZonaMapper.deleteByPrimaryKey(zonaKey);
	}


	public int insert(DimZona record) throws Exception {
		return dimZonaMapper.insert(record);
	}


	public int insertSelective(DimZona record) throws Exception {
		return dimZonaMapper.insertSelective(record);
	}


	public List<DimZona> selectByExample(DimZonaExample example) throws Exception {
		return dimZonaMapper.selectByExample(example);
	}


	public DimZona selectByPrimaryKey(Integer zonaKey) throws Exception {
		return dimZonaMapper.selectByPrimaryKey(zonaKey);
	}


	public int updateByExampleSelective(DimZona record, DimZonaExample example) throws Exception {
		return dimZonaMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimZona record, DimZonaExample example) throws Exception {
		return dimZonaMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimZona record) throws Exception {
		return dimZonaMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimZona record) throws Exception {
		return dimZonaMapper.updateByPrimaryKey(record);
	}

}

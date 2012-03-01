package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimMonedaMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimMoneda;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimMonedaExample;

public class DimMonedaManager {
	
	private DimMonedaMapper dimMonedaMapper;

	public DimMonedaMapper getDimMonedaMapper() {
		return dimMonedaMapper;
	}

	public void setDimMonedaMapper(DimMonedaMapper dimMonedaMapper) {
		this.dimMonedaMapper = dimMonedaMapper;
	}


	public int countByExample(DimMonedaExample example) {
		return dimMonedaMapper.countByExample(example);
	}


	public int deleteByExample(DimMonedaExample example) {
		return dimMonedaMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer monedaKey) {
		return dimMonedaMapper.deleteByPrimaryKey(monedaKey);
	}


	public int insert(DimMoneda record) {
		return dimMonedaMapper.insert(record);
	}


	public int insertSelective(DimMoneda record) {
		return dimMonedaMapper.insertSelective(record);
	}


	public List<DimMoneda> selectByExample(DimMonedaExample example) {
		return dimMonedaMapper.selectByExample(example);
	}


	public DimMoneda selectByPrimaryKey(Integer monedaKey) {
		return dimMonedaMapper.selectByPrimaryKey(monedaKey);
	}


	public int updateByExampleSelective(DimMoneda record,
			DimMonedaExample example) {
		return dimMonedaMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimMoneda record, DimMonedaExample example) {
		return dimMonedaMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimMoneda record) {
		return dimMonedaMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimMoneda record) {
		return dimMonedaMapper.updateByPrimaryKey(record);
	}

}

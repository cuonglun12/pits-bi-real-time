package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimMonedaMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimMoneda;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimMonedaExample;

public class DimMonedaManager {
	
	private DimMonedaMapper dimMonedaMapper;

	public DimMonedaMapper getDimMonedaMapper() throws Exception {
		return dimMonedaMapper;
	}

	public void setDimMonedaMapper(DimMonedaMapper dimMonedaMapper) throws Exception {
		this.dimMonedaMapper = dimMonedaMapper;
	}


	public int countByExample(DimMonedaExample example) throws Exception {
		return dimMonedaMapper.countByExample(example);
	}


	public int deleteByExample(DimMonedaExample example) throws Exception {
		return dimMonedaMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer monedaKey) throws Exception {
		return dimMonedaMapper.deleteByPrimaryKey(monedaKey);
	}


	public int insert(DimMoneda record) throws Exception {
		return dimMonedaMapper.insert(record);
	}


	public int insertSelective(DimMoneda record) throws Exception {
		return dimMonedaMapper.insertSelective(record);
	}


	public List<DimMoneda> selectByExample(DimMonedaExample example) throws Exception {
		return dimMonedaMapper.selectByExample(example);
	}


	public DimMoneda selectByPrimaryKey(Integer monedaKey) throws Exception {
		return dimMonedaMapper.selectByPrimaryKey(monedaKey);
	}


	public int updateByExampleSelective(DimMoneda record,
			DimMonedaExample example) throws Exception {
		return dimMonedaMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimMoneda record, DimMonedaExample example) throws Exception {
		return dimMonedaMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimMoneda record) throws Exception {
		return dimMonedaMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimMoneda record) throws Exception {
		return dimMonedaMapper.updateByPrimaryKey(record);
	}

}

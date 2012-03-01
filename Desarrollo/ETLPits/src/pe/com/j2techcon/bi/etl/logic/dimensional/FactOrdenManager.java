package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.FactOrdenMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactOrden;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactOrdenExample;

public class FactOrdenManager {
	
	private FactOrdenMapper factOrdenMapper;

	public FactOrdenMapper getFactOrdenMapper() {
		return factOrdenMapper;
	}

	public void setFactOrdenMapper(FactOrdenMapper factOrdenMapper) {
		this.factOrdenMapper = factOrdenMapper;
	}


	public int countByExample(FactOrdenExample example) {
		return factOrdenMapper.countByExample(example);
	}


	public int deleteByExample(FactOrdenExample example) {
		return factOrdenMapper.deleteByExample(example);
	}


	public int insert(FactOrden record) {
		return factOrdenMapper.insert(record);
	}


	public int insertSelective(FactOrden record) {
		return factOrdenMapper.insertSelective(record);
	}


	public List<FactOrden> selectByExample(FactOrdenExample example) {
		return factOrdenMapper.selectByExample(example);
	}


	public int updateByExampleSelective(FactOrden record,
			FactOrdenExample example) {
		return factOrdenMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(FactOrden record, FactOrdenExample example) {
		return factOrdenMapper.updateByExample(record, example);
	}

}

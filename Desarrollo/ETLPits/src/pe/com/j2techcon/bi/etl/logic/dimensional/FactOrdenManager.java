package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.FactOrdenMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactOrden;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactOrdenExample;

public class FactOrdenManager {
	
	private FactOrdenMapper factOrdenMapper;

	public FactOrdenMapper getFactOrdenMapper() throws Exception {
		return factOrdenMapper;
	}

	public void setFactOrdenMapper(FactOrdenMapper factOrdenMapper) throws Exception {
		this.factOrdenMapper = factOrdenMapper;
	}


	public int countByExample(FactOrdenExample example) throws Exception {
		return factOrdenMapper.countByExample(example);
	}


	public int deleteByExample(FactOrdenExample example) throws Exception {
		return factOrdenMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer ordenKey) throws Exception {
		return factOrdenMapper.deleteByPrimaryKey(ordenKey);
	}


	public int insert(FactOrden record) throws Exception {
		return factOrdenMapper.insert(record);
	}


	public int insertSelective(FactOrden record) throws Exception {
		return factOrdenMapper.insertSelective(record);
	}


	public List<FactOrden> selectByExample(FactOrdenExample example) throws Exception {
		return factOrdenMapper.selectByExample(example);
	}


	public FactOrden selectByPrimaryKey(Integer ordenKey) throws Exception {
		return factOrdenMapper.selectByPrimaryKey(ordenKey);
	}


	public int updateByExampleSelective(FactOrden record,
			FactOrdenExample example) throws Exception {
		return factOrdenMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(FactOrden record, FactOrdenExample example) throws Exception {
		return factOrdenMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(FactOrden record) throws Exception {
		return factOrdenMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(FactOrden record) throws Exception {
		return factOrdenMapper.updateByPrimaryKey(record);
	}

}

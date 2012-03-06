package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.FactDespachoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactDespacho;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactDespachoExample;

public class FactDespachoManager {
	
	private FactDespachoMapper factDespachoMapper;

	public FactDespachoMapper getFactDespachoMapper() {
		return factDespachoMapper;
	}

	public void setFactDespachoMapper(FactDespachoMapper factDespachoMapper) {
		this.factDespachoMapper = factDespachoMapper;
	}


	public int countByExample(FactDespachoExample example) {
		return factDespachoMapper.countByExample(example);
	}


	public int deleteByExample(FactDespachoExample example) {
		return factDespachoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer despachoKey) {
		return factDespachoMapper.deleteByPrimaryKey(despachoKey);
	}


	public int insert(FactDespacho record) {
		return factDespachoMapper.insert(record);
	}


	public int insertSelective(FactDespacho record) {
		return factDespachoMapper.insertSelective(record);
	}


	public List<FactDespacho> selectByExample(FactDespachoExample example) {
		return factDespachoMapper.selectByExample(example);
	}


	public FactDespacho selectByPrimaryKey(Integer despachoKey) {
		return factDespachoMapper.selectByPrimaryKey(despachoKey);
	}


	public int updateByExampleSelective(FactDespacho record,
			FactDespachoExample example) {
		return factDespachoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(FactDespacho record, FactDespachoExample example) {
		return factDespachoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(FactDespacho record) {
		return factDespachoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(FactDespacho record) {
		return factDespachoMapper.updateByPrimaryKey(record);
	}

}

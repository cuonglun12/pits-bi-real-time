package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.FactDespachoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactDespacho;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactDespachoExample;

public class FactDespachoManager {
	
	private FactDespachoMapper factDespachoMapper;

	public FactDespachoMapper getFactDespachoMapper() throws Exception {
		return factDespachoMapper;
	}

	public void setFactDespachoMapper(FactDespachoMapper factDespachoMapper) throws Exception {
		this.factDespachoMapper = factDespachoMapper;
	}


	public int countByExample(FactDespachoExample example) throws Exception {
		return factDespachoMapper.countByExample(example);
	}


	public int deleteByExample(FactDespachoExample example) throws Exception {
		return factDespachoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer despachoKey) throws Exception {
		return factDespachoMapper.deleteByPrimaryKey(despachoKey);
	}


	public int insert(FactDespacho record) throws Exception {
		return factDespachoMapper.insert(record);
	}


	public int insertSelective(FactDespacho record) throws Exception {
		return factDespachoMapper.insertSelective(record);
	}


	public List<FactDespacho> selectByExample(FactDespachoExample example) throws Exception {
		return factDespachoMapper.selectByExample(example);
	}


	public FactDespacho selectByPrimaryKey(Integer despachoKey) throws Exception {
		return factDespachoMapper.selectByPrimaryKey(despachoKey);
	}


	public int updateByExampleSelective(FactDespacho record,
			FactDespachoExample example) throws Exception {
		return factDespachoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(FactDespacho record, FactDespachoExample example) throws Exception {
		return factDespachoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(FactDespacho record) throws Exception {
		return factDespachoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(FactDespacho record) throws Exception {
		return factDespachoMapper.updateByPrimaryKey(record);
	}

}

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


	public int insert(FactDespacho record) {
		return factDespachoMapper.insert(record);
	}


	public int insertSelective(FactDespacho record) {
		return factDespachoMapper.insertSelective(record);
	}


	public List<FactDespacho> selectByExample(FactDespachoExample example) {
		return factDespachoMapper.selectByExample(example);
	}


	public int updateByExampleSelective(FactDespacho record,
			FactDespachoExample example) {
		return factDespachoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(FactDespacho record, FactDespachoExample example) {
		return factDespachoMapper.updateByExample(record, example);
	}

}

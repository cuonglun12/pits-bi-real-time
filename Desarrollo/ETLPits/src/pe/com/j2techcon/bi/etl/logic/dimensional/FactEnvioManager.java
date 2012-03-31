package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.FactEnvioMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactEnvio;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactEnvioExample;

public class FactEnvioManager {
	
	private FactEnvioMapper factEnvioMapper;

	public FactEnvioMapper getFactEnvioMapper() {
		return factEnvioMapper;
	}

	public void setFactEnvioMapper(FactEnvioMapper factEnvioMapper) {
		this.factEnvioMapper = factEnvioMapper;
	}

	public int countByExample(FactEnvioExample example) {
		return factEnvioMapper.countByExample(example);
	}

	public int deleteByExample(FactEnvioExample example) {
		return factEnvioMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer envioKey) {
		return factEnvioMapper.deleteByPrimaryKey(envioKey);
	}

	public int insert(FactEnvio record) {
		return factEnvioMapper.insert(record);
	}

	public int insertSelective(FactEnvio record) {
		return factEnvioMapper.insertSelective(record);
	}

	public List<FactEnvio> selectByExample(FactEnvioExample example) {
		return factEnvioMapper.selectByExample(example);
	}

	public FactEnvio selectByPrimaryKey(Integer envioKey) {
		return factEnvioMapper.selectByPrimaryKey(envioKey);
	}

	public int updateByExampleSelective(FactEnvio record,
			FactEnvioExample example) {
		return factEnvioMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(FactEnvio record, FactEnvioExample example) {
		return factEnvioMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(FactEnvio record) {
		return factEnvioMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(FactEnvio record) {
		return factEnvioMapper.updateByPrimaryKey(record);
	}

}

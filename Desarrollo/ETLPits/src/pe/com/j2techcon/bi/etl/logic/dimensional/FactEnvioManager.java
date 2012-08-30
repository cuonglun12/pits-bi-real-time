package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.FactEnvioMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactEnvio;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactEnvioExample;

public class FactEnvioManager {
	
	private FactEnvioMapper factEnvioMapper;

	public FactEnvioMapper getFactEnvioMapper() throws Exception {
		return factEnvioMapper;
	}

	public void setFactEnvioMapper(FactEnvioMapper factEnvioMapper) throws Exception {
		this.factEnvioMapper = factEnvioMapper;
	}

	public int countByExample(FactEnvioExample example) throws Exception {
		return factEnvioMapper.countByExample(example);
	}

	public int deleteByExample(FactEnvioExample example) throws Exception {
		return factEnvioMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer envioKey) throws Exception {
		return factEnvioMapper.deleteByPrimaryKey(envioKey);
	}

	public int insert(FactEnvio record) throws Exception {
		return factEnvioMapper.insert(record);
	}

	public int insertSelective(FactEnvio record) throws Exception {
		return factEnvioMapper.insertSelective(record);
	}

	public List<FactEnvio> selectByExample(FactEnvioExample example) throws Exception {
		return factEnvioMapper.selectByExample(example);
	}

	public FactEnvio selectByPrimaryKey(Integer envioKey) throws Exception {
		return factEnvioMapper.selectByPrimaryKey(envioKey);
	}

	public int updateByExampleSelective(FactEnvio record,
			FactEnvioExample example) throws Exception {
		return factEnvioMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(FactEnvio record, FactEnvioExample example) throws Exception {
		return factEnvioMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(FactEnvio record) throws Exception {
		return factEnvioMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(FactEnvio record) throws Exception {
		return factEnvioMapper.updateByPrimaryKey(record);
	}

}

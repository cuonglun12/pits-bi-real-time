package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TClienteMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TClienteExample;

public class TClienteManager {

	private TClienteMapper tClienteMapper;
	
	public TClienteMapper gettClienteMapper() throws Exception {
		return tClienteMapper;
	}

	public void settClienteMapper(TClienteMapper tClienteMapper) throws Exception {
		this.tClienteMapper = tClienteMapper;
	}

	public int countByExample(TClienteExample example) throws Exception {
		return tClienteMapper.countByExample(example);
	}

	public int deleteByExample(TClienteExample example) throws Exception {
		return tClienteMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer cliId) throws Exception {
		return tClienteMapper.deleteByPrimaryKey(cliId);
	}

	public int insert(TCliente record) throws Exception {
		return tClienteMapper.insert(record);
	}

	public int insertSelective(TCliente record) throws Exception {
		return tClienteMapper.insertSelective(record);
	}

	public List<TCliente> selectByExample(TClienteExample example) throws Exception {
		return tClienteMapper.selectByExample(example);
	}

	public TCliente selectByPrimaryKey(Integer cliId) throws Exception {
		return tClienteMapper.selectByPrimaryKey(cliId);
	}

	public int updateByExampleSelective(TCliente record, TClienteExample example) throws Exception {
		return tClienteMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TCliente record, TClienteExample example) throws Exception {
		return tClienteMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TCliente record) throws Exception {
		return tClienteMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCliente record) throws Exception {
		return tClienteMapper.updateByPrimaryKey(record);
	}

}

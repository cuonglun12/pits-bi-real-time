package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TClienteMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TClienteExample;

public class TClienteManager {

	private TClienteMapper tClienteMapper;
	
	public TClienteMapper gettClienteMapper() {
		return tClienteMapper;
	}

	public void settClienteMapper(TClienteMapper tClienteMapper) {
		this.tClienteMapper = tClienteMapper;
	}

	public int countByExample(TClienteExample example) {
		return tClienteMapper.countByExample(example);
	}

	public int deleteByExample(TClienteExample example) {
		return tClienteMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer cliId) {
		return tClienteMapper.deleteByPrimaryKey(cliId);
	}

	public int insert(TCliente record) {
		return tClienteMapper.insert(record);
	}

	public int insertSelective(TCliente record) {
		return tClienteMapper.insertSelective(record);
	}

	public List<TCliente> selectByExample(TClienteExample example) {
		return tClienteMapper.selectByExample(example);
	}

	public TCliente selectByPrimaryKey(Integer cliId) {
		return tClienteMapper.selectByPrimaryKey(cliId);
	}

	public int updateByExampleSelective(TCliente record, TClienteExample example) {
		return tClienteMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TCliente record, TClienteExample example) {
		return tClienteMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TCliente record) {
		return tClienteMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCliente record) {
		return tClienteMapper.updateByPrimaryKey(record);
	}

}

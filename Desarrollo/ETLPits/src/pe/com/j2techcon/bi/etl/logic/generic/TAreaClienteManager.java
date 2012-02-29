package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TAreaClienteMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaClienteExample;

public class TAreaClienteManager {
	
	private TAreaClienteMapper tAreaClienteMapper;

	public TAreaClienteMapper gettAreaClienteMapper() {
		return tAreaClienteMapper;
	}

	public void settAreaClienteMapper(TAreaClienteMapper tAreaClienteMapper) {
		this.tAreaClienteMapper = tAreaClienteMapper;
	}

	public int countByExample(TAreaClienteExample example) {
		return tAreaClienteMapper.countByExample(example);
	}

	public int deleteByExample(TAreaClienteExample example) {
		return tAreaClienteMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer areCliId) {
		return tAreaClienteMapper.deleteByPrimaryKey(areCliId);
	}

	public int insert(TAreaCliente record) {
		return tAreaClienteMapper.insert(record);
	}

	public int insertSelective(TAreaCliente record) {
		return tAreaClienteMapper.insertSelective(record);
	}

	public List<TAreaCliente> selectByExample(TAreaClienteExample example) {
		return tAreaClienteMapper.selectByExample(example);
	}

	public TAreaCliente selectByPrimaryKey(Integer areCliId) {
		return tAreaClienteMapper.selectByPrimaryKey(areCliId);
	}

	public int updateByExampleSelective(TAreaCliente record,
			TAreaClienteExample example) {
		return tAreaClienteMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TAreaCliente record, TAreaClienteExample example) {
		return tAreaClienteMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TAreaCliente record) {
		return tAreaClienteMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TAreaCliente record) {
		return tAreaClienteMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TAreaClienteMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaClienteExample;

public class TAreaClienteManager {
	
	private TAreaClienteMapper tAreaClienteMapper;

	public TAreaClienteMapper gettAreaClienteMapper() throws Exception {
		return tAreaClienteMapper;
	}

	public void settAreaClienteMapper(TAreaClienteMapper tAreaClienteMapper) throws Exception {
		this.tAreaClienteMapper = tAreaClienteMapper;
	}

	public int countByExample(TAreaClienteExample example) throws Exception {
		return tAreaClienteMapper.countByExample(example);
	}

	public int deleteByExample(TAreaClienteExample example) throws Exception {
		return tAreaClienteMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer areCliId) throws Exception {
		return tAreaClienteMapper.deleteByPrimaryKey(areCliId);
	}

	public int insert(TAreaCliente record) throws Exception {
		return tAreaClienteMapper.insert(record);
	}

	public int insertSelective(TAreaCliente record) throws Exception {
		return tAreaClienteMapper.insertSelective(record);
	}

	public List<TAreaCliente> selectByExample(TAreaClienteExample example) throws Exception {
		return tAreaClienteMapper.selectByExample(example);
	}

	public TAreaCliente selectByPrimaryKey(Integer areCliId) throws Exception {
		return tAreaClienteMapper.selectByPrimaryKey(areCliId);
	}

	public int updateByExampleSelective(TAreaCliente record,
			TAreaClienteExample example) throws Exception {
		return tAreaClienteMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TAreaCliente record, TAreaClienteExample example) throws Exception {
		return tAreaClienteMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TAreaCliente record) throws Exception {
		return tAreaClienteMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TAreaCliente record) throws Exception {
		return tAreaClienteMapper.updateByPrimaryKey(record);
	}

}

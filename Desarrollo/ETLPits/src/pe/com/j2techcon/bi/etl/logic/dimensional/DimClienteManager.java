package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimClienteMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimCliente;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimClienteExample;

public class DimClienteManager {

	private DimClienteMapper dimClienteMapper;
	
	public DimClienteMapper getDimClienteMapper() {
		return dimClienteMapper;
	}

	public void setDimClienteMapper(DimClienteMapper dimClienteMapper) {
		this.dimClienteMapper = dimClienteMapper;
	}


	public int countByExample(DimClienteExample example) {
		return dimClienteMapper.countByExample(example);
	}


	public int deleteByExample(DimClienteExample example) {
		return dimClienteMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer clienteKey) {
		return dimClienteMapper.deleteByPrimaryKey(clienteKey);
	}


	public int insert(DimCliente record) {
		return dimClienteMapper.insert(record);
	}


	public int insertSelective(DimCliente record) {
		return dimClienteMapper.insertSelective(record);
	}


	public List<DimCliente> selectByExample(DimClienteExample example) {
		return dimClienteMapper.selectByExample(example);
	}


	public DimCliente selectByPrimaryKey(Integer clienteKey) {
		return dimClienteMapper.selectByPrimaryKey(clienteKey);
	}


	public int updateByExampleSelective(DimCliente record,
			DimClienteExample example) {
		return dimClienteMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimCliente record, DimClienteExample example) {
		return dimClienteMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimCliente record) {
		return dimClienteMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimCliente record) {
		return dimClienteMapper.updateByPrimaryKey(record);
	}

}

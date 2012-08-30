package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimClienteMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimCliente;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimClienteExample;

public class DimClienteManager {

	private DimClienteMapper dimClienteMapper;
	
	public DimClienteMapper getDimClienteMapper() throws Exception {
		return dimClienteMapper;
	}

	public void setDimClienteMapper(DimClienteMapper dimClienteMapper) throws Exception {
		this.dimClienteMapper = dimClienteMapper;
	}


	public int countByExample(DimClienteExample example) throws Exception {
		return dimClienteMapper.countByExample(example);
	}


	public int deleteByExample(DimClienteExample example) throws Exception {
		return dimClienteMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer clienteKey) throws Exception {
		return dimClienteMapper.deleteByPrimaryKey(clienteKey);
	}


	public int insert(DimCliente record) throws Exception {
		return dimClienteMapper.insert(record);
	}


	public int insertSelective(DimCliente record) throws Exception {
		return dimClienteMapper.insertSelective(record);
	}


	public List<DimCliente> selectByExample(DimClienteExample example) throws Exception {
		return dimClienteMapper.selectByExample(example);
	}


	public DimCliente selectByPrimaryKey(Integer clienteKey) throws Exception {
		return dimClienteMapper.selectByPrimaryKey(clienteKey);
	}


	public int updateByExampleSelective(DimCliente record,
			DimClienteExample example) throws Exception {
		return dimClienteMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimCliente record, DimClienteExample example) throws Exception {
		return dimClienteMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimCliente record) throws Exception {
		return dimClienteMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimCliente record) throws Exception {
		return dimClienteMapper.updateByPrimaryKey(record);
	}

}

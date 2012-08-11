package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.ClienteMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Cliente;
import pe.com.j2techcon.bi.etl.domain.origen.ClienteExample;

public class ClienteManager {
	
	private ClienteMapper clienteMapper;

	public ClienteMapper getClienteMapper() {
		return clienteMapper;
	}

	public void setClienteMapper(ClienteMapper clienteMapper) {
		this.clienteMapper = clienteMapper;
	}

	public int countByExample(ClienteExample example) {
		return clienteMapper.countByExample(example);
	}

	public int deleteByExample(ClienteExample example) {
		return clienteMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codcliente) {
		return clienteMapper.deleteByPrimaryKey(codcliente);
	}

	public int insert(Cliente record) {
		return clienteMapper.insert(record);
	}

	public int insertSelective(Cliente record) {
		return clienteMapper.insertSelective(record);
	}

	public List<Cliente> selectByExample(ClienteExample example) {
		return clienteMapper.selectByExample(example);
	}

	public Cliente selectByPrimaryKey(String codcliente) {
		return clienteMapper.selectByPrimaryKey(codcliente);
	}

	public int updateByExampleSelective(Cliente record, ClienteExample example) {
		return clienteMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Cliente record, ClienteExample example) {
		return clienteMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Cliente record) {
		return clienteMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Cliente record) {
		return clienteMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.ClienteMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Cliente;
import pe.com.j2techcon.bi.etl.domain.origen.ClienteExample;

public class ClienteManager {
	
	private ClienteMapper clienteMapper;

	public ClienteMapper getClienteMapper() throws Exception {
		return clienteMapper;
	}

	public void setClienteMapper(ClienteMapper clienteMapper) throws Exception {
		this.clienteMapper = clienteMapper;
	}

	public int countByExample(ClienteExample example) throws Exception {
		return clienteMapper.countByExample(example);
	}

	public int deleteByExample(ClienteExample example) throws Exception {
		return clienteMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codcliente) throws Exception {
		return clienteMapper.deleteByPrimaryKey(codcliente);
	}

	public int insert(Cliente record) throws Exception {
		return clienteMapper.insert(record);
	}

	public int insertSelective(Cliente record) throws Exception {
		return clienteMapper.insertSelective(record);
	}

	public List<Cliente> selectByExample(ClienteExample example) throws Exception {
		return clienteMapper.selectByExample(example);
	}

	public Cliente selectByPrimaryKey(String codcliente) throws Exception {
		return clienteMapper.selectByPrimaryKey(codcliente);
	}

	public int updateByExampleSelective(Cliente record, ClienteExample example) throws Exception {
		return clienteMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Cliente record, ClienteExample example) throws Exception {
		return clienteMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Cliente record) throws Exception {
		return clienteMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Cliente record) throws Exception {
		return clienteMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.OrdenesMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Ordenes;
import pe.com.j2techcon.bi.etl.domain.origen.OrdenesExample;

public class OrdenesManager {

	private OrdenesMapper ordenesMapper;
	
	public OrdenesMapper getOrdenesMapper() throws Exception {
		return ordenesMapper;
	}

	public void setOrdenesMapper(OrdenesMapper ordenesMapper) throws Exception {
		this.ordenesMapper = ordenesMapper;
	}

	public int countByExample(OrdenesExample example) throws Exception {
		return ordenesMapper.countByExample(example);
	}

	public int deleteByExample(OrdenesExample example) throws Exception {
		return ordenesMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String serie, String orden) throws Exception {
		return ordenesMapper.deleteByPrimaryKey(serie, orden);
	}

	public int insert(Ordenes record) throws Exception {
		return ordenesMapper.insert(record);
	}

	public int insertSelective(Ordenes record) throws Exception {
		return ordenesMapper.insertSelective(record);
	}

	public List<Ordenes> selectByExample(OrdenesExample example) throws Exception {
		return ordenesMapper.selectByExample(example);
	}

	public Ordenes selectByPrimaryKey(String serie, String orden) throws Exception {
		return ordenesMapper.selectByPrimaryKey(serie, orden);
	}

	public int updateByExampleSelective(Ordenes record, OrdenesExample example) throws Exception {
		return ordenesMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Ordenes record, OrdenesExample example) throws Exception {
		return ordenesMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Ordenes record) throws Exception {
		return ordenesMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Ordenes record) throws Exception {
		return ordenesMapper.updateByPrimaryKey(record);
	}

}

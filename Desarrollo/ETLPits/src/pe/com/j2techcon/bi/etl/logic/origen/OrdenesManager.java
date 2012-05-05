package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.OrdenesMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Ordenes;
import pe.com.j2techcon.bi.etl.domain.origen.OrdenesExample;

public class OrdenesManager {

	private OrdenesMapper ordenesMapper;
	
	public OrdenesMapper getOrdenesMapper() {
		return ordenesMapper;
	}

	public void setOrdenesMapper(OrdenesMapper ordenesMapper) {
		this.ordenesMapper = ordenesMapper;
	}

	public int countByExample(OrdenesExample example) {
		return ordenesMapper.countByExample(example);
	}

	public int deleteByExample(OrdenesExample example) {
		return ordenesMapper.deleteByExample(example);
	}

	public int insert(Ordenes record) {
		return ordenesMapper.insert(record);
	}

	public int insertSelective(Ordenes record) {
		return ordenesMapper.insertSelective(record);
	}

	public List<Ordenes> selectByExample(OrdenesExample example) {
		return ordenesMapper.selectByExample(example);
	}

	public int updateByExampleSelective(Ordenes record, OrdenesExample example) {
		return ordenesMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Ordenes record, OrdenesExample example) {
		return ordenesMapper.updateByExample(record, example);
	}

}

package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TServicioMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TServicio;
import pe.com.j2techcon.bi.etl.domain.generic.TServicioExample;

public class TServicioManager {
	
	private TServicioMapper tServicioMapper;

	public TServicioMapper gettServicioMapper() {
		return tServicioMapper;
	}

	public void settServicioMapper(TServicioMapper tServicioMapper) {
		this.tServicioMapper = tServicioMapper;
	}

	public int countByExample(TServicioExample example) {
		return tServicioMapper.countByExample(example);
	}

	public int deleteByExample(TServicioExample example) {
		return tServicioMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer servId) {
		return tServicioMapper.deleteByPrimaryKey(servId);
	}

	public int insert(TServicio record) {
		return tServicioMapper.insert(record);
	}

	public int insertSelective(TServicio record) {
		return tServicioMapper.insertSelective(record);
	}

	public List<TServicio> selectByExample(TServicioExample example) {
		return tServicioMapper.selectByExample(example);
	}

	public TServicio selectByPrimaryKey(Integer servId) {
		return tServicioMapper.selectByPrimaryKey(servId);
	}

	public int updateByExampleSelective(TServicio record,
			TServicioExample example) {
		return tServicioMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TServicio record, TServicioExample example) {
		return tServicioMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TServicio record) {
		return tServicioMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TServicio record) {
		return tServicioMapper.updateByPrimaryKey(record);
	}

}

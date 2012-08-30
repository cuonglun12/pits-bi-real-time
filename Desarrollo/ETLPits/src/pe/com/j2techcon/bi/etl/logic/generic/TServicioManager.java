package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TServicioMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TServicio;
import pe.com.j2techcon.bi.etl.domain.generic.TServicioExample;

public class TServicioManager {
	
	private TServicioMapper tServicioMapper;

	public TServicioMapper gettServicioMapper() throws Exception {
		return tServicioMapper;
	}

	public void settServicioMapper(TServicioMapper tServicioMapper) throws Exception {
		this.tServicioMapper = tServicioMapper;
	}

	public int countByExample(TServicioExample example) throws Exception {
		return tServicioMapper.countByExample(example);
	}

	public int deleteByExample(TServicioExample example) throws Exception {
		return tServicioMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer servId) throws Exception {
		return tServicioMapper.deleteByPrimaryKey(servId);
	}

	public int insert(TServicio record) throws Exception {
		return tServicioMapper.insert(record);
	}

	public int insertSelective(TServicio record) throws Exception {
		return tServicioMapper.insertSelective(record);
	}

	public List<TServicio> selectByExample(TServicioExample example) throws Exception {
		return tServicioMapper.selectByExample(example);
	}

	public TServicio selectByPrimaryKey(Integer servId) throws Exception {
		return tServicioMapper.selectByPrimaryKey(servId);
	}

	public int updateByExampleSelective(TServicio record,
			TServicioExample example) throws Exception {
		return tServicioMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TServicio record, TServicioExample example) throws Exception {
		return tServicioMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TServicio record) throws Exception {
		return tServicioMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TServicio record) throws Exception {
		return tServicioMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TZonaMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TZona;
import pe.com.j2techcon.bi.etl.domain.generic.TZonaExample;

public class TZonaManager {
	
	private TZonaMapper tZonaMapper;

	public TZonaMapper gettZonaMapper() {
		return tZonaMapper;
	}

	public void settZonaMapper(TZonaMapper tZonaMapper) {
		this.tZonaMapper = tZonaMapper;
	}

	public int countByExample(TZonaExample example) {
		return tZonaMapper.countByExample(example);
	}

	public int deleteByExample(TZonaExample example) {
		return tZonaMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer zonId) {
		return tZonaMapper.deleteByPrimaryKey(zonId);
	}

	public int insert(TZona record) {
		return tZonaMapper.insert(record);
	}

	public int insertSelective(TZona record) {
		return tZonaMapper.insertSelective(record);
	}

	public List<TZona> selectByExample(TZonaExample example) {
		return tZonaMapper.selectByExample(example);
	}

	public TZona selectByPrimaryKey(Integer zonId) {
		return tZonaMapper.selectByPrimaryKey(zonId);
	}

	public int updateByExampleSelective(TZona record, TZonaExample example) {
		return tZonaMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TZona record, TZonaExample example) {
		return tZonaMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TZona record) {
		return tZonaMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TZona record) {
		return tZonaMapper.updateByPrimaryKey(record);
	}

}

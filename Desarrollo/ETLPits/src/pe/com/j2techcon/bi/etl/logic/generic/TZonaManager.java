package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TZonaMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TZona;
import pe.com.j2techcon.bi.etl.domain.generic.TZonaExample;

public class TZonaManager {
	
	private TZonaMapper tZonaMapper;

	public TZonaMapper gettZonaMapper() throws Exception {
		return tZonaMapper;
	}

	public void settZonaMapper(TZonaMapper tZonaMapper) throws Exception {
		this.tZonaMapper = tZonaMapper;
	}

	public int countByExample(TZonaExample example) throws Exception {
		return tZonaMapper.countByExample(example);
	}

	public int deleteByExample(TZonaExample example) throws Exception {
		return tZonaMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer zonId) throws Exception {
		return tZonaMapper.deleteByPrimaryKey(zonId);
	}

	public int insert(TZona record) throws Exception {
		return tZonaMapper.insert(record);
	}

	public int insertSelective(TZona record) throws Exception {
		return tZonaMapper.insertSelective(record);
	}

	public List<TZona> selectByExample(TZonaExample example) throws Exception {
		return tZonaMapper.selectByExample(example);
	}

	public TZona selectByPrimaryKey(Integer zonId) throws Exception {
		return tZonaMapper.selectByPrimaryKey(zonId);
	}

	public int updateByExampleSelective(TZona record, TZonaExample example) throws Exception {
		return tZonaMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TZona record, TZonaExample example) throws Exception {
		return tZonaMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TZona record) throws Exception {
		return tZonaMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TZona record) throws Exception {
		return tZonaMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TParametroMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;

public class TParametroManager {
	
	private TParametroMapper tParametroMapper;

	public TParametroMapper gettParametroMapper() {
		return tParametroMapper;
	}

	public void settParametroMapper(TParametroMapper tParametroMapper) {
		this.tParametroMapper = tParametroMapper;
	}

	public int countByExample(TParametroExample example) {
		return tParametroMapper.countByExample(example);
	}

	public int deleteByExample(TParametroExample example) {
		return tParametroMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer paramId) {
		return tParametroMapper.deleteByPrimaryKey(paramId);
	}

	public int insert(TParametro record) {
		return tParametroMapper.insert(record);
	}

	public int insertSelective(TParametro record) {
		return tParametroMapper.insertSelective(record);
	}

	public List<TParametro> selectByExample(TParametroExample example) {
		return tParametroMapper.selectByExample(example);
	}

	public TParametro selectByPrimaryKey(Integer paramId) {
		return tParametroMapper.selectByPrimaryKey(paramId);
	}

	public int updateByExampleSelective(TParametro record,
			TParametroExample example) {
		return tParametroMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TParametro record, TParametroExample example) {
		return tParametroMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TParametro record) {
		return tParametroMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TParametro record) {
		return tParametroMapper.updateByPrimaryKey(record);
	}

}

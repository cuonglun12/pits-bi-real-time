package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TParametroMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;

public class TParametroManager {
	
	private TParametroMapper tParametroMapper;

	public TParametroMapper gettParametroMapper() throws Exception {
		return tParametroMapper;
	}

	public void settParametroMapper(TParametroMapper tParametroMapper) throws Exception {
		this.tParametroMapper = tParametroMapper;
	}

	public int countByExample(TParametroExample example) throws Exception {
		return tParametroMapper.countByExample(example);
	}

	public int deleteByExample(TParametroExample example) throws Exception {
		return tParametroMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer paramId) throws Exception {
		return tParametroMapper.deleteByPrimaryKey(paramId);
	}

	public int insert(TParametro record) throws Exception {
		return tParametroMapper.insert(record);
	}

	public int insertSelective(TParametro record) throws Exception {
		return tParametroMapper.insertSelective(record);
	}

	public List<TParametro> selectByExample(TParametroExample example) throws Exception {
		return tParametroMapper.selectByExample(example);
	}

	public TParametro selectByPrimaryKey(Integer paramId) throws Exception {
		return tParametroMapper.selectByPrimaryKey(paramId);
	}

	public int updateByExampleSelective(TParametro record,
			TParametroExample example) throws Exception {
		return tParametroMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TParametro record, TParametroExample example) throws Exception {
		return tParametroMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TParametro record) throws Exception {
		return tParametroMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TParametro record) throws Exception {
		return tParametroMapper.updateByPrimaryKey(record);
	}

}

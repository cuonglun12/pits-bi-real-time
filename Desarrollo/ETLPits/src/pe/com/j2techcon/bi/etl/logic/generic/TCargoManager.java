package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TCargoMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TCargo;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoExample;

public class TCargoManager {
	
	private TCargoMapper tCargoMapper;

	public TCargoMapper gettCargoMapper() throws Exception {
		return tCargoMapper;
	}

	public void settCargoMapper(TCargoMapper tCargoMapper) throws Exception {
		this.tCargoMapper = tCargoMapper;
	}

	public int countByExample(TCargoExample example) throws Exception {
		return tCargoMapper.countByExample(example);
	}

	public int deleteByExample(TCargoExample example) throws Exception {
		return tCargoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer carDespId) throws Exception {
		return tCargoMapper.deleteByPrimaryKey(carDespId);
	}

	public int insert(TCargo record) throws Exception {
		return tCargoMapper.insert(record);
	}

	public int insertSelective(TCargo record) throws Exception {
		return tCargoMapper.insertSelective(record);
	}

	public List<TCargo> selectByExample(TCargoExample example) throws Exception {
		return tCargoMapper.selectByExample(example);
	}

	public TCargo selectByPrimaryKey(Integer carDespId) throws Exception {
		return tCargoMapper.selectByPrimaryKey(carDespId);
	}

	public int updateByExampleSelective(TCargo record,
			TCargoExample example) throws Exception {
		return tCargoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TCargo record,
			TCargoExample example) throws Exception {
		return tCargoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TCargo record) throws Exception {
		return tCargoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCargo record) throws Exception {
		return tCargoMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TCargoMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TCargo;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoExample;

public class TCargoManager {
	
	private TCargoMapper tCargoMapper;

	public TCargoMapper gettCargoMapper() {
		return tCargoMapper;
	}

	public void settCargoMapper(TCargoMapper tCargoMapper) {
		this.tCargoMapper = tCargoMapper;
	}

	public int countByExample(TCargoExample example) {
		return tCargoMapper.countByExample(example);
	}

	public int deleteByExample(TCargoExample example) {
		return tCargoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer carDespId) {
		return tCargoMapper.deleteByPrimaryKey(carDespId);
	}

	public int insert(TCargo record) {
		return tCargoMapper.insert(record);
	}

	public int insertSelective(TCargo record) {
		return tCargoMapper.insertSelective(record);
	}

	public List<TCargo> selectByExample(TCargoExample example) {
		return tCargoMapper.selectByExample(example);
	}

	public TCargo selectByPrimaryKey(Integer carDespId) {
		return tCargoMapper.selectByPrimaryKey(carDespId);
	}

	public int updateByExampleSelective(TCargo record,
			TCargoExample example) {
		return tCargoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TCargo record,
			TCargoExample example) {
		return tCargoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TCargo record) {
		return tCargoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCargo record) {
		return tCargoMapper.updateByPrimaryKey(record);
	}

}

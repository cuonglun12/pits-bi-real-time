package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TSedeMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TSede;
import pe.com.j2techcon.bi.etl.domain.generic.TSedeExample;

public class TSedeManager {
	
	private TSedeMapper tSedeMapper;

	public TSedeMapper gettSedeMapper() {
		return tSedeMapper;
	}

	public void settSedeMapper(TSedeMapper tSedeMapper) {
		this.tSedeMapper = tSedeMapper;
	}

	public int countByExample(TSedeExample example) {
		return tSedeMapper.countByExample(example);
	}

	public int deleteByExample(TSedeExample example) {
		return tSedeMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer sedId) {
		return tSedeMapper.deleteByPrimaryKey(sedId);
	}

	public int insert(TSede record) {
		return tSedeMapper.insert(record);
	}

	public int insertSelective(TSede record) {
		return tSedeMapper.insertSelective(record);
	}

	public List<TSede> selectByExample(TSedeExample example) {
		return tSedeMapper.selectByExample(example);
	}

	public TSede selectByPrimaryKey(Integer sedId) {
		return tSedeMapper.selectByPrimaryKey(sedId);
	}

	public int updateByExampleSelective(TSede record, TSedeExample example) {
		return tSedeMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TSede record, TSedeExample example) {
		return tSedeMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TSede record) {
		return tSedeMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TSede record) {
		return tSedeMapper.updateByPrimaryKey(record);
	}

}

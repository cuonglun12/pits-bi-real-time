package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TSedeMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TSede;
import pe.com.j2techcon.bi.etl.domain.generic.TSedeExample;

public class TSedeManager {
	
	private TSedeMapper tSedeMapper;

	public TSedeMapper gettSedeMapper() throws Exception {
		return tSedeMapper;
	}

	public void settSedeMapper(TSedeMapper tSedeMapper) throws Exception {
		this.tSedeMapper = tSedeMapper;
	}

	public int countByExample(TSedeExample example) throws Exception {
		return tSedeMapper.countByExample(example);
	}

	public int deleteByExample(TSedeExample example) throws Exception {
		return tSedeMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer sedId) throws Exception {
		return tSedeMapper.deleteByPrimaryKey(sedId);
	}

	public int insert(TSede record) throws Exception {
		return tSedeMapper.insert(record);
	}

	public int insertSelective(TSede record) throws Exception {
		return tSedeMapper.insertSelective(record);
	}

	public List<TSede> selectByExample(TSedeExample example) throws Exception {
		return tSedeMapper.selectByExample(example);
	}

	public TSede selectByPrimaryKey(Integer sedId) throws Exception {
		return tSedeMapper.selectByPrimaryKey(sedId);
	}

	public int updateByExampleSelective(TSede record, TSedeExample example) throws Exception {
		return tSedeMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TSede record, TSedeExample example) throws Exception {
		return tSedeMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TSede record) throws Exception {
		return tSedeMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TSede record) throws Exception {
		return tSedeMapper.updateByPrimaryKey(record);
	}

}

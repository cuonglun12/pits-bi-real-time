package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TOrdenMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TOrden;
import pe.com.j2techcon.bi.etl.domain.generic.TOrdenExample;

public class TOrdenManager {
	
	private TOrdenMapper tOrdenMapper;

	public TOrdenMapper gettOrdenMapper() throws Exception {
		return tOrdenMapper;
	}

	public void settOrdenMapper(TOrdenMapper tOrdenMapper) throws Exception {
		this.tOrdenMapper = tOrdenMapper;
	}

	public int countByExample(TOrdenExample example) throws Exception {
		return tOrdenMapper.countByExample(example);
	}

	public int deleteByExample(TOrdenExample example) throws Exception {
		return tOrdenMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer ordId) throws Exception {
		return tOrdenMapper.deleteByPrimaryKey(ordId);
	}

	public int insert(TOrden record) throws Exception {
		return tOrdenMapper.insert(record);
	}

	public int insertSelective(TOrden record) throws Exception {
		return tOrdenMapper.insertSelective(record);
	}

	public List<TOrden> selectByExample(TOrdenExample example) throws Exception {
		return tOrdenMapper.selectByExample(example);
	}

	public TOrden selectByPrimaryKey(Integer ordId) throws Exception {
		return tOrdenMapper.selectByPrimaryKey(ordId);
	}

	public int updateByExampleSelective(TOrden record, TOrdenExample example) throws Exception {
		return tOrdenMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TOrden record, TOrdenExample example) throws Exception {
		return tOrdenMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TOrden record) throws Exception {
		return tOrdenMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TOrden record) throws Exception {
		return tOrdenMapper.updateByPrimaryKey(record);
	}

}

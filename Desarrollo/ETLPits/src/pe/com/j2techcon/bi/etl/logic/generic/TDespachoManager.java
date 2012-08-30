package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TDespachoMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TDespachoExample;

public class TDespachoManager {
	
	private TDespachoMapper tDespachoMapper;

	public TDespachoMapper gettDespachoMapper() throws Exception {
		return tDespachoMapper;
	}

	public void settDespachoMapper(TDespachoMapper tDespachoMapper) throws Exception {
		this.tDespachoMapper = tDespachoMapper;
	}

	public int countByExample(TDespachoExample example) throws Exception {
		return tDespachoMapper.countByExample(example);
	}

	public int deleteByExample(TDespachoExample example) throws Exception {
		return tDespachoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer despId) throws Exception {
		return tDespachoMapper.deleteByPrimaryKey(despId);
	}

	public int insert(TDespacho record) throws Exception {
		return tDespachoMapper.insert(record);
	}

	public int insertSelective(TDespacho record) throws Exception {
		return tDespachoMapper.insertSelective(record);
	}

	public List<TDespacho> selectByExample(TDespachoExample example) throws Exception {
		return tDespachoMapper.selectByExample(example);
	}

	public TDespacho selectByPrimaryKey(Integer despId) throws Exception {
		return tDespachoMapper.selectByPrimaryKey(despId);
	}

	public int updateByExampleSelective(TDespacho record,
			TDespachoExample example) throws Exception {
		return tDespachoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TDespacho record, TDespachoExample example) throws Exception {
		return tDespachoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TDespacho record) throws Exception {
		return tDespachoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TDespacho record) throws Exception {
		return tDespachoMapper.updateByPrimaryKey(record);
	}

}

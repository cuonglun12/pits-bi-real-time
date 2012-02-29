package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TDespachoMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TDespachoExample;

public class TDespachoManager {
	
	private TDespachoMapper tDespachoMapper;

	public TDespachoMapper gettDespachoMapper() {
		return tDespachoMapper;
	}

	public void settDespachoMapper(TDespachoMapper tDespachoMapper) {
		this.tDespachoMapper = tDespachoMapper;
	}

	public int countByExample(TDespachoExample example) {
		return tDespachoMapper.countByExample(example);
	}

	public int deleteByExample(TDespachoExample example) {
		return tDespachoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer despId) {
		return tDespachoMapper.deleteByPrimaryKey(despId);
	}

	public int insert(TDespacho record) {
		return tDespachoMapper.insert(record);
	}

	public int insertSelective(TDespacho record) {
		return tDespachoMapper.insertSelective(record);
	}

	public List<TDespacho> selectByExample(TDespachoExample example) {
		return tDespachoMapper.selectByExample(example);
	}

	public TDespacho selectByPrimaryKey(Integer despId) {
		return tDespachoMapper.selectByPrimaryKey(despId);
	}

	public int updateByExampleSelective(TDespacho record,
			TDespachoExample example) {
		return tDespachoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TDespacho record, TDespachoExample example) {
		return tDespachoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TDespacho record) {
		return tDespachoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TDespacho record) {
		return tDespachoMapper.updateByPrimaryKey(record);
	}

}

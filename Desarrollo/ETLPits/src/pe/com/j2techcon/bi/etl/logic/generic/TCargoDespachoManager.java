package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TCargoDespachoMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespachoExample;

public class TCargoDespachoManager {
	
	private TCargoDespachoMapper tCargoDespachoMapper;

	public TCargoDespachoMapper gettCargoDespachoMapper() {
		return tCargoDespachoMapper;
	}

	public void settCargoDespachoMapper(TCargoDespachoMapper tCargoDespachoMapper) {
		this.tCargoDespachoMapper = tCargoDespachoMapper;
	}

	public int countByExample(TCargoDespachoExample example) {
		return tCargoDespachoMapper.countByExample(example);
	}

	public int deleteByExample(TCargoDespachoExample example) {
		return tCargoDespachoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer carDespId) {
		return tCargoDespachoMapper.deleteByPrimaryKey(carDespId);
	}

	public int insert(TCargoDespacho record) {
		return tCargoDespachoMapper.insert(record);
	}

	public int insertSelective(TCargoDespacho record) {
		return tCargoDespachoMapper.insertSelective(record);
	}

	public List<TCargoDespacho> selectByExample(TCargoDespachoExample example) {
		return tCargoDespachoMapper.selectByExample(example);
	}

	public TCargoDespacho selectByPrimaryKey(Integer carDespId) {
		return tCargoDespachoMapper.selectByPrimaryKey(carDespId);
	}

	public int updateByExampleSelective(TCargoDespacho record,
			TCargoDespachoExample example) {
		return tCargoDespachoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TCargoDespacho record,
			TCargoDespachoExample example) {
		return tCargoDespachoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TCargoDespacho record) {
		return tCargoDespachoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCargoDespacho record) {
		return tCargoDespachoMapper.updateByPrimaryKey(record);
	}

}

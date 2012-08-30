package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TCargoDespachoMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespachoExample;

public class TCargoDespachoManager {
	
	private TCargoDespachoMapper tCargoDespachoMapper;

	public TCargoDespachoMapper gettCargoDespachoMapper() throws Exception {
		return tCargoDespachoMapper;
	}

	public void settCargoDespachoMapper(TCargoDespachoMapper tCargoDespachoMapper) throws Exception {
		this.tCargoDespachoMapper = tCargoDespachoMapper;
	}

	public int countByExample(TCargoDespachoExample example) throws Exception {
		return tCargoDespachoMapper.countByExample(example);
	}

	public int deleteByExample(TCargoDespachoExample example) throws Exception {
		return tCargoDespachoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer carDespId) throws Exception {
		return tCargoDespachoMapper.deleteByPrimaryKey(carDespId);
	}

	public int insert(TCargoDespacho record) throws Exception {
		return tCargoDespachoMapper.insert(record);
	}

	public int insertSelective(TCargoDespacho record) throws Exception {
		return tCargoDespachoMapper.insertSelective(record);
	}

	public List<TCargoDespacho> selectByExample(TCargoDespachoExample example) throws Exception {
		return tCargoDespachoMapper.selectByExample(example);
	}

	public TCargoDespacho selectByPrimaryKey(Integer carDespId) throws Exception {
		return tCargoDespachoMapper.selectByPrimaryKey(carDespId);
	}

	public int updateByExampleSelective(TCargoDespacho record,
			TCargoDespachoExample example) throws Exception {
		return tCargoDespachoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TCargoDespacho record,
			TCargoDespachoExample example) throws Exception {
		return tCargoDespachoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TCargoDespacho record) throws Exception {
		return tCargoDespachoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCargoDespacho record) throws Exception {
		return tCargoDespachoMapper.updateByPrimaryKey(record);
	}

}

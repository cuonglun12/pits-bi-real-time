package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.TTipopersonalMapper;
import pe.com.j2techcon.bi.etl.domain.origen.TTipopersonal;
import pe.com.j2techcon.bi.etl.domain.origen.TTipopersonalExample;

public class TTipopersonalManager {
	
	private TTipopersonalMapper TTipopersonalMapper;

	public TTipopersonalMapper getTTipopersonalMapper() {
		return TTipopersonalMapper;
	}

	public void setTTipopersonalMapper(TTipopersonalMapper tTipopersonalMapper) {
		TTipopersonalMapper = tTipopersonalMapper;
	}

	public int countByExample(TTipopersonalExample example) {
		return TTipopersonalMapper.countByExample(example);
	}

	public int deleteByExample(TTipopersonalExample example) {
		return TTipopersonalMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codtipopersonal) {
		return TTipopersonalMapper.deleteByPrimaryKey(codtipopersonal);
	}

	public int insert(TTipopersonal record) {
		return TTipopersonalMapper.insert(record);
	}

	public int insertSelective(TTipopersonal record) {
		return TTipopersonalMapper.insertSelective(record);
	}

	public List<TTipopersonal> selectByExample(TTipopersonalExample example) {
		return TTipopersonalMapper.selectByExample(example);
	}

	public TTipopersonal selectByPrimaryKey(String codtipopersonal) {
		return TTipopersonalMapper.selectByPrimaryKey(codtipopersonal);
	}

	public int updateByExampleSelective(TTipopersonal record,
			TTipopersonalExample example) {
		return TTipopersonalMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TTipopersonal record,
			TTipopersonalExample example) {
		return TTipopersonalMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TTipopersonal record) {
		return TTipopersonalMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TTipopersonal record) {
		return TTipopersonalMapper.updateByPrimaryKey(record);
	}

}

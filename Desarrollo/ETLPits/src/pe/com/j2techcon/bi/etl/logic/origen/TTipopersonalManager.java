package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.TTipopersonalMapper;
import pe.com.j2techcon.bi.etl.domain.origen.TTipopersonal;
import pe.com.j2techcon.bi.etl.domain.origen.TTipopersonalExample;

public class TTipopersonalManager {
	
	private TTipopersonalMapper TTipopersonalMapper;

	public TTipopersonalMapper getTTipopersonalMapper() throws Exception {
		return TTipopersonalMapper;
	}

	public void setTTipopersonalMapper(TTipopersonalMapper tTipopersonalMapper) throws Exception {
		TTipopersonalMapper = tTipopersonalMapper;
	}

	public int countByExample(TTipopersonalExample example) throws Exception {
		return TTipopersonalMapper.countByExample(example);
	}

	public int deleteByExample(TTipopersonalExample example) throws Exception {
		return TTipopersonalMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codtipopersonal) throws Exception {
		return TTipopersonalMapper.deleteByPrimaryKey(codtipopersonal);
	}

	public int insert(TTipopersonal record) throws Exception {
		return TTipopersonalMapper.insert(record);
	}

	public int insertSelective(TTipopersonal record) throws Exception {
		return TTipopersonalMapper.insertSelective(record);
	}

	public List<TTipopersonal> selectByExample(TTipopersonalExample example) throws Exception {
		return TTipopersonalMapper.selectByExample(example);
	}

	public TTipopersonal selectByPrimaryKey(String codtipopersonal) throws Exception {
		return TTipopersonalMapper.selectByPrimaryKey(codtipopersonal);
	}

	public int updateByExampleSelective(TTipopersonal record,
			TTipopersonalExample example) throws Exception {
		return TTipopersonalMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TTipopersonal record,
			TTipopersonalExample example) throws Exception {
		return TTipopersonalMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TTipopersonal record) throws Exception {
		return TTipopersonalMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TTipopersonal record) throws Exception {
		return TTipopersonalMapper.updateByPrimaryKey(record);
	}

}

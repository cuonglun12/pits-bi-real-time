package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.TTipopersonalMapper;
import pe.com.j2techcon.bi.etl.domain.origen.TTipopersonal;
import pe.com.j2techcon.bi.etl.domain.origen.TTipopersonalExample;

public class TTipopersonalManager {

	private TTipopersonalMapper tTipopersonalMapper;
	
	public TTipopersonalMapper gettTipopersonalMapper() {
		return tTipopersonalMapper;
	}

	public void settTipopersonalMapper(TTipopersonalMapper tTipopersonalMapper) {
		this.tTipopersonalMapper = tTipopersonalMapper;
	}

	public int countByExample(TTipopersonalExample example) {
		return tTipopersonalMapper.countByExample(example);
	}

	public int deleteByExample(TTipopersonalExample example) {
		return tTipopersonalMapper.deleteByExample(example);
	}

	public int insert(TTipopersonal record) {
		return tTipopersonalMapper.insert(record);
	}

	public int insertSelective(TTipopersonal record) {
		return tTipopersonalMapper.insertSelective(record);
	}

	public List<TTipopersonal> selectByExample(TTipopersonalExample example) {
		return tTipopersonalMapper.selectByExample(example);
	}

	public int updateByExampleSelective(TTipopersonal record,
			TTipopersonalExample example) {
		return tTipopersonalMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TTipopersonal record,
			TTipopersonalExample example) {
		return tTipopersonalMapper.updateByExample(record, example);
	}

}

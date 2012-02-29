package pe.com.j2techcon.bi.etl.logic.control;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.control.TProcesoMapper;
import pe.com.j2techcon.bi.etl.domain.control.TProceso;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoExample;

public class TProcesoManager {

	private TProcesoMapper tProcesoMapper;
	
	public TProcesoMapper gettProcesoMapper() {
		return tProcesoMapper;
	}

	public void settProcesoMapper(TProcesoMapper tProcesoMapper) {
		this.tProcesoMapper = tProcesoMapper;
	}

	public int countByExample(TProcesoExample example) {
		return tProcesoMapper.countByExample(example);
	}

	public int deleteByExample(TProcesoExample example) {
		return tProcesoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer procId) {
		return tProcesoMapper.deleteByPrimaryKey(procId);
	}


	public int insert(TProceso record) {
		return tProcesoMapper.insert(record);
	}


	public int insertSelective(TProceso record) {
		return tProcesoMapper.insertSelective(record);
	}


	public List<TProceso> selectByExample(TProcesoExample example) {
		return tProcesoMapper.selectByExample(example);
	}


	public TProceso selectByPrimaryKey(Integer procId) {
		return tProcesoMapper.selectByPrimaryKey(procId);
	}


	public int updateByExampleSelective(TProceso record, TProcesoExample example) {
		return tProcesoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(TProceso record, TProcesoExample example) {
		return tProcesoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(TProceso record) {
		return tProcesoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(TProceso record) {
		return tProcesoMapper.updateByPrimaryKey(record);
	}

}

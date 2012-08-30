package pe.com.j2techcon.bi.etl.logic.control;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.control.TProcesoMapper;
import pe.com.j2techcon.bi.etl.domain.control.TProceso;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoExample;

public class TProcesoManager {

	private TProcesoMapper tProcesoMapper;
	
	public TProcesoMapper gettProcesoMapper() throws Exception {
		return tProcesoMapper;
	}

	public void settProcesoMapper(TProcesoMapper tProcesoMapper) throws Exception {
		this.tProcesoMapper = tProcesoMapper;
	}

	public int countByExample(TProcesoExample example) throws Exception {
		return tProcesoMapper.countByExample(example);
	}

	public int deleteByExample(TProcesoExample example) throws Exception {
		return tProcesoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer procId) throws Exception {
		return tProcesoMapper.deleteByPrimaryKey(procId);
	}


	public int insert(TProceso record) throws Exception {
		return tProcesoMapper.insert(record);
	}


	public int insertSelective(TProceso record) throws Exception {
		return tProcesoMapper.insertSelective(record);
	}


	public List<TProceso> selectByExample(TProcesoExample example) throws Exception {
		return tProcesoMapper.selectByExample(example);
	}


	public TProceso selectByPrimaryKey(Integer procId) throws Exception {
		return tProcesoMapper.selectByPrimaryKey(procId);
	}


	public int updateByExampleSelective(TProceso record, TProcesoExample example) throws Exception {
		return tProcesoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(TProceso record, TProcesoExample example) throws Exception {
		return tProcesoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(TProceso record) throws Exception {
		return tProcesoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(TProceso record) throws Exception {
		return tProcesoMapper.updateByPrimaryKey(record);
	}

}

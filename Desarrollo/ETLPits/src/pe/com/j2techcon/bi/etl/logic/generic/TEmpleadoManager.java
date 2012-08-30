package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TEmpleadoMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleado;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoExample;

public class TEmpleadoManager {
	
	private TEmpleadoMapper tEmpleadoMapper;

	public TEmpleadoMapper gettEmpleadoMapper() throws Exception {
		return tEmpleadoMapper;
	}

	public void settEmpleadoMapper(TEmpleadoMapper tEmpleadoMapper) throws Exception {
		this.tEmpleadoMapper = tEmpleadoMapper;
	}

	public int countByExample(TEmpleadoExample example) throws Exception {
		return tEmpleadoMapper.countByExample(example);
	}

	public int deleteByExample(TEmpleadoExample example) throws Exception {
		return tEmpleadoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer empId) throws Exception {
		return tEmpleadoMapper.deleteByPrimaryKey(empId);
	}

	public int insert(TEmpleado record) throws Exception {
		return tEmpleadoMapper.insert(record);
	}

	public int insertSelective(TEmpleado record) throws Exception {
		return tEmpleadoMapper.insertSelective(record);
	}

	public List<TEmpleado> selectByExample(TEmpleadoExample example) throws Exception {
		return tEmpleadoMapper.selectByExample(example);
	}

	public TEmpleado selectByPrimaryKey(Integer empId) throws Exception {
		return tEmpleadoMapper.selectByPrimaryKey(empId);
	}

	public int updateByExampleSelective(TEmpleado record,
			TEmpleadoExample example) throws Exception {
		return tEmpleadoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TEmpleado record, TEmpleadoExample example) throws Exception {
		return tEmpleadoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TEmpleado record) throws Exception {
		return tEmpleadoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TEmpleado record) throws Exception {
		return tEmpleadoMapper.updateByPrimaryKey(record);
	}

}

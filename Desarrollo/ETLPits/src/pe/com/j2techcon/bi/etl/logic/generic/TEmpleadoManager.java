package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TEmpleadoMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleado;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoExample;

public class TEmpleadoManager {
	
	private TEmpleadoMapper tEmpleadoMapper;

	public TEmpleadoMapper gettEmpleadoMapper() {
		return tEmpleadoMapper;
	}

	public void settEmpleadoMapper(TEmpleadoMapper tEmpleadoMapper) {
		this.tEmpleadoMapper = tEmpleadoMapper;
	}

	public int countByExample(TEmpleadoExample example) {
		return tEmpleadoMapper.countByExample(example);
	}

	public int deleteByExample(TEmpleadoExample example) {
		return tEmpleadoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer empId) {
		return tEmpleadoMapper.deleteByPrimaryKey(empId);
	}

	public int insert(TEmpleado record) {
		return tEmpleadoMapper.insert(record);
	}

	public int insertSelective(TEmpleado record) {
		return tEmpleadoMapper.insertSelective(record);
	}

	public List<TEmpleado> selectByExample(TEmpleadoExample example) {
		return tEmpleadoMapper.selectByExample(example);
	}

	public TEmpleado selectByPrimaryKey(Integer empId) {
		return tEmpleadoMapper.selectByPrimaryKey(empId);
	}

	public int updateByExampleSelective(TEmpleado record,
			TEmpleadoExample example) {
		return tEmpleadoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TEmpleado record, TEmpleadoExample example) {
		return tEmpleadoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TEmpleado record) {
		return tEmpleadoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TEmpleado record) {
		return tEmpleadoMapper.updateByPrimaryKey(record);
	}

}

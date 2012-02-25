package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TEmpleadoCategoriaMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoria;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoriaExample;

public class TEmpleadoCategoriaManager {
	
	private TEmpleadoCategoriaMapper tEmpleadoCategoriaMapper;

	public TEmpleadoCategoriaMapper gettEmpleadoCategoriaMapper() {
		return tEmpleadoCategoriaMapper;
	}

	public void settEmpleadoCategoriaMapper(
			TEmpleadoCategoriaMapper tEmpleadoCategoriaMapper) {
		this.tEmpleadoCategoriaMapper = tEmpleadoCategoriaMapper;
	}

	public int countByExample(TEmpleadoCategoriaExample example) {
		return tEmpleadoCategoriaMapper.countByExample(example);
	}

	public int deleteByExample(TEmpleadoCategoriaExample example) {
		return tEmpleadoCategoriaMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer empCatId) {
		return tEmpleadoCategoriaMapper.deleteByPrimaryKey(empCatId);
	}

	public int insert(TEmpleadoCategoria record) {
		return tEmpleadoCategoriaMapper.insert(record);
	}

	public int insertSelective(TEmpleadoCategoria record) {
		return tEmpleadoCategoriaMapper.insertSelective(record);
	}

	public List<TEmpleadoCategoria> selectByExample(
			TEmpleadoCategoriaExample example) {
		return tEmpleadoCategoriaMapper.selectByExample(example);
	}

	public TEmpleadoCategoria selectByPrimaryKey(Integer empCatId) {
		return tEmpleadoCategoriaMapper.selectByPrimaryKey(empCatId);
	}

	public int updateByExampleSelective(TEmpleadoCategoria record,
			TEmpleadoCategoriaExample example) {
		return tEmpleadoCategoriaMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TEmpleadoCategoria record,
			TEmpleadoCategoriaExample example) {
		return tEmpleadoCategoriaMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TEmpleadoCategoria record) {
		return tEmpleadoCategoriaMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TEmpleadoCategoria record) {
		return tEmpleadoCategoriaMapper.updateByPrimaryKey(record);
	}

}

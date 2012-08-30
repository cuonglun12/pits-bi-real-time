package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TEmpleadoCategoriaMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoria;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoriaExample;

public class TEmpleadoCategoriaManager {
	
	private TEmpleadoCategoriaMapper tEmpleadoCategoriaMapper;

	public TEmpleadoCategoriaMapper gettEmpleadoCategoriaMapper() throws Exception {
		return tEmpleadoCategoriaMapper;
	}

	public void settEmpleadoCategoriaMapper(
			TEmpleadoCategoriaMapper tEmpleadoCategoriaMapper) throws Exception {
		this.tEmpleadoCategoriaMapper = tEmpleadoCategoriaMapper;
	}

	public int countByExample(TEmpleadoCategoriaExample example) throws Exception {
		return tEmpleadoCategoriaMapper.countByExample(example);
	}

	public int deleteByExample(TEmpleadoCategoriaExample example) throws Exception {
		return tEmpleadoCategoriaMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer empCatId) throws Exception {
		return tEmpleadoCategoriaMapper.deleteByPrimaryKey(empCatId);
	}

	public int insert(TEmpleadoCategoria record) throws Exception {
		return tEmpleadoCategoriaMapper.insert(record);
	}

	public int insertSelective(TEmpleadoCategoria record) throws Exception {
		return tEmpleadoCategoriaMapper.insertSelective(record);
	}

	public List<TEmpleadoCategoria> selectByExample(
			TEmpleadoCategoriaExample example) throws Exception {
		return tEmpleadoCategoriaMapper.selectByExample(example);
	}

	public TEmpleadoCategoria selectByPrimaryKey(Integer empCatId) throws Exception {
		return tEmpleadoCategoriaMapper.selectByPrimaryKey(empCatId);
	}

	public int updateByExampleSelective(TEmpleadoCategoria record,
			TEmpleadoCategoriaExample example) throws Exception {
		return tEmpleadoCategoriaMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TEmpleadoCategoria record,
			TEmpleadoCategoriaExample example) throws Exception {
		return tEmpleadoCategoriaMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TEmpleadoCategoria record) throws Exception {
		return tEmpleadoCategoriaMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TEmpleadoCategoria record) throws Exception {
		return tEmpleadoCategoriaMapper.updateByPrimaryKey(record);
	}

}

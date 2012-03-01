package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TProductoMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TProducto;
import pe.com.j2techcon.bi.etl.domain.generic.TProductoExample;

public class TProductoManager {
	
	private TProductoMapper tProductoMapper;

	public TProductoMapper gettProductoMapper() {
		return tProductoMapper;
	}

	public void settProductoMapper(TProductoMapper tProductoMapper) {
		this.tProductoMapper = tProductoMapper;
	}

	public int countByExample(TProductoExample example) {
		return tProductoMapper.countByExample(example);
	}

	public int deleteByExample(TProductoExample example) {
		return tProductoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer prodId) {
		return tProductoMapper.deleteByPrimaryKey(prodId);
	}

	public int insert(TProducto record) {
		return tProductoMapper.insert(record);
	}

	public int insertSelective(TProducto record) {
		return tProductoMapper.insertSelective(record);
	}

	public List<TProducto> selectByExample(TProductoExample example) {
		return tProductoMapper.selectByExample(example);
	}

	public TProducto selectByPrimaryKey(Integer prodId) {
		return tProductoMapper.selectByPrimaryKey(prodId);
	}

	public int updateByExampleSelective(TProducto record,
			TProductoExample example) {
		return tProductoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TProducto record, TProductoExample example) {
		return tProductoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TProducto record) {
		return tProductoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TProducto record) {
		return tProductoMapper.updateByPrimaryKey(record);
	}

}

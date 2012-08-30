package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TProductoMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TProducto;
import pe.com.j2techcon.bi.etl.domain.generic.TProductoExample;

public class TProductoManager {
	
	private TProductoMapper tProductoMapper;

	public TProductoMapper gettProductoMapper() throws Exception {
		return tProductoMapper;
	}

	public void settProductoMapper(TProductoMapper tProductoMapper) throws Exception {
		this.tProductoMapper = tProductoMapper;
	}

	public int countByExample(TProductoExample example) throws Exception {
		return tProductoMapper.countByExample(example);
	}

	public int deleteByExample(TProductoExample example) throws Exception {
		return tProductoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer prodId) throws Exception {
		return tProductoMapper.deleteByPrimaryKey(prodId);
	}

	public int insert(TProducto record) throws Exception {
		return tProductoMapper.insert(record);
	}

	public int insertSelective(TProducto record) throws Exception {
		return tProductoMapper.insertSelective(record);
	}

	public List<TProducto> selectByExample(TProductoExample example) throws Exception {
		return tProductoMapper.selectByExample(example);
	}

	public TProducto selectByPrimaryKey(Integer prodId) throws Exception {
		return tProductoMapper.selectByPrimaryKey(prodId);
	}

	public int updateByExampleSelective(TProducto record,
			TProductoExample example) throws Exception {
		return tProductoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TProducto record, TProductoExample example) throws Exception {
		return tProductoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TProducto record) throws Exception {
		return tProductoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TProducto record) throws Exception {
		return tProductoMapper.updateByPrimaryKey(record);
	}

}

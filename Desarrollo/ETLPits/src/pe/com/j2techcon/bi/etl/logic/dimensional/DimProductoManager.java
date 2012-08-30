package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimProductoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimProducto;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimProductoExample;

public class DimProductoManager {
	
	private DimProductoMapper dimProductoMapper;

	public DimProductoMapper getDimProductoMapper() throws Exception {
		return dimProductoMapper;
	}

	public void setDimProductoMapper(DimProductoMapper dimProductoMapper) throws Exception {
		this.dimProductoMapper = dimProductoMapper;
	}


	public int countByExample(DimProductoExample example) throws Exception {
		return dimProductoMapper.countByExample(example);
	}


	public int deleteByExample(DimProductoExample example) throws Exception {
		return dimProductoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer productoKey) throws Exception {
		return dimProductoMapper.deleteByPrimaryKey(productoKey);
	}


	public int insert(DimProducto record) throws Exception {
		return dimProductoMapper.insert(record);
	}


	public int insertSelective(DimProducto record) throws Exception {
		return dimProductoMapper.insertSelective(record);
	}


	public List<DimProducto> selectByExample(DimProductoExample example) throws Exception {
		return dimProductoMapper.selectByExample(example);
	}


	public DimProducto selectByPrimaryKey(Integer productoKey) throws Exception {
		return dimProductoMapper.selectByPrimaryKey(productoKey);
	}


	public int updateByExampleSelective(DimProducto record,
			DimProductoExample example) throws Exception {
		return dimProductoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimProducto record, DimProductoExample example) throws Exception {
		return dimProductoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimProducto record) throws Exception {
		return dimProductoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimProducto record) throws Exception {
		return dimProductoMapper.updateByPrimaryKey(record);
	}

}

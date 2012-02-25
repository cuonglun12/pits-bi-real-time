package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimProductoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimProducto;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimProductoExample;

public class DimProductoManager {
	
	private DimProductoMapper dimProductoMapper;

	public DimProductoMapper getDimProductoMapper() {
		return dimProductoMapper;
	}

	public void setDimProductoMapper(DimProductoMapper dimProductoMapper) {
		this.dimProductoMapper = dimProductoMapper;
	}


	public int countByExample(DimProductoExample example) {
		return dimProductoMapper.countByExample(example);
	}


	public int deleteByExample(DimProductoExample example) {
		return dimProductoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer productoKey) {
		return dimProductoMapper.deleteByPrimaryKey(productoKey);
	}


	public int insert(DimProducto record) {
		return dimProductoMapper.insert(record);
	}


	public int insertSelective(DimProducto record) {
		return dimProductoMapper.insertSelective(record);
	}


	public List<DimProducto> selectByExample(DimProductoExample example) {
		return dimProductoMapper.selectByExample(example);
	}


	public DimProducto selectByPrimaryKey(Integer productoKey) {
		return dimProductoMapper.selectByPrimaryKey(productoKey);
	}


	public int updateByExampleSelective(DimProducto record,
			DimProductoExample example) {
		return dimProductoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimProducto record, DimProductoExample example) {
		return dimProductoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimProducto record) {
		return dimProductoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimProducto record) {
		return dimProductoMapper.updateByPrimaryKey(record);
	}

}

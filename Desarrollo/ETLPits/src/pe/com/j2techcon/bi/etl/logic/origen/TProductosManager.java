package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.TProductosMapper;
import pe.com.j2techcon.bi.etl.domain.origen.TProductos;
import pe.com.j2techcon.bi.etl.domain.origen.TProductosExample;

public class TProductosManager {
	
	private TProductosMapper tProductosMapper;

	public TProductosMapper gettProductosMapper() {
		return tProductosMapper;
	}

	public void settProductosMapper(TProductosMapper tProductosMapper) {
		this.tProductosMapper = tProductosMapper;
	}

	public int countByExample(TProductosExample example) {
		return tProductosMapper.countByExample(example);
	}

	public int deleteByExample(TProductosExample example) {
		return tProductosMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codproducto) {
		return tProductosMapper.deleteByPrimaryKey(codproducto);
	}

	public int insert(TProductos record) {
		return tProductosMapper.insert(record);
	}

	public int insertSelective(TProductos record) {
		return tProductosMapper.insertSelective(record);
	}

	public List<TProductos> selectByExample(TProductosExample example) {
		return tProductosMapper.selectByExample(example);
	}

	public TProductos selectByPrimaryKey(String codproducto) {
		return tProductosMapper.selectByPrimaryKey(codproducto);
	}

	public int updateByExampleSelective(TProductos record,
			TProductosExample example) {
		return tProductosMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TProductos record, TProductosExample example) {
		return tProductosMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TProductos record) {
		return tProductosMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TProductos record) {
		return tProductosMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.TProductosMapper;
import pe.com.j2techcon.bi.etl.domain.origen.TProductos;
import pe.com.j2techcon.bi.etl.domain.origen.TProductosExample;

public class TProductosManager {
	
	private TProductosMapper tProductosMapper;

	public TProductosMapper gettProductosMapper() throws Exception {
		return tProductosMapper;
	}

	public void settProductosMapper(TProductosMapper tProductosMapper) throws Exception {
		this.tProductosMapper = tProductosMapper;
	}

	public int countByExample(TProductosExample example) throws Exception {
		return tProductosMapper.countByExample(example);
	}

	public int deleteByExample(TProductosExample example) throws Exception {
		return tProductosMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codproducto) throws Exception {
		return tProductosMapper.deleteByPrimaryKey(codproducto);
	}

	public int insert(TProductos record) throws Exception {
		return tProductosMapper.insert(record);
	}

	public int insertSelective(TProductos record) throws Exception {
		return tProductosMapper.insertSelective(record);
	}

	public List<TProductos> selectByExample(TProductosExample example) throws Exception {
		return tProductosMapper.selectByExample(example);
	}

	public TProductos selectByPrimaryKey(String codproducto) throws Exception {
		return tProductosMapper.selectByPrimaryKey(codproducto);
	}

	public int updateByExampleSelective(TProductos record,
			TProductosExample example) throws Exception {
		return tProductosMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TProductos record, TProductosExample example) throws Exception {
		return tProductosMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TProductos record) throws Exception {
		return tProductosMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TProductos record) throws Exception {
		return tProductosMapper.updateByPrimaryKey(record);
	}

}

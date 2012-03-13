package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimFacturadoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimFacturado;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimFacturadoExample;

public class DimFacturadoManager {
	
	private DimFacturadoMapper dimFacturadoMapper;

	public DimFacturadoMapper getDimFacturadoMapper() {
		return dimFacturadoMapper;
	}

	public void setDimFacturadoMapper(DimFacturadoMapper dimFacturadoMapper) {
		this.dimFacturadoMapper = dimFacturadoMapper;
	}


	public int countByExample(DimFacturadoExample example) {
		return dimFacturadoMapper.countByExample(example);
	}


	public int deleteByExample(DimFacturadoExample example) {
		return dimFacturadoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer facturadoKey) {
		return dimFacturadoMapper.deleteByPrimaryKey(facturadoKey);
	}


	public int insert(DimFacturado record) {
		return dimFacturadoMapper.insert(record);
	}


	public int insertSelective(DimFacturado record) {
		return dimFacturadoMapper.insertSelective(record);
	}


	public List<DimFacturado> selectByExample(DimFacturadoExample example) {
		return dimFacturadoMapper.selectByExample(example);
	}


	public DimFacturado selectByPrimaryKey(Integer facturadoKey) {
		return dimFacturadoMapper.selectByPrimaryKey(facturadoKey);
	}


	public int updateByExampleSelective(DimFacturado record,
			DimFacturadoExample example) {
		return dimFacturadoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimFacturado record, DimFacturadoExample example) {
		return dimFacturadoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimFacturado record) {
		return dimFacturadoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimFacturado record) {
		return dimFacturadoMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimFacturadoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimFacturado;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimFacturadoExample;

public class DimFacturadoManager {
	
	private DimFacturadoMapper dimFacturadoMapper;

	public DimFacturadoMapper getDimFacturadoMapper() throws Exception {
		return dimFacturadoMapper;
	}

	public void setDimFacturadoMapper(DimFacturadoMapper dimFacturadoMapper) throws Exception {
		this.dimFacturadoMapper = dimFacturadoMapper;
	}


	public int countByExample(DimFacturadoExample example) throws Exception {
		return dimFacturadoMapper.countByExample(example);
	}


	public int deleteByExample(DimFacturadoExample example) throws Exception {
		return dimFacturadoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer facturadoKey) throws Exception {
		return dimFacturadoMapper.deleteByPrimaryKey(facturadoKey);
	}


	public int insert(DimFacturado record) throws Exception {
		return dimFacturadoMapper.insert(record);
	}


	public int insertSelective(DimFacturado record) throws Exception {
		return dimFacturadoMapper.insertSelective(record);
	}


	public List<DimFacturado> selectByExample(DimFacturadoExample example) throws Exception {
		return dimFacturadoMapper.selectByExample(example);
	}


	public DimFacturado selectByPrimaryKey(Integer facturadoKey) throws Exception {
		return dimFacturadoMapper.selectByPrimaryKey(facturadoKey);
	}


	public int updateByExampleSelective(DimFacturado record,
			DimFacturadoExample example) throws Exception {
		return dimFacturadoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimFacturado record, DimFacturadoExample example) throws Exception {
		return dimFacturadoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimFacturado record) throws Exception {
		return dimFacturadoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimFacturado record) throws Exception {
		return dimFacturadoMapper.updateByPrimaryKey(record);
	}

}

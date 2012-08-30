package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimTipoRutaMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRuta;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRutaExample;

public class DimTipoRutaManager {
	
	private DimTipoRutaMapper dimTipoRutaMapper;

	public DimTipoRutaMapper getDimTipoRutaMapper() throws Exception {
		return dimTipoRutaMapper;
	}

	public void setDimTipoRutaMapper(DimTipoRutaMapper dimTipoRutaMapper) throws Exception {
		this.dimTipoRutaMapper = dimTipoRutaMapper;
	}


	public int countByExample(DimTipoRutaExample example) throws Exception {
		return dimTipoRutaMapper.countByExample(example);
	}


	public int deleteByExample(DimTipoRutaExample example) throws Exception {
		return dimTipoRutaMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer tipoRutaKey) throws Exception {
		return dimTipoRutaMapper.deleteByPrimaryKey(tipoRutaKey);
	}


	public int insert(DimTipoRuta record) throws Exception {
		return dimTipoRutaMapper.insert(record);
	}


	public int insertSelective(DimTipoRuta record) throws Exception {
		return dimTipoRutaMapper.insertSelective(record);
	}


	public List<DimTipoRuta> selectByExample(DimTipoRutaExample example) throws Exception {
		return dimTipoRutaMapper.selectByExample(example);
	}


	public DimTipoRuta selectByPrimaryKey(Integer tipoRutaKey) throws Exception {
		return dimTipoRutaMapper.selectByPrimaryKey(tipoRutaKey);
	}


	public int updateByExampleSelective(DimTipoRuta record,
			DimTipoRutaExample example) throws Exception {
		return dimTipoRutaMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimTipoRuta record, DimTipoRutaExample example) throws Exception {
		return dimTipoRutaMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimTipoRuta record) throws Exception {
		return dimTipoRutaMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimTipoRuta record) throws Exception {
		return dimTipoRutaMapper.updateByPrimaryKey(record);
	}

}

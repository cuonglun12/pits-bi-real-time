package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimTipoRutaMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRuta;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRutaExample;

public class DimTipoRutaManager {
	
	private DimTipoRutaMapper dimTipoRutaMapper;

	public DimTipoRutaMapper getDimTipoRutaMapper() {
		return dimTipoRutaMapper;
	}

	public void setDimTipoRutaMapper(DimTipoRutaMapper dimTipoRutaMapper) {
		this.dimTipoRutaMapper = dimTipoRutaMapper;
	}


	public int countByExample(DimTipoRutaExample example) {
		return dimTipoRutaMapper.countByExample(example);
	}


	public int deleteByExample(DimTipoRutaExample example) {
		return dimTipoRutaMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer tipoRutaKey) {
		return dimTipoRutaMapper.deleteByPrimaryKey(tipoRutaKey);
	}


	public int insert(DimTipoRuta record) {
		return dimTipoRutaMapper.insert(record);
	}


	public int insertSelective(DimTipoRuta record) {
		return dimTipoRutaMapper.insertSelective(record);
	}


	public List<DimTipoRuta> selectByExample(DimTipoRutaExample example) {
		return dimTipoRutaMapper.selectByExample(example);
	}


	public DimTipoRuta selectByPrimaryKey(Integer tipoRutaKey) {
		return dimTipoRutaMapper.selectByPrimaryKey(tipoRutaKey);
	}


	public int updateByExampleSelective(DimTipoRuta record,
			DimTipoRutaExample example) {
		return dimTipoRutaMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimTipoRuta record, DimTipoRutaExample example) {
		return dimTipoRutaMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimTipoRuta record) {
		return dimTipoRutaMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimTipoRuta record) {
		return dimTipoRutaMapper.updateByPrimaryKey(record);
	}

}

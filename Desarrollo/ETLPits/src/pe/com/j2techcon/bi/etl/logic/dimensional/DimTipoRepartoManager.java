package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimTipoRepartoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoReparto;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRepartoExample;

public class DimTipoRepartoManager {

	private DimTipoRepartoMapper dimTipoRepartoMapper;
	
	public DimTipoRepartoMapper getDimTipoRepartoMapper() {
		return dimTipoRepartoMapper;
	}

	public void setDimTipoRepartoMapper(DimTipoRepartoMapper dimTipoRepartoMapper) {
		this.dimTipoRepartoMapper = dimTipoRepartoMapper;
	}


	public int countByExample(DimTipoRepartoExample example) {
		return dimTipoRepartoMapper.countByExample(example);
	}


	public int deleteByExample(DimTipoRepartoExample example) {
		return dimTipoRepartoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer tipoRepartoKey) {
		return dimTipoRepartoMapper.deleteByPrimaryKey(tipoRepartoKey);
	}


	public int insert(DimTipoReparto record) {
		return dimTipoRepartoMapper.insert(record);
	}


	public int insertSelective(DimTipoReparto record) {
		return dimTipoRepartoMapper.insertSelective(record);
	}


	public List<DimTipoReparto> selectByExample(DimTipoRepartoExample example) {
		return dimTipoRepartoMapper.selectByExample(example);
	}


	public DimTipoReparto selectByPrimaryKey(Integer tipoRepartoKey) {
		return dimTipoRepartoMapper.selectByPrimaryKey(tipoRepartoKey);
	}


	public int updateByExampleSelective(DimTipoReparto record,
			DimTipoRepartoExample example) {
		return dimTipoRepartoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimTipoReparto record,
			DimTipoRepartoExample example) {
		return dimTipoRepartoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimTipoReparto record) {
		return dimTipoRepartoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimTipoReparto record) {
		return dimTipoRepartoMapper.updateByPrimaryKey(record);
	}

}

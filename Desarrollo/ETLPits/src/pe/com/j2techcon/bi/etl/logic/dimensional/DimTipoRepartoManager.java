package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimTipoRepartoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoReparto;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRepartoExample;

public class DimTipoRepartoManager {

	private DimTipoRepartoMapper dimTipoRepartoMapper;
	
	public DimTipoRepartoMapper getDimTipoRepartoMapper() throws Exception {
		return dimTipoRepartoMapper;
	}

	public void setDimTipoRepartoMapper(DimTipoRepartoMapper dimTipoRepartoMapper) throws Exception {
		this.dimTipoRepartoMapper = dimTipoRepartoMapper;
	}


	public int countByExample(DimTipoRepartoExample example) throws Exception {
		return dimTipoRepartoMapper.countByExample(example);
	}


	public int deleteByExample(DimTipoRepartoExample example) throws Exception {
		return dimTipoRepartoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer tipoRepartoKey) throws Exception {
		return dimTipoRepartoMapper.deleteByPrimaryKey(tipoRepartoKey);
	}


	public int insert(DimTipoReparto record) throws Exception {
		return dimTipoRepartoMapper.insert(record);
	}


	public int insertSelective(DimTipoReparto record) throws Exception {
		return dimTipoRepartoMapper.insertSelective(record);
	}


	public List<DimTipoReparto> selectByExample(DimTipoRepartoExample example) throws Exception {
		return dimTipoRepartoMapper.selectByExample(example);
	}


	public DimTipoReparto selectByPrimaryKey(Integer tipoRepartoKey) throws Exception {
		return dimTipoRepartoMapper.selectByPrimaryKey(tipoRepartoKey);
	}


	public int updateByExampleSelective(DimTipoReparto record,
			DimTipoRepartoExample example) throws Exception {
		return dimTipoRepartoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimTipoReparto record,
			DimTipoRepartoExample example) throws Exception {
		return dimTipoRepartoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimTipoReparto record) throws Exception {
		return dimTipoRepartoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimTipoReparto record) throws Exception {
		return dimTipoRepartoMapper.updateByPrimaryKey(record);
	}

}

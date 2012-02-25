package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimTipoDocumentoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoDocumento;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoDocumentoExample;

public class DimTipoDocumentoManager {
	
	private DimTipoDocumentoMapper dimTipoDocumentoMapper;

	public DimTipoDocumentoMapper getDimTipoDocumentoMapper() {
		return dimTipoDocumentoMapper;
	}

	public void setDimTipoDocumentoMapper(
			DimTipoDocumentoMapper dimTipoDocumentoMapper) {
		this.dimTipoDocumentoMapper = dimTipoDocumentoMapper;
	}


	public int countByExample(DimTipoDocumentoExample example) {
		return dimTipoDocumentoMapper.countByExample(example);
	}


	public int deleteByExample(DimTipoDocumentoExample example) {
		return dimTipoDocumentoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer tipoDocumentoKey) {
		return dimTipoDocumentoMapper.deleteByPrimaryKey(tipoDocumentoKey);
	}


	public int insert(DimTipoDocumento record) {
		return dimTipoDocumentoMapper.insert(record);
	}


	public int insertSelective(DimTipoDocumento record) {
		return dimTipoDocumentoMapper.insertSelective(record);
	}


	public List<DimTipoDocumento> selectByExample(
			DimTipoDocumentoExample example) {
		return dimTipoDocumentoMapper.selectByExample(example);
	}


	public DimTipoDocumento selectByPrimaryKey(Integer tipoDocumentoKey) {
		return dimTipoDocumentoMapper.selectByPrimaryKey(tipoDocumentoKey);
	}


	public int updateByExampleSelective(DimTipoDocumento record,
			DimTipoDocumentoExample example) {
		return dimTipoDocumentoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimTipoDocumento record,
			DimTipoDocumentoExample example) {
		return dimTipoDocumentoMapper.deleteByExample(example);
	}


	public int updateByPrimaryKeySelective(DimTipoDocumento record) {
		return dimTipoDocumentoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimTipoDocumento record) {
		return dimTipoDocumentoMapper.updateByPrimaryKey(record);
	}

}

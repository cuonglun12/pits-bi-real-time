package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimTipoDocumentoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoDocumento;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoDocumentoExample;

public class DimTipoDocumentoManager {
	
	private DimTipoDocumentoMapper dimTipoDocumentoMapper;

	public DimTipoDocumentoMapper getDimTipoDocumentoMapper() throws Exception {
		return dimTipoDocumentoMapper;
	}

	public void setDimTipoDocumentoMapper(
			DimTipoDocumentoMapper dimTipoDocumentoMapper) throws Exception {
		this.dimTipoDocumentoMapper = dimTipoDocumentoMapper;
	}


	public int countByExample(DimTipoDocumentoExample example) throws Exception {
		return dimTipoDocumentoMapper.countByExample(example);
	}


	public int deleteByExample(DimTipoDocumentoExample example) throws Exception {
		return dimTipoDocumentoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer tipoDocumentoKey) throws Exception {
		return dimTipoDocumentoMapper.deleteByPrimaryKey(tipoDocumentoKey);
	}


	public int insert(DimTipoDocumento record) throws Exception {
		return dimTipoDocumentoMapper.insert(record);
	}


	public int insertSelective(DimTipoDocumento record) throws Exception {
		return dimTipoDocumentoMapper.insertSelective(record);
	}


	public List<DimTipoDocumento> selectByExample(
			DimTipoDocumentoExample example) throws Exception {
		return dimTipoDocumentoMapper.selectByExample(example);
	}


	public DimTipoDocumento selectByPrimaryKey(Integer tipoDocumentoKey) throws Exception {
		return dimTipoDocumentoMapper.selectByPrimaryKey(tipoDocumentoKey);
	}


	public int updateByExampleSelective(DimTipoDocumento record,
			DimTipoDocumentoExample example) throws Exception {
		return dimTipoDocumentoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimTipoDocumento record,
			DimTipoDocumentoExample example) throws Exception {
		return dimTipoDocumentoMapper.deleteByExample(example);
	}


	public int updateByPrimaryKeySelective(DimTipoDocumento record) throws Exception {
		return dimTipoDocumentoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimTipoDocumento record) throws Exception {
		return dimTipoDocumentoMapper.updateByPrimaryKey(record);
	}

}

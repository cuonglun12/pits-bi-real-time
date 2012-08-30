package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimTipoPagoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoPago;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoPagoExample;

public class DimTipoPagoManager {

	private DimTipoPagoMapper dimTipoPagoMapper;
	
	public DimTipoPagoMapper getDimTipoPagoMapper() throws Exception {
		return dimTipoPagoMapper;
	}

	public void setDimTipoPagoMapper(DimTipoPagoMapper dimTipoPagoMapper) throws Exception {
		this.dimTipoPagoMapper = dimTipoPagoMapper;
	}


	public int countByExample(DimTipoPagoExample example) throws Exception {
		return dimTipoPagoMapper.countByExample(example);
	}


	public int deleteByExample(DimTipoPagoExample example) throws Exception {
		return dimTipoPagoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer tipoPagoKey) throws Exception {
		return dimTipoPagoMapper.deleteByPrimaryKey(tipoPagoKey);
	}


	public int insert(DimTipoPago record) throws Exception {
		return dimTipoPagoMapper.insert(record);
	}


	public int insertSelective(DimTipoPago record) throws Exception {
		return dimTipoPagoMapper.insertSelective(record);
	}


	public List<DimTipoPago> selectByExample(DimTipoPagoExample example) throws Exception {
		return dimTipoPagoMapper.selectByExample(example);
	}


	public DimTipoPago selectByPrimaryKey(Integer tipoPagoKey) throws Exception {
		return dimTipoPagoMapper.selectByPrimaryKey(tipoPagoKey);
	}


	public int updateByExampleSelective(DimTipoPago record,
			DimTipoPagoExample example) throws Exception {
		return dimTipoPagoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimTipoPago record, DimTipoPagoExample example) throws Exception {
		return dimTipoPagoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimTipoPago record) throws Exception {
		return dimTipoPagoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimTipoPago record) throws Exception {
		return dimTipoPagoMapper.updateByPrimaryKey(record);
	}

}

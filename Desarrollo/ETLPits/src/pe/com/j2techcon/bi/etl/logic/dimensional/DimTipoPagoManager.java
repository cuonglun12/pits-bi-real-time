package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimTipoPagoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoPago;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoPagoExample;

public class DimTipoPagoManager {

	private DimTipoPagoMapper dimTipoPagoMapper;
	
	public DimTipoPagoMapper getDimTipoPagoMapper() {
		return dimTipoPagoMapper;
	}

	public void setDimTipoPagoMapper(DimTipoPagoMapper dimTipoPagoMapper) {
		this.dimTipoPagoMapper = dimTipoPagoMapper;
	}


	public int countByExample(DimTipoPagoExample example) {
		return dimTipoPagoMapper.countByExample(example);
	}


	public int deleteByExample(DimTipoPagoExample example) {
		return dimTipoPagoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer tipoPagoKey) {
		return dimTipoPagoMapper.deleteByPrimaryKey(tipoPagoKey);
	}


	public int insert(DimTipoPago record) {
		return dimTipoPagoMapper.insert(record);
	}


	public int insertSelective(DimTipoPago record) {
		return dimTipoPagoMapper.insertSelective(record);
	}


	public List<DimTipoPago> selectByExample(DimTipoPagoExample example) {
		return dimTipoPagoMapper.selectByExample(example);
	}


	public DimTipoPago selectByPrimaryKey(Integer tipoPagoKey) {
		return dimTipoPagoMapper.selectByPrimaryKey(tipoPagoKey);
	}


	public int updateByExampleSelective(DimTipoPago record,
			DimTipoPagoExample example) {
		return dimTipoPagoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimTipoPago record, DimTipoPagoExample example) {
		return dimTipoPagoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimTipoPago record) {
		return dimTipoPagoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimTipoPago record) {
		return dimTipoPagoMapper.updateByPrimaryKey(record);
	}

}

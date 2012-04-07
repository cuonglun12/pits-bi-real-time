package pe.com.j2techcon.bi.etl.logic.control;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.control.TProcesoDetalleMapper;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoDetalle;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoDetalleExample;

public class TProcesoDetalleManager {
	
	private TProcesoDetalleMapper tProcesoDetalleMapper;
	
	public TProcesoDetalleMapper gettProcesoDetalleMapper() {
		return tProcesoDetalleMapper;
	}

	public void settProcesoDetalleMapper(TProcesoDetalleMapper tProcesoDetalleMapper) {
		this.tProcesoDetalleMapper = tProcesoDetalleMapper;
	}

	public int countByExample(TProcesoDetalleExample example) {
		return tProcesoDetalleMapper.countByExample(example);
	}

	public int deleteByExample(TProcesoDetalleExample example) {
		return tProcesoDetalleMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer proDetId) {
		return tProcesoDetalleMapper.deleteByPrimaryKey(proDetId);
	}

	public int insert(TProcesoDetalle record) {
		return tProcesoDetalleMapper.insert(record);
	}

	public int insertSelective(TProcesoDetalle record) {
		return tProcesoDetalleMapper.insertSelective(record);
	}

	public List<TProcesoDetalle> selectByExample(TProcesoDetalleExample example) {
		return tProcesoDetalleMapper.selectByExample(example);
	}

	public TProcesoDetalle selectByPrimaryKey(Integer proDetId) {
		return tProcesoDetalleMapper.selectByPrimaryKey(proDetId);
	}

	public int updateByExampleSelective(TProcesoDetalle record,
			TProcesoDetalleExample example) {
		return tProcesoDetalleMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TProcesoDetalle record,
			TProcesoDetalleExample example) {
		return tProcesoDetalleMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TProcesoDetalle record) {
		return tProcesoDetalleMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TProcesoDetalle record) {
		return tProcesoDetalleMapper.updateByPrimaryKey(record);
	}

}

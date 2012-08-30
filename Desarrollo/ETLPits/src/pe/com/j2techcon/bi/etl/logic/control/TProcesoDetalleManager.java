package pe.com.j2techcon.bi.etl.logic.control;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.control.TProcesoDetalleMapper;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoDetalle;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoDetalleExample;

public class TProcesoDetalleManager {
	
	private TProcesoDetalleMapper tProcesoDetalleMapper;
	
	public TProcesoDetalleMapper gettProcesoDetalleMapper() throws Exception {
		return tProcesoDetalleMapper;
	}

	public void settProcesoDetalleMapper(TProcesoDetalleMapper tProcesoDetalleMapper) throws Exception {
		this.tProcesoDetalleMapper = tProcesoDetalleMapper;
	}

	public int countByExample(TProcesoDetalleExample example) throws Exception {
		return tProcesoDetalleMapper.countByExample(example);
	}

	public int deleteByExample(TProcesoDetalleExample example) throws Exception {
		return tProcesoDetalleMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer procDetId) throws Exception {
		return tProcesoDetalleMapper.deleteByPrimaryKey(procDetId);
	}

	public int insert(TProcesoDetalle record) throws Exception {
		return tProcesoDetalleMapper.insert(record);
	}

	public int insertSelective(TProcesoDetalle record) throws Exception {
		return tProcesoDetalleMapper.insertSelective(record);
	}

	public List<TProcesoDetalle> selectByExample(TProcesoDetalleExample example) throws Exception {
		return tProcesoDetalleMapper.selectByExample(example);
	}

	public TProcesoDetalle selectByPrimaryKey(Integer procDetId) throws Exception {
		return tProcesoDetalleMapper.selectByPrimaryKey(procDetId);
	}

	public int updateByExampleSelective(TProcesoDetalle record,
			TProcesoDetalleExample example) throws Exception {
		return tProcesoDetalleMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TProcesoDetalle record,
			TProcesoDetalleExample example) throws Exception {
		return tProcesoDetalleMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TProcesoDetalle record) throws Exception {
		return tProcesoDetalleMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TProcesoDetalle record) throws Exception {
		return tProcesoDetalleMapper.updateByPrimaryKey(record);
	}

}

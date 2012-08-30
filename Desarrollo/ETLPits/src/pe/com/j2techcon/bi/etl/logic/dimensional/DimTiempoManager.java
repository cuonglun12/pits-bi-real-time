package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimTiempoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempo;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempoExample;

public class DimTiempoManager {
	
	private DimTiempoMapper dimTiempoMapper;

	public DimTiempoMapper getDimTiempoMapper() throws Exception {
		return dimTiempoMapper;
	}

	public void setDimTiempoMapper(DimTiempoMapper dimTiempoMapper) throws Exception {
		this.dimTiempoMapper = dimTiempoMapper;
	}


	public int countByExample(DimTiempoExample example) throws Exception {
		return dimTiempoMapper.countByExample(example);
	}


	public int deleteByExample(DimTiempoExample example) throws Exception {
		return dimTiempoMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer tiempoKey) throws Exception {
		return dimTiempoMapper.deleteByPrimaryKey(tiempoKey);
	}


	public int insert(DimTiempo record) throws Exception {
		return dimTiempoMapper.insert(record);
	}


	public int insertSelective(DimTiempo record) throws Exception {
		return dimTiempoMapper.insertSelective(record);
	}


	public List<DimTiempo> selectByExample(DimTiempoExample example) throws Exception {
		return dimTiempoMapper.selectByExample(example);
	}


	public DimTiempo selectByPrimaryKey(Integer tiempoKey) throws Exception {
		return dimTiempoMapper.selectByPrimaryKey(tiempoKey);
	}


	public int updateByExampleSelective(DimTiempo record,
			DimTiempoExample example) throws Exception {
		return dimTiempoMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimTiempo record, DimTiempoExample example) throws Exception {
		return dimTiempoMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimTiempo record) throws Exception {
		return dimTiempoMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimTiempo record) throws Exception {
		return dimTiempoMapper.updateByPrimaryKey(record);
	}

}

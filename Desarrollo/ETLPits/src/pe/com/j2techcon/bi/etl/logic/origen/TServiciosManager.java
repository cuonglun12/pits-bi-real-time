package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.TServiciosMapper;
import pe.com.j2techcon.bi.etl.domain.origen.TServicios;
import pe.com.j2techcon.bi.etl.domain.origen.TServiciosExample;

public class TServiciosManager {
	
	private TServiciosMapper tServiciosMapper;

	public TServiciosMapper gettServiciosMapper() {
		return tServiciosMapper;
	}

	public void settServiciosMapper(TServiciosMapper tServiciosMapper) {
		this.tServiciosMapper = tServiciosMapper;
	}

	public int countByExample(TServiciosExample example) {
		return tServiciosMapper.countByExample(example);
	}

	public int deleteByExample(TServiciosExample example) {
		return tServiciosMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codservicio) {
		return tServiciosMapper.deleteByPrimaryKey(codservicio);
	}

	public int insert(TServicios record) {
		return tServiciosMapper.insert(record);
	}

	public int insertSelective(TServicios record) {
		return tServiciosMapper.insertSelective(record);
	}

	public List<TServicios> selectByExample(TServiciosExample example) {
		return tServiciosMapper.selectByExample(example);
	}

	public TServicios selectByPrimaryKey(String codservicio) {
		return tServiciosMapper.selectByPrimaryKey(codservicio);
	}

	public int updateByExampleSelective(TServicios record,
			TServiciosExample example) {
		return tServiciosMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TServicios record, TServiciosExample example) {
		return tServiciosMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TServicios record) {
		return tServiciosMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TServicios record) {
		return tServiciosMapper.updateByPrimaryKey(record);
	}

}

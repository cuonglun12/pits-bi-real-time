package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.TServiciosMapper;
import pe.com.j2techcon.bi.etl.domain.origen.TServicios;
import pe.com.j2techcon.bi.etl.domain.origen.TServiciosExample;

public class TServiciosManager {
	
	private TServiciosMapper tServiciosMapper;

	public TServiciosMapper gettServiciosMapper() throws Exception {
		return tServiciosMapper;
	}

	public void settServiciosMapper(TServiciosMapper tServiciosMapper) throws Exception {
		this.tServiciosMapper = tServiciosMapper;
	}

	public int countByExample(TServiciosExample example) throws Exception {
		return tServiciosMapper.countByExample(example);
	}

	public int deleteByExample(TServiciosExample example) throws Exception {
		return tServiciosMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codservicio) throws Exception {
		return tServiciosMapper.deleteByPrimaryKey(codservicio);
	}

	public int insert(TServicios record) throws Exception {
		return tServiciosMapper.insert(record);
	}

	public int insertSelective(TServicios record) throws Exception {
		return tServiciosMapper.insertSelective(record);
	}

	public List<TServicios> selectByExample(TServiciosExample example) throws Exception {
		return tServiciosMapper.selectByExample(example);
	}

	public TServicios selectByPrimaryKey(String codservicio) throws Exception {
		return tServiciosMapper.selectByPrimaryKey(codservicio);
	}

	public int updateByExampleSelective(TServicios record,
			TServiciosExample example) throws Exception {
		return tServiciosMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TServicios record, TServiciosExample example) throws Exception {
		return tServiciosMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TServicios record) throws Exception {
		return tServiciosMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TServicios record) throws Exception {
		return tServiciosMapper.updateByPrimaryKey(record);
	}

}

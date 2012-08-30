package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.DetdespachoMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Detdespacho;
import pe.com.j2techcon.bi.etl.domain.origen.DetdespachoExample;

public class DetdespachoManager {
	
	private DetdespachoMapper detdespachoMapper;

	public DetdespachoMapper getDetdespachoMapper() throws Exception {
		return detdespachoMapper;
	}

	public void setDetdespachoMapper(DetdespachoMapper detdespachoMapper) throws Exception {
		this.detdespachoMapper = detdespachoMapper;
	}

	public int countByExample(DetdespachoExample example) throws Exception {
		return detdespachoMapper.countByExample(example);
	}

	public int deleteByExample(DetdespachoExample example) throws Exception {
		return detdespachoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String serieguia, String nroguia,
			String serie, String orden, String correlativo) throws Exception {
		return detdespachoMapper.deleteByPrimaryKey(serieguia, nroguia, serie, orden, correlativo);
	}

	public int insert(Detdespacho record) throws Exception {
		return detdespachoMapper.insert(record);
	}

	public int insertSelective(Detdespacho record) throws Exception {
		return detdespachoMapper.insertSelective(record);
	}

	public List<Detdespacho> selectByExample(DetdespachoExample example) throws Exception {
		return detdespachoMapper.selectByExample(example);
	}

	public Detdespacho selectByPrimaryKey(String serieguia, String nroguia,
			String serie, String orden, String correlativo) throws Exception {
		return detdespachoMapper.selectByPrimaryKey(serieguia, nroguia, serie, orden, correlativo);
	}

	public int updateByExampleSelective(Detdespacho record,
			DetdespachoExample example) throws Exception {
		return detdespachoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Detdespacho record, DetdespachoExample example) throws Exception {
		return detdespachoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Detdespacho record) throws Exception {
		return detdespachoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Detdespacho record) throws Exception {
		return detdespachoMapper.updateByPrimaryKey(record);
	}

}

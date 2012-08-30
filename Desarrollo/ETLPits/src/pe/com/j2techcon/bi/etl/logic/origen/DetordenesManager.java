package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.DetordenesMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Detordenes;
import pe.com.j2techcon.bi.etl.domain.origen.DetordenesExample;

public class DetordenesManager {
	
	private DetordenesMapper detordenesMapper;

	public DetordenesMapper getDetordenesMapper() throws Exception {
		return detordenesMapper;
	}

	public void setDetordenesMapper(DetordenesMapper detordenesMapper) throws Exception {
		this.detordenesMapper = detordenesMapper;
	}

	public int countByExample(DetordenesExample example) throws Exception {
		return detordenesMapper.countByExample(example);
	}

	public int deleteByExample(DetordenesExample example) throws Exception {
		return detordenesMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String serie, String orden,
			String correlativo, String tipoingreso, String userDigitacion) throws Exception {
		return detordenesMapper.deleteByPrimaryKey(serie, orden, correlativo, tipoingreso, userDigitacion);
	}

	public int insert(Detordenes record) throws Exception {
		return detordenesMapper.insert(record);
	}

	public int insertSelective(Detordenes record) throws Exception {
		return detordenesMapper.insertSelective(record);
	}

	public List<Detordenes> selectByExample(DetordenesExample example) throws Exception {
		return detordenesMapper.selectByExample(example);
	}

	public Detordenes selectByPrimaryKey(String serie, String orden,
			String correlativo, String tipoingreso, String userDigitacion) throws Exception {
		return detordenesMapper.selectByPrimaryKey(serie, orden, correlativo, tipoingreso, userDigitacion);
	}

	public int updateByExampleSelective(Detordenes record,
			DetordenesExample example) throws Exception {
		return detordenesMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Detordenes record, DetordenesExample example) throws Exception {
		return detordenesMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Detordenes record) throws Exception {
		return detordenesMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Detordenes record) throws Exception {
		return detordenesMapper.updateByPrimaryKey(record);
	}

}

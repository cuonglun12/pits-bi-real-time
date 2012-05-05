package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.DetordenesMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Detordenes;
import pe.com.j2techcon.bi.etl.domain.origen.DetordenesExample;

public class DetordenesManager {
	
	private DetordenesMapper detordenesMapper;

	public DetordenesMapper getDetordenesMapper() {
		return detordenesMapper;
	}

	public void setDetordenesMapper(DetordenesMapper detordenesMapper) {
		this.detordenesMapper = detordenesMapper;
	}

	public int countByExample(DetordenesExample example) {
		return detordenesMapper.countByExample(example);
	}

	public int deleteByExample(DetordenesExample example) {
		return detordenesMapper.deleteByExample(example);
	}

	public int insert(Detordenes record) {
		return detordenesMapper.insert(record);
	}

	public int insertSelective(Detordenes record) {
		return detordenesMapper.insertSelective(record);
	}

	public List<Detordenes> selectByExample(DetordenesExample example) {
		return detordenesMapper.selectByExample(example);
	}

	public int updateByExampleSelective(Detordenes record,
			DetordenesExample example) {
		return detordenesMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Detordenes record, DetordenesExample example) {
		return detordenesMapper.updateByExample(record, example);
	}

}

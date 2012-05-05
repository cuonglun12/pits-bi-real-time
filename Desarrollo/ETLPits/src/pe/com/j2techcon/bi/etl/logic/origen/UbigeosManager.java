package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.UbigeosMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Ubigeos;
import pe.com.j2techcon.bi.etl.domain.origen.UbigeosExample;

public class UbigeosManager {
	
	private UbigeosMapper ubigeosMapper;

	public UbigeosMapper getUbigeosMapper() {
		return ubigeosMapper;
	}

	public void setUbigeosMapper(UbigeosMapper ubigeosMapper) {
		this.ubigeosMapper = ubigeosMapper;
	}

	public int countByExample(UbigeosExample example) {
		return ubigeosMapper.countByExample(example);
	}

	public int deleteByExample(UbigeosExample example) {
		return ubigeosMapper.deleteByExample(example);
	}

	public int insert(Ubigeos record) {
		return ubigeosMapper.insert(record);
	}

	public int insertSelective(Ubigeos record) {
		return ubigeosMapper.insertSelective(record);
	}

	public List<Ubigeos> selectByExample(UbigeosExample example) {
		return ubigeosMapper.selectByExample(example);
	}

	public int updateByExampleSelective(Ubigeos record, UbigeosExample example) {
		return ubigeosMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Ubigeos record, UbigeosExample example) {
		return ubigeosMapper.updateByExample(record, example);
	}

}

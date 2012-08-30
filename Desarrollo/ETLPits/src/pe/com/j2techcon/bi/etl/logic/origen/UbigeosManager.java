package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.UbigeosMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Ubigeos;
import pe.com.j2techcon.bi.etl.domain.origen.UbigeosExample;

public class UbigeosManager {
	
	private UbigeosMapper ubigeosMapper;

	public UbigeosMapper getUbigeosMapper() throws Exception {
		return ubigeosMapper;
	}

	public void setUbigeosMapper(UbigeosMapper ubigeosMapper) throws Exception {
		this.ubigeosMapper = ubigeosMapper;
	}

	public int countByExample(UbigeosExample example) throws Exception {
		return ubigeosMapper.countByExample(example);
	}

	public int deleteByExample(UbigeosExample example) throws Exception {
		return ubigeosMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String ubigeo) throws Exception {
		return ubigeosMapper.deleteByPrimaryKey(ubigeo);
	}

	public int insert(Ubigeos record) throws Exception {
		return ubigeosMapper.insert(record);
	}

	public int insertSelective(Ubigeos record) throws Exception {
		return ubigeosMapper.insertSelective(record);
	}

	public List<Ubigeos> selectByExample(UbigeosExample example) throws Exception {
		return ubigeosMapper.selectByExample(example);
	}

	public Ubigeos selectByPrimaryKey(String ubigeo) throws Exception {
		return ubigeosMapper.selectByPrimaryKey(ubigeo);
	}

	public int updateByExampleSelective(Ubigeos record, UbigeosExample example) throws Exception {
		return ubigeosMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Ubigeos record, UbigeosExample example) throws Exception {
		return ubigeosMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Ubigeos record) throws Exception {
		return ubigeosMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Ubigeos record) throws Exception {
		return ubigeosMapper.updateByPrimaryKey(record);
	}

}

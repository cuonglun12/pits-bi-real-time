package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.SedesprovMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Sedesprov;
import pe.com.j2techcon.bi.etl.domain.origen.SedesprovExample;

public class SedesprovManager {
	
	private SedesprovMapper sedesprovMapper;

	public SedesprovMapper getSedesprovMapper() {
		return sedesprovMapper;
	}

	public void setSedesprovMapper(SedesprovMapper sedesprovMapper) {
		this.sedesprovMapper = sedesprovMapper;
	}

	public int countByExample(SedesprovExample example) {
		return sedesprovMapper.countByExample(example);
	}

	public int deleteByExample(SedesprovExample example) {
		return sedesprovMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codsede) {
		return sedesprovMapper.deleteByPrimaryKey(codsede);
	}

	public int insert(Sedesprov record) {
		return sedesprovMapper.insert(record);
	}

	public int insertSelective(Sedesprov record) {
		return sedesprovMapper.insertSelective(record);
	}

	public List<Sedesprov> selectByExample(SedesprovExample example) {
		return sedesprovMapper.selectByExample(example);
	}

	public Sedesprov selectByPrimaryKey(String codsede) {
		return sedesprovMapper.selectByPrimaryKey(codsede);
	}

	public int updateByExampleSelective(Sedesprov record,
			SedesprovExample example) {
		return sedesprovMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Sedesprov record, SedesprovExample example) {
		return sedesprovMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Sedesprov record) {
		return sedesprovMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Sedesprov record) {
		return sedesprovMapper.updateByPrimaryKey(record);
	}

}

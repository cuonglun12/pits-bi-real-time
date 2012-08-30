package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.SedesprovMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Sedesprov;
import pe.com.j2techcon.bi.etl.domain.origen.SedesprovExample;

public class SedesprovManager {
	
	private SedesprovMapper sedesprovMapper;

	public SedesprovMapper getSedesprovMapper() throws Exception {
		return sedesprovMapper;
	}

	public void setSedesprovMapper(SedesprovMapper sedesprovMapper) throws Exception {
		this.sedesprovMapper = sedesprovMapper;
	}

	public int countByExample(SedesprovExample example) throws Exception {
		return sedesprovMapper.countByExample(example);
	}

	public int deleteByExample(SedesprovExample example) throws Exception {
		return sedesprovMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codsede) throws Exception {
		return sedesprovMapper.deleteByPrimaryKey(codsede);
	}

	public int insert(Sedesprov record) throws Exception {
		return sedesprovMapper.insert(record);
	}

	public int insertSelective(Sedesprov record) throws Exception {
		return sedesprovMapper.insertSelective(record);
	}

	public List<Sedesprov> selectByExample(SedesprovExample example) throws Exception {
		return sedesprovMapper.selectByExample(example);
	}

	public Sedesprov selectByPrimaryKey(String codsede) throws Exception {
		return sedesprovMapper.selectByPrimaryKey(codsede);
	}

	public int updateByExampleSelective(Sedesprov record,
			SedesprovExample example) throws Exception {
		return sedesprovMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Sedesprov record, SedesprovExample example) throws Exception {
		return sedesprovMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Sedesprov record) throws Exception {
		return sedesprovMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Sedesprov record) throws Exception {
		return sedesprovMapper.updateByPrimaryKey(record);
	}

}

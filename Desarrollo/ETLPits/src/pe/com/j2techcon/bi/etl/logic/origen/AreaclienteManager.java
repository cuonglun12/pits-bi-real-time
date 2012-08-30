package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.AreaclienteMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Areacliente;
import pe.com.j2techcon.bi.etl.domain.origen.AreaclienteExample;

public class AreaclienteManager {
	
	private AreaclienteMapper areaclienteMapper;

	public AreaclienteMapper getAreaclienteMapper() throws Exception {
		return areaclienteMapper;
	}

	public void setAreaclienteMapper(AreaclienteMapper areaclienteMapper) throws Exception {
		this.areaclienteMapper = areaclienteMapper;
	}

	public int countByExample(AreaclienteExample example) throws Exception {
		return areaclienteMapper.countByExample(example);
	}

	public int deleteByExample(AreaclienteExample example) throws Exception {
		return areaclienteMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codareacliente, String codcliente) throws Exception {
		return areaclienteMapper.deleteByPrimaryKey(codareacliente, codcliente);
	}

	public int insert(Areacliente record) throws Exception {
		return areaclienteMapper.insert(record);
	}

	public int insertSelective(Areacliente record) throws Exception {
		return areaclienteMapper.insertSelective(record);
	}

	public List<Areacliente> selectByExample(AreaclienteExample example) throws Exception {
		return areaclienteMapper.selectByExample(example);
	}

	public Areacliente selectByPrimaryKey(String codareacliente,
			String codcliente) throws Exception {
		return areaclienteMapper.selectByPrimaryKey(codareacliente, codcliente);
	}

	public int updateByExampleSelective(Areacliente record,
			AreaclienteExample example) throws Exception {
		return areaclienteMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Areacliente record, AreaclienteExample example) throws Exception {
		return areaclienteMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Areacliente record) throws Exception {
		return areaclienteMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Areacliente record) throws Exception {
		return areaclienteMapper.updateByPrimaryKey(record);
	}

}

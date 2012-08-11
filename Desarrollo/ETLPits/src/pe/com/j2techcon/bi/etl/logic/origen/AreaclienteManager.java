package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.AreaclienteMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Areacliente;
import pe.com.j2techcon.bi.etl.domain.origen.AreaclienteExample;

public class AreaclienteManager {
	
	private AreaclienteMapper areaclienteMapper;

	public AreaclienteMapper getAreaclienteMapper() {
		return areaclienteMapper;
	}

	public void setAreaclienteMapper(AreaclienteMapper areaclienteMapper) {
		this.areaclienteMapper = areaclienteMapper;
	}

	public int countByExample(AreaclienteExample example) {
		return areaclienteMapper.countByExample(example);
	}

	public int deleteByExample(AreaclienteExample example) {
		return areaclienteMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codareacliente, String codcliente) {
		return areaclienteMapper.deleteByPrimaryKey(codareacliente, codcliente);
	}

	public int insert(Areacliente record) {
		return areaclienteMapper.insert(record);
	}

	public int insertSelective(Areacliente record) {
		return areaclienteMapper.insertSelective(record);
	}

	public List<Areacliente> selectByExample(AreaclienteExample example) {
		return areaclienteMapper.selectByExample(example);
	}

	public Areacliente selectByPrimaryKey(String codareacliente,
			String codcliente) {
		return areaclienteMapper.selectByPrimaryKey(codareacliente, codcliente);
	}

	public int updateByExampleSelective(Areacliente record,
			AreaclienteExample example) {
		return areaclienteMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Areacliente record, AreaclienteExample example) {
		return areaclienteMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Areacliente record) {
		return areaclienteMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Areacliente record) {
		return areaclienteMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.DespachoMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Despacho;
import pe.com.j2techcon.bi.etl.domain.origen.DespachoExample;

public class DespachoManager {

	private DespachoMapper despachoMapper;

	public DespachoMapper getDespachoMapper() {
		return despachoMapper;
	}

	public void setDespachoMapper(DespachoMapper despachoMapper) {
		this.despachoMapper = despachoMapper;
	}

	public int countByExample(DespachoExample example) {
		return despachoMapper.countByExample(example);
	}

	public int deleteByExample(DespachoExample example) {
		return despachoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String serieguia, String nroguia) {
		return despachoMapper.deleteByPrimaryKey(serieguia, nroguia);
	}

	public int insert(Despacho record) {
		return despachoMapper.insert(record);
	}

	public int insertSelective(Despacho record) {
		return despachoMapper.insertSelective(record);
	}

	public List<Despacho> selectByExample(DespachoExample example) {
		return despachoMapper.selectByExample(example);
	}

	public Despacho selectByPrimaryKey(String serieguia, String nroguia) {
		return despachoMapper.selectByPrimaryKey(serieguia, nroguia);
	}

	public int updateByExampleSelective(Despacho record, DespachoExample example) {
		return despachoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Despacho record, DespachoExample example) {
		return despachoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Despacho record) {
		return despachoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Despacho record) {
		return despachoMapper.updateByPrimaryKey(record);
	}

}

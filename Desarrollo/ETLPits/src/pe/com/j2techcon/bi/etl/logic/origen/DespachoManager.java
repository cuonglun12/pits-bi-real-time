package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.DespachoMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Despacho;
import pe.com.j2techcon.bi.etl.domain.origen.DespachoExample;

public class DespachoManager {

	private DespachoMapper despachoMapper;

	public DespachoMapper getDespachoMapper() throws Exception {
		return despachoMapper;
	}

	public void setDespachoMapper(DespachoMapper despachoMapper) throws Exception {
		this.despachoMapper = despachoMapper;
	}

	public int countByExample(DespachoExample example) throws Exception {
		return despachoMapper.countByExample(example);
	}

	public int deleteByExample(DespachoExample example) throws Exception {
		return despachoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String serieguia, String nroguia) throws Exception {
		return despachoMapper.deleteByPrimaryKey(serieguia, nroguia);
	}

	public int insert(Despacho record) throws Exception {
		return despachoMapper.insert(record);
	}

	public int insertSelective(Despacho record) throws Exception {
		return despachoMapper.insertSelective(record);
	}

	public List<Despacho> selectByExample(DespachoExample example) throws Exception {
		return despachoMapper.selectByExample(example);
	}

	public Despacho selectByPrimaryKey(String serieguia, String nroguia) throws Exception {
		return despachoMapper.selectByPrimaryKey(serieguia, nroguia);
	}

	public int updateByExampleSelective(Despacho record, DespachoExample example) throws Exception {
		return despachoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Despacho record, DespachoExample example) throws Exception {
		return despachoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Despacho record) throws Exception {
		return despachoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Despacho record) throws Exception {
		return despachoMapper.updateByPrimaryKey(record);
	}

}

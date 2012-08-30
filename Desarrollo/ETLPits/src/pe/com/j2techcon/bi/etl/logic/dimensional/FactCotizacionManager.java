package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.FactCotizacionMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacion;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacionExample;

public class FactCotizacionManager {
	
	private FactCotizacionMapper factCotizacionMapper;
	
	public FactCotizacionMapper getFactCotizacionMapper() throws Exception {
		return factCotizacionMapper;
	}


	public void setFactCotizacionMapper(FactCotizacionMapper factCotizacionMapper) throws Exception {
		this.factCotizacionMapper = factCotizacionMapper;
	}


	public int countByExample(FactCotizacionExample example) throws Exception {
		return factCotizacionMapper.countByExample(example);
	}

	
	public int deleteByExample(FactCotizacionExample example) throws Exception {
		return factCotizacionMapper.deleteByExample(example);
	}

	
	public int deleteByPrimaryKey(Integer cotizacionKey) throws Exception {
		return factCotizacionMapper.deleteByPrimaryKey(cotizacionKey);
	}

	
	public int insert(FactCotizacion record) throws Exception {
		return factCotizacionMapper.insert(record);
	}

	
	public int insertSelective(FactCotizacion record) throws Exception {
		return factCotizacionMapper.insertSelective(record);
	}

	
	public List<FactCotizacion> selectByExample(FactCotizacionExample example) throws Exception {
		return factCotizacionMapper.selectByExample(example);
	}

	
	public FactCotizacion selectByPrimaryKey(Integer cotizacionKey) throws Exception {
		return factCotizacionMapper.selectByPrimaryKey(cotizacionKey);
	}

	
	public int updateByExampleSelective(FactCotizacion record,
			FactCotizacionExample example) throws Exception {
		return factCotizacionMapper.updateByExampleSelective(record, example);
	}

	
	public int updateByExample(FactCotizacion record,
			FactCotizacionExample example) throws Exception {
		return factCotizacionMapper.updateByExample(record, example);
	}

	
	public int updateByPrimaryKeySelective(FactCotizacion record) throws Exception {
		return factCotizacionMapper.updateByPrimaryKeySelective(record);
	}

	
	public int updateByPrimaryKey(FactCotizacion record) throws Exception {
		return factCotizacionMapper.updateByPrimaryKey(record);
	}

}

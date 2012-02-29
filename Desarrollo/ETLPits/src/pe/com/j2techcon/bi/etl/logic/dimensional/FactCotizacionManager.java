package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.FactCotizacionMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacion;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacionExample;

public class FactCotizacionManager {
	
	private FactCotizacionMapper factCotizacionMapper;

	public FactCotizacionMapper getFactCotizacionMapper() {
		return factCotizacionMapper;
	}

	public void setFactCotizacionMapper(FactCotizacionMapper factCotizacionMapper) {
		this.factCotizacionMapper = factCotizacionMapper;
	}


	public int countByExample(FactCotizacionExample example) {
		return factCotizacionMapper.countByExample(example);
	}


	public int deleteByExample(FactCotizacionExample example) {
		return factCotizacionMapper.deleteByExample(example);
	}


	public int insert(FactCotizacion record) {
		return factCotizacionMapper.insert(record);
	}


	public int insertSelective(FactCotizacion record) {
		return factCotizacionMapper.insertSelective(record);
	}


	public List<FactCotizacion> selectByExample(FactCotizacionExample example) {
		return factCotizacionMapper.selectByExample(example);
	}


	public int updateByExampleSelective(FactCotizacion record,
			FactCotizacionExample example) {
		return factCotizacionMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(FactCotizacion record,
			FactCotizacionExample example) {
		return factCotizacionMapper.updateByExample(record, example);
	}

}

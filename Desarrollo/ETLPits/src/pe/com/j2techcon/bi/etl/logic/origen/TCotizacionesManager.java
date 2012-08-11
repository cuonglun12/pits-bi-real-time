package pe.com.j2techcon.bi.etl.logic.origen;

import java.math.BigDecimal;
import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.TCotizacionesMapper;
import pe.com.j2techcon.bi.etl.domain.origen.TCotizaciones;
import pe.com.j2techcon.bi.etl.domain.origen.TCotizacionesExample;

public class TCotizacionesManager {
	
	private TCotizacionesMapper tCotizacionesMapper;

	public TCotizacionesMapper gettCotizacionesMapper() {
		return tCotizacionesMapper;
	}

	public void settCotizacionesMapper(TCotizacionesMapper tCotizacionesMapper) {
		this.tCotizacionesMapper = tCotizacionesMapper;
	}

	public int countByExample(TCotizacionesExample example) {
		return tCotizacionesMapper.countByExample(example);
	}

	public int deleteByExample(TCotizacionesExample example) {
		return tCotizacionesMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String coserie, BigDecimal conumero) {
		return tCotizacionesMapper.deleteByPrimaryKey(coserie, conumero);
	}

	public int insert(TCotizaciones record) {
		return tCotizacionesMapper.insert(record);
	}

	public int insertSelective(TCotizaciones record) {
		return tCotizacionesMapper.insertSelective(record);
	}

	public List<TCotizaciones> selectByExample(TCotizacionesExample example) {
		return tCotizacionesMapper.selectByExample(example);
	}

	public TCotizaciones selectByPrimaryKey(String coserie, BigDecimal conumero) {
		return tCotizacionesMapper.selectByPrimaryKey(coserie, conumero);
	}

	public int updateByExampleSelective(TCotizaciones record,
			TCotizacionesExample example) {
		return tCotizacionesMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TCotizaciones record,
			TCotizacionesExample example) {
		return tCotizacionesMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TCotizaciones record) {
		return tCotizacionesMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCotizaciones record) {
		return tCotizacionesMapper.updateByPrimaryKey(record);
	}
}

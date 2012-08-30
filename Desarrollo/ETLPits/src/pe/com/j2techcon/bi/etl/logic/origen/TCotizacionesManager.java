package pe.com.j2techcon.bi.etl.logic.origen;

import java.math.BigDecimal;
import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.TCotizacionesMapper;
import pe.com.j2techcon.bi.etl.domain.origen.TCotizaciones;
import pe.com.j2techcon.bi.etl.domain.origen.TCotizacionesExample;

public class TCotizacionesManager {
	
	private TCotizacionesMapper tCotizacionesMapper;

	public TCotizacionesMapper gettCotizacionesMapper() throws Exception {
		return tCotizacionesMapper;
	}

	public void settCotizacionesMapper(TCotizacionesMapper tCotizacionesMapper) throws Exception {
		this.tCotizacionesMapper = tCotizacionesMapper;
	}

	public int countByExample(TCotizacionesExample example) throws Exception {
		return tCotizacionesMapper.countByExample(example);
	}

	public int deleteByExample(TCotizacionesExample example) throws Exception {
		return tCotizacionesMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String coserie, BigDecimal conumero) throws Exception {
		return tCotizacionesMapper.deleteByPrimaryKey(coserie, conumero);
	}

	public int insert(TCotizaciones record) throws Exception {
		return tCotizacionesMapper.insert(record);
	}

	public int insertSelective(TCotizaciones record) throws Exception {
		return tCotizacionesMapper.insertSelective(record);
	}

	public List<TCotizaciones> selectByExample(TCotizacionesExample example) throws Exception {
		return tCotizacionesMapper.selectByExample(example);
	}

	public TCotizaciones selectByPrimaryKey(String coserie, BigDecimal conumero) throws Exception {
		return tCotizacionesMapper.selectByPrimaryKey(coserie, conumero);
	}

	public int updateByExampleSelective(TCotizaciones record,
			TCotizacionesExample example) throws Exception {
		return tCotizacionesMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TCotizaciones record,
			TCotizacionesExample example) throws Exception {
		return tCotizacionesMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TCotizaciones record) throws Exception {
		return tCotizacionesMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCotizaciones record) throws Exception {
		return tCotizacionesMapper.updateByPrimaryKey(record);
	}
}

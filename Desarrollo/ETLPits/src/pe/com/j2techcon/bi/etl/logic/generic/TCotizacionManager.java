package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TCotizacionMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacion;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacionExample;

public class TCotizacionManager {
	
	private TCotizacionMapper tCotizacionMapper;

	public TCotizacionMapper gettCotizacionMapper() {
		return tCotizacionMapper;
	}

	public void settCotizacionMapper(TCotizacionMapper tCotizacionMapper) {
		this.tCotizacionMapper = tCotizacionMapper;
	}

	public int countByExample(TCotizacionExample example) {
		return tCotizacionMapper.countByExample(example);
	}

	public int deleteByExample(TCotizacionExample example) {
		return tCotizacionMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer cotiId) {
		return tCotizacionMapper.deleteByPrimaryKey(cotiId);
	}

	public int insert(TCotizacion record) {
		return tCotizacionMapper.insert(record);
	}

	public int insertSelective(TCotizacion record) {
		return tCotizacionMapper.insertSelective(record);
	}

	public List<TCotizacion> selectByExample(TCotizacionExample example) {
		return tCotizacionMapper.selectByExample(example);
	}

	public TCotizacion selectByPrimaryKey(Integer cotiId) {
		return tCotizacionMapper.selectByPrimaryKey(cotiId);
	}

	public int updateByExampleSelective(TCotizacion record,
			TCotizacionExample example) {
		return tCotizacionMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TCotizacion record, TCotizacionExample example) {
		return tCotizacionMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TCotizacion record) {
		return tCotizacionMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCotizacion record) {
		return tCotizacionMapper.updateByPrimaryKey(record);
	}

}

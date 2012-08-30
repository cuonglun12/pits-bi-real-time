package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TCotizacionMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacion;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacionExample;

public class TCotizacionManager {
	
	private TCotizacionMapper tCotizacionMapper;

	public TCotizacionMapper gettCotizacionMapper() throws Exception {
		return tCotizacionMapper;
	}

	public void settCotizacionMapper(TCotizacionMapper tCotizacionMapper) throws Exception {
		this.tCotizacionMapper = tCotizacionMapper;
	}

	public int countByExample(TCotizacionExample example) throws Exception {
		return tCotizacionMapper.countByExample(example);
	}

	public int deleteByExample(TCotizacionExample example) throws Exception {
		return tCotizacionMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer cotiId) throws Exception {
		return tCotizacionMapper.deleteByPrimaryKey(cotiId);
	}

	public int insert(TCotizacion record) throws Exception {
		return tCotizacionMapper.insert(record);
	}

	public int insertSelective(TCotizacion record) throws Exception {
		return tCotizacionMapper.insertSelective(record);
	}

	public List<TCotizacion> selectByExample(TCotizacionExample example) throws Exception {
		return tCotizacionMapper.selectByExample(example);
	}

	public TCotizacion selectByPrimaryKey(Integer cotiId) throws Exception {
		return tCotizacionMapper.selectByPrimaryKey(cotiId);
	}

	public int updateByExampleSelective(TCotizacion record,
			TCotizacionExample example) throws Exception {
		return tCotizacionMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TCotizacion record, TCotizacionExample example) throws Exception {
		return tCotizacionMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TCotizacion record) throws Exception {
		return tCotizacionMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCotizacion record) throws Exception {
		return tCotizacionMapper.updateByPrimaryKey(record);
	}

}

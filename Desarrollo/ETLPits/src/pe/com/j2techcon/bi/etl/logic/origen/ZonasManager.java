package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.ZonasMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Zonas;
import pe.com.j2techcon.bi.etl.domain.origen.ZonasExample;

public class ZonasManager {

	private ZonasMapper zonasMapper;
	
	public ZonasMapper getZonasMapper() {
		return zonasMapper;
	}

	public void setZonasMapper(ZonasMapper zonasMapper) {
		this.zonasMapper = zonasMapper;
	}

	public int countByExample(ZonasExample example) {
		return zonasMapper.countByExample(example);
	}

	public int deleteByExample(ZonasExample example) {
		return zonasMapper.deleteByExample(example);
	}

	public int insert(Zonas record) {
		return zonasMapper.insert(record);
	}

	public int insertSelective(Zonas record) {
		return zonasMapper.insertSelective(record);
	}

	public List<Zonas> selectByExample(ZonasExample example) {
		return zonasMapper.selectByExample(example);
	}

	public int updateByExampleSelective(Zonas record, ZonasExample example) {
		return zonasMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Zonas record, ZonasExample example) {
		return zonasMapper.updateByExample(record, example);
	}

}

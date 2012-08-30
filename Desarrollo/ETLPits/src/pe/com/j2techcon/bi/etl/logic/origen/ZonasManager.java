package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.ZonasMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Zonas;
import pe.com.j2techcon.bi.etl.domain.origen.ZonasExample;

public class ZonasManager {
	
	private ZonasMapper zonasMapper;

	public ZonasMapper getZonasMapper() throws Exception {
		return zonasMapper;
	}

	public void setZonasMapper(ZonasMapper zonasMapper) throws Exception {
		this.zonasMapper = zonasMapper;
	}

	public int countByExample(ZonasExample example) throws Exception {
		return zonasMapper.countByExample(example);
	}

	public int deleteByExample(ZonasExample example) throws Exception {
		return zonasMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codzona) throws Exception {
		return zonasMapper.deleteByPrimaryKey(codzona);
	}

	public int insert(Zonas record) throws Exception {
		return zonasMapper.insert(record);
	}

	public int insertSelective(Zonas record) throws Exception {
		return zonasMapper.insertSelective(record);
	}

	public List<Zonas> selectByExample(ZonasExample example) throws Exception {
		return zonasMapper.selectByExample(example);
	}

	public Zonas selectByPrimaryKey(String codzona) throws Exception {
		return zonasMapper.selectByPrimaryKey(codzona);
	}

	public int updateByExampleSelective(Zonas record, ZonasExample example) throws Exception {
		return zonasMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Zonas record, ZonasExample example) throws Exception {
		return zonasMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Zonas record) throws Exception {
		return zonasMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Zonas record) throws Exception {
		return zonasMapper.updateByPrimaryKey(record);
	}

}

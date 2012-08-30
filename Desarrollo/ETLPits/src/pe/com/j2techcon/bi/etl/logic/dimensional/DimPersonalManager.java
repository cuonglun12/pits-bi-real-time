package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimPersonalMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimPersonal;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimPersonalExample;

public class DimPersonalManager {
	
	private DimPersonalMapper dimPersonalMapper;

	public DimPersonalMapper getDimPersonalMapper() throws Exception {
		return dimPersonalMapper;
	}

	public void setDimPersonalMapper(DimPersonalMapper dimPersonalMapper) throws Exception {
		this.dimPersonalMapper = dimPersonalMapper;
	}


	public int countByExample(DimPersonalExample example) throws Exception {
		return dimPersonalMapper.countByExample(example);
	}


	public int deleteByExample(DimPersonalExample example) throws Exception {
		return dimPersonalMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer personalKey) throws Exception {
		return dimPersonalMapper.deleteByPrimaryKey(personalKey);
	}


	public int insert(DimPersonal record) throws Exception {
		return dimPersonalMapper.insert(record);
	}


	public int insertSelective(DimPersonal record) throws Exception {
		return dimPersonalMapper.insertSelective(record);
	}


	public List<DimPersonal> selectByExample(DimPersonalExample example) throws Exception {
		return dimPersonalMapper.selectByExample(example);
	}


	public DimPersonal selectByPrimaryKey(Integer personalKey) throws Exception {
		return dimPersonalMapper.selectByPrimaryKey(personalKey);
	}


	public int updateByExampleSelective(DimPersonal record,
			DimPersonalExample example) throws Exception {
		return dimPersonalMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimPersonal record, DimPersonalExample example) throws Exception {
		return dimPersonalMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimPersonal record) throws Exception {
		return dimPersonalMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimPersonal record) throws Exception {
		return dimPersonalMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimPersonalMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimPersonal;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimPersonalExample;

public class DimPersonalManager {
	
	private DimPersonalMapper dimPersonalMapper;

	public DimPersonalMapper getDimPersonalMapper() {
		return dimPersonalMapper;
	}

	public void setDimPersonalMapper(DimPersonalMapper dimPersonalMapper) {
		this.dimPersonalMapper = dimPersonalMapper;
	}


	public int countByExample(DimPersonalExample example) {
		return dimPersonalMapper.countByExample(example);
	}


	public int deleteByExample(DimPersonalExample example) {
		return dimPersonalMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer personalKey) {
		return dimPersonalMapper.deleteByPrimaryKey(personalKey);
	}


	public int insert(DimPersonal record) {
		return dimPersonalMapper.insert(record);
	}


	public int insertSelective(DimPersonal record) {
		return dimPersonalMapper.insertSelective(record);
	}


	public List<DimPersonal> selectByExample(DimPersonalExample example) {
		return dimPersonalMapper.selectByExample(example);
	}


	public DimPersonal selectByPrimaryKey(Integer personalKey) {
		return dimPersonalMapper.selectByPrimaryKey(personalKey);
	}


	public int updateByExampleSelective(DimPersonal record,
			DimPersonalExample example) {
		return dimPersonalMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimPersonal record, DimPersonalExample example) {
		return dimPersonalMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimPersonal record) {
		return dimPersonalMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimPersonal record) {
		return dimPersonalMapper.updateByPrimaryKey(record);
	}

}

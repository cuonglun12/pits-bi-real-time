package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimSedeMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimSede;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimSedeExample;

public class DimSedeManager {
	
	private DimSedeMapper dimSedeMapper;

	public DimSedeMapper getDimSedeMapper() {
		return dimSedeMapper;
	}

	public void setDimSedeMapper(DimSedeMapper dimSedeMapper) {
		this.dimSedeMapper = dimSedeMapper;
	}


	public int countByExample(DimSedeExample example) {
		return dimSedeMapper.countByExample(example);
	}


	public int deleteByExample(DimSedeExample example) {
		return dimSedeMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer sedeKey) {
		return dimSedeMapper.deleteByPrimaryKey(sedeKey);
	}


	public int insert(DimSede record) {
		return dimSedeMapper.insert(record);
	}


	public int insertSelective(DimSede record) {
		return dimSedeMapper.insertSelective(record);
	}


	public List<DimSede> selectByExample(DimSedeExample example) {
		return dimSedeMapper.selectByExample(example);
	}


	public DimSede selectByPrimaryKey(Integer sedeKey) {
		return dimSedeMapper.selectByPrimaryKey(sedeKey);
	}


	public int updateByExampleSelective(DimSede record, DimSedeExample example) {
		return dimSedeMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimSede record, DimSedeExample example) {
		return dimSedeMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimSede record) {
		return dimSedeMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimSede record) {
		return dimSedeMapper.updateByPrimaryKey(record);
	}

}

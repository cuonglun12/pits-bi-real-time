package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimSedeMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimSede;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimSedeExample;

public class DimSedeManager {
	
	private DimSedeMapper dimSedeMapper;

	public DimSedeMapper getDimSedeMapper() throws Exception {
		return dimSedeMapper;
	}

	public void setDimSedeMapper(DimSedeMapper dimSedeMapper) throws Exception {
		this.dimSedeMapper = dimSedeMapper;
	}


	public int countByExample(DimSedeExample example) throws Exception {
		return dimSedeMapper.countByExample(example);
	}


	public int deleteByExample(DimSedeExample example) throws Exception {
		return dimSedeMapper.deleteByExample(example);
	}


	public int deleteByPrimaryKey(Integer sedeKey) throws Exception {
		return dimSedeMapper.deleteByPrimaryKey(sedeKey);
	}


	public int insert(DimSede record) throws Exception {
		return dimSedeMapper.insert(record);
	}


	public int insertSelective(DimSede record) throws Exception {
		return dimSedeMapper.insertSelective(record);
	}


	public List<DimSede> selectByExample(DimSedeExample example) throws Exception {
		return dimSedeMapper.selectByExample(example);
	}


	public DimSede selectByPrimaryKey(Integer sedeKey) throws Exception {
		return dimSedeMapper.selectByPrimaryKey(sedeKey);
	}


	public int updateByExampleSelective(DimSede record, DimSedeExample example) throws Exception {
		return dimSedeMapper.updateByExampleSelective(record, example);
	}


	public int updateByExample(DimSede record, DimSedeExample example) throws Exception {
		return dimSedeMapper.updateByExample(record, example);
	}


	public int updateByPrimaryKeySelective(DimSede record) throws Exception {
		return dimSedeMapper.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(DimSede record) throws Exception {
		return dimSedeMapper.updateByPrimaryKey(record);
	}

}

package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimUbigeoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimUbigeo;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimUbigeoExample;

public class DimUbigeoManager{

	private DimUbigeoMapper dimUbigeoMapper;

	public DimUbigeoMapper getDimUbigeoMapper() throws Exception {
		return dimUbigeoMapper;
	}

	public void setDimUbigeoMapper(DimUbigeoMapper dimUbigeoMapper) throws Exception {
		this.dimUbigeoMapper = dimUbigeoMapper;
	}

	public int countByExample(DimUbigeoExample example) throws Exception {
		return dimUbigeoMapper.countByExample(example);
	}

	public int deleteByExample(DimUbigeoExample example) throws Exception {
		return dimUbigeoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer ubigeoKey) throws Exception {
		return dimUbigeoMapper.deleteByPrimaryKey(ubigeoKey);
	}

	public int insert(DimUbigeo record) throws Exception {
		return dimUbigeoMapper.insert(record);
	}

	public int insertSelective(DimUbigeo record) throws Exception {
		return dimUbigeoMapper.insertSelective(record);
	}

	public List<DimUbigeo> selectByExample(DimUbigeoExample example) throws Exception {
		return dimUbigeoMapper.selectByExample(example);
	}

	public DimUbigeo selectByPrimaryKey(Integer ubigeoKey) throws Exception {
		return dimUbigeoMapper.selectByPrimaryKey(ubigeoKey);
	}

	public int updateByExampleSelective(DimUbigeo record,
			DimUbigeoExample example) throws Exception {
		return dimUbigeoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(DimUbigeo record, DimUbigeoExample example) throws Exception {
		return dimUbigeoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(DimUbigeo record) throws Exception {
		return dimUbigeoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(DimUbigeo record) throws Exception {
		return dimUbigeoMapper.updateByPrimaryKey(record);
	}

}

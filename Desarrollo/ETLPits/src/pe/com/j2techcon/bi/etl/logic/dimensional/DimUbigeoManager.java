package pe.com.j2techcon.bi.etl.logic.dimensional;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.dimensional.DimUbigeoMapper;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimUbigeo;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimUbigeoExample;

public class DimUbigeoManager{

	private DimUbigeoMapper dimUbigeoMapper;

	public DimUbigeoMapper getDimUbigeoMapper() {
		return dimUbigeoMapper;
	}

	public void setDimUbigeoMapper(DimUbigeoMapper dimUbigeoMapper) {
		this.dimUbigeoMapper = dimUbigeoMapper;
	}

	public int countByExample(DimUbigeoExample example) {
		return dimUbigeoMapper.countByExample(example);
	}

	public int deleteByExample(DimUbigeoExample example) {
		return dimUbigeoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer ubigeoKey) {
		return dimUbigeoMapper.deleteByPrimaryKey(ubigeoKey);
	}

	public int insert(DimUbigeo record) {
		return dimUbigeoMapper.insert(record);
	}

	public int insertSelective(DimUbigeo record) {
		return dimUbigeoMapper.insertSelective(record);
	}

	public List<DimUbigeo> selectByExample(DimUbigeoExample example) {
		return dimUbigeoMapper.selectByExample(example);
	}

	public DimUbigeo selectByPrimaryKey(Integer ubigeoKey) {
		return dimUbigeoMapper.selectByPrimaryKey(ubigeoKey);
	}

	public int updateByExampleSelective(DimUbigeo record,
			DimUbigeoExample example) {
		return dimUbigeoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(DimUbigeo record, DimUbigeoExample example) {
		return dimUbigeoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(DimUbigeo record) {
		return dimUbigeoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(DimUbigeo record) {
		return dimUbigeoMapper.updateByPrimaryKey(record);
	}

}

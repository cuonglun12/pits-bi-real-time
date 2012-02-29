package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TUbigeoMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeo;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeoExample;

public class TUbigeoManager {
	
	private TUbigeoMapper tUbigeoMapper;

	public TUbigeoMapper gettUbigeoMapper() {
		return tUbigeoMapper;
	}

	public void settUbigeoMapper(TUbigeoMapper tUbigeoMapper) {
		this.tUbigeoMapper = tUbigeoMapper;
	}

	public int countByExample(TUbigeoExample example) {
		return tUbigeoMapper.countByExample(example);
	}

	public int deleteByExample(TUbigeoExample example) {
		return tUbigeoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer ubiId) {
		return tUbigeoMapper.deleteByPrimaryKey(ubiId);
	}

	public int insert(TUbigeo record) {
		return tUbigeoMapper.insert(record);
	}

	public int insertSelective(TUbigeo record) {
		return tUbigeoMapper.insertSelective(record);
	}

	public List<TUbigeo> selectByExample(TUbigeoExample example) {
		return tUbigeoMapper.selectByExample(example);
	}

	public TUbigeo selectByPrimaryKey(Integer ubiId) {
		return tUbigeoMapper.selectByPrimaryKey(ubiId);
	}

	public int updateByExampleSelective(TUbigeo record, TUbigeoExample example) {
		return tUbigeoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TUbigeo record, TUbigeoExample example) {
		return tUbigeoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TUbigeo record) {
		return tUbigeoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TUbigeo record) {
		return tUbigeoMapper.updateByPrimaryKey(record);
	}

}

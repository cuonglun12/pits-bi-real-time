package pe.com.j2techcon.bi.etl.logic.generic;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.generic.TUbigeoMapper;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeo;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeoExample;

public class TUbigeoManager {
	
	private TUbigeoMapper tUbigeoMapper;

	public TUbigeoMapper gettUbigeoMapper() throws Exception {
		return tUbigeoMapper;
	}

	public void settUbigeoMapper(TUbigeoMapper tUbigeoMapper) throws Exception {
		this.tUbigeoMapper = tUbigeoMapper;
	}

	public int countByExample(TUbigeoExample example) throws Exception {
		return tUbigeoMapper.countByExample(example);
	}

	public int deleteByExample(TUbigeoExample example) throws Exception {
		return tUbigeoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer ubiId) throws Exception {
		return tUbigeoMapper.deleteByPrimaryKey(ubiId);
	}

	public int insert(TUbigeo record) throws Exception {
		return tUbigeoMapper.insert(record);
	}

	public int insertSelective(TUbigeo record) throws Exception {
		return tUbigeoMapper.insertSelective(record);
	}

	public List<TUbigeo> selectByExample(TUbigeoExample example) throws Exception {
		return tUbigeoMapper.selectByExample(example);
	}

	public TUbigeo selectByPrimaryKey(Integer ubiId) throws Exception {
		return tUbigeoMapper.selectByPrimaryKey(ubiId);
	}

	public int updateByExampleSelective(TUbigeo record, TUbigeoExample example) throws Exception {
		return tUbigeoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TUbigeo record, TUbigeoExample example) throws Exception {
		return tUbigeoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TUbigeo record) throws Exception {
		return tUbigeoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TUbigeo record) throws Exception {
		return tUbigeoMapper.updateByPrimaryKey(record);
	}

}

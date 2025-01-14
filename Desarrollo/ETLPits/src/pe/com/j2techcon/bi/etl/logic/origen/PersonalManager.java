package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.PersonalMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Personal;
import pe.com.j2techcon.bi.etl.domain.origen.PersonalExample;

public class PersonalManager {
	
	private PersonalMapper personalMapper;

	public PersonalMapper getPersonalMapper() throws Exception {
		return personalMapper;
	}

	public void setPersonalMapper(PersonalMapper personalMapper) throws Exception {
		this.personalMapper = personalMapper;
	}

	public int countByExample(PersonalExample example) throws Exception {
		return personalMapper.countByExample(example);
	}

	public int deleteByExample(PersonalExample example) throws Exception {
		return personalMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codigopersonal) throws Exception {
		return personalMapper.deleteByPrimaryKey(codigopersonal);
	}

	public int insert(Personal record) throws Exception {
		return personalMapper.insert(record);
	}

	public int insertSelective(Personal record) throws Exception {
		return personalMapper.insertSelective(record);
	}

	public List<Personal> selectByExample(PersonalExample example) throws Exception {
		return personalMapper.selectByExample(example);
	}

	public Personal selectByPrimaryKey(String codigopersonal) throws Exception {
		return personalMapper.selectByPrimaryKey(codigopersonal);
	}

	public int updateByExampleSelective(Personal record, PersonalExample example) throws Exception {
		return personalMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Personal record, PersonalExample example) throws Exception {
		return personalMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Personal record) throws Exception {
		return personalMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Personal record) throws Exception {
		return personalMapper.updateByPrimaryKey(record);
	}

}

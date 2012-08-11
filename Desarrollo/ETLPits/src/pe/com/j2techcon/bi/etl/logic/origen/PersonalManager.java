package pe.com.j2techcon.bi.etl.logic.origen;

import java.util.List;

import pe.com.j2techcon.bi.etl.dao.origen.PersonalMapper;
import pe.com.j2techcon.bi.etl.domain.origen.Personal;
import pe.com.j2techcon.bi.etl.domain.origen.PersonalExample;

public class PersonalManager {
	
	private PersonalMapper personalMapper;

	public PersonalMapper getPersonalMapper() {
		return personalMapper;
	}

	public void setPersonalMapper(PersonalMapper personalMapper) {
		this.personalMapper = personalMapper;
	}

	public int countByExample(PersonalExample example) {
		return personalMapper.countByExample(example);
	}

	public int deleteByExample(PersonalExample example) {
		return personalMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String codigopersonal) {
		return personalMapper.deleteByPrimaryKey(codigopersonal);
	}

	public int insert(Personal record) {
		return personalMapper.insert(record);
	}

	public int insertSelective(Personal record) {
		return personalMapper.insertSelective(record);
	}

	public List<Personal> selectByExample(PersonalExample example) {
		return personalMapper.selectByExample(example);
	}

	public Personal selectByPrimaryKey(String codigopersonal) {
		return personalMapper.selectByPrimaryKey(codigopersonal);
	}

	public int updateByExampleSelective(Personal record, PersonalExample example) {
		return personalMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Personal record, PersonalExample example) {
		return personalMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Personal record) {
		return personalMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Personal record) {
		return personalMapper.updateByPrimaryKey(record);
	}

}

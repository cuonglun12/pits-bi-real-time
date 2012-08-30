package pe.com.j2techcon.bi.etl.dao.origen;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.origen.Personal;
import pe.com.j2techcon.bi.etl.domain.origen.PersonalExample;

public interface PersonalMapper {
    int countByExample(PersonalExample example) throws Exception;

    int deleteByExample(PersonalExample example) throws Exception;

    int deleteByPrimaryKey(String codigopersonal) throws Exception;

    int insert(Personal record) throws Exception;

    int insertSelective(Personal record) throws Exception;

    List<Personal> selectByExample(PersonalExample example) throws Exception;

    Personal selectByPrimaryKey(String codigopersonal) throws Exception;

    int updateByExampleSelective(@Param("record") Personal record, @Param("example") PersonalExample example) throws Exception;

    int updateByExample(@Param("record") Personal record, @Param("example") PersonalExample example) throws Exception;

    int updateByPrimaryKeySelective(Personal record) throws Exception;

    int updateByPrimaryKey(Personal record) throws Exception;
}
package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeo;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeoExample;

public interface TUbigeoMapper {
    int countByExample(TUbigeoExample example) throws Exception;

    int deleteByExample(TUbigeoExample example) throws Exception;

    int deleteByPrimaryKey(Integer ubiId) throws Exception;

    int insert(TUbigeo record) throws Exception;

    int insertSelective(TUbigeo record) throws Exception;

    List<TUbigeo> selectByExample(TUbigeoExample example) throws Exception;

    TUbigeo selectByPrimaryKey(Integer ubiId) throws Exception;

    int updateByExampleSelective(@Param("record") TUbigeo record, @Param("example") TUbigeoExample example) throws Exception;

    int updateByExample(@Param("record") TUbigeo record, @Param("example") TUbigeoExample example) throws Exception;

    int updateByPrimaryKeySelective(TUbigeo record) throws Exception;

    int updateByPrimaryKey(TUbigeo record) throws Exception;
}
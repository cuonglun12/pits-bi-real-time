package pe.com.j2techcon.bi.etl.dao.generic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeo;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeoExample;

public interface TUbigeoMapper {
    int countByExample(TUbigeoExample example);

    int deleteByExample(TUbigeoExample example);

    int deleteByPrimaryKey(Integer ubiId);

    int insert(TUbigeo record);

    int insertSelective(TUbigeo record);

    List<TUbigeo> selectByExample(TUbigeoExample example);

    TUbigeo selectByPrimaryKey(Integer ubiId);

    int updateByExampleSelective(@Param("record") TUbigeo record, @Param("example") TUbigeoExample example);

    int updateByExample(@Param("record") TUbigeo record, @Param("example") TUbigeoExample example);

    int updateByPrimaryKeySelective(TUbigeo record);

    int updateByPrimaryKey(TUbigeo record);
}
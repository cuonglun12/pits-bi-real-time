package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimUbigeo;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimUbigeoExample;

public interface DimUbigeoMapper {
    int countByExample(DimUbigeoExample example);

    int deleteByExample(DimUbigeoExample example);

    int deleteByPrimaryKey(Integer ubigeoKey);

    int insert(DimUbigeo record);

    int insertSelective(DimUbigeo record);

    List<DimUbigeo> selectByExample(DimUbigeoExample example);

    DimUbigeo selectByPrimaryKey(Integer ubigeoKey);

    int updateByExampleSelective(@Param("record") DimUbigeo record, @Param("example") DimUbigeoExample example);

    int updateByExample(@Param("record") DimUbigeo record, @Param("example") DimUbigeoExample example);

    int updateByPrimaryKeySelective(DimUbigeo record);

    int updateByPrimaryKey(DimUbigeo record);
}
package pe.com.j2techcon.bi.etl.dao.dimensional;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimUbigeo;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimUbigeoExample;

public interface DimUbigeoMapper {
    int countByExample(DimUbigeoExample example) throws Exception;

    int deleteByExample(DimUbigeoExample example) throws Exception;

    int deleteByPrimaryKey(Integer ubigeoKey) throws Exception;

    int insert(DimUbigeo record) throws Exception;

    int insertSelective(DimUbigeo record) throws Exception;

    List<DimUbigeo> selectByExample(DimUbigeoExample example) throws Exception;

    DimUbigeo selectByPrimaryKey(Integer ubigeoKey) throws Exception;

    int updateByExampleSelective(@Param("record") DimUbigeo record, @Param("example") DimUbigeoExample example) throws Exception;

    int updateByExample(@Param("record") DimUbigeo record, @Param("example") DimUbigeoExample example) throws Exception;

    int updateByPrimaryKeySelective(DimUbigeo record) throws Exception;

    int updateByPrimaryKey(DimUbigeo record) throws Exception;
}
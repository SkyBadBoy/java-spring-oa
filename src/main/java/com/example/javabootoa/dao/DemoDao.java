package com.example.javabootoa.dao;

import com.example.javabootoa.domain.DemoDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoDao {

    /**
     * 查询所有
     * 这边不建议这么写，不是很方便
     * @return
     */
    @Select("select id,name from demo")
    List<DemoDO> selectAll();
}

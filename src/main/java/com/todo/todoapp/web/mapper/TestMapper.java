package com.todo.todoapp.web.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    public String getTime();
}

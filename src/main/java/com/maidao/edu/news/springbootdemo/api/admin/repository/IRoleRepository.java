package com.maidao.edu.news.springbootdemo.api.admin.repository;

import com.maidao.edu.news.springbootdemo.api.admin.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 创建人:chenpeng
 * 创建时间:2019-08-09 10:34
 * Version 1.8.0_211
 * 项目名称：news
 * 类名称:IRoleRepository
 * 类描述:实现与数据库的交互，持久层是介于业务逻辑层和数据库之间的，访问数据库并为业务处理提供或保存数据
 **/

public interface IRoleRepository extends JpaRepository<Role, Integer> {
}
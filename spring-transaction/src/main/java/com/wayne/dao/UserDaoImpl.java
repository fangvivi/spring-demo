package com.wayne.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author wayne
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where user=?";
        jdbcTemplate.update(sql, 100, "lucy");
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where user=?";
        jdbcTemplate.update(sql,100,"mary");
    }
}

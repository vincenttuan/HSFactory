package com.hs.factory.psi.repository;

import com.hs.factory.psi.entity.Suppliers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SuppliersDao {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    // 查詢全部
    public List<Suppliers> query() {
        String sql = "Select * From Suppliers order by id";
        List<Suppliers> supplierses = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Suppliers.class));
        return supplierses;
    }
    
}

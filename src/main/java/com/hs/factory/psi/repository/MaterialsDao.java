package com.hs.factory.psi.repository;

import com.hs.factory.psi.entity.Materials;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MaterialsDao {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    // 查詢全部
    public List<Materials> query() {
        String sql = "Select * From Materials order by id";
        List<Materials> materialses = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Materials.class));
        return materialses;
    }
    
}

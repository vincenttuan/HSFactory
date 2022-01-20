package com.hs.factory.psi.controller;

import com.hs.factory.psi.entity.Suppliers;
import com.hs.factory.psi.repository.SuppliersDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/suppliers")
public class SuppliersController {
    
    @Autowired
    private SuppliersDao suppliersDao;
    
    @RequestMapping("/query")
    @ResponseBody
    public String query(Model model) {
        List<Suppliers> supplierses = suppliersDao.query();
        return supplierses.toString(); 
    }
    
}

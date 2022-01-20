package com.hs.factory.psi.controller;

import com.hs.factory.psi.entity.Materials;
import com.hs.factory.psi.repository.MaterialsDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/materials")
public class MaterialsController {
    
    @Autowired
    private MaterialsDao materialsDao;
    
    @RequestMapping("/query")
    @ResponseBody
    public String query(Model model) {
        List<Materials> materialses = materialsDao.query();
        return materialses.toString(); 
    }
    
}

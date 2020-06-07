package org.nwpu405118group.cesiumweb.admin.controller;



import org.nwpu405118group.cesiumweb.service.entity.LandMark;
import org.nwpu405118group.cesiumweb.service.service.LandMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
@Autowired
    private LandMarkService landMarkService;

    @PostMapping("/addLandmark")
    public String addLandmark(LandMark landmark) {
        landMarkService.add(landmark);
        return "redirect:/admin/landmarks";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/main")
    public String mainPage() {
        return "admin_main";
    }

    @GetMapping("/landmarks")
    public String landmarks(Model model) {
        List<LandMark> landMarkList = landMarkService.findAll();
        model.addAttribute("landmarks", landMarkList);

        return "admin_landmarks";
    }

    @GetMapping("/deleteLandmark")
    public String deleteLandmark(String id) {
        landMarkService.deleteById(id);
        return "redirect:/admin/landmarks";
    }

}

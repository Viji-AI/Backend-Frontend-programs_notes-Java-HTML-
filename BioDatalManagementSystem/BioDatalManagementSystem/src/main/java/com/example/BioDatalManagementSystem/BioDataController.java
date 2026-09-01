package com.example.BioDatalManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biodata")
public class BioDataController {

    @Autowired
    private BioDataService bioDataService;

    @GetMapping
    public List<BioData> getAllBioDatas() {
        return bioDataService.getBioData();
    }

    @GetMapping("/{id}")
    public BioData getBioDataById(@PathVariable int id) {
        return bioDataService.getBioDataById(id);
    }

    @PostMapping
    public String addBioData(@RequestBody BioData bioData) {
        bioDataService.addBioData(bioData);
        return "Bio Data added";
    }

    @PutMapping
    public String updateBioData(@RequestBody BioData bioData) {
        return bioDataService.updateBioData(bioData);
    }

    @DeleteMapping("/{id}")
    public String deleteBioData(@PathVariable int id) {
        return bioDataService.deleteBioData(id);
    }
}
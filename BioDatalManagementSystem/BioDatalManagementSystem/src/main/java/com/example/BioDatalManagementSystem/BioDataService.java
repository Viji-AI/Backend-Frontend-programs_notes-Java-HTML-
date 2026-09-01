package com.example.BioDatalManagementSystem;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BioDataService {

    private List<BioData> bioData = new ArrayList<>();

    public BioDataService() {
        bioData.add(new BioData(1, "Ravi", "Male", 25));
        bioData.add(new BioData(2, "Sita", "Female", 30));
    }

    public List<BioData> getBioData() {
        return bioData;
    }

    public BioData getBioDataById(int id) {

        for (BioData b : bioData) {
            if (b.getPersonId() == id) {
                return b;
            }
        }

        return null;
    }

    public void addBioData(BioData bioData) {
        this.bioData.add(bioData);
    }

    public String updateBioData(BioData bioData) {

        for (int i = 0; i < this.bioData.size(); i++) {

            if (this.bioData.get(i).getPersonId() == bioData.getPersonId()) {

                this.bioData.set(i, bioData);

                return "Bio Data Updated";
            }
        }

        return "Bio Data Not Found";
    }

    public String deleteBioData(int id) {

        for (int i = 0; i < this.bioData.size(); i++) {

            if (this.bioData.get(i).getPersonId() == id) {

                this.bioData.remove(i);

                return "Bio Data Deleted";
            }
        }

        return "Bio Data Not Found";
    }
}
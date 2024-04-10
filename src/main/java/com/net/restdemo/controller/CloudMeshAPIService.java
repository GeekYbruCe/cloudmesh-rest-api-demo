package com.net.restdemo.controller;

import com.net.restdemo.model.CloudMesh;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudmesh")
public class CloudMeshAPIService {

    CloudMesh cloudMesh;
    @GetMapping("{vendorId}")
    public CloudMesh getCloudMeshDetails(String vendorId) {
        return cloudMesh;
//        new CloudMesh("V01",
//                "Manalapan",
//                "+16023232341",
//                "FirstVendor");

    }
    @PostMapping
     public String createCloudMeshDetails(@RequestBody CloudMesh cloudMesh) {
        this.cloudMesh = cloudMesh;
        return "CloudMesh vendor created successfully";
    }
    @PutMapping
    public String updateCloudMeshDetails(@RequestBody CloudMesh cloudMesh){
        this.cloudMesh = cloudMesh;
        return "CloudMesh vendor updated successfully";


     }
    @DeleteMapping("{vendorId}")
    public String deleteCloudMeshDetails(String vendorId) {
        this.cloudMesh = null;
        return "CloudMesh vendor deleted successfully";
    }
}

package com.emsi.parcel.parcel.controllers;

import com.emsi.parcel.parcel.entities.Parcel;
import com.emsi.parcel.parcel.services.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/parcels")
@CrossOrigin(origins = "http://localhost:5173")
public class ParcelController {
    private final ParcelService parcelService;

    @Autowired
    public ParcelController(ParcelService parcelService){
        this.parcelService=parcelService;
    }
    @PostMapping("/save")
    public Parcel saveParcel(@RequestBody Parcel parcel) {
        return parcelService.saveParcel(parcel);
    }
    @GetMapping
    public List<Parcel> getAllParcels() {
        return parcelService.getAllParcels();
    }
    @GetMapping("findByTrackingNumber/{trackingNumber}")
    public Parcel findByTrackingNumber(@PathVariable String trackingNumber) {
        return parcelService.findByTrackingNumber(trackingNumber);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        parcelService.deleteById(id);
    }

    @PutMapping("/{id}/updateStatus")
    public ResponseEntity<String> updateStatus(@PathVariable Long id, @RequestBody Map<String, String> statusMap) {
        String newStatus = statusMap.get("status");
        // Perform logic to update the status in your service
        parcelService.updateStatus(id, newStatus);
        return ResponseEntity.ok("Status updated successfully");
    }
}

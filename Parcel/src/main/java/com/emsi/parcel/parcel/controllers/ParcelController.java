package com.emsi.parcel.parcel.controllers;

import com.emsi.parcel.parcel.entities.Parcel;
import com.emsi.parcel.parcel.services.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}

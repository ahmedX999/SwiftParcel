package com.emsi.parcel.parcel.controllers;

import com.emsi.parcel.parcel.entities.Location;
import com.emsi.parcel.parcel.entities.Parcel;
import com.emsi.parcel.parcel.services.LocationService;
import com.emsi.parcel.parcel.services.ParcelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/locations")
@CrossOrigin(origins = "http://localhost:5173")
public class LocationController {

    private final LocationService locationService;
    private final ParcelService parcelService;
    @PostMapping
    public Location saveLocation(@RequestBody Location location) {

        return locationService.saveLocation(location);
    }
    @GetMapping("/parcel")
    public List<Location> getLocationHistory(Parcel parcel) {
        return locationService.getLocationHistory(parcel);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        locationService.deleteById(id);
    }
    @GetMapping
    public List<Location> getAllLocationHistory() {
        return locationService.getAllLocationHistory();
    }
}

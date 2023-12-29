package com.emsi.parcel.parcel.services;

import com.emsi.parcel.parcel.entities.Location;
import com.emsi.parcel.parcel.entities.Parcel;
import com.emsi.parcel.parcel.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    private final LocationRepository locationRepository;

    @Autowired
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    public List<Location> getLocationHistory(Parcel parcel) {
        return locationRepository.findByParcelOrderByTimestampDesc(parcel);
    }
}

package com.emsi.parcel.parcel.services;

import com.emsi.parcel.parcel.entities.Parcel;
import com.emsi.parcel.parcel.repositories.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ParcelService {
    @Autowired
    ParcelRepository parcelRepository;


    public Parcel saveParcel(Parcel parcel) {
        return parcelRepository.save(parcel);
    }

    public List<Parcel> getAllParcels() {
        return parcelRepository.findAll();
    }

    public Parcel findByTrackingNumber(String trackingNumber) {
        return parcelRepository.findByTrackingNumber(trackingNumber);
    }

    public void deleteById(Long aLong) {
        parcelRepository.deleteById(aLong);
    }

    public Optional<Parcel> getParcelById(Long aLong) {
        return parcelRepository.findById(aLong);
    }

    @Transactional
    public void updateStatus(Long parcelId, String newStatus) {
        Optional<Parcel> optionalParcel = parcelRepository.findById(parcelId);

        if (optionalParcel.isPresent()) {
            Parcel parcel = optionalParcel.get();
            parcel.setStatus(newStatus);
            parcelRepository.save(parcel);
        } else {
            return;
        }
    }


}

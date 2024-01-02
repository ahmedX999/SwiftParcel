package com.emsi.Parcel.Notification.Service.services;

import com.emsi.Parcel.Notification.Service.beans.Parcel;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.stereotype.Repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "PARCEL-SERVICE")
public interface ParcelServiceClient {

    @GetMapping("/api/parcels")
    List<Parcel> getAllParcels();

    @GetMapping("/api/parcels/{parcelId}")
    Optional<Parcel> getParcelById(@PathVariable Long parcelId);
}

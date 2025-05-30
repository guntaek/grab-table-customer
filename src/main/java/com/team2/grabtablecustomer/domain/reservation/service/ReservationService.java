package com.team2.grabtablecustomer.domain.reservation.service;

import com.team2.grabtablecustomer.domain.reservation.dto.ReservationSlotResponseDto;

import java.util.Date;
import java.time.LocalDate;
import java.util.List;

public interface ReservationService {

    List<ReservationSlotResponseDto> getAvailableSlotsByGrade(Long storeId, String grade, String visitDate);
}

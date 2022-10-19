package com.fuelmanagement.Dto;

import com.fuelmanagement.domain.FuelType;
import com.fuelmanagement.domain.RequisitionStatus;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
@Builder
public class FuelRequisitionDto {
        private Long id;
        private Long amount;
        private String description;
        private String reasonForRequest;
        private String requestedBy;
        private String approvedBy;
        private String authorisedBy;
        private LocalDateTime dateCreated;
        private LocalDateTime dateApproved;
        private LocalDateTime dateAuthorized;
       private FuelType fuelType;
       private RequisitionStatus requisitionStatus;

}

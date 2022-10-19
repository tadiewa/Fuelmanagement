package com.fuelmanagement.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "fuelrequisition")
public class FuelRequisition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long requisitionId;
    private Long amount;
    private String description;
    private String reasonForRequest;
    private String requestedBy;
    private String approvedBy;
    private String authorisedBy;
    private LocalDateTime dateCreated;
    private LocalDateTime dateApproved;
    private LocalDateTime dateAuthorized;
    private String field4;
    private String field5;
    private String field6;
    private String field7;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name ="fuel_Id",
            referencedColumnName = "fuelId"
    )
    private FuelType fuelType;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name ="requisitionStatus_Id",
            referencedColumnName = "requisitionStatusId"
    )
    private RequisitionStatus requisitionStatus;
}

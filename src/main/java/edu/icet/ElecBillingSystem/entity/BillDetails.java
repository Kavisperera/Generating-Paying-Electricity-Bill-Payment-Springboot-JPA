package edu.icet.ElecBillingSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "bill_details")
public class BillDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String serviceRequestNo;

    @Column
    private String billNo;

    @Column
    private LocalDate billCreationDate;

    @Column
    private LocalDate billDueDate;

    @Column
    private double billAmount;

    @Column
    private double billAmountAfterDueDate;

    @Column
    private LocalDate paymentDate;

    @Column
    private String  billpayment;

    @Column
    private String  paymentDone;
}

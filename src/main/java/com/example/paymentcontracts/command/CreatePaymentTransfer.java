package com.example.paymentcontracts.command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Value
public class CreatePaymentTransfer {
    @TargetAggregateIdentifier
    private String paymentId;
    private String fromAccountId;
    private String toAccountId;
    private BigDecimal amount;
    /*
    private String payMethodId;
    private String appointmentId;

     */
}

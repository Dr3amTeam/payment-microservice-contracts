package com.example.paymentcontracts.command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Value
public class CreatePaymentTransfer {
    @TargetAggregateIdentifier
    private String paymentId;
    private String customerId;
    private String employerId;
    private BigDecimal amount;
}

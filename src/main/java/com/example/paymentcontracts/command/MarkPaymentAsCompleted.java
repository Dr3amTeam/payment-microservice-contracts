package com.example.paymentcontracts.command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class MarkPaymentAsCompleted {
    @TargetAggregateIdentifier
    private String paymentId;
}

package org.example.ex3.builder;

import java.math.BigDecimal;

public class Order {

    private final String id;
    private final String customerName;
    private final BigDecimal amount;
    private final String currency;
    private final String comment;
    private final boolean paid;

    private Order(Builder builder) {
        this.id = builder.id;
        this.customerName = builder.customerName;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.comment = builder.comment;
        this.paid = builder.paid;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getComment() {
        return comment;
    }

    public boolean isPaid() {
        return paid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", comment='" + comment + '\'' +
                ", paid=" + paid +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String customerName;
        private BigDecimal amount;
        private String currency;
        private String comment;
        private boolean paid;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder paid(boolean paid) {
            this.paid = paid;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
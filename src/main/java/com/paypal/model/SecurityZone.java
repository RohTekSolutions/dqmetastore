package com.paypal.model;

public enum  SecurityZone {



        HRZ("High Risk Zone"), PAZ("Paypal Analytics Zone"), OTHER("others");

        private String name;

    SecurityZone(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }


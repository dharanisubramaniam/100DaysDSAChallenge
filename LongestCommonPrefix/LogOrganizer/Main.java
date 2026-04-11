package com.company;

public class Main {

    public static void main(String[] args) {
        // Real-world scenario: Logs from the "Payment" microservice
        String[] paymentLogs = {
                "PAYMENT_SERVICE_SUCCESS_1001.log",
                "PAYMENT_SERVICE_FAILURE_1002.log",
                "PAYMENT_SERVICE_PENDING_1003.log",
                "PAYMENT_SERVICE_RETRY_1004.log"
        };

        String serviceName = identifyServicePrefix(paymentLogs);

        System.out.println("Identified Source Service: [" + serviceName + "]");
        System.out.println(" Action: Creating directory '/logs/" + serviceName.toLowerCase() + "'");

        for (String log : paymentLogs) {
            System.out.println("Moving " + log + " to " + serviceName + " bucket...");
        }
    }
    public static String identifyServicePrefix(String[] fileNames) {
        if (fileNames == null || fileNames.length == 0) return "UNKNOWN";

        for (int i = 0; i < fileNames[0].length(); i++) {
            char c = fileNames[0].charAt(i);
            for (int j = 1; j < fileNames.length; j++) {
                // If we hit a mismatch or the end of a string, we found our prefix
                if (i == fileNames[j].length() || fileNames[j].charAt(i) != c) {
                    return fileNames[0].substring(0, i);
                }
            }
        }
        return fileNames[0];
    }
}

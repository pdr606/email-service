package com.pdr606.emailservice.core;

public record EmailRequest(String to, String subject, String body) {
}

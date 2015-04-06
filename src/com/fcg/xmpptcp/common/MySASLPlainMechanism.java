package com.fcg.xmpptcp.common;

import org.jivesoftware.smack.sasl.SASLPlainMechanism;
import org.jivesoftware.smack.SASLAuthentication;


public class MySASLPlainMechanism extends SASLPlainMechanism {

    public MySASLPlainMechanism(SASLAuthentication saslAuthentication) {
        super(saslAuthentication);
    }

    protected String getAuthenticationText(String username, String host, String password) {
        if ("10.30.25.128".equalsIgnoreCase(host)) {
            host = "10.30.25.128";
        }
        return super.getAuthenticationText(username, host, password);
    }
}

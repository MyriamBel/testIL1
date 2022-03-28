package com.company;

public class CodeToIp {
    String ipAddress;

    public void CodeToIp(Long code) {
        StringBuilder sb = new StringBuilder(15);
        for (int i = 0; i <= 3; i++) {
            sb.insert(0, Long.toString(code & 0xff));
            if (i < 3) {
                sb.insert(0, '.');
            }
            code = code >> 8;
        }
        this.setIpAddress(String.valueOf(sb));
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}

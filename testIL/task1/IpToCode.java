package com.company;

public class IpToCode {
    Long integer;

    public void IpToCode(String ip){
//    разбить адрес на блоки по разделителю
        String[] list_digits = ip.split("\\.");
//        накопитель
        long result = 0;
        for (int i = 3; i >= 0; i--) {
            long value = Long.parseLong(list_digits[3 - i]);
            result |= value << (i * 8);
        }
        this.setInteger(result);
    }

    public Long getInteger() {
        return integer;
    }

    public void setInteger(Long integer) {
        this.integer = integer;
    }
}

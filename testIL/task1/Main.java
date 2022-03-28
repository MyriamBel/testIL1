package com.company;


//Задание 1 "IP-адреса"
//	IpV4 адрес состоит из 4 октетов, значит его можно хранить в переменной типа int32.
//	Реализуйте пару функций, которые однозначно преобразуют строковое представление IpV4 адрес
//	(вида "127.0.0.1") в значение типа int32 и наоборот.
//	Примеры:
//	2149583360 ==> "128.32.10.0"
//	255        ==> "0.0.0.255"


//    Каждый октет IP-адреса заключает в себе 256 комбинаций предыдущего октета.
//    Так, третий октет содержит в себе 256 комбинаций четвёртого октета, а второй -
//    256 комбинаций третьего, каждый из которого содержит в себе, в свою очередь, еще по 256 комбинаций
//    четвёртого октета. В четвёртом же октете комбинация содержится только одна - та, которую мы там и видим.
//    Таким образом, четвёртый октет содержит 1 комбинацию, или 256^0,
//    третий октет содержит 256(или 256^1) комбинаций,
//    второй - 256*256(256^2), а первый - 256*246*256(256^3) комбинаций адресов.
//    Формула перевода IP в число - Х = У*256^3+Y*256^2+Y*256*1+Y*256^0.
//    Код можно доработать - добавить проверку, чтобы приходила строка определенного формата и
//    содержала только цифры.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    String ipAddress = console.nextLine();

    IpToCode ipToCode = new IpToCode();
    ipToCode.IpToCode(ipAddress);
    System.out.println(ipToCode.getInteger());

    CodeToIp codeToIp = new CodeToIp();
    codeToIp.CodeToIp(ipToCode.getInteger());
    System.out.println(codeToIp.getIpAddress());
    }
}
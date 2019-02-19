package de.re.easymodbus.client.Archiv;

import de.re.easymodbus.datatypes.RegisterOrder;
import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.DateTime;
import de.re.easymodbus.modbusclient.ModbusClient;
import jssc.SerialPortException;
import jssc.SerialPortTimeoutException;

import java.io.IOException;

public class Testy {

    public static void main(String[] args) throws IOException, SerialPortTimeoutException, SerialPortException, ModbusException {
        ModbusClient modbusClient = new ModbusClient();
        modbusClient.Connect("172.28.192.32", 502);
      //  modbusClient.Connect("127.0.0.1", 502);

//        for (int i=1; i<=500; i++){
//            float inputReg10 = modbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(1,2), RegisterOrder.HighLow);
//            System.out.println("Zwrocono Wartość= " + inputReg10);
//
//        }
//        for (int i = 1; i <= 519; i = i + 2) {
//            float inputReg10 = modbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(i, 2), RegisterOrder.HighLow);
//            String getdateTime = DateTime.getDateTimeStringMilliseconds();
//            System.out.println(getdateTime + "   Zwrocono Wartość dla Offset=" + i + " => " + inputReg10);
//        }
        for (int i = 801; i <= 801; i = i + 4) {
            double inputReg10 = modbusClient.ConvertRegistersToDouble(modbusClient.ReadHoldingRegisters(i, 4), RegisterOrder.HighLow);
            String getdateTime = DateTime.getDateTimeStringMilliseconds();
            System.out.println(getdateTime + "   Zwrocono Wartość dla Offset=" + i + " => " + inputReg10/1000+"kWh");
        }

//        float inputReg = modbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(1,2), RegisterOrder.HighLow);
//        float inputReg1 = modbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(3,2), RegisterOrder.HighLow);
//        float inputReg2 = modbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(5,2), RegisterOrder.HighLow);
//        float inputReg3 = modbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(7,2), RegisterOrder.HighLow);
//        float inputReg4 = modbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(9,2), RegisterOrder.HighLow);
//        float inputReg5 = modbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(11,2), RegisterOrder.HighLow);
//        float inputReg6 = modbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(13,2), RegisterOrder.HighLow);
//        float inputReg7 = modbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(15,2), RegisterOrder.HighLow);
//        float inputReg8 = modbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(187,2), RegisterOrder.HighLow);
//        float inputReg9 = modbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(129,2), RegisterOrder.HighLow);
//
//        System.out.println("Zwrocono Wartość Napiecie Va-n: " + inputReg);
//        System.out.println("Zwrocono Wartość: " + inputReg1);
//        System.out.println("Zwrocono Wartość: " + inputReg2);
//        System.out.println("Zwrocono Wartość: " + inputReg3);
//        System.out.println("Zwrocono Wartość: " + inputReg4);
//        System.out.println("Zwrocono Wartość: " + inputReg5);
//        System.out.println("Zwrocono Wartość: " + inputReg6);
//        System.out.println("Zwrocono Wartość: " + inputReg7);
//        System.out.println("Zwrocono Wartość Fmin: " + inputReg8);
//        System.out.println("Zwrocono Wartość Fmax: " + inputReg9);

//        int[] inputRegisters = modbusClient.ReadHoldingRegisters(0, 10);
//        for (int i = 0; i < inputRegisters.length; i++) {
//            System.out.println("Zwrocono wartosc int dla i=#" + i + "    Wartość: " + inputRegisters[i]);

    }

}


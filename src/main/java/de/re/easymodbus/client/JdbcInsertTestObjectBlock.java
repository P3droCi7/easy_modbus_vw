package de.re.easymodbus.client;

import de.re.easymodbus.datatypes.RegisterOrder;
import de.re.easymodbus.modbusclient.ModbusClient;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;


public class JdbcInsertTestObjectBlock {

    public static void main(String[] args){

        Timer timer = new Timer();
        timer.schedule(new Hello(), 0, 30000);
//        ModbusClient modbusClient = new ModbusClient();
//        modbusClient.Connect("172.28.192.32", 502);
//
//        double inputReg10 = modbusClient.ConvertRegistersToDouble(modbusClient.ReadHoldingRegisters(801, 4), RegisterOrder.HighLow);
//
//
//        Timestamp timeStamp = new Timestamp(Calendar.getInstance().getTime().getTime());
//        JdbcInsertDateAndActiveEnergy.jdbcInsert(timeStamp, inputReg10);
    }

}





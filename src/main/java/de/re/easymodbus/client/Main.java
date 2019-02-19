package de.re.easymodbus.client;

import de.re.easymodbus.datatypes.RegisterOrder;
import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.ModbusClient;
import jssc.SerialPortException;
import jssc.SerialPortTimeoutException;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;

public class Main {
  public static void main(String[] args) throws Exception {
    ModbusClient modbusClient = new ModbusClient();
  //  modbusClient.Connect("172.28.192.32", 502);
    modbusClient.Connect("127.0.0.1", 502);

    //double PacActiveEnergyValue = modbusClient.ConvertRegistersToDouble(modbusClient.ReadHoldingRegisters(801, 4), RegisterOrder.HighLow);
    int[] PacActiveEnergyValue = modbusClient.ReadHoldingRegisters(0, 1);
    double PacAEV = PacActiveEnergyValue[0];
    Timestamp timeStamp = new Timestamp(Calendar.getInstance().getTime().getTime());
    JdbcInsertDateAndActiveEnergy.jdbcInsert(timeStamp, PacAEV);
    //execute insert jdbc method on created pac object
  }
}


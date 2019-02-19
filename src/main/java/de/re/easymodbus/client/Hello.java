package de.re.easymodbus.client;

import de.re.easymodbus.datatypes.RegisterOrder;
import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.ModbusClient;
import jssc.SerialPortException;
import jssc.SerialPortTimeoutException;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.TimerTask;

class Hello extends TimerTask {
    public void run(){


        try {
            ModbusClient modbusClient = new ModbusClient();
            modbusClient.Connect("172.28.192.32", 502);
            double inputReg10 = modbusClient.ConvertRegistersToDouble(modbusClient.ReadHoldingRegisters(801, 4), RegisterOrder.HighLow);
            Timestamp timeStamp = new Timestamp(Calendar.getInstance().getTime().getTime());
            JdbcInsertDateAndActiveEnergy.jdbcInsert(timeStamp, inputReg10);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SerialPortException e) {
            e.printStackTrace();
        } catch (ModbusException e) {
            e.printStackTrace();
        } catch (SerialPortTimeoutException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
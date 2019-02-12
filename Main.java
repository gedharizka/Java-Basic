package com.gedharizka.javafundamental;

import com.gedharizka.javafundamental.Percabangan.controlFlowElseIf;
import com.gedharizka.javafundamental.Percabangan.controlFlowSwitch;
import com.gedharizka.javafundamental.Basic.kendaraan.Kereta;
import com.gedharizka.javafundamental.Basic.kendaraan.Mobil;
import com.gedharizka.javafundamental.Basic.kendaraan.Motor;
import com.gedharizka.javafundamental.Basic.music.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Gitar.bunyi();
        Motor.jumlahBan();
        Mobil.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("hari ini =" +today);

        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("besok = "+tomorrow);
        System.out.println();
        System.out.println("===========================");
        System.out.println();
        controlFlowElseIf.percabanganElseIf();
        controlFlowSwitch.percabanganSwitch();
        controlFlowSwitch.cobaSwitch();
    }
}

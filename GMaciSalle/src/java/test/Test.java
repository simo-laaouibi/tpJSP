/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Machine;
import entities.Salle;
import services.MachineService;
import services.SalleService;

/**
 *
 * @author oussama
 */
public class Test {
    public static void main(String[] args) {
        MachineService ms =new MachineService();
        SalleService ss = new SalleService();
        ss.create(new Salle("code1"));
        ms.create(new Machine("machine1", "machine1", 1000, ss.findById(1)));
    }
}

package edu.unl.cc.jbeginners.home.view;

import edu.unl.cc.jbeginners.home.domain.Status;
import edu.unl.cc.jbeginners.home.domain.ElectronicLock;

import java.util.Scanner;


public class ElectronicLockExecute {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ElectronicLock lock = new ElectronicLock("5678",Status.CLOSED);
        lock.setStatus(Status.CLOSED);
        open(scanner,lock);
    }
    public static void open(Scanner scanner, ElectronicLock lock) {
        int attemps = 0;
        while ((attemps < 3 && lock.getStatus()!= Status.OPEN)) {
            System.out.println("Ingrese la clave");
            String key = scanner.next();
            lock.open(key);
            attemps++;
        }
        if(lock.getStatus()== Status.OPEN) {
            System.out.println("Clave Aceptada, cerradura abierta");
        }else {
            System.out.println("Clave no aceptada");
            if(attemps==3) {
                lock.setStatus(Status.CLOSED);
                System.out.println("CLAVE BLOQUEADO");
            }
        }
        String key = scanner.next();
    }
}

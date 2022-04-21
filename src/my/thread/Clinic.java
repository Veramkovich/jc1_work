package my.thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Clinic {

    private Map<String, Card> registry;
    private Doctor doctor;

    public Clinic() {
        registry = new HashMap<>();
        doctor = new Doctor();
        doctor.setFree(true);
    }

    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        Collection<Patient> patients = new ArrayList<>(10);
        for (int i = 1; i <= 10; i++) {
            Patient patient = new Patient(clinic, "Patient " + i);
            patients.add(patient);
            new Thread(patient, patient.getFio()).start();
        }
    }

    public Card takeCard(String fio) {
        return registry.getOrDefault(fio, new Card(fio));
    }

    public Spravka visitDoctor(Card card) {
        Spravka spravka = null;
        try {
            enter();
            System.out.println("Patient card: " + card);
            spravka = new Spravka();
            exit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return spravka;
    }

    private void enter() throws InterruptedException {
        synchronized (doctor) {
            while (!doctor.isFree()) {
                doctor.wait();
            }
            doctor.setFree(false);

            System.out.println("Enter patient: " + Thread.currentThread().getName());
            Thread.sleep(2000);

        }
    }

    private void exit() throws InterruptedException {
        synchronized (doctor) {
            Thread.sleep(1000);
            System.out.println("Exit patient: " + Thread.currentThread().getName());
            doctor.setFree(true);
            doctor.notifyAll();
        }
    }

    public void putStamp(Spravka spravka) {
        spravka.setStampted(true);
    }
}

class Patient implements Runnable {

    Spravka spravka;
    private Clinic clinic;
    private String fio;

    public Patient(Clinic clinic, String fio) {
        this.clinic = clinic;
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public Spravka getSpravka() {
        return spravka;
    }

    @Override
    public void run() {
        Card card = clinic.takeCard(fio);
        spravka = clinic.visitDoctor(card);
        clinic.putStamp(spravka);
        System.out.println(fio + " has spravka " + spravka);
    }

}

class Card {
    private String fio;

    public Card(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Card{" +
                "fio='" + fio + '\'' +
                '}';
    }
}

class Spravka {
    private boolean isStampted = false;

    public boolean isStampted() {
        return isStampted;
    }

    public void setStampted(boolean stampted) {
        isStampted = stampted;
    }

    @Override
    public String toString() {
        return "Spravka{" +
                "isStampted=" + isStampted +
                '}';
    }
}

class Doctor {
    private boolean free;

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
package dita.program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AntrianBank {
    
    private static final String[] queue = new String [10] ;
    private static int counters = 0 ;
    
    private static boolean penyimpananData() {
        return counters < queue.length;
    }
    
    private static void Antrian() {
        int data = 0;
        String alpha = "";
        while(data == 0) {
            System.out.print("Masukan Data Antrian : ");
            Scanner huruf = new Scanner(System.in);
            alpha = huruf.next();
            data = 1 ;
            
        }
    queue[counters] = alpha;
    counters++;
    }
    private static void hapusData() {
        counters--;
        for(int i = 0; i < counters; i++) {
            
        }
        System.out.println("Data Awal Yang Telah Di Keluarkan");
        
    }
    private static void removelast () {
        String aList = null;
        System.out.print("Masukan Urutan Data Yang Akan Di Hapus /t:"+aList);
        
        Scanner alist;
        alist = new Scanner(System.in);
         {
            menuProgram();
        }
    }
    
    private static void tampilkanData() {
        System.out.print("Data Dalam Antrian");
        for(int i = 0; i < counters; i++){
            System.out.println(" ["+i+" => "+queue[i]+"]");
        }
        System.out.println("");
    }
    
    private static void bersihkanData() {
        counters = 0;
    }
    
    private static void keluar() {
        String quitss = "y";
        System.out.print("Ingin Keluar Dari Program? (Y/T) : ");
        quitss = new Scanner(System.in).nextLine();
        if(quitss.equalsIgnoreCase("y")) {
            System.exit(0);
        }
        else {
            menuProgram();
        }
    }
    
    private static void menuPilihan(int pilihanMenu) {
        switch(pilihanMenu) {
            case 1 :
                boolean check = penyimpananData();
                if(check) {
                    Antrian();
                }
                check = penyimpananData();
                if(check) {
                    Antrian();
                }
                check = penyimpananData();
                if(check) {
                    Antrian();
                }
                check = penyimpananData();
                if(check) {
                    Antrian();
                }
                check = penyimpananData();
                if(check) {
                    Antrian();
                }
                check = penyimpananData();
                if(check) {
                    Antrian();
                }
                check = penyimpananData();
                if(check) {
                    Antrian();
                }
                check = penyimpananData();
                if(check) {
                    Antrian();
                }
                check = penyimpananData();
                if(check) {
                    Antrian();
                }
                check = penyimpananData();
                if(check) {
                    Antrian();
                }
                
                else {
                    System.out.print("Antrian Penuh!! Kosongkan Terlebih Dahulu!!");
                }
                break;
            case 2 :
                hapusData();
                break;
            case 3 :
                removelast ();
                break;
            case 4 :
                bersihkanData();
                break;
            case 5 :
                tampilkanData();
                break;
            case 6 :
                keluar();
                break;
        }
        menuProgram();
    }
    
    private static void menuProgram() {
        int data = 0;
        int pilihanMenu = 0;
        while(data == 0) {
        System.out.println("========Menu Antrian========");
        System.out.println("1. Tambah Data Antrian");
        System.out.println("2. Hapus Antrian Elemen Pertama");
        System.out.println("3. Hapus Antrian di Posisi Tertentu");
        System.out.println("4. Hapus Semua Elemen");
        System.out.println("5. Tampilkan Data");
        System.out.println("6. Keluar");
        System.out.print("Masukkan Nomor Menu (1 - 6) : ");
        Scanner menuOption = new Scanner(System.in);
        try {
            pilihanMenu = menuOption.nextInt();
            data = 1;
        }catch(InputMismatchException e) {
            System.out.println("Masukkan Data Antian");
        }
    }
    System.out.println("");
    menuPilihan(pilihanMenu);
    }
    
    public static void main(String[] args) {
        menuProgram(); 
               
    }
    
}
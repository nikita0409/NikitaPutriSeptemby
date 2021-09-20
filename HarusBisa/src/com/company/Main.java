package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Mahasiswa> m = new ArrayList<Mahasiswa>();
        List<Matkul> ma = new ArrayList<Matkul>();
        List<Nilai> n = new ArrayList<Nilai>();
        Scanner s = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int x = 0;
        do{
            System.out.println("1. TAMBAH DATA MHS");
            System.out.println("2. TAMPILKAN DATA DAN JUMLAH MAHASISWA");
            System.out.println("3. CARI DATA MAHASISWA");
            System.out.println("4. HAPUS DATA MAHASISWA");
            System.out.println("5. UBAH DATA MAHASISWA");
            System.out.println("6. INPUT DATA MATA KULIAH");
            System.out.println("7. TAMPILKAN DATA MATA KULIAH");
            System.out.println("8. CARI MAHASISWA DAN DATA MATA KULIAH");
            System.out.println("9. INPUT NILAI DAN IPK MAHASISWA");
            System.out.println("10. CARI DATA MAHASISWA DAN IPK NYA");
            System.out.println("MASUKKAN PILIHAN ANDA>>");
            x = s.nextInt();

            switch(x){
                case 1:
                    System.out.print("Masukkan nim :");
                    int mnim = s.nextInt();
                    System.out.print("Masukkan nama :");
                    String mnama = scan.nextLine();
                    System.out.println("DATA BERHASIL DITAMBAHKAN");
                    m.add(new Mahasiswa(mnim,mnama));
                    break;
                case 2:
                    int jml = 0;
                    System.out.println("--------------------------");
                    Iterator<Mahasiswa> i = m.iterator();
                        while(i.hasNext()){
                            Mahasiswa mahasiswa = i.next();
                            System.out.println(mahasiswa);
                            jml++;
                        }
                    System.out.println("JUMLAH MAHASISWA TERDAFTAR :"+jml);
                    System.out.println("--------------------------");
                    break;
                case 3:
                    boolean cari = false;
                    System.out.println("Masukkan nim yang akan dicari :");
                    mnim = s.nextInt();
                    System.out.println("--------------------------");
                    i = m.iterator();
                    while(i.hasNext()){
                        Mahasiswa mahasiswa = i.next();
                        if(mahasiswa.getNim() == mnim) {
                            System.out.println(mahasiswa);
                            cari = true;
                        }
                    }
                    System.out.println("--------------------------");
                    if(!cari){
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case 4:
                    cari = false;
                    System.out.println("Masukkan nim yang akan dihapus:");
                    mnim = s.nextInt();
                    System.out.println("--------------------------");
                    i = m.iterator();
                    while(i.hasNext()){
                        Mahasiswa mahasiswa = i.next();
                        if(mahasiswa.getNim() == mnim) {
                            System.out.println(mahasiswa);
                            i.remove();
                            cari = true;
                        }
                    }
                    System.out.println("--------------------------");
                    if(!cari){
                        System.out.println("Data tidak ditemukan");
                    }else{
                        System.out.println("Data Berhasil Dihapus");
                    }
                    break;
                case 5:
                    cari = false;
                    System.out.println("Masukkan nim yang akan diubah:");
                    mnim = s.nextInt();
                    System.out.println("--------------------------");
                    ListIterator<Mahasiswa> lim = m.listIterator();
                    while(lim.hasNext()){
                        Mahasiswa mahasiswa = lim.next();
                        if(mahasiswa.getNim() == mnim) {
                            System.out.println(mahasiswa);
                            System.out.println("Masukkan nama baru : ");
                            mnama = scan.nextLine();
                            lim.set(new Mahasiswa(mnim,mnama));
                            cari = true;
                        }
                    }
                    System.out.println("--------------------------");
                    if(!cari){
                        System.out.println("Data tidak ditemukan");
                    }else{
                        System.out.println("Data Berhasil Diubah");
                    }
                    break;
                case 6:
                    System.out.println("DAFTAR MATA KULIAH : ");
                    System.out.println("1. Logika dan Algoritma");
                    System.out.println("2. Kalkulus");
                    System.out.println("3. Komputer Grafis");
                    System.out.println("4. Visual Basic");
                    System.out.println("5. Web");
                    cari = false;
                    System.out.println("Masukkan nim:");
                    mnim = s.nextInt();
                    System.out.println("--------------------------");
                    lim = m.listIterator();
                    while(lim.hasNext()){
                        Mahasiswa mahasiswa = lim.next();
                        if(mahasiswa.getNim() == mnim) {
                            System.out.println(mahasiswa);
                            System.out.println("Masukkan nilai nilai : ");
                            System.out.println("--------------------------");
                            System.out.println("Masukkan nim :");
                            System.out.println("--------------------------");
                            mnim = s.nextInt();
                            System.out.println("Masukkan nama mata kuliah-1 : ");
                            String mm1 = scan.nextLine();
                            System.out.println("Masukkan nama mata kuliah-2 : ");
                            String mm2 = scan.nextLine();
                            System.out.println("Masukkan nama mata kuliah-3 : ");
                            String mm3 = scan.nextLine();
                            System.out.println("Masukkan nama mata kuliah-4 : ");
                            String mm4 = scan.nextLine();
                            System.out.println("Masukkan nama mata kuliah-5 : ");
                            String mm5 = scan.nextLine();
                            ma.add(new Matkul(mnim, mm1, mm2, mm3, mm4, mm5));
                            cari = true;
                        }
                    }
                    System.out.println("--------------------------");
                    if(!cari){
                        System.out.println("Data tidak ditemukan");
                    }else{
                        System.out.println("Data Berhasil Disimpan");
                    }
                    break;
                case 7:
                    System.out.println("--------------------------");
                    Iterator<Matkul> im = ma.iterator();
                    while(im.hasNext()){
                        Matkul matkul = im.next();
                        System.out.println(matkul);
                        System.out.println("--------------------------");
                    }
                    break;
                case 8:
                cari = false;
                System.out.println("Masukkan nim yang akan dicari :");
                mnim = s.nextInt();
                System.out.println("--------------------------");
                i = m.iterator();
                im = ma.iterator();
                while(i.hasNext()){
                    Mahasiswa mahasiswa = i.next();
                    System.out.println("--------------------------");
                    Matkul matkul = im.next();
                    if(mahasiswa.getNim() == mnim) {
                        System.out.println(mahasiswa);
                        System.out.println(matkul);
                        cari = true;
                    }
                }
                System.out.println("--------------------------");
                if(!cari){
                    System.out.println("Data tidak ditemukan");
                }
                break;
                case 9:
                    cari = false;
                    System.out.println("Masukkan nim:");
                    mnim = s.nextInt();
                    System.out.println("--------------------------");
                    lim = m.listIterator();
                    while(lim.hasNext()){
                        Mahasiswa mahasiswa = lim.next();
                        if(mahasiswa.getNim() == mnim) {
                            System.out.println(mahasiswa);
                            System.out.println("Masukkan nilai nilai : ");
                            System.out.println("Masukkan nim :");
                            mnim = s.nextInt();
                            System.out.println("--------------------------");
                            System.out.println("Masukkan nilai Logika dan Algoritma : ");
                            int n1 = s.nextInt();
                            System.out.println("Masukkan nilai Kalkulus : ");
                            int n2 = s.nextInt();
                            System.out.println("Masukkan nilai Komputer Grafis : ");
                            int n3 = s.nextInt();
                            System.out.println("Masukkan nilai Visual Basic : ");
                            int n4 = s.nextInt();
                            System.out.println("Masukkan nilai Web : ");
                            int n5 = s.nextInt();
                            int rata = n1+n2+n3+n4+n5;
                            int rt = rata/5;
                            String gr;
                            System.out.println("--------------------------");
                            System.out.println("Rata Rata Nilai adalah : "+rt);
                            if(rt>=80){
                                gr = "A";
                                System.out.println("Grade IPK : "+gr);
                            }else if(rt>=70&&rt<=79){
                                gr = "B";
                                System.out.println("Grade IPK : "+gr);
                            }else if(rt>=65&&rt<=69){
                                gr = "C";
                                System.out.println("Grade IPK : "+gr);
                            }else if(rt>=55&&rt<=64) {
                                gr = "D";
                                System.out.println("Grade IPK : "+gr);
                            }else{
                                gr = "E";
                                System.out.println("Grade IPK : "+gr);
                            }
                            n.add(new Nilai(mnim, n1, n2, n3, n4, n5, rt, gr));
                            cari = true;
                        }
                    }
                    System.out.println("--------------------------");
                    if(!cari){
                        System.out.println("Data tidak ditemukan");
                    }else{
                        System.out.println("Data Berhasil Disimpan");
                    }
                    break;
                case 10:
                    cari = false;
                    Iterator<Nilai> ni = n.iterator();
                    System.out.println("Masukkan nim yang akan dicari :");
                    mnim = s.nextInt();
                    System.out.println("--------------------------");
                    i = m.iterator();
                    im = ma.iterator();
                    while(i.hasNext()){
                        Mahasiswa mahasiswa = i.next();
                        Matkul matkul = im.next();
                        Nilai nilai = ni.next();
                        if(mahasiswa.getNim() == mnim) {
                            System.out.println(mahasiswa);
                            System.out.println("--------------------------");
                            System.out.println(matkul);
                            System.out.println("--------------------------");
                            System.out.println(nilai);
                            cari = true;
                        }
                    }
                    System.out.println("--------------------------");
                    if(!cari){
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
            }
        }while (x!=0);
    }
}
    class Mahasiswa{
        private int nim;
        private String nama;

        Mahasiswa(int nim, String nama) {
            this.nim = nim;
            this.nama = nama;
        }

        public int getNim(){
            return nim;
        }

        public String getNama() {
            return nama;
        }
        public String toString(){
            return nim+"\t"+nama;
        }
    }

    class Matkul {
        private String namaMatkul1,namaMatkul2,namaMatkul3,namaMatkul4,namaMatkul5;
        private int nim;

        Matkul(int nim, String namaMatkul1, String namaMatkul2, String namaMatkul3, String namaMatkul4, String namaMatkul5){
            this.nim = nim;
            this.namaMatkul1 = namaMatkul1;
            this.namaMatkul2 = namaMatkul2;
            this.namaMatkul3 = namaMatkul3;
            this.namaMatkul4 = namaMatkul4;
            this.namaMatkul5 = namaMatkul5;

        }

        public int getNim() {
            return nim;
        }

        public String getNamaMatkul1() {
            return namaMatkul1;
        }

        public String getNamaMatkul2() {
            return namaMatkul2;
        }

        public String getNamaMatkul3() {
            return namaMatkul3;
        }

        public String getNamaMatkul4() {
            return namaMatkul4;
        }

        public String getNamaMatkul5() {
            return namaMatkul5;
        }

        public String toString(){
            return nim+"\n"+namaMatkul1+"\n"+namaMatkul2+"\n"+namaMatkul3+"\n"+namaMatkul4+"\n"+namaMatkul5;
        }

    }

    class Nilai {

    private int nim, nilai1, nilai2, nilai3, nilai4, nilai5, ratarata;
    private String grade;

    Nilai(int nim, int nilai1, int nilai2, int nilai3, int nilai4, int nilai5, int ratarata, String grade){
        this.nim = nim;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
        this.ratarata = ratarata;
        this.grade = grade;
    }

        public int getNim() {
            return nim;
        }

        public int getNilai1() {
            return nilai1;
        }

        public int getNilai2() {
            return nilai2;
        }

        public int getNilai3() {
            return nilai3;
        }

        public int getNilai4() {
            return nilai4;
        }

        public int getNilai5() {
            return nilai5;
        }

        public int getRatarata() {
            return ratarata;
        }

        public String getGrade() {
            return grade;
        }

        public String toString(){
            return nim+"\n Logika dan Algoritma : "+nilai1+"\n Kalkulus : "+nilai2+"\n Komputer Grafis : "+nilai3+"\n Visual Basic : "+nilai4+"\n Web : "+nilai5+"\n Rata-rata : "+ratarata+"\n Grade : "+grade;
        }

    }

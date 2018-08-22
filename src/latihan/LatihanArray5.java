/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Asus
 */
public class LatihanArray5 {
//public static void main (String args []){
int nis [][] = {{210651},{210651},{210652}};
String nama [][] = {{"Sabina"},{"Indira"},{"Karina"}};
public void tampil(String n){
System.out.println("Identitas Siswa Angkatan 27");
}
public void namanis (int n){
for (int i = 0; i< 1; i++){
for (int j = 0; j < 1; j++){
System.out.println(nama[1][j]+":"+nis[1][j]);
}
}
}
public static void main (String[]args){
LatihanArray5 siswa = new LatihanArray5();
siswa.tampil(null);
siswa.namanis(0);
}
}




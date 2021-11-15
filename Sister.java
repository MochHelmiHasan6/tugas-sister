/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sister;
import java.util.*;
/**
 *
 * @author imuy
 */
public class Sister {
    public float lebar;
    public float panjang;
    public float tinggi;
    
    public float hitungVolume(){
        return lebar * panjang * tinggi;
    }
    
    public float hitungPermukaan(){
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sister a[] = new Sister[5];
        for (int i = 0; i < 2; i++) {
            a[i]= new Sister();
            System.out.println("Balok ke-" + (i+1));
            System.out.println("Lebar : ");
            a[i].lebar = sc.nextFloat();
            System.out.println("Panjang : ");
            a[i].panjang = sc.nextFloat();
            System.out.println("Tinggi : ");
            a[i].tinggi = sc.nextFloat();
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Volume Balok ke-"+(i+1)+"="+a[i].hitungVolume());
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Luas Permukaan ke-"+(i+1)+"="+a[i].hitungPermukaan());
        }
    }
    
}

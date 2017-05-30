/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektSklepu;
import java.util.Collection;
        


/**
 *
 * @author Anna Konieczna
 */
/*public class Bilans {
    Produkt ProductTab[];
    Pracownik EmployeeTab[];
    double przychod;
    double wydatki;
    double koszt_pra;
    double koszt_dost;
    double straty;
    double suma_kosztow;
    double zysk;
    double rent;
    
    public Bilans (Produkt TabP[],Pracownik TabE[]) {
        this.ProductTab = TabP[]; // potem  zmienimy bo nier wiadomo ocb
        this.EmployeeTab = TabE[];
        this.przychod = 0;
        this.przychod =0;
        this.wydatki =0;
        this.koszt_pra =0;
        this.koszt_dost =0;
        this.straty =0;
        this.suma_kosztow =0;
        this.zysk =0;
        this.rent =0;
    }
    
    private double count_przychod () {
       
        for (int i=0; i < ProductTab.length; i++)
            {
                   this.przychod += ProductTab[i].getPrice() * ProductTab[i].getBought();
            }   
        return przychod;
           
    }
    public double getPrzychod(){
        
        return count_przychod();
    }
    
    public double count_wydatki() {
        this.wydatki = 2000 + 50 + 100; // dziwne hardkodowane liczby? mycie okien  i cos
        return this.wydatki;
    }
    public double getWydatki() {
        return count_wydatki();
    }
    public double count_koszt_pracownikow() {
        for (int i = 0; i < EmployeeTab.length; i++){
            this.koszt_pra = this.koszt_pra + EmployeeTab[i].getPay();
        }
        return koszt_pra;
    }
    public double getKoszt_pracownikow () {
        return count_koszt_pracownikow();
    }
    public double count_koszt_dostaw() {
         for (int i=0; i < ProductTab.length; i++) {
             if (ProductTab[i].getQuantity() == 0) {
                 this.koszt_dost = this.koszt_dost + (20 * ProductTab[i].getMag_Cost());          
                         }
         }
         return koszt_dost;
    }
    public double getKoszt_dostaw() {
        return count_koszt_dostaw();
    }
    public double count_straty() {
        for (int i=0; i<ProductTab.lenght; i++){
            this.straty = this.straty + (ProductTab[i].getQuantity() * ProductTab[i].getMag_Cost() * 0.05);
        }
        return this.straty;
    }
    public double getStraty() {
        return count_straty();
    }
    public double count_suma_kosztow () {
        this.suma_kosztow = getWydatki() + getKoszt_pracownika() + getStraty() + getKoszt_dostawy();
        return this.suma_kosztow;
    }
    public double getSuma_kosztow () {
        return count_suma_kosztow();
    }
    public double count_zysk() {
        this.zysk = getPrzychod() - getSuma_kosztow();
        return this.zysk;
    }
    public double getZysk() {
        return count_zysk();
    }
    public double count_rent() {
        this.rent = (getZysk()/getPrzychod()) * 100;
        return this.rent;
    }
    public double getRent() {
        return count_rent();
    }
    
}
*/


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Trang Phan
 */
public class HangTu {
    private int heSo;
    private int soMu;
    private String bien;

    public HangTu(int heSo, int soMu, String bien) {
        this.heSo = heSo;
        this.soMu = soMu;
        this.bien = bien;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    public int getSoMu() {
        return soMu;
    }

    public void setSoMu(int soMu) {
        this.soMu = soMu;
    }

    public String getBien() {
        return bien;
    }

    public void setBien(String bien) {
        this.bien = bien;
    }

    @Override
    public String toString() {
        return heSo + "x^" + soMu;
    }
    
}

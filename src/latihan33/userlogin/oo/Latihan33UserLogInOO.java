/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan33.userlogin.oo;

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : IF-1
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : Membuat Program LogIn Berbasis Object Oriented
 */
public class Latihan33UserLogInOO {

    private final static String username = "Alfi";
    private final static String password = "jocong";
    private boolean statusAkun;

    private boolean CekAkun(String parUserName, String parPassword){
        return statusAkun = parUserName.equals(username) && parPassword.equals(password);
    }

    private void HasilLogin(boolean status, String parUserName){
        String hasil = status ? "******HALLO ".concat(parUserName)
                .concat("******\nSelamat Datang di Aplikasi ini")
                : "Ooops, Username atau Password anda salah";
        System.out.println(hasil);
    }

    public void PengecekanLogin(String parUserName, String parPassword){
        CekAkun(parUserName, parPassword);
        HasilLogin(statusAkun, parUserName);
    }
}


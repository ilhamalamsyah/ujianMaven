/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ifunpas.rkppl.ujianmaven;

/**
 *
 * @author Ilham Alamsyah
 */
public class soalTest {
    private static Soal s;
    
    @Before
    public void awal(){
        s = new Soal();
        System.out.println("Mengawali test");
    }
}

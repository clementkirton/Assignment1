package com.mycompany.servicea1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author w206113903
 */
public class SeriousComponent {
    
    public static boolean testSeriousness( String text ) {
    return !text.toUpperCase().contains( "FUNNY" );
  }
}

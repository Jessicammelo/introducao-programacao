/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jessi
 */
public class Tipos {
    public static void tste(String []args){
        byte b = 127;
short s = 1000;
int i = 1000000000;
long l = 1000000000;
b = (byte) s; // tenta converter short em byte
b = (byte) i; // tenta converter int em byte
s = (short) i; // tenta converter int em short
b = (byte) l; // tenta converter long em byte
s = (short) l; // tenta converter long em short
i = (int) l; // tenta converter long em int
b = (byte) 10; // tenta converter int em byte
s = (short) 10; // tenta converter int em short

    }
}

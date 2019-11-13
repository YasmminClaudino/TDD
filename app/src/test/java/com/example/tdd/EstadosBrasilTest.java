package com.example.tdd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EstadosBrasilTest {
    @Test
    public void isASouthState(){
        ArrayList<String> preload;
        Estados es = new Estados();
        preload = es.getEstados();
        assertEquals(preload.get(0), "Rio Grande do Sul");

    }
}

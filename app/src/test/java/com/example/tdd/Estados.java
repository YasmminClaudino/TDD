package com.example.tdd;

import java.util.ArrayList;
import java.util.List;

class Estados {
    private ArrayList<String> estados = new ArrayList<>();
    public Estados(){
        criarEstados(estados);
    }
    private ArrayList<String> criarEstados(ArrayList<String> estados){
        this.estados.add("Rio Grande do Sul");
        this.estados.add("Santa Catarina");
        this.estados.add("Paraná");
        return this.estados;
    }

    public ArrayList<String> getEstados() {
        return estados;
    }
}

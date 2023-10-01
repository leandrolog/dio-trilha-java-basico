package src;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoas {


    private List<Pessoa> pessoas;


    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> orderByIdade(){
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(pessoas);
        return pessoasOrdenadas;
    }

}

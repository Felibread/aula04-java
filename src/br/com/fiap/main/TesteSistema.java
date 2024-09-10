package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteSistema {

    public static void main(String[] args) {

        //Instanciar objetos

        Produto objProduto = new Produto();
        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();

        objCliente.setNome("Bread");
        objCliente.setIdade(18);
        objCliente.setAltura(1.89);

        objEndereco.setLogradouro("Rua Helmut Strobel");
        objEndereco.setCep("0676-7070");
        objEndereco.setCidade("Taboão da Serra");
        objEndereco.setBairro("PQ.Pinheiros");

        objEndereco.setEndereco(objEndereco);

        //Saídas
        System.out.println(
                "Nome: " + objCliente.getNome() +
                        "\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
                        "\nCEP: " + objCliente.getEndereco().getCep()



        );
    }
}

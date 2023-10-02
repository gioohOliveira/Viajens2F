import javax.swing.*;
public class main {
    public static void main(String[] args){

        //classe objeto= construtor
        Turista mochileiro= new Turista("Lindsay");
        Turista mochileira=  new Turista();

        // definir forma de cada turista
        mochileiro.setcpf = "123";
        mochileira.setnome= "namor";
        mochileira.setcpf= "456";

        // Atribuição indireta
        String nome = JOptionPane.showInputDialog("Entre com o nome");
        mochileira.setNome(nome);
        System.out.println("O nome do objeto é :" + mochileira.getNome());
        // Fazer o mesmo para capturar o cpf deste objeto
        String cpf = JOptionPane.showInputDialog("Entre com o cpf");
        mochileira.setCpf(cpf);
        System.out.println("O CPF do objeto é :" + mochileira.getCpf());
        // Novo objeto
        nome = JOptionPane.showInputDialog("Qual seu nome: ");
        // Criando objeto com construtor recebendo nome
        Turista outroTurista = new Turista(nome);
        System.out.println("O nome deste turista é :" + outroTurista.getNome());
        // Fazer o recebimento  do cpf para este turista

    }
}

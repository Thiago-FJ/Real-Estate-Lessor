import java.util.Scanner;
public class Pessoa {
    Scanner scP = new Scanner(System.in);
    String nomeP;
    String cpf;
    String dataNasc;
    String compEnd;
    String email;
    String tel1;
    String tel2;

    public void setCad(){
        
        System.out.println("Digite seu nome completo: ");
        nomeP = scP.nextLine();

        System.out.println("Digite seu cpf: ");
        cpf = scP.nextLine();

        System.out.println("Digite sua data de nascimento: ");
        dataNasc = scP.nextLine();

        System.out.println("Digite seu endereço completo: ");
        email = scP.nextLine();

        System.out.println("Digite seu email: ");
        compEnd = scP.nextLine();

        System.out.println("Digite seu número de telefone: ");
        tel1 = scP.nextLine();

        System.out.println("Digite outro número para contato: ");
        tel2 = scP.nextLine();

    }

    public void getAllP(){
        System.out.println("\tInformações pessoais");
        
    }

    public String getNomeP() {
        return nomeP;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getCompEnd() {
        return compEnd;
    }

    public String getEmail() {
        return email;
    }

    public String getTel1() {
        return tel1;
    }

    public String getTel2() {
        return tel2;
    }
}

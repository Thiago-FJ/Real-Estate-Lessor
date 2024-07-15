import java.util.Scanner;
public class ClienteLocador extends Pessoa{
    String estCivil;
    int ident;
    String nomeM;
    String nomePai;
    String naturalidade;
    Scanner scCLoc = new Scanner(System.in);
    Pessoa psLoc = new Pessoa();
    public void setCadLocI(){
        
        psLoc.setCad();

        System.out.println("Digite seu estado civil: ");
        estCivil = scCLoc.nextLine();

        System.out.println("Digite o nome da sua mãe: ");
        nomeM = scCLoc.nextLine();

        System.out.println("Digite o nome do seu pai: ");
        nomePai = scCLoc.nextLine();

        System.out.println("Digite sua naturalidade: ");
        naturalidade = scCLoc.nextLine();

        System.out.println("Digite seu número de identidade: ");
        ident = scCLoc.nextInt();
    
        scCLoc.close();
    }
    public void setCadLoc(){
        Pessoa psLoc = new Pessoa();
        psLoc.setCad();

        System.out.println("Digite seu estado civil: ");
        estCivil = scCLoc.nextLine();

        System.out.println("Digite o nome da sua mãe: ");
        nomeM = scCLoc.nextLine();

        System.out.println("Digite o nome do seu pai: ");
        nomePai = scCLoc.nextLine();

        System.out.println("Digite sua naturalidade: ");
        naturalidade = scCLoc.nextLine();

        System.out.println("Digite seu número de identidade: ");
        ident = scCLoc.nextInt();

    }

    public String getEstCivil() {
        return estCivil;
    }

    public int getIdent() {
        return ident;
    }

    public String getNomeM() {
        return nomeM;
    }

    public String getNomePai() {
        return nomePai;
    }

    public String getNaturalidade() {
        return naturalidade;
    }
    public void getAllLloc(){
        System.out.println("Nome: "+ psLoc.getNomeP());
        System.out.println("CPF: "+psLoc.getCpf());
        System.out.println("Data de nascimento: "+psLoc.getDataNasc());
        System.out.println("Endereço completo: "+psLoc.getCompEnd());
        System.out.println("E-mail: "+psLoc.getEmail());
        System.out.println("CPF: "+psLoc.getCpf());
        System.out.println("Telefone 1: "+psLoc.getTel1());
        System.out.println("Telefone 2: "+psLoc.getTel2());
        System.out.println("Estado Civil: "+getEstCivil());
        System.out.println("Identidade: "+getIdent());
        System.out.println("Nome do Pai: "+getNomePai());
        System.out.println("Nome da Mãe: "+getNomeM());
        System.out.println("Naturalidade: "+getNaturalidade());
    }

}

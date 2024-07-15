
public class ClienteCompra extends Pessoa{
    Pessoa psC = new Pessoa();
    ImoveisPref pPref = new ImoveisPref();
    public void setCadCompra(){
        psC.setCad();
    }

    public void getAllP(){
        System.out.println("Nome: "+ psC.getNomeP());
        System.out.println("CPF: "+psC.getCpf());
        System.out.println("Data de nascimento: "+psC.getDataNasc());
        System.out.println("Endereço completo: "+psC.getCompEnd());
        System.out.println("E-mail: "+psC.getEmail());
        System.out.println("CPF: "+psC.getCpf());
        System.out.println("Telefone 1: "+psC.getTel1());
        System.out.println("Telefone 2: "+psC.getTel2());
    }



    

}

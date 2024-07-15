import java.util.Scanner;
public class ImoveisPref extends Imoveis{
    Float valMax;
    Float valMin;
    Imoveis imoPref = new Imoveis();

    public void setPref(){
        Scanner scPref = new Scanner(System.in);

    System.out.println("\n\tCadastro de preferência sobre imóveis: ");

        System.out.println("Digite o valor máximo dos imóveis: ");
        valMax = scPref.nextFloat();

        System.out.println("Digite o valor mínimo dos imóveis: ");
        valMin = scPref.nextFloat();
           

        imoPref.setImovel();

        scPref.close();
    }

    public void getAllI(){
        System.out.println("\tInformações de preferências:");
        System.out.println("Valor máximo do imóvel:" + getValMax());
        System.out.println("Valor máximo do imóvel:" + getValMin());
        System.out.println("Categoria do imóvel:" + imoPref.getCat());
        System.out.println("Tipo do imóvel:" + imoPref.getTipo());
        System.out.println("Local do imóvel:" + imoPref.getLocal());
    }

    public Float getValMax() {
        return valMax;
    }
    public Float getValMin() {
        return valMin;
    }
}

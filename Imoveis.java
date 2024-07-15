import java.util.Scanner;

public class Imoveis {
    String cat;
    String tipo;
    String local;

    public void getAllI(){
        System.out.println("\tInformações sobre imóvel> ");
        
    }

    public void setImovel(){

        Scanner scImo = new Scanner(System.in);

        System.out.println("Digite a categoria do imóvel (residencial, industrial, comercial, reural): ");
        cat = scImo.nextLine();

        scImo.nextLine();

        System.out.println("Digite o tipo do imóvel (apartamento, kitnet, flat,casa,terreno,sítio): ");
        tipo = scImo.nextLine();

        System.out.println("Digite a localização do imóvel: ");
        local = scImo.nextLine();

    }

    public String getCat() {
        return cat;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLocal() {
        return local;
    }

}

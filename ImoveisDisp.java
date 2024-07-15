import java.util.Scanner;
public class ImoveisDisp extends Imoveis{
    String busca;
    Float valor;
    String tamanho;
    int qntVaga;
    int qntBan;
    String desc;

    Scanner scDisp = new Scanner(System.in);
    Imoveis imoD = new Imoveis();
    public void setDisp(){
        
        imoD.setImovel();
   
        System.out.println("Digite o que busca com o imóvel (compra, locação, lançamento): ");
        busca = scDisp.nextLine();

        System.out.println("Digite o valor do imóvel: ");
        valor = scDisp.nextFloat();

        scDisp.nextLine();
        System.out.println("Digite o tamanho do imóvel: ");
        tamanho = scDisp.nextLine();

        System.out.println("Digite a quantidade de vagas do imóvel: ");
        qntVaga = scDisp.nextInt();

        System.out.println("Digite a quantidade de banheiros do imóvel: ");
        qntBan = scDisp.nextInt();

        scDisp.nextLine();

        System.out.println("Digite oa descrição do imóvel: ");
        desc = scDisp.nextLine();

        scDisp.close();

    }

    public void getAllI(){
        System.out.println("\tInformações do Imóvel:");
        System.out.println("Tipo de busca:" + getBusca());
        System.out.println("Valor do imóvel:" + getValor());
        System.out.println("Categoria do imóvel:" + imoD.getCat());
        System.out.println("Tipo do imóvel:" + imoD.getTipo());
        System.out.println("Local do imóvel:" + imoD.getLocal());
        System.out.println("Tamanho do imóvel:" + getTamanho());
        System.out.println("Quantidade de vagas de carro:" + getQntVaga());
        System.out.println("Quantidade de banheiros:" + getQntBan());
        System.out.println("Descrição do imóvel:" + getDesc());
    }
    public String getBusca() {
        return busca;
    }

    public Float getValor() {
        return valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getQntVaga() {
        return qntVaga;
    }

    public int getQntBan() {
        return qntBan;
    }

    public String getDesc() {
        return desc;
    }

    
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int esc;
        ClienteCompra cC = new ClienteCompra();
        ClienteLocador cL = new ClienteLocador();
        ImoveisPref cCPref = new ImoveisPref();
        ImoveisDisp cLImo = new ImoveisDisp();

        Scanner scMain = new Scanner(System.in);

        System.out.println("Cadastros da empresa de tecnologia");
        System.out.println("Qual tipo de cadastro você deseja fazer:\n\t[1]Cadastro normal\n\t[2]Cadastro Locador sem cadastro de imóvel\n\t[3]Cadastro Locador com cadastro de imóvel");
        esc = scMain.nextInt();

        if (esc == 1){
            cC.setCadCompra();
            cCPref.setPref();
        }
        else if (esc == 2){
            cL.setCadLocI();
            cLImo.setDisp();
        }
        else if (esc == 3){
            cL.setCadLoc();
        }
        else{
            System.out.println("Opção indísponível");
        }

        System.out.println("\n\nEu Ana Clara Ferreira Joaquim da empresa de tecnologia - Agradecemos pelo seu cadastro!");

        if (esc == 1){
            cC.getAllP();
            cCPref.getAllI();
        }
        else if (esc == 2){
            cL.getAllLloc();
            cLImo.getAllI();
            
        }
        else if (esc == 3){
            cL.getAllLloc();
        }

        scMain.close();
    }
}

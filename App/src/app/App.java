package app; //onde fica guardado


public class App {

    public static void main(String[] args) {
        FrontEnd start =  new FrontEnd(); //dizendo que vou usar tal classe
        int resposta = start.menu(); //chamando metódo 
        //vou repetir o que fiz em cima
        DataBase fim = new DataBase();
        fim.prices(resposta);
        
    
        
              
    }
}

    public class MeuArquivo {

    public static void main (String [] args) {
        String primeiroNome = "Maxwell";
        String segundoNome = "Moura";
        String terceiroNome = "Muniz";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome);

        System.out.println(nomeCompleto);
   
        }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome) {
        return "Resultado do método " + primeiroNome.concat(" ") + segundoNome.concat(" ").concat(terceiroNome);
    }
        
    }
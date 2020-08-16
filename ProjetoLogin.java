import java.util.Scanner;

public class ProjetoLogin {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sobrenome");
        String sobrenome = scanner.nextLine();
        String usuario = nome.charAt(0) + "_" + sobrenome;
        String senha = null;
        

        boolean validaSenha = false;

        while (validaSenha == false){

            System.out.println("Crie uma senha");

            senha = scanner.nextLine();
            if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() > 7) {
                System.out.println("Cadastrado com sucesso");
                validaSenha = true;
            } else {
                System.out.println("Requer 1 letra maiuscula, 1 numero, e 1 desses caracteres - ! @, e ter mais que 7 caracteres!");
            }



        }

        System.out.println("Usuario:"+usuario);
        System.out.println("Senha:"+senha);
        boolean validaUsuario = false;

        while (validaUsuario == false){
            System.out.println("Digite o ususario");
            String login = scanner.nextLine();
            System.out.println("Digite a senha");
            String senhaLogin = scanner.nextLine();
            if (login.equals(usuario)&&senhaLogin.equals(senha)){
                System.out.println("Login realizado com sucesso");
                validaUsuario = true;
            }else {
                System.out.println("Usuario ou senha incorreto");
            }

        }












    }


}

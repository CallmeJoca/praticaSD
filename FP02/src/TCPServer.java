/**
 *
 * @author Joca
 */
import java.net.*;
import java.util.ArrayList;
import java.io.*;
public class TCPServer {
    public TCPServer(){
        
        ServerSocket meuServidor;
        Socket sServidor;
        ObjectOutputStream os;
        ObjectInputStream is;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        String clientMessage;
        String serverMessage;
        int id, i = 0;
        String nome, curso, contacto, resposta;
        try{
            meuServidor = new ServerSocket(2222);
            System.out.println("socket a escuta");
            while(true){
                    sServidor = meuServidor.accept();
                    System.out.println("Ligação aceite");
            
                    os = new ObjectOutputStream(sServidor.getOutputStream());
                    is = new ObjectInputStream(sServidor.getInputStream());
                    System.out.println("Streams ligados");
               do{
                    ArrayList<aluno> alunos = new ArrayList<aluno>();
                    serverMessage = "Menu:\n 1. Registar novo estudante.\n 2. Consultar estudantes.\n 3. Consultar número de acessos.\n Pesquisar estudantes por nome.\n 5. Sair.\n";
                    os.writeObject(serverMessage); //WRITE
                    os.flush();

                    clientMessage = (String) is.readObject(); //READ
                    System.out.println(clientMessage);

                    switch (clientMessage) {
                        case "1":
                            // Definir ID
                            id = alunos.size();

                            // Definir o nome
                            serverMessage = "Nome: ";
                            os.writeObject(serverMessage); //WRITE
                            os.flush();
                            nome = (String) is.readObject(); //READ
                            System.out.println(nome);

                            // Definir o curso
                            serverMessage = "Curso: ";
                            os.writeObject(serverMessage); //WRITE
                            os.flush();
                            curso = (String) is.readObject(); //READ
                            System.out.println(curso);

                            // Definir o contacto
                            serverMessage = "Contacto: ";
                            os.writeObject(serverMessage); //WRITE
                            os.flush();
                            contacto = (String) is.readObject(); //READ
                            System.out.println(contacto);
                            
                            aluno a = new aluno(id, nome, curso, contacto);

                            while(i != alunos.size()){
                                if (alunos.get(i).equals(a)){
                                    System.out.println("Aluno já existe");
                                    serverMessage = "Aluno já está registado. \n Deseja proceder: S ou N\n";
                                    os.writeObject(serverMessage); //WRITE
                                    os.flush();
                                    
                                    resposta = (String) is.readObject(); //READ
                                    if (resposta == "N")
                                        serverMessage = "fim";
                                    break;
                                }
                                i++;
                            }

                            if (i == alunos.size()){
                                alunos.add(a);
                                
                                System.out.println("Registo bem sucedido");
                            }
                            
                            break;
                        case "2":
                            String listaAlunos = "";
                            for (int j = 0 ; j <= alunos.size() ; j++){
                                listaAlunos = listaAlunos + alunos.get(j).tostring();
                                os.writeObject(listaAlunos);
                                os.flush();
                            }
                            
                            break;
                        case "3":
                            
                            break;
                        case "4":

                            break;
                        case "5":
                            serverMessage = "fim";
                            break;
                    }

                } while(!serverMessage.equals("fim"));
               
               os.close();
               is.close();
               sServidor.close();
            }
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        TCPServer server = new TCPServer();
    }
}

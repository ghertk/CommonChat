package chat;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MensagemInterface extends Remote {
    /**
     * Método responsavel por receber os dados do cliente
     * 
     * @param mensagem 
     * @param ipCliente
     * @throws RemoteException 
     */
    void enviarMensagem(String mensagem, String ipCliente) throws RemoteException;
    
    /**
     * 
     * @param ipCliente
     * @param nome
     * @return
     * @throws RemoteException 
     */
    List<String> conectarUsuario(String ipCliente, String nome) throws RemoteException;
}

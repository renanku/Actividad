package Bancoss;
import java.util.LinkedList;
import java.util.Queue;

public class Turnos {
    private int contadorTurno;
    private Queue<Cliente> colaClientes;

    public Turnos() {
        this.contadorTurno = 1; 
        this.colaClientes = new LinkedList<>();
    }

   
    public void asignarTurno(Cliente cliente) {
        cliente.setTurno("Turno " + contadorTurno);
        colaClientes.add(cliente);
        contadorTurno++;
    }

    
    public Cliente despacharTurno() {
        return colaClientes.poll(); 
    }

    
    public Queue<Cliente> getClientesEnEspera() {
        return colaClientes;
    }
}


	


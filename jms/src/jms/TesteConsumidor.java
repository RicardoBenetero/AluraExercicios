package jms;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.Message;

import java.util.Scanner;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;


public class TesteConsumidor {

	public static void main(String[] args) throws NamingException, JMSException {
		
		
		InitialContext context = new InitialContext();

	
		ConnectionFactory cf = (ConnectionFactory)context.lookup("ConnectionFactory");
		Connection conexao = cf.createConnection();

		conexao.start();
		
		//cria context, factory, connection

		Session session = conexao.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination fila = (Destination) context.lookup("financeiro");
		MessageConsumer consumer = session.createConsumer(fila);

		Message message = (Message) consumer.receive();
		System.out.println("Recebendo msg: " + message);

		session.close();

		//scanner e close da  connection e context

		new Scanner(System.in).nextLine();

		conexao.close();    
		context.close();
	}

}

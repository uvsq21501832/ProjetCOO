package fr.uvsq.coo.projet_ex2;

import java.sql.Connection;
import java.util.ArrayList;

public abstract class DAO<Type> {
	
	public Connection connect;//=ConnectionMysqlBD.connection;
	
	
	public abstract boolean creer(Type p );
	public abstract ArrayList<Type> lire();
	public abstract Type trouver(String identifiant);
	public abstract Type modifier(Type p );
	public abstract void supprimer(Type p );
}

package com.senai.anna.domain;
import  java.io.Serializable ;
import  java.util.Objects ;

import  javax.persistence.Column ;
import  javax.persistence.Entity ;
import  javax.persistence.GeneratedValue ;
import  javax.persistence.GenerationType ;
import  javax.persistence.Id ;
import  javax.persistence.JoinColumn ;
import  javax.persistence.ManyToOne ;

@Entidade
public  class  Cidade  implementa  Serializable {
	private  static  final  long serialVersionUID =  1l ;
@Column ( name = " id_cidade " )
@Identificação 
@GeneratedValue ( estratégia  =  GenerationType . IDENTITY )
 id inteiro privado ;  
@Column ( name = " nome_cidade " )
 nome da string privada ;

@ManyToOne 
@JoinColumn ( name = " estado_id " )
private  Estado estado;

public  Cidade () {
	
}

público  Cidade ( Integer  id , Cordas  Nome , Estado  estado ) {
	super ();
	isso . id = id;
	isso . nome = nome;
	isso . estado = estado;
}

public  Integer  getId () {
	return id;
}

public  void  setId ( ID inteiro  ) {
	isso . id = id;
}

public  String  getNome () {
	return nome;
}

public  void  setNome ( String  nome ) {
	isso . nome = nome;
}

public  Estado  getEstado () {
	return estado;
}

public  void  setEstado ( Estado  estado ) {
	isso . estado = estado;
}

@Sobrepor
public  int  hashCode () {
	retornar  objetos . hash (id);
}

@Sobrepor
public  boolean  equals ( Object  obj ) {
	if ( this  == obj)
		return  true ;
	if (obj ==  null )
		return  false ;
	if (getClass () ! = obj . getClass ())
		return  false ;
	Cidade outro = ( Cidade ) obj;
	retornar  objetos . igual (id, outro . id);
}

		
} 

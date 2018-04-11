package br.com.alura.loja.modelo;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

public class Projeto {

	private String name;
	private long id;
	private int anoDeInicio;
	
	public Projeto(String name, long id, int anoDeInicio) {
		this.name = name;
		this.id = id;
		this.anoDeInicio = anoDeInicio;
	}
	
	public Projeto() {
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	public int getAnoDeInicio() {
		return anoDeInicio;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String toJson(){
		return new Gson().toJson(this);
	}
	
	public String toXml(){
		return new XStream().toXML(this);
	}
}

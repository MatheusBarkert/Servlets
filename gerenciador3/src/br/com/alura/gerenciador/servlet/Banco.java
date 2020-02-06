package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(Banco.chaveSequencial++);
		empresa.setNome("Alura");
		Banco.lista.add(empresa);
		
		Empresa empresa2 = new Empresa();
		empresa2.setId(Banco.chaveSequencial++);
		empresa2.setNome("Caelum");
		Banco.lista.add(empresa2);
		
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer paramID) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId()==paramID) {
				it.remove();
			}
		}
		
	}

	public Empresa buscaEmpresaPelaId(Integer paramId) {
		
		for (Empresa empresa : lista) {
			if(empresa.getId()==paramId) {
				return empresa;
			}
		}
		return null;
		
	}

}

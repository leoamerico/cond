package br.com.login.hibernate;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.login.beans.comum.*;

public class GeraTabelas {
	public static void main(String[] args) {
		
		 AnnotationConfiguration cfg = new AnnotationConfiguration(); 

		 cfg.addAnnotatedClass(Acesso.class);
		 cfg.addAnnotatedClass(Endereco.class);
		 cfg.addAnnotatedClass(PessoaFisica.class);
		 
		 new SchemaExport(cfg).create(true, true);
		}	
}
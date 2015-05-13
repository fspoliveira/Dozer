package br.com.bitwaysystem.Dozer;

import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import br.com.bitwaysystem.entity.People;
import br.com.bitwaysystem.entity.Pessoa;

/**
 * Example Based in http://dozer.sourceforge.net/
 *
 */
public class App {
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa(35, "João");		

		List<String> list = Arrays
				.asList("file:" + new java.io.File("").getAbsolutePath()
						+ "\\Dozermapping.xml");

		Mapper mapper = new DozerBeanMapper(list);
		People people = mapper.map(pessoa, People.class);

		System.out.println("Name " + people.getName());
		System.out.println("Age " + people.getAge());

	}
}

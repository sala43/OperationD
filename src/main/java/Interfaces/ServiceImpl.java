package Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import Entity.Pojo;

public class ServiceImpl {
	List<String[]> list;

	public ServiceImpl() {

		String[] data1 = { "jeya", "chan", "23", "covai", "9796468976" };
		String[] data2 = { "thiya", "ku", "22", "selam", "8215469463" };
		String[] data3 = { "anoop", "kerala", "20", "paalakadu", "7568945548" };
		list = Arrays.asList(data1, data2, data3);
	}

	
	public List<String[]> getDetails( ){
		return list;
	}

}

package com.rackerrank.testes;

public class Teste {
	
	public static void main(String[] args) {
		
		String ER_CUSTCOM_ADDR_ENG = "Shell Canada Limited; 400 - 4th Avenue; S.W.; Calgary; Alberta; T2P 0J4;";
		String ER_CUSTCOM_CUSTCOM_ENG_NM = "VINI CANADA CUSTOMER 1";
		
		String CUSTOMER_COUNTRY_NAME = "Pennzoil-Quaker State Co";
		
		
		String[] addr = ER_CUSTCOM_ADDR_ENG.split(";",5);
		
		String result = "To:" + "\n" + ER_CUSTCOM_CUSTCOM_ENG_NM + " " + "\n";
		Integer x = 0;
		for(x=0;x<addr.length;x=x+1){
		    result = result + addr[x] + '\n';
		};

		System.out.println(result + CUSTOMER_COUNTRY_NAME);
	}

}

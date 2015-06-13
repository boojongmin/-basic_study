package com.school.store;

public class StoreMain {
	public static void main(String[] args) {
		ComputerGoods com1 = new ComputerGoods("LG��Ʈ��", 1000000, "windows", true);
		ComputerGoods com2 = new ComputerGoods("�Ｚ ��Ʈ��", 1000000, "windows", true);
		ComputerGoods com3 = new ComputerGoods("����� ��Ʈ��", 1000000, "linux", true);
		ComputerGoods com4 = new ComputerGoods("LG ����ũž", 1000000, "windows", false);
		ComputerGoods com5 = new ComputerGoods("IMB ����", 1000000, "unix", false);
		
		CameraGoods camear1 = new CameraGoods("sony-001", 1500000, "�Ҵ�", true);
		CameraGoods camear2 = new CameraGoods("m-009", 990000, "�̳�Ÿ", false);
		CameraGoods camear3 = new CameraGoods("eos", 1500000, "ĳ��", true);
		CameraGoods camear4 = new CameraGoods("a-001", 1500000, "�ø�Ǫ��", false);
		CameraGoods camear5 = new CameraGoods("k-001", 1500000, "�Ｚ", true);
		
		Goods[] ca = new Goods[]{com1, com2, com3, com4, com5, 
								camear1, camear2, camear3, camear4, camear5};
		int totalPayment =0;
		for(int i =0; i < ca.length; i++){
			totalPayment += ca[i].price;
		}
		System.out.println("��ü ��ǰ�� ���� : " + totalPayment);
		int cameraTotalPayment = 0;
		int computerTotalPayment = 0;
		int unkownTotalPayment = 0;
		//foreach    
		for(Goods g : ca  ){
			if(g instanceof CameraGoods){
				cameraTotalPayment += g.price;
			}else if(g instanceof ComputerGoods){
				computerTotalPayment += g.price;
			}else{
				unkownTotalPayment += g.price;
			}
		}
		String msg = 
				String.format("camera : %d \ncomputer : %d \nunkown : %d", 
									cameraTotalPayment, computerTotalPayment, unkownTotalPayment);
		System.out.println(msg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package cpu;

import java.util.Scanner;

public class cpu {
	int price;
	public class processor{
		int no_of_cores;
		String manufacturer;
		public static class ram
		{
			int memory;
			String ram_manufacturer;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		cpu cpu1 =new cpu();
		cpu.processor processor1 = cpu1.new processor();
		cpu.processor.ram ram1 = new cpu.processor.ram();
		System.out.print("CPU: ");
		processor1.manufacturer=sc.next();
		System.out.print("Price: ");
		cpu1.price=sc.nextInt();
		System.out.print("no.of cores: ");
		processor1.no_of_cores=sc.nextInt();
		System.out.print("RAM manufacturer: ");
		ram1.ram_manufacturer=sc.next();
		System.out.print("RAM memory: ");
		ram1.memory=sc.nextInt();
		System.out.printf("CPU %s\n price %d\n no.of cores %d\n RAM manufactures %s\n memory %d\n",processor1.manufacturer,cpu1.price,processor1.no_of_cores,ram1.ram_manufacturer,ram1.memory);
		
		

	}

}

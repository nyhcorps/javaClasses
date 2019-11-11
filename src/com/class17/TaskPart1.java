package com.class17;

public class TaskPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1=new Dog();
		dog1.breed="Husky";
		Dog dog2=new Dog();
		dog2.breed="Bulldog";
		Dog dog3=new Dog();
		dog3.breed="Labrador";
		dog1.age=7;
		dog1.size="small";
		dog1.weight=6;
		dog2.age=2;
		dog2.size="medium";
		dog2.weight=15;
		dog3.age=1;
		dog3.size="Large";
		dog3.weight=60;
		
		dog1.eats();
		dog1.age();
		dog1.houseBroken();
		dog2.eats();
		dog2.age();
		dog2.houseBroken();
		dog3.eats();
		dog3.age();
		dog3.houseBroken();
		System.out.println("=============================");
		Phone phone1=new Phone();
		Phone phone2=new Phone();
		Phone phone3=new Phone();
		
		phone1.make="Apple";
		phone1.model="iphone 6";
		phone1.year=2016;
		phone1.isOld=true;
		phone2.make="Android";
		phone2.model="Samsung A20s";
		phone2.year=2019;
		phone2.isOld=false;
		phone3.make="Nokia";
		phone3.model="6.2";
		phone3.year=2019;
		phone3.isOld=false;
		
		phone1.about();
		phone2.about();
		phone3.about();
		
		
	}

}

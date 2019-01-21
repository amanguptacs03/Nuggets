package com.assign.nugget_4;

import java.util.Random;

public class TestMedicine {
public static void main(String[] args) {
	Medicine[] m=new Medicine[10];
	Random r=new Random();
	for(int i=0;i<10;i++){
int j=	r.nextInt(3);
switch(j)
{
case 0:
	Tablet t=new Tablet();
	t.displayLabel();
	break;
case 1:
	Syrup sy= new Syrup();
	sy.displayLabel();
	break;
case 2:
Ointment o=new Ointment();
	o.displayLabel();
	break;

}
	}
}
}
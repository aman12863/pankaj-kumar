class Car
{
	int price;
	String name;
	String model;
		void m(int p,String n,String mo)
		{
		price=p;
		name=n;
		model=mo;
		}
	
}


class Supercar extends Car
{
String stapny;
void p(String st)
{
stapny=st;
}

void display()
	{
	System.out.println(stapny+""+price+" "+name+" "+model);
	}
}

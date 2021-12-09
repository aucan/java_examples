interface Ali {
	void muzikBecerisi();
}


interface Hasan {
	void sporBecerisi();
}


interface Osman extends Ali, Hasan {
	void resimBecerisi();
}


class Fatma {
	String gozRengi="Yesil gozlu";
	void dilBecerisi(){
		System.out.println("Cabuk dil ogrenir");
	}
}


class Zeynep extends Fatma {
	String sacSekli="Duz Sacli";
	public void elBecerisi(){
		System.out.println("Eli titremez");
	}
}


class Sevim extends Zeynep implements Osman {
	String tenRengi="Esmer";
	public void muzikBecerisi()
	{
		System.out.println("Gitar calar");
	}
	public void sporBecerisi()
	{
		System.out.println("Yuzer");
	}
	public void resimBecerisi()
	{
		System.out.println("Yagli boya resim yapar");
	}
	public void dansBecerisi(){
		System.out.println("Robot dans yapar");
	}
}

public class Main2{

	public static void main(String[] args){
		Sevim instanceSevim = new Sevim();
		System.out.println(instanceSevim.gozRengi);
		System.out.println(instanceSevim.sacSekli);
		System.out.println(instanceSevim.tenRengi); 
		instanceSevim.muzikBecerisi();
		instanceSevim.sporBecerisi();
		instanceSevim.resimBecerisi();
		instanceSevim.dilBecerisi();
		instanceSevim.elBecerisi();
		instanceSevim.dansBecerisi(); 
	}
}	


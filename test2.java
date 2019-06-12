package test2;

class Profile{
	String name;
	String address;
	String job;
	void showProfile(){
		System.out.println("名前:"+name+"住所:"+address+"職業:"+job);
	}
}

class UseProfile{
	public static void main(String args[]){		
		Profile myProf=new Profile();
		myProf.name="夏目漱石\n";
		myProf.address="高田馬場\n";
		myProf.job="早大英語教師\n";
		myProf.showProfile();
		myProf.name="小泉八雲\n";
		myProf.address="西大久保\n";
		myProf.job="早大英語教師\n";
		myProf.showProfile();
	}
}

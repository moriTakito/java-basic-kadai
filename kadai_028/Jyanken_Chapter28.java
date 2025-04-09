package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	private String[] jyn = {"r","s","p"};
	
	public String getMyChoice() {
	    boolean roop = true;
	    String input = "";
	    while(roop) {
	    	Scanner myChoice = new Scanner(System.in);
			input = myChoice.next();
		    for (int i = 0;i < jyn.length;i++) {
				 if(input.equals(jyn[i])) {
				    roop = false;
				    myChoice.close();
				 }
		    }
		    if(roop) {
		    	System.out.println("入力されたじゃんけんの手はありません");
		    	System.out.println("自分のじゃんけんの手をもう一度入力しましょう");
		    }
	    }
		return input;
	}
	
	public String getRandom() {
		int randJyn = (int)(Math.floor(Math.random() * 3));
		return jyn[randJyn];
	}
	
	public void playGame() {
		HashMap<String,String> jynMap = new HashMap<String,String>();
		jynMap.put("r","グー");
		jynMap.put("s","チョキ");
		jynMap.put("p","パー");
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		String ply = getMyChoice();
		String cpu = getRandom();	
		System.out.println("自分の手は" + jynMap.get(ply) + ",対戦相手の手は" + jynMap.get(cpu));
		if(ply.equals(cpu)) {
			System.out.println("あいこです");
		}else if((jynMap.get(ply) == "グー" && jynMap.get(cpu) == "チョキ") || (jynMap.get(ply) == "チョキ" && jynMap.get(cpu) == "パー") || (jynMap.get(ply) == "パー" && jynMap.get(cpu) == "グー")) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
	
}
package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> dctMap = new HashMap<String,String>();
	
	public void setDictionary() {
		dctMap.put("apple","りんご");
		dctMap.put("peach","桃");
		dctMap.put("banana","バナナ");
		dctMap.put("lemon","レモン");
		dctMap.put("pear","梨");
		dctMap.put("kiwi","キウイ");
		dctMap.put("strawberry","いちご");
		dctMap.put("grape","ぶどう");
		dctMap.put("muscat","マスカット");
		dctMap.put("cherry","さくらんぼ");
	}
	
	public void searchDictionary(String word) {
	    if(dctMap.get(word) != null) {
	    	System.out.println(word + "の意味は" + dctMap.get(word));
	    }else {
	    	System.out.println(word + "の意味は辞書に登録されていません");
	    }
	}
	
	public void searchDictionary(String[] word) {
		for(int i=0 ; i < word.length ; i++) {
	    	  if(dctMap.get(word[i]) != null) {
	    		  System.out.println(word[i] + "の意味は" + dctMap.get(word[i]));
	    	  }else {
	    		  System.out.println(word[i] + "の意味は辞書に登録されていません");
	    	  }
		}
	}
	
	public void checkDictionary() {
		String[] fruit = {"apple","peach","banana","lemon","pear","kiwi","strawberry","grape","muscat","cherry"};
		      
		for(int i=0 ; i < fruit.length ; i++) {
			if(dctMap.get(fruit[i]) != null) {
				System.out.println(fruit[i] + "の意味は" + dctMap.get(fruit[i]));
		    }else{
		    	System.out.println(fruit[i] + "意味は辞書に登録されていません");
		    }  
		}
	}
	
}
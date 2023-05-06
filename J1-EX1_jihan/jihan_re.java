public class jihan_re {
	public static void main (String[] args) {
		
		int coinNum = Integer.parseInt(args.length);
        int coinCek = 0 ;
		int coinSum = 0 ;
		
		for(int i = 0 ; i < coinNum ; i++){
            coinSum += Integer.parseInt(args[i]) ;

            if(coinCek == 10 || coinCek == 50 || coinCek == 100 || coinCek == 500){

            }else if(coinCek == 1 || coinCek == 5) {
                System.out.println("警告："+ coinCek +"は使えません");
            
            }else{
                System.out.println("警告："+ coinCek + "は硬貨として適切な値ではありません");
            }

        }

                System.out.println("ただいまの投入金額は"+ coinSum + "です");

        
	}
}

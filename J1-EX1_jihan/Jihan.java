class jihan{
    public static void main (String[] args){


        int coinNum = args.length;
        int coinCek = 0 ;
        int coinSum = 0 ;


        for(int  i = 0 ; i < coinNum ; i++) {

        	coinCek = Integer.parseInt(args[i]) ; /*args[i]でコマンドライン引数を順に取得できる*/

        	if(coinCek == 10 || coinCek == 50 || coinCek == 100 || coinCek == 500 ){

        			coinSum = coinSum + coinCek ;

        	}else if(coinCek == 1 || coinCek == 5){

            		System.out.println("警告：" + coinCek + "円玉はつかえません");

        	}else {
        			System.out.println("警告：" + coinCek + "は硬貨として適切な値ではありません");
        	}

        	System.out.println("ただいまの投入金額は"+ coinSum + "円です") ;
        }

    }
}
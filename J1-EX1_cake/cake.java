public class cake {
	public static void main (String[] args) {


       final String SHORT_CAKE = "ショートケーキ";
       final String MONBRAN = "モンブラン";
       final String CHOCO_CAKE = "チョコレートケーキ";
       final String STRAWBERRY_TALTO = "いちごのタルト" ;
       final String CHESE_CAKE = "チーズケーキ";

       String cakeMenu = "" ;

       int cakeCount = 0 ;
       int cakeSum = 0 ;
       int price = 0 ;

       double discountLate = 0.8 ;
       double cakeTax = 1.08 ;


        for(int i = 0 ; i < args.length ; i += 2) {

        	 cakeMenu = args[i] ;
        	 cakeCount = Integer.parseInt(args[i+1]);

        	 switch(cakeMenu){

             	case SHORT_CAKE :

             		cakeSum += 320 * cakeCount ;

             		break  ;

             	case MONBRAN :
             		cakeSum += 350 * cakeCount ;
             		break ;

             	case CHOCO_CAKE :

             		cakeSum += 370 * cakeCount ;
             		break ;

             	case STRAWBERRY_TALTO :

             		cakeSum += 400 * cakeCount ;
             		break  ;

             	case CHESE_CAKE :

             		cakeSum += 300 * cakeCount ;
             		break  ;
        	 }
        }

        if(cakeCount > 1000){
        	price = (int)(cakeSum * discountLate * cakeTax) ;
        }else {
        	price = (int)(cakeSum * cakeTax) ;
        }


        System.out.println("合計金額は"+ cakeSum + "です。");

	}
}
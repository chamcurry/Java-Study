class Jihan{
    public static void main (String[] args){

        int money = Integer.parseInt(args[0]);


        if(money != 10 || money != 50 || money != 100 || money != 500 ){
            System.out.println("警告：" + money + "円は硬貨として適切な値ではありません");

        }else if(money == 1){
            System.out.println("警告：1円玉は使えません") ;
        }else if(money == 5){
            System.out.println("警告：5円玉は使えません") ;

        }

       int totalMoney =  money ;

        System.out.println("ただいまの投入金額は"+ totalMoney + money + "円です") ;


    }
}
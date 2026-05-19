package Abstraction;

    interface Payment {
        void pay();
    }

    class UPI implements Payment{
        public void pay(){
            System.out.println("Payment through UPI");
        }
    }

    class CreditCard implements Payment{
        public void pay(){
            System.out.println("Payment through CreditCard");
        }
    }

    class NetBanking implements Payment{
        public void pay(){
            System.out.println("Payment through NetBanking");
        }
    }

    class MainClass_2{
        public static void main(String[] args) {
            Payment obj;
            obj = new UPI();
            obj.pay();

            obj = new CreditCard();
            obj.pay();

            obj = new NetBanking();
            obj.pay();
        }
    }



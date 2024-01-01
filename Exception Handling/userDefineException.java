public class userDefineException {


    //This is user define exception which is extended by eception class
    class lowBalanceException extends Exception{
        public String toString(){
            return "Balance should not less than 5000";
        }
    }
    public void fun1(){
            try {
                throw new lowBalanceException();
            }catch (lowBalanceException e){
                System.out.println(e);
            }
        }

    public static void main(String[] args) {
        userDefineException ue=new userDefineException();
        ue.fun1();
    }

}

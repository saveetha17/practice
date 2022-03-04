public class CodingBat {
    public static void main(String[] args) {
        sleepIN(false,true);
    }

    public static boolean sleepIN(boolean weekday,boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        else
            return false;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile && bSmile) || (!(aSmile && bSmile))){
            return true;
        }
  else{
            return false;
        }
    }

}

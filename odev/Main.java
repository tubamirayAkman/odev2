public class Main {

    public static void main(String[] args) {
        String[] names = {"kadir","gokhan","hakan","suzan","pınar","mehmet","ali","emel","fırat","james","jale","ersin","deniz","gozde","anıl","burak"};
        int [] minutes = {243,265,270,273,278,299,317,329,334,341,343,388,393,402,412,445};
        // a 200-299 b 300-399 c 400+ (hatırlamak için)
        Marathon m1 = new Marathon(names,minutes);
        m1.displayAllMessages();


    }
}
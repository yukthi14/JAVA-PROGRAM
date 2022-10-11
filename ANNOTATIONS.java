class KeyPadPhone{
    @Deprecated
    void sendMessage(){
        System.out.println("Text message sent!");
    }
}

class SmartPhone extends KeyPadPhone{
    @Override
    void sendMessage(){
        System.out.println("Message sent through WhatsApp!");
    }
}

public class ANNOTATIONS{
    public static void main(String args[]){
        @SuppressWarnings("deprecation")
        SmartPhone MI = new SmartPhone();
        MI.sendMessage();
    }
}
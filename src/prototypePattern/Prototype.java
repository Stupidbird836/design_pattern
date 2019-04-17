package prototypePattern;

import java.util.Random;

public class Prototype {

    public static void main(String... args) {
        int i = 0;
        Phone phone = new Phone(new Man());
        while (i <= 5) {
            Phone clone = phone.clone();
            phone.setToPhoneNumber(getRandString(11));
            call(clone);
            i++;
        }

    }

    private static String getRandString(int maxLength) {
        String source = "0123456789";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }

    private static void call(Phone phone) {
        System.out.println("给" + phone.getToPhoneNumber() + "打电话：" + phone.getHello() + phone.getContext());
    }
}

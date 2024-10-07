public class StringDataType {
    public static void main(String[] args) {
        String text = "Hello world";
        String text2 = " salom";
        String uppercase = text.toUpperCase();
        String lowercase = text.toLowerCase();
        String replace = text.replace("Hello" ,"fffff");
        String concast = text.concat(".... ").concat(text2);
        String text3  = new String("hello world");

//        System.out.println(concast);
//        System.out.println(text.length());
//        System.out.println(uppercase);
//        System.out.println(lowercase);
//        System.out.println(replace);
//        System.out.println(text.equals(text2));
        String replace1 = text.replace("Hello" , "qalisan");
        String concat2 = text.concat(" mana shu").concat(text2);
        System.out.println(replace1);
        System.out.println(concat2);

    }
}
